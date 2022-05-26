package Controller.Manager;

import model.FoodItem;

public class DeleteMenuItemController {

    public String FoodName;

    public void deleteFoodItemController() {
        FoodItem.delete(FoodName);
    }
}
