package bo.edu.ucb.sis.piratebay.model;

public class DetailModel {
    private Integer productID;
    private Integer quantity;
    private String productName;
    private Integer quantityreq;
    private Integer quantitycomm;
    private Integer quantityrec;
    private String date;
    private Integer status;

    public DetailModel() {
    }

    public DetailModel(Integer productID, Integer quantity, String productName, Integer quantityreq, Integer quantitycomm, Integer quantityrec, String date, Integer status) {
        this.productID = productID;
        this.quantity = quantity;
        this.productName = productName;
        this.quantityreq = quantityreq;
        this.quantitycomm = quantitycomm;
        this.quantityrec = quantityrec;
        this.date = date;
        this.status = status;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantityreq() {
        return quantityreq;
    }

    public void setQuantityreq(Integer quantityreq) {
        this.quantityreq = quantityreq;
    }

    public Integer getQuantitycomm() {
        return quantitycomm;
    }

    public void setQuantitycomm(Integer quantitycomm) {
        this.quantitycomm = quantitycomm;
    }

    public Integer getQuantityrec() {
        return quantityrec;
    }

    public void setQuantityrec(Integer quantityrec) {
        this.quantityrec = quantityrec;
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


}
