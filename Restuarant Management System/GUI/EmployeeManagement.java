package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.Person;
import Entity.Employee;
import EntityList.EmployeeList;
import File.*;

public class EmployeeManagement extends JFrame implements ActionListener
{
	//......................................for Font....................................
	
	Font font15 =new Font("cambria",Font.BOLD,15);
	Font font20= new Font("cambria",Font.BOLD,20);
	Font titlefont =new Font("cambria",Font.BOLD,25);
	
	//..................................Attribute declaration...........................
	
	JLabel titleLabel, nameLabel,genderLabel,ageLabel,contactNumberLabel,nationalIdLabel,empIdLabel,empDesignationLabel,empSalaryLabel,updateLabel,searchLabel,deleteLabel;
	JTextField nameField,genderField,ageField,contactNumberField,nationalIdField,empIdField,empDesignationField,empSalaryField,updateField,searchField,deleteField;
	JButton addButton,deleteButton,updateButton,showAllButton,backButton,clearButton,searchButton;
	JTextArea textArea;
	
	EmployeeList employeeList=new EmployeeList(1000);
	
	public EmployeeManagement()
	{
		//................................Frame Creation....................................
		
		super("MENU MANAGEMENT");
		this.setSize(900,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocation(300,100);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153,153,255));
		
		//....................................Load previos employee data from file.....................
		
		FileIO.loadEmployee(employeeList);
		
	    //.............................For Title..........................................
		
		titleLabel=new JLabel("EMPLOYEE MANAGEMENT");
		titleLabel.setBounds(290,20,300,50);
		titleLabel.setFont(titlefont);
		titleLabel.setForeground(Color.WHITE);
		this.add(titleLabel);
		
		//...................................For name Component.................................
		
		nameLabel=new JLabel("EMPLOYEE NAME");
		nameLabel.setBounds(30,80,150,30);
		nameLabel.setFont(font15);
		nameLabel.setForeground(Color.BLACK);
		this.add(nameLabel);
		
		nameField= new JTextField();
		nameField.setBounds(180,80,150,30);
		nameField.setFont(font15);
		nameField.setForeground(Color.BLACK);
		this.add(nameField);
		
		//..................................For gender component.................................
		
		genderLabel=new JLabel("EMPLOYEE GENDER");
		genderLabel.setBounds(30,120,150,30);
		genderLabel.setFont(font15);
		genderLabel.setForeground(Color.BLACK);
		this.add(genderLabel);
		
		genderField=new JTextField();
		genderField.setBounds(180,120,150,30);
		genderField.setFont(font15);
		genderField.setForeground(Color.BLACK);
		this.add(genderField);
		
		//..................................For age component....................................
		
		ageLabel=new JLabel("EMPLOYEE AGE");
		ageLabel.setBounds(30,160,150,30);
		ageLabel.setFont(font15);
		ageLabel.setForeground(Color.BLACK);
		this.add(ageLabel);
		
	    ageField=new JTextField();
		ageField.setBounds(180,160,150,30);
		ageField.setFont(font15);
		ageField.setForeground(Color.BLACK);
		this.add(ageField);
		
		//..................................For Contact number component.............................
		
		contactNumberLabel=new JLabel("CONTACT NUMBER");
		contactNumberLabel.setBounds(30,200,150,30);
		contactNumberLabel.setFont(font15);
	    contactNumberLabel.setForeground(Color.BLACK);
		this.add(contactNumberLabel);
		
		contactNumberField=new JTextField();
		contactNumberField.setBounds(180,200,150,30);
		contactNumberField.setFont(font15);
		contactNumberField.setForeground(Color.BLACK);
		this.add(contactNumberField);
		
		//................................For National Id component..................................
		
		nationalIdLabel=new JLabel("NATIONAL ID");
		nationalIdLabel.setBounds(30,240,150,30);
		nationalIdLabel.setFont(font15);
	    nationalIdLabel.setForeground(Color.BLACK);
		this.add(nationalIdLabel);
		
		nationalIdField=new JTextField();
		nationalIdField.setBounds(180,240,150,30);
		nationalIdField.setFont(font15);
		nationalIdField.setForeground(Color.BLACK);
		this.add(nationalIdField);
		
		//.................................Emp Id component.....................................
		
		empIdLabel=new JLabel("EMPLOYEE ID");
		empIdLabel.setBounds(30,280,150,30);
		empIdLabel.setFont(font15);
	    empIdLabel.setForeground(Color.BLACK);
		this.add(empIdLabel);
		
		empIdField=new JTextField();
		empIdField.setBounds(180,280,150,30);
		empIdField.setFont(font15);
		empIdField.setForeground(Color.BLACK);
		this.add(empIdField);
		
		//................................Emp designation component..............................
		
		empDesignationLabel =new JLabel("DESIGNATION");
		empDesignationLabel.setBounds(30,320,150,30);
		empDesignationLabel.setFont(font15);
	    empDesignationLabel.setForeground(Color.BLACK);
		this.add(empDesignationLabel);
		
	    empDesignationField=new JTextField();
		empDesignationField.setBounds(180,320,150,30);
		empDesignationField.setFont(font15);
		empDesignationLabel.setForeground(Color.BLACK);
		this.add(empDesignationField);
		
		//...............................Emp Salary component......................................
		
		empSalaryLabel = new JLabel("EMPLOYEE SALARY");
		empSalaryLabel.setBounds(30,360,150,30);
		empSalaryLabel.setFont(font15);
	    empSalaryLabel.setForeground(Color.BLACK);
		this.add(empSalaryLabel);
		
	    empSalaryField=new JTextField();
		empSalaryField.setBounds(180,360,150,30);
		empSalaryField.setFont(font15);
		empSalaryField.setForeground(Color.BLACK);
		this.add(empSalaryField);
		
		//...................................Button creation................................
		
		addButton=new JButton("ADD");
		addButton.setBounds(30,430,130,30);
		addButton.setFont(font20);
		addButton.setBackground(new Color(0,51,102));
		addButton.setForeground(Color.WHITE);
		addButton.addActionListener(this);
		this.add(addButton);
		
		showAllButton =new JButton("DISPLAY");
		showAllButton.setBounds(180,430,130,30);                           
		showAllButton.setFont(font20);
		showAllButton.setBackground(new Color(0,51,102));
		showAllButton.setForeground(Color.WHITE);
		showAllButton.addActionListener(this);
		this.add(showAllButton);
		
		
	    backButton=new JButton("BACK");
		backButton.setBounds(30,480,130,30);
		backButton.setFont(font20);
		backButton.setBackground(new Color(0,51,102));
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(this);
		this.add(backButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(180,480,130,30);
		clearButton.setFont(font20);
		clearButton.setBackground(new Color(0,51,102));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		this.add(clearButton);
		
		//.................................For text Area....................................
		
		textArea=new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(font15);
		textArea.setText(employeeList.getAllEmployeeAsString());
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setBounds(430,80,400,320);
		this.add(jsp);
		
		//.............................Update component......................................
		
		updateLabel=new JLabel("Update employee by id");
		updateLabel.setBounds(330,400,170,30);
		updateLabel.setFont(font15);
		updateLabel.setForeground(Color.BLACK);
		this.add(updateLabel);
		
		updateField=new JTextField();
		updateField.setBounds(330,430,130,30);
		updateField.setFont(font15);
		updateField.setForeground(Color.BLACK);
		this.add(updateField);
		
		updateButton=new JButton("UPDATE");
		updateButton.setBounds(330,480,130,30);              
		updateButton.setFont(font20);
		updateButton.setBackground(new Color(0,51,102));
		updateButton.setForeground(Color.WHITE);
		updateButton.addActionListener(this);
		this.add(updateButton);
		
		//..........................................Search Component..............................
		
		searchLabel=new JLabel("Search employee by id");
		searchLabel.setBounds(500,400,170,30);
		searchLabel.setFont(font15);
		searchLabel.setForeground(Color.BLACK);
		this.add(searchLabel);
		
		searchField=new JTextField();
		searchField.setBounds(500,430,130,30);
		searchField.setFont(font15);
		searchField.setForeground(Color.BLACK);
		this.add(searchField);
		
		searchButton=new JButton("SEARCH");
		searchButton.setBounds(500,480,130,30);
		searchButton.setFont(font20);
		searchButton.setBackground(new Color(0,51,102));
		searchButton.setForeground(Color.WHITE);
		searchButton.addActionListener(this);
		this.add(searchButton);
		
		//......................................For Delete Component....................................
		
		deleteLabel =new JLabel("Delete food by id");
		deleteLabel.setBounds(670,400,170,30);
		deleteLabel.setFont(font15);
		deleteLabel.setForeground(Color.BLACK);
		this.add(deleteLabel);
		
		deleteField=new JTextField();
		deleteField.setBounds(670,430,130,30);
		deleteField.setFont(font15);
		deleteField.setForeground(Color.BLACK);
		this.add(deleteField);
		
		deleteButton= new JButton("DELETE");
		deleteButton.setBounds(670,480,130,30);
	    deleteButton.setFont(font20);
		deleteButton.setBackground(new Color(0,51,102));
		deleteButton.setForeground(Color.WHITE);
		deleteButton.addActionListener(this);
		this.add(deleteButton);
		
		
		this.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(addButton==e.getSource())
		{
			System.out.println("ADD CLICKED");
			try{
				String empName=nameField.getText();
				String empGender=genderField.getText();
				int empAge= Integer.parseInt(ageField.getText());
				String contact=contactNumberField.getText();
				String nationalId=nationalIdField.getText();
				String empId=empIdField.getText();
				String designation=empDesignationField.getText();
				double salary=Double.parseDouble(empSalaryField.getText());
				
				Employee emp = employeeList.getEmployeeByEmpId(empId);
				if(emp==null)
				{
					Employee Emp=new Employee(empName,empGender,empAge,contact,nationalId,empId,designation,salary);
					employeeList.insertEmployee(Emp);
					FileIO.saveEmployee(Emp);
					textArea.setText(employeeList.getAllEmployeeAsString());
				}
				else{
				JOptionPane.showMessageDialog(this,"Employee ID Already Used","ID ERROR",JOptionPane.WARNING_MESSAGE);
			}
			
				
			}
			
			catch(NumberFormatException ex)
			{
	
				JOptionPane.showMessageDialog(this, "Please enter age in integer and salary in integer/double.");
			}
			
		}
		else if(updateButton==e.getSource())
		{
			System.out.println("UPDATE CLICKED");
			String empId=updateField.getText();
			Employee emp=employeeList.getEmployeeByEmpId(empId);
			if(emp!=null)
			{
				try
				{
					String empName=nameField.getText();
				    String empGender=genderField.getText();
				    int empAge= Integer.parseInt(ageField.getText());
				    String contact=contactNumberField.getText();
				    String nationalId=nationalIdField.getText();
				    String designation=empDesignationField.getText();
				    double salary=Double.parseDouble(empSalaryField.getText());
					
					emp.setName(empName);
					emp.setGender(empGender);
					emp.setAge(empAge);
					emp.setContactNumber(contact);
					emp.setNationalId(nationalId);
					emp.setEmpDesignation(designation);
					emp.setEmpSalary(salary);
					
					employeeList.updateEmployee(emp);
					FileIO.saveEmployee(emp);
					
					JOptionPane.showMessageDialog(this,"EMPLOYEE UPDATED SUCCESSFULLY");
					
					textArea.setText(employeeList.getAllEmployeeAsString());
				  	
				}
				
				catch(NumberFormatException ex) 
			    {
                   JOptionPane.showMessageDialog(this, "Please enter int age or int/double salary.");
                }
			}
			else
			{
				 JOptionPane.showMessageDialog(this, "Employee Not Found With This ID.", "ID ERROR", JOptionPane.WARNING_MESSAGE);
			}
			
		}
		
		else if(deleteButton==e.getSource())
		{
			System.out.println("DELETE CLICKED");
			String empId=deleteField.getText();
			Employee emp=employeeList.getEmployeeByEmpId(empId);
			if(emp!=null)
			{
				int option=JOptionPane.showConfirmDialog(this,"Are you sure to delete it?");
				if(option==JOptionPane.YES_OPTION)
				{
					employeeList.removeEmployeeByEmpId(empId);
					textArea.setText(employeeList.getAllEmployeeAsString());
				}
			
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Employee Not Found With This ID.", "ID ERROR", JOptionPane.WARNING_MESSAGE);
			}
			
		
		}
		else if(searchButton==e.getSource())
		{
			System.out.println("SEARCH CLICKED");
			String empId=searchField.getText();
			Employee emp=employeeList.getEmployeeByEmpId(empId);
			if(emp!=null)
			{
				textArea.setText(emp.getAEmployeeAsString());
			}
			else{
				 JOptionPane.showMessageDialog(this,"Employee Not Found With This ID.","ID ERROR",JOptionPane.WARNING_MESSAGE);
			}
			
		}
		else if(showAllButton==e.getSource())
		{
			System.out.println("DISPLAY CLICKED");
			textArea.setText(employeeList.getAllEmployeeAsString());
		}
		else if(clearButton==e.getSource())
		{
			System.out.println("CLEAR CLICKED");
			textArea.setText("");
		}
		else if(backButton==e.getSource())
		{
			System.out.println("BACK CLICKED");
			ManagementPage mngPane =new ManagementPage();
			this.setVisible(false);
		}
	
	}

	   
	}
	
	
	
	
	

	
	
