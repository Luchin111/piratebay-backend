package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.CityDao;
import bo.edu.ucb.sis.piratebay.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityBl {
    private CityDao cityDao;

    @Autowired
    public CityBl(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public List<CityModel> findAllCities() {
        return this.cityDao.findAllCities();
    }
}
