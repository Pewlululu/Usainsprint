package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.OrderDetails;
import model.Orders;

public class ViewOrderController {

    public int StatusId;

    public static Iterator<OrderDetails> ViewBill(int id) {
        ArrayList<OrderDetails> list = OrderDetails.getAllRecords(id);
        Iterator<OrderDetails> itr = list.iterator();
        return itr;
    }

    public String getOrderStatus() {
        String OrStatus = "";
        Orders Or = new Orders();
        Or.getOrdStatus(StatusId);
        OrStatus = Or.getStatus();
        return OrStatus;
    }
}
