package Entity;
public class Employee extends Person
{
   // .........................Attribute declaration...........................
   
   private String empId;
   private String empDesignation;
   private double empSalary;
   
   // .........................Empty constractor.............................
   
   public Employee()
   {
	   System.out.println("Empty constractor");
   }
   
   // ..........................peramitarize constractor..........................
   
   public Employee(String name,String gender,int age,String contactNumber,String nationalId,String empId,String empDesignation,double empSalary)
   {
	   super(name,gender,age,contactNumber,nationalId);
	   setEmpId(empId);
	   setEmpDesignation(empDesignation);
	   setEmpSalary(empSalary);
   }
   
   //....................................setter getter of Emp id...................................
   
   public void setEmpId(String empId)
   {
	   this.empId=empId;
   }
   public String getEmpId()
   {
	   return empId;
   }
   
   //...................................setter getter of Emp Designation...............................
   
   public void setEmpDesignation(String empDesignation)
   {
	   this.empDesignation=empDesignation;
   }
   public String getEmpDesignation()
   {
	   return empDesignation;
   }
   
   //.................................setter getter of Emp salary.............................
   
   public void setEmpSalary(double empSalary)
   {
	   if(empSalary>=5000 && empSalary<=1000000)
	   {
		   this.empSalary=empSalary;
	   }
   }
   public double getEmpSalary()
   {
	   return empSalary;
   }
   
   //...............................for employee details show...................................
   
   public void showAEmployeeInfo()
   {
	   super.display();
	   System.out.println("Employee Id :"+empId);
	   System.out.println("Employee Designation :"+empDesignation);
	   System.out.println("Employee Salary :"+empSalary);
   }
   
   
   public String getAEmployeeAsString()
   {
	   return super.getPersonDetailsAsString()+"\n"+
	          "Employee Id :"+empId+"\n"+
	          "Employee Designation :"+empDesignation+"\n"+
	          "Employee Salary :"+empSalary+"\n"+
			  "-------------------------"+"\n";
   }
   
   
   
   
   
   
   
   
   
   
}