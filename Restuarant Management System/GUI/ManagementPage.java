package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ManagementPage extends JFrame implements ActionListener
{
	// ...........................Font creation..................
	
	Font font20=new Font("cambria",Font.BOLD,20);
	
	
	//............................Component declaraton....................
	
	JButton menuMngButton,orderMngButton,empMngButton,stockMngButton,logOutButton;
	
	public ManagementPage()
	{
		super("MANAGEMENT PAGE");
		this.setSize(900,600);
		this.setLocation(300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(153,153,255));
		this.setLayout(null);
		
		//..............................Button Creation.....................
		
		menuMngButton=new JButton("MENU MANAGEMENT");
		menuMngButton.setBounds(300,80,280,50);
		menuMngButton.setBackground(new Color(0,51,102));
		menuMngButton.setFont(font20);
		menuMngButton.setForeground(Color.WHITE);
		menuMngButton.addActionListener(this);
		this.add(menuMngButton);
		
		orderMngButton=new JButton("ORDER MANAGEMENT");
		orderMngButton.setBounds(300,150,280,50);
		orderMngButton.setBackground(new Color(0,51,102));
		orderMngButton.setFont(font20);
		orderMngButton.setForeground(Color.WHITE);
		orderMngButton.addActionListener(this);
		this.add(orderMngButton);
		
		empMngButton=new JButton("EMPLOYEE MANAGEMENT");
		empMngButton.setBounds(300,220,280,50);
		empMngButton.setBackground(new Color(0,51,102));
		empMngButton.setFont(font20);
		empMngButton.setForeground(Color.WHITE);
		empMngButton.addActionListener(this);
		this.add(empMngButton);
		
		stockMngButton=new JButton("STOCK MANAGEMENT");
		stockMngButton.setBounds(300,290,280,50);
		stockMngButton.setBackground(new Color(0,51,102));
		stockMngButton.setFont(font20);
		stockMngButton.setForeground(Color.WHITE);
		stockMngButton.addActionListener(this);
		this.add(stockMngButton);
		
		logOutButton=new JButton("LOG-OUT");
		logOutButton.setBounds(340,400,200,40);
		logOutButton.setBackground(new Color(0,51,102));
		logOutButton.setFont(font20);
		logOutButton.setForeground(Color.WHITE);
		logOutButton.addActionListener(this);
		this.add(logOutButton);
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(menuMngButton==e.getSource())
		{
			System.out.println("MENU");
			MenuManagement menuMng = new MenuManagement();
			this.setVisible(false);
		}
		else if(orderMngButton==e.getSource())
		{
			System.out.println("ORDER");
			OrderManagement OrMng=new OrderManagement();
			this.setVisible(false);
		}
		else if(empMngButton==e.getSource())
		{
			System.out.println("EMP");
			EmployeeManagement empMng =new  EmployeeManagement();
			this.setVisible(false);
		}
		else if(stockMngButton==e.getSource())
		{
			
			System.out.println("STOCK");
			StockManagement smng=new StockManagement();
			this.setVisible(false);
		}
		else if(logOutButton==e.getSource())
		{
			System.out.println("LOG OUT");
			AdminPanel admin=new AdminPanel();
			this.setVisible(false);
		}
	}
	
	
}