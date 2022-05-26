package Controller.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

public class ViewMenuItemController {

    public static Iterator<FoodItem> getFoodData() {
        ArrayList<FoodItem> list = FoodItem.getAllRecords();
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
