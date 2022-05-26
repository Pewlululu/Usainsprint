package Controller.Staff;

import model.Orders;

public class ModifyOrdersController {

    public int Id;

    public void fulfillOrderController() {
        Orders order = new Orders();
        order.setId(Id);
        order.fulfillOrder(order);
    }

    public void unfulfillOrderController() {
        Orders order = new Orders();
        order.setId(Id);
        order.unfulfillOrder(order);
    }
}
