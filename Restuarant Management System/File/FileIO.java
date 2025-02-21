package File;
import java.io.*;
import java.util.Scanner;
import Entity.*;
import EntityList.*;
import GUI.*;

public class FileIO
{
	//..............................For cheak User................................
	public static boolean cheakUser(String uname,String upass)
	{
		boolean flag=false;
		try{
			Scanner scan=new Scanner(new File("./File/Data/user.txt"));
			
			while(scan.hasNextLine())
			{
				String line=scan.nextLine();
				String data[]=line.split("##");
				if(uname.equals(data[0]) && upass.equals(data[2]))
				{
					flag=true;
					break;
				}
			}
			scan.close();
		}
		
		catch(Exception e)
		{
			System.out.println("CAN NOT READ THE FILE.");
		}
		return flag;
	}
	
	// ...................................For Write .........................
	
	public static void saveUser(String uname,String email,String upass)
	{
		
		try{
			FileWriter writer= new FileWriter(new File("./File/Data/user.txt"),true);
			writer.write(uname+"##"+email+"##"+upass+"\n");
			writer.flush();
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("CAN NOT WRITE FILE.");
		}
		
	}
	
	//.............................................New Employee Saving  ...........................................
	
	public static void saveEmployee(Employee emp)
	{
		try{
			FileWriter writer= new FileWriter(new File("./File/Data/employee.txt"),true);
			
			String line=emp.getName()+"##"+emp.getGender()+"##"+emp.getAge()+"##"+emp.getContactNumber()+"##"+
			            emp.getNationalId()+"##"+emp.getEmpId()+"##"+emp.getEmpDesignation()+"##"+emp.getEmpSalary()+"\n";
						
			writer.write(line);
			writer.flush();
			writer.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Can't read file");
		}
	}
	
	//..............................................For Load old Employee from File....................................
	
	public static void loadEmployee(EmployeeList empList)
	{
		try{
			Scanner scLine=new Scanner(new File("./File/Data/employee.txt"));
			
			while(scLine.hasNextLine())
			{
				String line=scLine.nextLine();
				String data[]=line.split("##");
				
				Employee emp=new Employee(data[0],data[1],Integer.parseInt(data[2]),data[3],data[4],data[5],data[6],Double.parseDouble(data[7]));
				
				empList.insertEmployee(emp);
			}
			
			scLine.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Can't read File");
		}
	}
	
	//...........................................For save foodItem in file.....................................
	
	public static void saveFoodItem(FoodItem foodItem)
	{
		try{
		  FileWriter writer= new FileWriter(new File("./File/Data/menu.txt"),true);
		   
		   String line=foodItem.getFoodName()+"##"+foodItem.getFoodId()+"##"+foodItem.getFoodCategory()+"##"+foodItem.getFoodPrice()+"\n";
		   writer.write(line);
		   writer.flush();
		   writer.close();
		   
		}
		catch(Exception e)
		{
			System.out.println("Can't read file.");
		}
		
	}
	
	//.....................................For load Food item..............................................
	
	public static void loadFoodItem(FoodItemList foodItemList)
	{
		try{
			Scanner scLine=new Scanner(new File("./File/Data/menu.txt"));
			while(scLine.hasNextLine())
			{
				String line=scLine.nextLine();
				String data[]=line.split("##");
				
				FoodItem foodItem=new FoodItem(data[0],data[1],data[2],Double.parseDouble(data[3]));
				foodItemList.insertFoodItem(foodItem);
			}
			scLine.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Can't read file.");
		}
	}
	
	//..................................For save order in file...................................
	
	public static void saveOrder(Order order)
	{
		try{
			
			FileWriter writer=new FileWriter(new File("./File/Data/order.txt"),true);
			
			String line=order.getOrderId()+"##"+order.getCustomerName()+"##"+order.getContact()+"##"+order.getAddress()+"##"+order.getFoods()+"\n";
			writer.write(line);
			writer.flush();
			writer.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("Can't read file");
		}
	
	}
	
	//...................................For load order from file..............................
	
	public static void loadOrder(OrderList orderList)
	{
		try{
			Scanner scLine=new Scanner(new File("./File/Data/order.txt"));
			while(scLine.hasNextLine())
			{
				String line=scLine.nextLine();
				String data[]=line.split("##");
				Order order=new Order(data[0],data[1],data[2],data[3],data[4]);
				
				orderList.insertOrder(order);
				
			}
			scLine.close();
			
		}
		catch(Exception e)
			{
				System.out.println("Can't read File");
			}
			
	}
	
	//........................................For save Table in file..............................
	
	public static void saveTable(Table table)
	{
		try{
			FileWriter writer =new FileWriter(new File("./File/Data/table.txt"),true);
			String line=table.getQuantity()+"##"+table.getType()+"##"+table.getTableId()+"\n";
			
			writer.write(line);
			writer.flush();
			writer.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Can't read file");
		}
	}
	
	//...................................For file Loading from file...........................................
	
	public static void loadTable(TableList tableList)
	{
		try{
			Scanner scLine=new Scanner(new File("./File/Data/table.txt"));
			
			while(scLine.hasNextLine())
			{
				String line=scLine.nextLine();
				String data[]=line.split("##");
				
				Table table=new Table(Integer.parseInt(data[0]),data[1],data[2]);
				tableList.insertTable(table);
			}
			scLine.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Can't read file");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
