package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

public class filterFoodController {

    public static Iterator<FoodItem> getAlldata(String name, String c) {
        ArrayList<FoodItem> list = FoodItem.filterFoodname(name, c);
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
