package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

public class FcategoryController {

    public static Iterator<FoodItem> getData(String Cname) {

        ArrayList<FoodItem> list = FoodItem.getAllRecordsByCategory(Cname);
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
