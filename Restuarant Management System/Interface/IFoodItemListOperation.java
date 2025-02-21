package Interface;
import Entity.*;
import EntityList.*;

public interface IFoodItemListOperation
{
	public void insertFoodItem(FoodItem food);
	public FoodItem getFoodItemById( String id);
	public void removeFoodItemById(String id);
	public String getAllFoodItemAsString();
	public void updateFoodItem(FoodItem updatedFood);
}