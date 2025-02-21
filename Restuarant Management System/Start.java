import Entity.*;
import EntityList.*;
import java.util.Scanner;

public class Start
{
	public static void main(String[]args)
    {
		/*Scanner sc = new Scanner(System.in);
		Scanner scLine= new Scanner(System.in);
		
		FoodItemList foodItemList= new FoodItemList(100);
		EmployeeList empList =new EmployeeList(100);
		
		System.out.println("WELCOME TO MY RESTURANT MANAGEMENT SYSTEM");
				
		while(true)
		{
			System.out.println("FOR FOOD ITEM MANAGEMENT.");
			System.out.println("1.Insert new food item to menu.");
			System.out.println("2.Update a food item by id.");
			System.out.println("3.Search a food item from the menu by id.");
			System.out.println("4.Delete a food item from the menu by id.");
			System.out.println("5.Show all food item from the menu.");
            System.out.println("6.Show a food item from the menu.");
			System.out.println("FOR EMPLOYEE MANAGEMENT.");
            System.out.println("7.Insert an new employee to the resturant.");
			System.out.println("8.Update an employee from the resturant by empId.");
			System.out.println("9.Search an employee from the resturant by empId.");
			System.out.println("10.Remove an employee from the resturant by empId.");
			System.out.println("11.Show all employee details from the resturant.");
			System.out.println("12.Show an employee details from the resturant.");
			

            System.out.print("Enter an option:");
            int option =sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Insert a new food item.");
				System.out.print("Enter food item name:");
				String name=scLine.nextLine();
				System.out.print("Enter food item id:");
				String id=scLine.nextLine();
				System.out.print("Enter food item category:");
				String category=scLine.nextLine();
				System.out.print("Enter food item price:");
				double price=sc.nextDouble();
				
				foodItemList.insertFoodItem(new FoodItem(name,id,category,price));
			}
			else if(option==2)
			{
				System.out.println("Update a book item.");
				System.out.print("Enter the id:");
				String id=scLine.nextLine();
				FoodItem foodItem = foodItemList.getFoodItemById(id);
				if(foodItem!=null){
				System.out.print("Enter food item name:");
				String name=scLine.nextLine();
				foodItem.setFoodName(name);
				System.out.print("Enter food item id:");
				String Id=scLine.nextLine();
				foodItem.setFoodId(Id);
				System.out.print("Enter food item category:");
				String category=scLine.nextLine();
				foodItem.setFoodCategory(category);
				System.out.print("Enter food item price:");
				double price=sc.nextDouble();
				foodItem.setFoodPrice(price);
				}
			}
			else if(option==3)
			{
				System.out.println("Search a food item.");
				System.out.print("Enter the food id:");
				String id=scLine.nextLine();
				
				FoodItem food=foodItemList.getFoodItemById(id);
				if(food!=null)
				{
					food.displayAFoodItem();
				}
				
			}
			else if(option==4)
			{
				System.out.println("Revome a food item .");
				System.out.print("Enter the food id:");
				String id=scLine.nextLine();
				
				foodItemList.removeFoodItemById(id);
			}
			else if(option==5)
			{
				System.out.println("Show all the Food item from the menu.");
				foodItemList.displayAllFoodItem();
			}
			else if(option==6)
			{
				System.out.println("Show a food item from the menu.");
				System.out.print("Enter the food id:");
				String id=scLine.nextLine();
				FoodItem food=foodItemList.getFoodItemById(id);
				if(food!=null)
				{
					food.displayAFoodItem();
				}
			}
			else if(option==7)
			{
				System.out.println("Insert an new employee.");
				System.out.print("Enter employee name:");
				String name=scLine.nextLine();
				System.out.print("Enter the gender:");
				String gender=scLine.nextLine();
				System.out.print("Enter the age:");
				int age=sc.nextInt();
				System.out.print("Enter the contact number:");
				String contactNumber=scLine.nextLine();
				System.out.print("Enter the national id:");
				String nationalId=scLine.nextLine();
				System.out.print("Enter the employee id:");
				String empId=scLine.nextLine();
				System.out.print("Enter the employee designation:");
				String designation=scLine.nextLine();
				System.out.print("Enter the employee salary:");
				double salary=sc.nextDouble();
				
				empList.insertEmployee(new Employee(name,gender,age,contactNumber,nationalId,empId,designation,salary));
			}
			else if(option==8)
			{
				System.out.print("Enter the empId:");
				String empId=scLine.nextLine();
				Employee emp = empList.getEmployeeByEmpId(empId);
				if(emp!=null)
				{
				    System.out.print("Enter employee name:");
				    String name=scLine.nextLine();
					emp.setName(name);
					System.out.print("Enter the gender:");
				    String gender=scLine.nextLine();
					emp.setGender(gender);
					System.out.print("Enter the age:");
				    int age=sc.nextInt();
					emp.setAge(age);
					System.out.print("Enter the contact number:");
				    String contactNumber=scLine.nextLine();
					emp.setContactNumber(contactNumber);
					System.out.print("Enter the national id:");
				    String nationalId=scLine.nextLine();
					emp.setNationalId(nationalId);
					System.out.print("Enter the employee id:");
				    String employeeId=scLine.nextLine();
					emp.setEmpId(employeeId);
					System.out.print("Enter the employee designation:");
				    String designation=scLine.nextLine();
					emp.setEmpDesignation(designation);
					System.out.print("Enter the employee salary:");
				    double salary=sc.nextDouble();
					emp.setEmpSalary(salary);
					
				}
			}
			else if(option==9)
			{
				System.out.print("Enter employee id:");
				String empId=scLine.nextLine();
				Employee emp=empList.getEmployeeByEmpId(empId);
				if(emp!=null)
				{
					emp.showAEmployeeInfo();
				}
			
			}
			else if(option==10)
			{
				System.out.print("Enter the employee id:");
				String empId=scLine.nextLine();
				empList.removeEmployeeByEmpId(empId);
			}
			else if(option==11)
			{
				empList.showAllEmployeeAsString();
			}
			else if(option==12)
			{
				System.out.print("Enter employee id:");
				String empId=scLine.nextLine();
				Employee emp =empList.getEmployeeByEmpId(empId);
				if(emp!=null)
				{
					emp.showAEmployeeInfo();
				}
				
			}
		
            
    		
			
		}*/
		
	TableList tableList = new TableList(10);
	tableList.insertTable(new Table(10,"Table","101"));
	//tableList.insertTable(new Table("T2"));
    tableList.getTableByTableId("101");
	//tableList.removeTableById("T1");
	System.out.println( tableList.getAllTableAsString());

		
		
		
		/*OrderList orderList=new OrderList(100);
		orderList.insertOrder(new Order("10","shf","0183728483863","fhsf","food 2X,mango 3X,"));
		System.out.println(orderList.getAllOrderAsString());
		//orderList.showAllOrder();
	    orderList.getOrderById("10");
		//orderList.removeOrder("10");
		//orderList.showAllOrder();*/
	}
}