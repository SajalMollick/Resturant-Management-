package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.FoodItem;
import EntityList.FoodItemList;
import File.*;

public class MenuManagement extends JFrame implements ActionListener
{
	//......................................for Font.................................
	
	Font font15 =new Font("cambria",Font.BOLD,15);
	Font font20= new Font("cambria",Font.BOLD,20);
	Font titlefont =new Font("cambria",Font.BOLD,25);
	
	//...............................Attribute .....................................
	
	JLabel titleLabel,foodNameLabel,foodIdLabel,foodCategoryLabel,foodPriceLabel,searchLabel,deleteLabel,updateLabel;
	JTextField foodNameField,foodIdField,foodCategoryField,foodPriceField,searchField,deleteField,updateField;
	JButton addButton,deleteButton,updateButton,showAllButton,backButton,clearButton,searchButton;
	JTextArea textArea;
	
	FoodItemList foodItemList=new FoodItemList(1000);
	
	public MenuManagement()
	{
		//................................Frame Creation....................................
		
		super("MENU MANAGEMENT PAGE");
		this.setSize(900,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocation(300,100);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153,153,255));
		
		//...............................Load menu from file..............................
		
		FileIO.loadFoodItem(foodItemList);
		
		//.............................For Title..........................................
		
		titleLabel=new JLabel("MENU MANAGEMENT");
		titleLabel.setBounds(290,20,300,50);
		titleLabel.setFont(titlefont);
		titleLabel.setForeground(Color.WHITE);
		this.add(titleLabel);
		
		//...................................food name component.........................
		
		foodNameLabel =new JLabel("FOOD NAME");
		foodNameLabel.setBounds(60,100,150,30);
		foodNameLabel.setFont(font15);
		foodNameLabel.setForeground(Color.BLACK);
		this.add(foodNameLabel);
		
		foodNameField= new JTextField();
		foodNameField.setBounds(200,100,150,30);
		foodNameField.setFont(font15);
		foodNameField.setForeground(Color.BLACK);
		this.add(foodNameField);
		
		//.................................food id component...................................
		
		foodIdLabel=new JLabel("FOOD ID");
		foodIdLabel.setBounds(60,160,150,30);
		foodIdLabel.setFont(font15);
		foodIdLabel.setForeground(Color.BLACK);
		this.add(foodIdLabel);
		
		foodIdField=new JTextField();
		foodIdField.setBounds(200,160,150,30);
		foodIdField.setFont(font15);
		foodIdField.setForeground(Color.BLACK);
		this.add(foodIdField);
		
		//................................food category component.............................
		
		foodCategoryLabel =new JLabel("FOOD CATEGORY");
		foodCategoryLabel.setBounds(60,220,150,30);
		foodCategoryLabel.setFont(font15);
		foodCategoryLabel.setForeground(Color.BLACK);
		this.add(foodCategoryLabel);
		
		foodCategoryField=new JTextField();
		foodCategoryField.setBounds(200,220,150,30);
		foodCategoryField.setFont(font15);
		foodCategoryField.setForeground(Color.BLACK);
		this.add(foodCategoryField);
		
	   //..................................food Price component............................
	   
	    foodPriceLabel=new JLabel("FOOD PRICE");
		foodPriceLabel.setBounds(60,280,150,30);
		foodPriceLabel.setFont(font15);
		foodPriceLabel.setForeground(Color.BLACK);
		this.add(foodPriceLabel);
		
		foodPriceField=new JTextField();
		foodPriceField.setBounds(200,280,150,30);
		foodPriceField.setFont(font15);
		foodPriceField.setForeground(Color.BLACK);
		this.add(foodPriceField);
		
		//.................................Button creation.....................................
		
		addButton=new JButton("ADD");
		addButton.setBounds(20,430,130,30);
		addButton.setFont(font20);
		addButton.setBackground(new Color(0,51,102));
		addButton.setForeground(Color.WHITE);
		addButton.addActionListener(this);
		this.add(addButton);
		
		showAllButton =new JButton("DISPLAY");
		showAllButton.setBounds(170,430,130,30);                           
		showAllButton.setFont(font20);
		showAllButton.setBackground(new Color(0,51,102));
		showAllButton.setForeground(Color.WHITE);
		showAllButton.addActionListener(this);
		this.add(showAllButton);
		
	    backButton=new JButton("BACK");
		backButton.setBounds(20,480,130,30);
		backButton.setFont(font20);
		backButton.setBackground(new Color(0,51,102));
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(this);
		this.add(backButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(170,480,130,30);
		clearButton.setFont(font20);
		clearButton.setBackground(new Color(0,51,102));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		this.add(clearButton);
		
		//..............................text area for display....................................
		
		textArea=new JTextArea();
		textArea.setFont(font15);
		textArea.setEditable(false);
		textArea.setText(foodItemList.getAllFoodItemAsString());
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setBounds(460,80,400,320);
		this.add(jsp);
		
		//...........................search component......................................
		
		searchLabel=new JLabel("Search food by id");
		searchLabel.setBounds(500,400,150,30);
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
		
		//...............................Delete Component.....................................
		
		deleteLabel =new JLabel("Delete food by id");
		deleteLabel.setBounds(670,400,150,30);
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
		
		//..................................Update component................................
		
		updateLabel=new JLabel("Update food by id");
		updateLabel.setBounds(330,400,150,30);
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
		
		
	
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    if(addButton==e.getSource())
	    {
			try{
				
		      //System.out.println("ADD CLICKED");
			  String foodName=foodNameField.getText();
			  String foodId=foodIdField.getText();
			  String foodCategory=foodCategoryField.getText();
		      double foodPrice = Double.parseDouble(foodPriceField.getText());
			  
			  FoodItem foodItem = foodItemList.getFoodItemById( foodId);
			
			if(foodItem==null)
			{
			    FoodItem fooditem=new FoodItem(foodName,foodId,foodCategory,foodPrice);
				foodItemList.insertFoodItem(fooditem);
				FileIO.saveFoodItem(fooditem);
				textArea.setText(foodItemList.getAllFoodItemAsString());
			}	
			else{
				JOptionPane.showMessageDialog(this,"Food ID Already Used","ID ERROR",JOptionPane.WARNING_MESSAGE);
			}
			
            }
			
		    catch (NumberFormatException ex) 
			{
                JOptionPane.showMessageDialog(this, "Invalid food price ! Please enter a valid food price.");
				
            }
			
	    }
		else if(updateButton==e.getSource())
		{
		    System.out.println("UPDATE CLICKED");
			String foodId=updateField.getText();
			FoodItem foodItem=foodItemList.getFoodItemById(foodId);
			if(foodItem!=null)
			{
				
		    try
			{
			  
			  String foodName=foodNameField.getText(); 
			  String foodCategory=foodCategoryField.getText();
		      double foodPrice = Double.parseDouble(foodPriceField.getText());
			  
			  foodItem.setFoodName(foodName);
			  foodItem.setFoodCategory(foodCategory);
			  foodItem.setFoodPrice(foodPrice);
			  
			  foodItemList.updateFoodItem(foodItem);
			  FileIO.saveFoodItem(foodItem);
			  
			  JOptionPane.showMessageDialog(this,"FOOD ITEM UPDATED SUCCESSFULLY");
			  textArea.setText(foodItemList.getAllFoodItemAsString());
			  
			}
			
			catch(NumberFormatException ex) 
			{
                JOptionPane.showMessageDialog(this, "Invalid food price ! Please enter a valid food price.");
				
            }
				
			   
			}
			else{

                JOptionPane.showMessageDialog(this, "Food Item Not Found With This ID.", "ID ERROR", JOptionPane.WARNING_MESSAGE); 
			}
			
			
			
			
			
		} 
		else if(deleteButton==e.getSource())
		{
			System.out.println("DELETE CLICKED");
			String foodId=deleteField.getText();
			FoodItem foodItem=foodItemList.getFoodItemById(foodId);
			if(foodItem!=null)
			{
				int option=JOptionPane.showConfirmDialog(this,"Are you sure to delete it.");
				
				if(option==JOptionPane.YES_OPTION)
				{
					foodItemList.removeFoodItemById(foodId);
					textArea.setText(foodItemList.getAllFoodItemAsString());
				}
				
			}
			else
				{
					 JOptionPane.showMessageDialog(this,"Food Item Not Found With This ID.","ID ERROR",JOptionPane.WARNING_MESSAGE);
				}
			
			
		}
		else if(searchButton==e.getSource())
		{
			System.out.println("SEARCH CLICKED");
			String foodId=searchField.getText();
			FoodItem foodItem = foodItemList.getFoodItemById(foodId);
			if(foodItem!=null)
			{
				textArea.setText(foodItem.getAFoodItemAsString());
				
			}
			else{
				 JOptionPane.showMessageDialog(this,"Food Item Not Found With This ID.","ID ERROR",JOptionPane.WARNING_MESSAGE);
			}
			
		}
		else if(showAllButton==e.getSource())
		{
			System.out.println("DISPLAY CLICKED");
			textArea.setText(foodItemList.getAllFoodItemAsString());
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
