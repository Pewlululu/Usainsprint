package Controller.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import model.Orders;

public class SearchOrdersController {

    public String txtinput;

    public Iterator<Orders> Search() {
        ArrayList<Orders> list = Orders.Search(txtinput);
        Iterator<Orders> itr = list.iterator();
        return itr;
    }

}
