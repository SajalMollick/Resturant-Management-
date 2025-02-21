package EntityList;
import Entity.FoodItem;
import Interface.IFoodItemListOperation;
public class FoodItemList implements IFoodItemListOperation
{
	FoodItem foods[];
	
	//.........................Empty constractor .........................
	
	public FoodItemList()
	{
	   foods = new FoodItem[50];
	}
	
	//.........................Peramitarize constractor..........................
	
	public FoodItemList(int size)
	{
		foods = new FoodItem[size];
	}
	
	// ..........................For Inseart food in the menu.............................
	
	public void insertFoodItem(FoodItem food)
	{
		boolean flag=false;
		for(int i=0;i<foods.length;i++)
		{
			if(foods[i]==null)
			{
				foods[i]=food;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("FOOD ITEM INSERT.");
		}
		else
		{
			System.out.println("FAILED TO INSERT THE FOOD ITEM");
		}
	}
	
	// ........................To get any item of food by it's id........................

    public FoodItem getFoodItemById( String id)
	{
		boolean flag=false;
		FoodItem foodItem = null;
		for(int i=0;i<foods.length;i++)
		{
			if(foods[i]!=null)
			{
				if(foods[i].getFoodId().equals(id))
				{
					foodItem=foods[i];
					flag=true;
					break;
				}
			}
		
		}
		if(flag)
		{
			System.out.println("FOOD ITEM FOUND.");
		}
		else{
			System.out.println("FOOD ITEM NOT FOUND.");
		}
		return foodItem;
	}	
	
	//.......................For remove any food item from the menu.....................
	
	public void removeFoodItemById(String id)
	{
		boolean flag=false;
		
		for(int i=0;i<foods.length;i++)
		{
			if(foods[i]!=null)
			{
				if(foods[i].getFoodId().equals(id))
				{
				    foods[i]=null;
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("FOOD ITEM DELETED.");
		}
		else 
		{
			System.out.println("FOOD ITEM NOT FOUND BY THIS ID.");
		}
	}
	
	// ....................For show all the item of the menu.................... 
	
	public void displayAllFoodItem()
	{
		for(int i=0;i<foods.length;i++)
		{ 
	        if(foods[i]!=null)
			{
			   foods[i].displayAFoodItem();
			}
		}
	}
	
	public String getAllFoodItemAsString()
	{
		String allFood="";
		for(int i=0;i<foods.length;i++)
		{  
	       if(foods[i]!=null)
		   {
			allFood+=foods[i].getAFoodItemAsString();
		   }
		}
		return allFood;
	}
	
	//...................................For Update Food Item.................................
	
	public void updateFoodItem(FoodItem updatedFood)
	{
		boolean flag=false;
		for(int i=0;i<foods.length;i++)
		{
			if(foods[i]!=null && foods[i].getFoodId().equals(updatedFood.getFoodId()))
			{
				foods[i]=updatedFood;
				flag=true;
				break;
			}	
			
		}
		
		if(flag)
		{
			System.out.println("UPDATED SUCCESSFULLY.");
		}
		else{
			System.out.println("NO ITEM FOUND WITH THIS ID");
		}
	}

	
	
	 
	
	
	
	
	
	
}