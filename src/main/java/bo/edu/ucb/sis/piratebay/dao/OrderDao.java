package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.DetailModel;
import bo.edu.ucb.sis.piratebay.model.OrderModel;
import bo.edu.ucb.sis.piratebay.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class OrderDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<OrderModel> findAllOrders() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT b.order_id, a.person_id, a.first_name,a.first_surname, a.direction, b.date, b.status, sum(c.qtty_requested)\n" +
                "FROM public.person a, public.order b, public.product_order c\n" +
                "WHERE a.person_id = b.person_id  \n" +
                "and b.order_id=c.order_id\n" +
                "group by b.order_id, a.person_id, a.first_name,a.first_surname, a.direction, b.date, b.status;";
        List<OrderModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<OrderModel>() {
                @Override
                public OrderModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new OrderModel(resultSet.getInt(1),
                            resultSet.getInt(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getString(6),
                            resultSet.getInt(7),
                            resultSet.getInt(8));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
    public List<DetailModel> findOrderDetail(int OrderId) {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT  a.product_id, b.quantity,b.product_name, sum(a.qtty_requested) as qtty_requested, a.qtty_commit, a.qtty_received,c.date, c.status \n" +
                "\tFROM public.product_order a, public.product b, public.order c\n" +
                "\twhere a.product_id = b.product_id\n" +
                "\tand c.order_id= a.order_id\n" +
                "\tand c.order_id="+ OrderId +" \n" +
                "\tgroup by a.product_id, b.quantity,b.product_name, a.qtty_commit, a.qtty_received,c.date, c.status;\n" +
                "\t";
        List<DetailModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<DetailModel>() {
                @Override
                public DetailModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new DetailModel(resultSet.getInt(1),
                            resultSet.getInt(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getInt(5),
                            resultSet.getInt(6),
                            resultSet.getString(7),
                            resultSet.getInt(8));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
