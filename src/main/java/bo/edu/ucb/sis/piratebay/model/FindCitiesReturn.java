package bo.edu.ucb.sis.piratebay.model;

import java.util.List;

public class FindCitiesReturn {

    private Integer errorcode;
    private String message;
    private List<CityModel> cityModel;

    public FindCitiesReturn() {
    }

    public FindCitiesReturn(Integer errorcode, String message, List<CityModel> cityModel) {
        this.errorcode = errorcode;
        this.message = message;
        this.cityModel = cityModel;
    }

    public Integer getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CityModel> getCityModel() {
        return cityModel;
    }

    public void setCityModel(List<CityModel> cityModel) {
        this.cityModel = cityModel;
    }

}
