package Controller.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

public class SearchMenuItemController {

    public String txtinput;

    public Iterator<FoodItem> Search() {
        ArrayList<FoodItem> list = FoodItem.Search(txtinput);
        Iterator<FoodItem> itr1 = list.iterator();
        return itr1;
    }
}
