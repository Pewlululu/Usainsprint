package Controller.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import model.Orders;

public class ViewOrdersController {

    public static Iterator<Orders> getdata() {
        ArrayList<Orders> arrayL = Orders.getAllRecords();
        Iterator<Orders> itr = arrayL.iterator();

        return itr;
    }
}
