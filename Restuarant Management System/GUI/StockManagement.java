package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.Equipment;
import Entity.Table;
import EntityList.TableList;
import File.*;

public class StockManagement extends JFrame implements ActionListener
{
	//......................................for Font.................................
	
	Font font15 =new Font("cambria",Font.BOLD,15);
	Font font20= new Font("cambria",Font.BOLD,20);
	Font titlefont =new Font("cambria",Font.BOLD,25);
	
	//............................................component Attribute........................
	
	JLabel titleLabel, tableIdLabel,typeLabel,quantityLabel,updateLabel,searchLabel,deleteLabel;
	JTextField tableIdField,typeField,quantityField,updateField,searchField,deleteField;
	JButton addButton,deleteButton,updateButton,showAllButton,backButton,clearButton,searchButton;
	JTextArea textArea;
	
	TableList tableList=new TableList(1000);
	
	public StockManagement()
	{
		//................................Frame Creation....................................
		
		super("STOCK MANAGEMENT PAGE");
		this.setSize(900,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocation(300,100);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153,153,255));
		
		//...........................Load table details from file.......................
		
	    FileIO.loadTable(tableList);
		
		//.............................For Title..........................................
		
		titleLabel=new JLabel("STOCK MANAGEMENT");
		titleLabel.setBounds(290,20,300,50);
		titleLabel.setFont(titlefont);
		titleLabel.setForeground(Color.WHITE);
		this.add(titleLabel);
		
		//................................Table id component...........................
		
		tableIdLabel =new JLabel("TABLE ID");
		tableIdLabel.setBounds(60,120,150,30);
		tableIdLabel.setFont(font15);
		tableIdLabel.setForeground(Color.BLACK);
		this.add(tableIdLabel);
		
		tableIdField= new JTextField();
		tableIdField.setBounds(200,120,150,30);
		tableIdField.setFont(font15);
		tableIdField.setForeground(Color.BLACK);
		this.add(tableIdField);
		
		//..................................type component.................................
		
		typeLabel=new JLabel("EQUIPMENT TYPE");
		typeLabel.setBounds(60,180,150,30);
		typeLabel.setFont(font15);
		typeLabel.setForeground(Color.BLACK);
		this.add(typeLabel);
		
		typeField=new JTextField();
		typeField.setBounds(200,180,150,30);
		typeField.setFont(font15);
		typeField.setForeground(Color.BLACK);
		this.add(typeField);
		
		//.................................Table Id component...............................
		
		quantityLabel =new JLabel("QUANTITY");
		quantityLabel.setBounds(60,240,150,30);
		quantityLabel.setFont(font15);
		quantityLabel.setForeground(Color.BLACK);
		this.add(quantityLabel);
		
		quantityField=new JTextField();
		quantityField.setBounds(200,240,150,30);
		quantityField.setFont(font15);
		quantityField.setForeground(Color.BLACK);
		this.add(quantityField);
		
		//......................................Button Creation.............................
		
		addButton=new JButton("ADD");
		addButton.setBounds(60,430,130,30);
		addButton.setFont(font20);
		addButton.setBackground(new Color(0,51,102));
		addButton.setForeground(Color.WHITE);
		addButton.addActionListener(this);
		this.add(addButton);
		
		showAllButton =new JButton("DISPLAY");
		showAllButton.setBounds(210,430,130,30);                           
		showAllButton.setFont(font20);
		showAllButton.setBackground(new Color(0,51,102));
		showAllButton.setForeground(Color.WHITE);
		showAllButton.addActionListener(this);
		this.add(showAllButton);
		
	    backButton=new JButton("BACK");
		backButton.setBounds(60,480,130,30);
		backButton.setFont(font20);
		backButton.setBackground(new Color(0,51,102));
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(this);
		this.add(backButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(210,480,130,30);
		clearButton.setFont(font20);
		clearButton.setBackground(new Color(0,51,102));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		this.add(clearButton);
		
		//..................................Text area for display..........................
		textArea=new JTextArea();
		textArea.setFont(font15);
		textArea.setEditable(false);
		textArea.setText(tableList.getAllTableAsString());
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setBounds(450,80,400,320);
		this.add(jsp);
		
		//...........................search component......................................
		
		searchLabel=new JLabel("Search table by id");
		searchLabel.setBounds(530,400,150,30);
		searchLabel.setFont(font15);
		searchLabel.setForeground(Color.BLACK);
		this.add(searchLabel);
		
		searchField=new JTextField();
		searchField.setBounds(530,430,130,30);
		searchField.setFont(font15);
		searchField.setForeground(Color.BLACK);
		this.add(searchField);
		
		searchButton=new JButton("SEARCH");
		searchButton.setBounds(530,480,130,30);
		searchButton.setFont(font20);
		searchButton.setBackground(new Color(0,51,102));
		searchButton.setForeground(Color.WHITE);
		searchButton.addActionListener(this);
		this.add(searchButton);
		
		//...............................Delete Component.....................................
		
		deleteLabel =new JLabel("Delete table by id");
		deleteLabel.setBounds(700,400,150,30);
		deleteLabel.setFont(font15);
		deleteLabel.setForeground(Color.BLACK);
		this.add(deleteLabel);
		
		deleteField=new JTextField();
		deleteField.setBounds(700,430,130,30);
		deleteField.setFont(font15);
		deleteField.setForeground(Color.BLACK);
		this.add(deleteField);
		
		deleteButton= new JButton("DELETE");
		deleteButton.setBounds(700,480,130,30);
	    deleteButton.setFont(font20);
		deleteButton.setBackground(new Color(0,51,102));
		deleteButton.setForeground(Color.WHITE);
		deleteButton.addActionListener(this);
		this.add(deleteButton);
		
		//..................................Update component................................
		
		updateLabel=new JLabel("Update table by id");
		updateLabel.setBounds(360,400,150,30);
		updateLabel.setFont(font15);
		updateLabel.setForeground(Color.BLACK);
		this.add(updateLabel);
		
		updateField=new JTextField();
		updateField.setBounds(360,430,130,30);
		updateField.setFont(font15);
		updateField.setForeground(Color.BLACK);
		this.add(updateField);
		
		updateButton=new JButton("UPDATE");
		updateButton.setBounds(360,480,130,30);              
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
			System.out.println("ADD");
			try{
				int quantity=Integer.parseInt(quantityField.getText());
				String type=typeField.getText();
				String tableId=tableIdField.getText();
				
				Table table=tableList.getTableByTableId(tableId);
				if(table==null)
				{
					Table tab=new Table(quantity,type,tableId);
					tableList.insertTable(tab);
					FileIO.saveTable(tab);
					textArea.setText(tableList. getAllTableAsString());
					
				}else{
				   JOptionPane.showMessageDialog(this,"Table ID Already Used","ID ERROR",JOptionPane.WARNING_MESSAGE);
				}
				
			}
			
			catch (NumberFormatException ex) 
			{
                JOptionPane.showMessageDialog(this, "Invalid quantity ! Please enter a valid quantity.");
				
            }
			
		}
		else if(updateButton==e.getSource())
		{
			System.out.println("UPDATE");
			String tableId=updateField.getText();
			Table table=tableList.getTableByTableId(tableId);
			
			if(table!=null)
			{
				try{
				   int quantity=Integer.parseInt(quantityField.getText());
				   String type=typeField.getText();
				   
				   table.setQuantity(quantity);
				   table.setType(type);
				   
				   tableList.updateTable(table);
				   FileIO.saveTable(table);
				   JOptionPane.showMessageDialog(this,"TABLE UPDATED SUCCESSFULLY");
				   textArea.setText(tableList.getAllTableAsString());
				
				}
			    
				catch (NumberFormatException ex) 
			    {
                   JOptionPane.showMessageDialog(this, "Invalid quantity ! Please enter a valid quantity.");
				
                }
				
			}
			else{
				JOptionPane.showMessageDialog(this, "Table Not Found With This ID.", "ID ERROR", JOptionPane.WARNING_MESSAGE); 
			}
		}
		else if(deleteButton==e.getSource())
		{
			System.out.println("DELETE");
			String tableId=deleteField.getText();
			Table table=tableList.getTableByTableId(tableId);
			if(table!=null)
			{
				int option=JOptionPane.showConfirmDialog(this,"Are you sure to delete it?");
				if(option==JOptionPane.YES_OPTION)
				{
					tableList.removeTableById(tableId);
					textArea.setText(tableList.getAllTableAsString());
				}
			}

			else
				{
				    JOptionPane.showMessageDialog(this,"Table Not Found With This ID.","ID ERROR",JOptionPane.WARNING_MESSAGE);
				}
		}
		else if(searchButton==e.getSource())
		{
			System.out.println("SEARCH");
			String tableId=searchField.getText();
			Table table=tableList.getTableByTableId(tableId);
			if(table!=null)
			{
				textArea.setText(table.getATableDetailsAsString());
	
			}
			else{
				 JOptionPane.showMessageDialog(this,"Table not Found With This ID.","ID ERROR",JOptionPane.WARNING_MESSAGE);
			}
			
			
		}
		else if(showAllButton==e.getSource())
		{
			System.out.println("DISPLAY");
			textArea.setText(tableList.getAllTableAsString());
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