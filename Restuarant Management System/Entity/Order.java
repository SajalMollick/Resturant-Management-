package Entity;
public class Order
{
	//.......................................Atribute.........................................
	
	private String orderId;
	private String customerName;
	private String contact;
	private String address;
	private String foods;
	
	//....................................Constractors.......................................
	
	public Order()
	{
		System.out.println("EMPTY");
	}
	
	public Order(String orderId,String customerName,String contact,String address,String foods)
	{
		setOrderId(orderId);
		setCustomerName(customerName);
		setContact(contact);
		setAddress(address);
		setFoods(foods);
	}
	
	//...............................setter getter of order id..............................
	
	public void setOrderId(String orderId)
	{
		this.orderId=orderId;
	}
	
	public String getOrderId()
	{
		return orderId;
	}
	
	//...........................setter getter of cutomer name...........................
	
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	//............................setter getter of contact........................
	
	public void setContact(String contact)
	{
		if(contact.length()>10)
		{
			this.contact=contact;
		}
		else
		{
			System.out.println("INVALID CONTACTNUMBER.");
		}
	}
	
	public String getContact()
	{
		return contact;
	}
	
	//..........................setter getter of address..........................
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	//.........................setter getter of foods.............................
	
	public void setFoods(String foods)
	{
		this.foods=foods;
	}
	public String getFoods()
	{
		return foods;
	}
	
	//..............................For Display....................................
	
	public void displayAOrder()
	{
		System.out.println(".....................");
		System.out.println("ORDER ID :"+ orderId);
		System.out.println("CUSTOMER NAME :"+ customerName);
		System.out.println("CONTACT :"+ contact);
		System.out.println("ADDRESS :"+ address);
		System.out.println("FOOD ITEM :"+ foods);
		System.out.println(".....................");
	}
	
	public String getAOrderAsString()
	{
		return "....................."+"\n"+
		       "ORDER ID :"+ orderId+"\n"+
		       "CUSTOMER NAME :"+ customerName +"\n"+
			   "CONTACT :"+ contact+"\n"+
			   "ADDRESS :"+ address+"\n"+
			   "FOOD ITEM :"+ foods+"\n"+
			   "....................."+"\n";  
	}
	
	
	
	
	
	
	
	
}