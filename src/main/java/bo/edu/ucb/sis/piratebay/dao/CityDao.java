package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class CityDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CityDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CityModel> findAllCities() {

        String query = "SELECT warehouse_id, warehouse_name, status FROM \"warehouse\" WHERE status = 1";
        List<CityModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<CityModel>() {
                @Override
                public CityModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new CityModel(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getInt(3));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
