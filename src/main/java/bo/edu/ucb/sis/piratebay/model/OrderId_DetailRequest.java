package bo.edu.ucb.sis.piratebay.model;

public class OrderId_DetailRequest {
    private String order_id;

    public OrderId_DetailRequest() {
    }

    public OrderId_DetailRequest(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
