package Controller.Customer;

import model.FoodItem;

public class AddOrdersController {

    public FoodItem Foods;

    public FoodItem getFoods() {
        return Foods;
    }

    public void setFoods(String F) {
        this.Foods = FoodItem.getFoodItemByName(F);
    }

}
