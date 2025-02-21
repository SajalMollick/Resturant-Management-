package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.Order;
import EntityList.OrderList;
import File.*;

public class OrderManagement extends JFrame implements ActionListener
{
	//......................................for Font.................................
	
	Font font15 =new Font("cambria",Font.BOLD,15);
	Font font20= new Font("cambria",Font.BOLD,20);
	Font titlefont =new Font("cambria",Font.BOLD,25);
	
	// ...............................Attribute declaration..............................
	
	JLabel titleLabel,orderIdLabel,customerNameLabel,contactLabel,addressLabel,foodLabel,updateLabel,searchLabel,deleteLabel;
	
	JTextField orderIdField,customerNameField,contactField,addressField,foodField,updateField,searchField,deleteField;
	
	JButton addButton,deleteButton,updateButton,showAllButton,backButton,clearButton,searchButton;
	
	JTextArea textArea;
	
	OrderList orderList=new OrderList(1000);
	
	public OrderManagement()
	{
		super("ORDER MANAGEMENT PAGE");
		this.setSize(900,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocation(300,100);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153,153,255));
		
		//............................For Loadig old order.............................
		
		FileIO.loadOrder(orderList);
		
		//................................For title .......................................
		
		titleLabel=new JLabel("ORDER MANAGEMENT");
		titleLabel.setBounds(290,20,300,50);
		titleLabel.setFont(titlefont);
		titleLabel.setForeground(Color.WHITE);
		this.add(titleLabel);
		
		//...........................For Order Id Component..................................
		
		orderIdLabel=new JLabel("ORDER ID");
		orderIdLabel.setBounds(50,120,150,30);
		orderIdLabel.setFont(font15);
		orderIdLabel.setForeground(Color.BLACK);
		this.add(orderIdLabel);
		
		orderIdField=new JTextField();
		orderIdField.setBounds(200,120,150,30);
		orderIdField.setFont(font15);
		orderIdField.setForeground(Color.BLACK);
		this.add(orderIdField);
		
		//..............................For Customer name compont..................................
		
		customerNameLabel =new JLabel("CUSTOMER NAME");
		customerNameLabel.setBounds(50,170,150,30);
		customerNameLabel.setFont(font15);
		customerNameLabel.setForeground(Color.BLACK);
		this.add(customerNameLabel);
		
		customerNameField=new JTextField();
		customerNameField.setBounds(200,170,150,30);
		customerNameField.setFont(font15);
		customerNameField.setForeground(Color.BLACK);
		this.add(customerNameField);
		
		//.............................For contact Component........................................
		
		contactLabel =new JLabel("CONTACT NUMBER");
		contactLabel.setBounds(50,220,150,30);
		contactLabel.setFont(font15);
		contactLabel.setForeground(Color.BLACK);
		this.add(contactLabel);
		
		contactField=new JTextField();
        contactField.setBounds(200,220,150,30);
		contactField.setFont(font15);
		contactField.setForeground(Color.BLACK);
		this.add(contactField);
		
		//....................................For address component..................................
		
		addressLabel=new JLabel("ADDRESS");
		addressLabel.setBounds(50,270,150,30);
		addressLabel.setFont(font15);
		addressLabel.setForeground(Color.BLACK);
		this.add(addressLabel);
		
		addressField = new JTextField();
        addressField.setBounds(200,270,150,30);
		addressField.setFont(font15);
		addressField.setForeground(Color.BLACK);
		this.add(addressField);
		
		//.................................For food component..............................
		
		foodLabel=new JLabel("ORDERED FOODS");
		foodLabel.setBounds(50,320,150,30);
		foodLabel.setFont(font15);
		foodLabel.setForeground(Color.BLACK);
		this.add(foodLabel);
		
		foodField=new JTextField();
		foodField.setBounds(200,320,150,30);
		foodField.setFont(font15);
		foodField.setForeground(Color.BLACK);
		this.add(foodField);
		
		//.................................Button Creation...............................
		
		addButton=new JButton("ADD");
		addButton.setBounds(50,420,130,30);
		addButton.setFont(font20);
		addButton.setBackground(new Color(0,51,102));
		addButton.setForeground(Color.WHITE);
		addButton.addActionListener(this);
		this.add(addButton);
		
		showAllButton=new JButton("DISPLAY");
		showAllButton.setBounds(200,420,130,30);
		showAllButton.setFont(font20);
		showAllButton.setBackground(new Color(0,51,102));
		showAllButton.setForeground(Color.WHITE);
		showAllButton.addActionListener(this);
		this.add(showAllButton);
		
		backButton =new JButton("BACK");
		backButton.setBounds(50,470,130,30);
		backButton.setFont(font20);
		backButton.setBackground(new Color(0,51,102));
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(this);
		this.add(backButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(200,470,130,30);
		clearButton.setFont(font20);
		clearButton.setBackground(new Color(0,51,102));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		this.add(clearButton);
		
		//.........................................Text Area Creation....................................
		
		textArea=new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(font15);
		textArea.setText(orderList.getAllOrderAsString());
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setBounds(450,80,400,310);
		this.add(jsp);
		
		//..............................Update component.......................................
		
		updateLabel=new JLabel("Update food by id");
		updateLabel.setBounds(370,390,150,30);
		updateLabel.setFont(font15);
		updateLabel.setForeground(Color.BLACK);
		this.add(updateLabel);
		
		updateField=new JTextField();
		updateField.setBounds(370,420,130,30);
		updateField.setFont(font15);
		updateField.setForeground(Color.BLACK);
		this.add(updateField);
		
		updateButton=new JButton("UPDATE");
		updateButton.setBounds(370,470,130,30);              
		updateButton.setFont(font20);
		updateButton.setBackground(new Color(0,51,102));
		updateButton.setForeground(Color.WHITE);
		updateButton.addActionListener(this);
		this.add(updateButton);
		
		//......................................Search component...................................
		
		searchLabel=new JLabel("Search food by id");
		searchLabel.setBounds(520,390,150,30);
		searchLabel.setFont(font15);
		searchLabel.setForeground(Color.BLACK);
		this.add(searchLabel);
		
		searchField=new JTextField();
		searchField.setBounds(520,420,130,30);
		searchField.setFont(font15);
		searchField.setForeground(Color.BLACK);
		this.add(searchField);
		
		searchButton=new JButton("SEARCH");
		searchButton.setBounds(520,470,130,30);
		searchButton.setFont(font20);
		searchButton.setBackground(new Color(0,51,102));
		searchButton.setForeground(Color.WHITE);
		searchButton.addActionListener(this);
		this.add(searchButton);
		
		//...........................................Delete component............................
		
		deleteLabel =new JLabel("Delete food by id");
		deleteLabel.setBounds(670,390,150,30);
		deleteLabel.setFont(font15);
		deleteLabel.setForeground(Color.BLACK);
		this.add(deleteLabel);
		
		deleteField=new JTextField();
		deleteField.setBounds(670,420,130,30);
		deleteField.setFont(font15);
		deleteField.setForeground(Color.BLACK);
		this.add(deleteField);
		
		deleteButton= new JButton("DELETE");
		deleteButton.setBounds(670,470,130,30);
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
			System.out.println("ADD");
			String orderId=orderIdField.getText();
			String cusName=customerNameField.getText();
			String contact=contactField.getText();
			String address=addressField.getText();
			String foods=foodField.getText();
			
			Order order=orderList.getOrderById(orderId);
			
			if(order==null)
			{
				Order orderItem=new Order(orderId,cusName,contact,address,foods);
				orderList.insertOrder(orderItem);
				FileIO.saveOrder(orderItem);
				textArea.setText(orderList.getAllOrderAsString());
			}
			else{
				JOptionPane.showMessageDialog(this,"Order id is already used","ID ERROR",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		else if(updateButton==e.getSource())
		{
			System.out.println("UPDATE");
			String orderId=updateField.getText();
			Order order=orderList.getOrderById(orderId);
			if(order!=null)
			{
			    String cusName=customerNameField.getText();
			    String contact=contactField.getText();
			    String address=addressField.getText();
			    String foods=foodField.getText();
				
				order.setCustomerName(cusName);
				order.setContact(contact);
				order.setAddress(address);
				order.setFoods(foods);
				
				orderList.updateOrder(order);
				textArea.setText(orderList.getAllOrderAsString());
				
				JOptionPane.showMessageDialog(this,"Update Succesfully");
			}
			else{
				JOptionPane.showMessageDialog(this,"No order found with this id","ID ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		else if(deleteButton==e.getSource())
		{
			System.out.println("DELETE");
			String orderId=deleteField.getText();
			Order order=orderList.getOrderById(orderId);
			
			if(order!=null)
			{
				int option=JOptionPane.showConfirmDialog(this,"Are you sure to delete it");
				if(option==JOptionPane.YES_OPTION)
				{
					orderList.removeOrder(orderId);
					textArea.setText(orderList.getAllOrderAsString());
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this,"No order found with this id","ID ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		
		}
		else if(searchButton==e.getSource())
		{
			System.out.println("SEARCH");
			String orderId=searchField.getText();
			Order order=orderList.getOrderById(orderId);
			
			if(order!=null)
			{
		       textArea.setText(order.getAOrderAsString());
			}
			else{
				JOptionPane.showMessageDialog(this,"No order found with this id","ID ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(showAllButton==e.getSource())
		{
			System.out.println("DISPLAY");
			textArea.setText(orderList.getAllOrderAsString());
		}
		else if(clearButton==e.getSource())
		{
			System.out.println("CLEAR");
			textArea.setText("");
		}
		else if(backButton==e.getSource())
		{
			System.out.println("BACK");
			ManagementPage mngPane =new ManagementPage();
			this.setVisible(false);
			
		}
	}
	
	
	
	
	
}