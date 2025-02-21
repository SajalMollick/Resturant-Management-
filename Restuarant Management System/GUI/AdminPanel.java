package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel extends JFrame implements ActionListener
{
	// ...............................Font creation...................................
	
	Font font15 = new Font("cambria",Font.BOLD,15);
	Font font20 = new Font("cambria",Font.BOLD,20);
	
	//...............................Component declaretion.............................
	
	JTextArea textArea ;
	JButton signInButton,signUpButton,contributionButton,clearButton;
	
	public AdminPanel()
	{
		//.........................Frame creation.................................
		
		super("ADMIN PANEL");
		this.setSize(900,600);
		this.setLocation(300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153,153,255));
		
		// ...............................Text area creation..................
		
		textArea=new JTextArea();
		textArea.setFont(font15);
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setBounds(100,100,350,350);
		this.add(jsp);
		
		//..................................Button Creation...............................
		
		signInButton=new JButton("SIGN-IN");
		signInButton.setBounds(550,100,180,50);
		signInButton.setFont(font20);
		signInButton.setBackground(new Color(0,51,102));
		signInButton.setForeground(Color.WHITE);
		signInButton.addActionListener(this);
		this.add(signInButton);
		
		signUpButton=new JButton("SIGN-UP");
		signUpButton.setBounds(550,200,180,50);
		signUpButton.setFont(font20);
		signUpButton.setBackground(new Color(0,51,102));
		signUpButton.setForeground(Color.WHITE);
		signUpButton.addActionListener(this);
		this.add(signUpButton);
		
		contributionButton=new JButton("CONTRIBUTION");
		contributionButton.setBounds(550,300,180,50);
		contributionButton.setFont(font20);
		contributionButton.setBackground(new Color(0,51,102));
		contributionButton.setForeground(Color.WHITE);
		contributionButton.addActionListener(this);
		this.add(contributionButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(550,400,180,50);
		clearButton.setFont(font20);
		clearButton.setBackground(new Color(0,51,102));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		this.add(clearButton);
		
		
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{ 
	    if(signInButton == e.getSource())
		{
			LogInPage logIn =new LogInPage();
			this.setVisible(false);
		}			
		 
		else if(signUpButton == e.getSource())
		{
			RegistrationPage registration = new RegistrationPage();
			this.setVisible(false);
		}
		else if(contributionButton == e.getSource())
		{
			textArea.setText("sshfshffhsdhfkshfhf");
			
			
		}
		else if(clearButton==e.getSource())
		{
			textArea.setText("");
		}
	}
	
	
	
	
	
	
	
}