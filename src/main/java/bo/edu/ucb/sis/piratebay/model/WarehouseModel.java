package bo.edu.ucb.sis.piratebay.model;

public class WarehouseModel {
    private Integer warehouse_id;
    private String warehouse_name;
    private String warehouse_address;
    private String status;

    public WarehouseModel() {
    }

    public WarehouseModel(Integer warehouse_id, String warehouse_name, String warehouse_address, String status) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.status = status;
    }


    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WarehouseModel{" +
                "warehouse_id=" + warehouse_id +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", warehouse_address='" + warehouse_address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
