package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import File.*;

public class LogInPage extends JFrame implements ActionListener
{
	// ...............................Font creation...................................

	Font font15 = new Font("Cambria", Font.BOLD, 15);
	Font font20 = new Font("Cambria", Font.BOLD, 20);
	
	//..................................Component declaration..........................

	JLabel userNameLabel, passwordLabel;
	JTextField userNameField;
	JPasswordField passwordFeild;
	JButton logInButton,backButton;
	
	public LogInPage()
	{
		super("LOG-IN PAGE");
		this.setSize(900, 600);
		this.setLocation(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153, 153, 255));
		
		// .............................Label creation...........................

		userNameLabel = new JLabel("USER NAME :");
		userNameLabel.setBounds(250, 165, 150, 50);
		userNameLabel.setFont(font20);
		userNameLabel.setForeground(Color.BLACK);
		this.add(userNameLabel);
		
		passwordLabel = new JLabel("PASSWORD :");
		passwordLabel.setBounds(250, 240, 150, 50);
		passwordLabel.setFont(font20);
		passwordLabel.setForeground(Color.BLACK);
		this.add(passwordLabel);
		
		//..................................Text Field creation........................

		userNameField = new JTextField();
		userNameField.setBounds(400, 175, 150, 30);
		userNameField.setFont(font20);
		userNameField.setForeground(Color.BLACK);
		this.add(userNameField);
		
		passwordFeild = new JPasswordField();
		passwordFeild.setBounds(400, 250, 150, 30);
		passwordFeild.setFont(font20);
		passwordFeild.setForeground(Color.BLACK);
		this.add(passwordFeild);
		
		//...........................Button creation.............................

		logInButton = new JButton("LOG-IN");
		logInButton.setBounds(250, 340, 140, 40);
		logInButton.setFont(font20);
		logInButton.setBackground(new Color(0, 51, 102));
		logInButton.setForeground(Color.WHITE);
		logInButton.addActionListener(this);
		this.add(logInButton);
		
		backButton = new JButton("BACK");
		backButton.setBounds(420, 340, 140, 40);
		backButton.setFont(font20);
		backButton.setBackground(new Color(0, 51, 102));
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(this);
		this.add(backButton);

	
		this.setVisible(true);
	}
	
	  public void actionPerformed(ActionEvent e)
	  {
		  if( logInButton== e.getSource())
		  {
			  String uname=userNameField.getText();
			  String upass= new String(passwordFeild.getPassword());
			 if(FileIO.cheakUser(uname,upass))
			  {
				  JOptionPane.showMessageDialog(this,"VALID USER","VALID",JOptionPane.PLAIN_MESSAGE);
				  ManagementPage mngPage = new ManagementPage();
				  this.setVisible(false);
				  
			  }
			  else{
				  JOptionPane.showMessageDialog(this,"WRONG USER NAME OR PASSWORD","WRONG",JOptionPane.ERROR_MESSAGE);
			  }
		  }
		  else if(backButton==e.getSource())
		  {
			  AdminPanel admin=new AdminPanel();
			  this.setVisible(false);
		  }
			  
	  }
	
	
	
	
	
}