package Entity;
public class FoodItem
{
	// Attribute declaration
	
    private String foodName;
	private String foodId;
	private String foodCategory;
	private double foodPrice;
	
	//------------------------Empty Constractor---------------------------
	
	public FoodItem()
	{
		System.out.println("Empty");
	}
	
	//----------------------------Perametarize Constractor---------------------
	
	public FoodItem(String foodName,String foodId,String foodCategory,double foodPrice)
	{
		setFoodName(foodName);
		setFoodId(foodId);
		setFoodCategory(foodCategory);
		setFoodPrice(foodPrice);	
	}
	
	// ...........................Setter Getter of Food Name......................
	
	public void setFoodName(String foodName)
	{
		this.foodName=foodName;
	}
	public String getFoodName()
	{
		return foodName;
	}
	
	//...............................Setter Getter of Food Id...........................
	
	public void setFoodId(String foodId)
	{
		this.foodId = foodId;
	}
	public String getFoodId()
	{
		return foodId;
	}
	
	//..........................Setter Getter of Food Category............................
	
	public void setFoodCategory(String foodCategory)
	{
		this.foodCategory=foodCategory;
	}
	public String getFoodCategory()
	{
		return foodCategory;
	}
	
	// ................................Setter Getter of Food Price.............................
	
	public void setFoodPrice(double foodPrice)
	{
		if(foodPrice>0)
		{
			this.foodPrice=foodPrice;
		}
		else
		{
			System.out.println("Invalid Price");
		}
	}
	public double getFoodPrice()
	{
	   return foodPrice;
	
	}
	
    // ..................................For Display in consul...................................
	
	public void displayAFoodItem()
	{ 
	    System.out.println(".....................");
		System.out.println("FOOD NAME :"+ foodName);
		System.out.println("FOOD ID :"+ foodId);
		System.out.println("FOOD CATEGORY :"+ foodCategory);
		System.out.println("FOOD PRICE :"+ foodPrice);
		System.out.println(".....................");
	}
	
	// ..............................For GUI Display..........................
	public String getAFoodItemAsString()
	{
		return "..........................."+"\n"+
		       "FOOD NAME :"+foodName+"\n"+
		       "FOOD ID :"+foodId+"\n"+
		       "FOOD CATEGORY :"+foodCategory+"\n"+
		       "FOOD PRICE :"+foodPrice+"\n"+
		       "..........................."+"\n";
	}
	
}