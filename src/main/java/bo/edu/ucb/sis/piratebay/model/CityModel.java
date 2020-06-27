package bo.edu.ucb.sis.piratebay.model;

public class CityModel {

    private Integer cityId;


    private String cityName;
    private Integer status;



    public CityModel(Integer cityId, String cityName, Integer status) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }








    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }





    public CityModel() {
    }
      //To-do lo del objeto aca
    @Override
    public String toString() {
        return "CityDao{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

}
