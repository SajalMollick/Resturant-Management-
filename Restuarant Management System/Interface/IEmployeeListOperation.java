package Interface;
import Entity.*;
import EntityList.*;

public interface IEmployeeListOperation
{
	public void insertEmployee(Employee emp);
	public Employee getEmployeeByEmpId(String empId);
	public void removeEmployeeByEmpId(String empId);
	public String getAllEmployeeAsString();
	public void updateEmployee(Employee updatedEmp);
	
}