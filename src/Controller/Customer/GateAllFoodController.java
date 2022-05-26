package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

public class GateAllFoodController {

    public static Iterator<FoodItem> getAlldata() {
        ArrayList<FoodItem> list = FoodItem.getAllRecords();
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
