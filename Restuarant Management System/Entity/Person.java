package Entity;
public abstract class Person
{
	//........................ Attribute declaration......................
	
	private String name;
	private String gender;
	private int age;
	private String contactNumber;
	private String nationalId;
	
	//........................Empty constractor...........................
	
	public Person()
	{
		System.out.println("Empty Constractor.");
	}
	
	//...........................Peramitarize constractor....................
	
	public Person(String name,String gender,int age,String contactNumber,String nationalId)
	{
		System.out.println("Peramitarize Constractor.");
		setName(name);
		setGender(gender);
		setAge(age);
		setContactNumber(contactNumber);
		setNationalId(nationalId);
	}
	
	// ...............................setter getter of name.......................
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	//..........................setter getter of gender.........................
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	
	//.............................setter getter of age..........................
	
	public void setAge(int age)
	{
		
	    this.age=age;
		
	}
	public int getAge()
	{
		return age;
	}
	
	//................................setter getter of contact number........................
	
	public void setContactNumber(String contactNumber)
	{
		if(contactNumber.length()>10)
		{
			this.contactNumber=contactNumber;
		}
		else{
			System.out.println("Invalid Contact Number."); 
		}
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
	
	// ...........................setter getter of national id..............................
	
	public void setNationalId(String nationalId)
	{
		if(nationalId.length()>10)
		{
			this.nationalId=nationalId;
		}
		else{
			System.out.println("Invalid National Id Number.");
		}
	}
	public String getNationalId()
	{
		return nationalId;
	}
	
	// ..........................Display all imformation...........................
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Age :"+age);
		System.out.println("Contact Number :"+contactNumber);
		System.out.println("National Id :"+nationalId);
	}
	
	public String getPersonDetailsAsString()
	{
		return "-------------------------"+"\n"+
	          "Name :"+name+"\n"+
		      "Gender :"+gender+"\n"+
		      "Age :"+age+"\n"+
		      "Contact Number :"+contactNumber+"\n"+
		      "National Id :"+nationalId;
	}

    //.......................Abstract method ................................
	public abstract String getAEmployeeAsString();
	
     
	
	
	
	
	
	
	
	
}