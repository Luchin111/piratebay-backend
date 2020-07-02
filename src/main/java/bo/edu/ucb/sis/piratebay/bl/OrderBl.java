package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.OrderDao;
import bo.edu.ucb.sis.piratebay.dao.UserDao;
import bo.edu.ucb.sis.piratebay.model.DetailModel;
import bo.edu.ucb.sis.piratebay.model.OrderModel;
import bo.edu.ucb.sis.piratebay.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBl {
    private OrderDao orderDao;
    //private int order_id;

    @Autowired
    public OrderBl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    public List<OrderModel> findAllOrders() {
        return this.orderDao.findAllOrders();
    }

    public List<DetailModel> findOrderDetail(int order_id) {
        return this.orderDao.findOrderDetail( order_id);
    }
}
