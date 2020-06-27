package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.WarehouseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class WarehouseDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public WarehouseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<WarehouseModel> findAllActives() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT warehouse_id, warehouse_name, warehouse_address, status FROM \"warehouse\" WHERE status = 1";
        List<WarehouseModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<WarehouseModel>() {
                @Override
                public WarehouseModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new WarehouseModel(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
