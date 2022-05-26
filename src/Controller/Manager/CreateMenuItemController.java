package Controller.Manager;

import model.FoodItem;

public class CreateMenuItemController {

    public String FoodName;
    public String CategoryName;
    public Float FoodPrice;
    public String Description;
    public String Allergens;
    public String FitemName;

    public void createFoodItemController() {
        FoodItem fooditem = new FoodItem();
        fooditem.setFoodItemName(FoodName);
        fooditem.setFoodItemCategory(CategoryName);
        fooditem.setFoodItemPrice(FoodPrice);
        fooditem.setFoodItemDescription(Description);
        fooditem.setFoodItemAllergens(Allergens);
        FoodItem.add(fooditem);
    }

    public boolean CheckFoodName() {
        boolean C = FoodItem.isFoodItemNameTaken(FitemName);
        return C;
    }
}
