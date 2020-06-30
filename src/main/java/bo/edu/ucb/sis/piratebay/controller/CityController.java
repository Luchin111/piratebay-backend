package bo.edu.ucb.sis.piratebay.controller;

import bo.edu.ucb.sis.piratebay.bl.CityBl;
import bo.edu.ucb.sis.piratebay.model.CityModel;
import bo.edu.ucb.sis.piratebay.model.FindCitiesReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/city")
@CrossOrigin(origins = "*")
public class CityController {
    private CityBl cityBl;


    @Autowired
    public CityController(CityBl cityBl) {
        this.cityBl = cityBl;
    }

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public FindCitiesReturn findCities() {
        List<CityModel> colCities =  this.cityBl.findAllCities();
        FindCitiesReturn ObjReturn = new FindCitiesReturn();
        ObjReturn.setErrorcode(0);
        ObjReturn.setMessage("OK");
        ObjReturn.setCityModel(colCities);
        return ObjReturn;
    }
}
