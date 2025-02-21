package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame implements ActionListener
{
	//..........................Font creation.......................
	Font titleFont = new Font("cambria",Font.ITALIC,25);
	Font font20 = new Font("cambria",Font.BOLD,20);
	
	JLabel titleLabel;
	JButton letsGoButton;
	
	public WelcomePage()
	{
		//..............................Frame creation..................................
		super("WELCOME");
		this.setSize(900,600);
		this.setLocation(300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153,153,255));
		
		//..............................Title Creation....................................
		
		titleLabel=new JLabel("WELCOME TO RESTAURANT MANAGEMENT SYSTEM");
		titleLabel.setBounds(150,50,600,50);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(new Color(0,0,102));
		this.add(titleLabel);
		
		//...........................Welcome Button  creation..........................
		
		letsGoButton=new JButton("LET'S GO");
		letsGoButton.setBounds(350,250,150,50);
		letsGoButton.setBackground(new Color(0,51,102));
		letsGoButton.setForeground(Color.WHITE);
		letsGoButton.setFont(font20);
		letsGoButton.addActionListener(this);
		this.add(letsGoButton);
		
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(letsGoButton == e.getSource())
		{
			 AdminPanel admin=new AdminPanel();
			this.setVisible(false);
		}
	}
	
	
	
	
}