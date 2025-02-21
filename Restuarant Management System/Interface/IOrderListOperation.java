package Interface;
import Entity.*;
import EntityList.*;

public interface IOrderListOperation
{
	public void insertOrder(Order order);
	public Order getOrderById(String orderId);
	public void removeOrder(String orderId);
	public String getAllOrderAsString();
	public void updateOrder(Order updatedOrder);
	
}