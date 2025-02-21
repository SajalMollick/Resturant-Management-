package EntityList;
import Entity.Order;
import Interface.*;

public class OrderList implements IOrderListOperation
{
	Order orders[];
	
	//............................Constractors..........................
	
	public OrderList()
	{
		orders=new Order[100];
	}
	
	public OrderList(int size)
	{
		orders=new Order[size];
	}
	
	//.........................For Insert Order...........................
	
	public void insertOrder(Order order)
	{
		boolean flag=false;
		for(int i=0;i<orders.length;i++)
		{
			if(orders[i]==null)
			{
				orders[i]=order;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("ORDER ADDED.");
		}
		else
		{
			System.out.println("ORDER NOT ADDED.");
		}
	}
	
    //..................................get order by id..........................
	
	public Order getOrderById(String orderId)
	{
		boolean flag=false;
		Order order=null;
		for(int i=0;i<orders.length;i++)
		{
			if(orders[i]!=null)
			{
				if(orders[i].getOrderId().equals(orderId))
				{
					order=orders[i];
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("ORDER FOUND WITH THIS ORDER ID.");
		}
		else{
			System.out.println("ORDER NOT FOUND WITH THIS ORDER ID.");
		}
		return order;
	}
	
	// ........................for Remove Order............................
	
	public void removeOrder(String orderId)
	{
		boolean flag=false;
		for(int i=0;i<orders.length;i++)
		{
			if(orders[i]!=null){
				
			if(orders[i].getOrderId().equals(orderId))
			{
				orders[i]=null;
				flag=true;
				break;
			}
			}
		}
		if(flag)
		{
			System.out.println("ORDER CANCEL WITH THIS ID.");
		}
		else{
			System.out.println("ORDER NOT CANCEL WITH THIS ID.");
		}

	}
	
	//............................for Display..........................
	
	public void showAllOrder()
	{
		for(int i=0;i<orders.length;i++)
		{
			if(orders[i]!=null)
			{
				orders[i].displayAOrder();
			}
		}
	}
	
	public String getAllOrderAsString()
	{
		String allOrder="";
		for(int i=0;i<orders.length;i++)
		{
			if(orders[i]!=null)
			{
				allOrder+=orders[i].getAOrderAsString();
			}
			
		}
		return allOrder;
	}
	
	//...........................................For Update Order.......................
	
	public void updateOrder(Order updatedOrder)
	{
		boolean flag =false;
		for(int i=0;i<orders.length;i++)
		{
			if(orders[i]!=null && orders[i].getOrderId().equals(updatedOrder.getOrderId()))
			{
				orders[i]=updatedOrder;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Update Succesfully");
		}
		else{
			System.out.println("No oreder found with this id.");
		}
	}
	
	
	
}