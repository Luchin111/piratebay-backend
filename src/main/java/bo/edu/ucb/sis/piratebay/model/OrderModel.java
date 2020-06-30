package bo.edu.ucb.sis.piratebay.model;

public class OrderModel {


    private Integer order_id;
    private Integer person_id;
    private String first_name;
    private String first_surname;
    private String  direction;
    private Integer order_user_id;
    private String date;
    private Integer status;
    private Integer quantity;

    public OrderModel() {
    }

    public OrderModel(Integer order_id, Integer person_id, String first_name, String first_surname, String direction, Integer order_user_id, String date, Integer status, Integer quantity) {
        this.order_id = order_id;
        this.person_id = person_id;
        this.first_name = first_name;
        this.first_surname = first_surname;
        this.direction = direction;
        this.order_user_id = order_user_id;
        this.date = date;
        this.status = status;
        this.quantity = quantity;
    }



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public Integer getOrder_user_id() {
        return order_user_id;
    }

    public void setOrder_user_id(Integer order_user_id) {
        this.order_user_id = order_user_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
