package Controller.Manager;

import model.FoodItem;

public class ModifyMenuItemController {

    public int FoodItemId;
    public String FoodItemName;
    public String FoodItemCategory;
    public Float FoodItemPrice;
    public String FoodItemDescription;
    public String FoodItemAllergens;

    public void modifyMenuItemController() {
        FoodItem fooditem = new FoodItem();
        fooditem.setFoodItemId(FoodItemId);
        fooditem.setFoodItemName(FoodItemName);
        fooditem.setFoodItemCategory(FoodItemCategory);
        fooditem.setFoodItemPrice(FoodItemPrice);
        fooditem.setFoodItemDescription(FoodItemDescription);
        fooditem.setFoodItemAllergens(FoodItemAllergens);
        FoodItem.modify(fooditem);
    }
}
