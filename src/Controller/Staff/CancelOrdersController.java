package Controller.Staff;

import model.Orders;

public class CancelOrdersController {

    public int Id;

    public void cancelOrderController() {
        Orders order = new Orders();
        order.setId(Id);
        order.cancelOrder(order);
    }
}
