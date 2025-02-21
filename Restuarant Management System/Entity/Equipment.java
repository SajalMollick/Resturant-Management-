package Entity;
public abstract class Equipment 
{
	private int quantity;
	private String type;
	
	public Equipment()
	{
		
	}
	
	public Equipment(int quantity,String type)
	{
	    setQuantity(quantity);
		setType(type);
	}
	//...................................Setter getter of quantity...................................
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	//....................................setter getter of type.................................
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public String getType()
	{
		return type;
	}
	
	//.......................................For Display........................................
	public void display()
	{
		System.out.println(" Total Table Number :"+quantity);
		System.out.println("Type of equipment :"+type);
	}
	
	public String getQuantityAsStirng()
	{
		return "....................."+"\n"+
		       "Total Table Number :"+quantity+"\n"+
			   "Type of equipment :"+type;
	}
	
	
}