package EntityList;
import Entity.Employee;
import Interface.*;

public class EmployeeList implements IEmployeeListOperation
{  
    //.............................Atrribute declaration...............................
 
	Employee employee[];
	
	//..........................Empty constractor................................
	
	public EmployeeList()
	{
		employee=new Employee[100];
	}
	
	//..............................Peramitarize constractor......................
	
	public EmployeeList(int size)
	{
		employee=new Employee[size];
	}
	
	//.............................For insert employee ...........................
	
	public void insertEmployee(Employee emp)
	{
		boolean flag=false;
		for(int i=0;i<employee.length;i++)
		{
			if(employee[i]==null)
			{
				employee[i]=emp;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("EMPLOYEE INSERTED.");
		}
		else
		{
			System.out.println("FAILED TO INSERT THE EMPLOYEE.");
		}
	}
	
	//................................To get employee by employee id............................
	
	public Employee getEmployeeByEmpId(String empId)
	{
		boolean flag=false;
		Employee emp=null;
		for(int i=0;i<employee.length;i++)
		{
			if(employee[i]!=null)
			{
				if(employee[i].getEmpId().equals(empId))
				{
					emp=employee[i];
					flag=true;
					break;
				}
					
			}
		}
		if(flag==true)
		{
			System.out.println("EMPLOYEE FOUND BY THIS EMPID.");
		}
		else
		{
			System.out.println("EMPLOYEE NOT FOUND BY THIS EMPID.");
		}
		return emp;
	}
	
	//................................To remove an employee by emp id.................................
	
	public void removeEmployeeByEmpId(String empId)
	{
		boolean flag=false;
		for(int i=0;i<employee.length;i++)
		{
			if(employee[i]!=null)
			{
				if(employee[i].getEmpId().equals(empId))
				{
					employee[i]=null;
					flag=true;
					break;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("EMPLOYEE REMOVED BY THIS EMPID.");
		}
		else
		{
			System.out.println("EMPLOYEE NOT FOUND BY THIS EMPID.");
		}
		
	}
	
	//.......................For show all the employee of the resturant.............................
	
	public void showAllEmployeeAsString()
	{
		for(int i=0;i<employee.length;i++)
		{
			if(employee[i]!=null)
			{
				employee[i].showAEmployeeInfo();
			}
		}
	}
	
	public String getAllEmployeeAsString()
	{
		String allEmp="";
		for(int i=0;i<employee.length;i++)
		{
			if(employee[i]!=null)
			{
				allEmp+=employee[i].getAEmployeeAsString();
			}
		}
		return allEmp;
	}
	
	//...............................For Update Employee................................
	               
	
	public void updateEmployee(Employee updatedEmp)
	{
		boolean flag=false;
		for(int i=0;i<employee.length;i++)
		{  
	        if(employee[i]!=null && employee[i].getEmpId().equals(updatedEmp.getEmpId()))
			{
			  
				employee[i]=updatedEmp;
				flag=true;
				break;
				 
		   }
		}
		if(flag)
		{
			System.out.println("EMPLOYEE UPDATED.");
		}
		else
		{
			System.out.println("NO EMPLOYEE FOUND WITH THIS ID.");
		}
		
	}
	
	
	
}