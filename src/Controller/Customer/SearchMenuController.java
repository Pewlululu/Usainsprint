package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

public class SearchMenuController {

    public String txtinput;

    public Iterator<FoodItem> Search() {
        ArrayList<FoodItem> list = FoodItem.Search(txtinput);
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
