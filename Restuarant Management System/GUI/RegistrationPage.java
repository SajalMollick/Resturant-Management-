package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import File.*;

public class RegistrationPage extends JFrame implements ActionListener {
	// ...............................Font creation...................................

	Font font15 = new Font("Cambria", Font.BOLD, 15);
	Font font20 = new Font("Cambria", Font.BOLD, 20);
	//..................................Component declaration..........................

	JLabel userNameLabel, passwordLabel, emailLabel;
	JTextField userNameField, emailField;
	JPasswordField passwordFeild;
	JButton registerButton;
	JButton backButton;

	public RegistrationPage() {
		//.............................Frame creation.............................

		super("REGISTRATION PAGE");
		this.setSize(900, 600);
		this.setLocation(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(153, 153, 255));

		// .............................Label creation...........................

		userNameLabel = new JLabel("USER NAME :");
		userNameLabel.setBounds(250, 150, 150, 50);
		userNameLabel.setFont(font20);
		userNameLabel.setForeground(Color.BLACK);
		this.add(userNameLabel);

		emailLabel = new JLabel("E-MAIL :");
		emailLabel.setBounds(250, 200, 150, 50);
		emailLabel.setFont(font20);
		emailLabel.setForeground(Color.BLACK);
		this.add(emailLabel);

		passwordLabel = new JLabel("PASSWORD :");
		passwordLabel.setBounds(250, 250, 150, 50);
		passwordLabel.setFont(font20);
		passwordLabel.setForeground(Color.BLACK);
		this.add(passwordLabel);

		//..................................Text Field creation........................

		userNameField = new JTextField();
		userNameField.setBounds(400, 155, 150, 30);
		userNameField.setFont(font20);
		userNameField.setForeground(Color.BLACK);
		this.add(userNameField);

		emailField = new JTextField();
		emailField.setBounds(400, 205, 150, 30);
		emailField.setFont(font20);
		emailField.setForeground(Color.BLACK);
		this.add(emailField);

		passwordFeild = new JPasswordField();
		passwordFeild.setBounds(400, 255, 150, 30);
		passwordFeild.setFont(font20);
		passwordFeild.setForeground(Color.BLACK);
		this.add(passwordFeild);

		//...........................Button creation.............................

		registerButton = new JButton("REGISTER");
		registerButton.setBounds(250, 340, 140, 40);
		registerButton.setFont(font20);
		registerButton.setBackground(new Color(0, 51, 102));
		registerButton.setForeground(Color.WHITE);
		registerButton.addActionListener(this);
		this.add(registerButton);

		backButton = new JButton("BACK");
		backButton.setBounds(420, 340, 140, 40);
		backButton.setFont(font20);
		backButton.setBackground(new Color(0, 51, 102));
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(this);
		this.add(backButton);


		this.setVisible(true);
	}

	public  void actionPerformed(ActionEvent e) {
		if(registerButton==e.getSource())
		{
			String uname=userNameField.getText();
			String email=emailField.getText();
			String upass= new String(passwordFeild.getPassword());
			
			FileIO.saveUser( uname,email,upass);
			JOptionPane.showMessageDialog(this,"NEW USER REGISTERED");
			
		}			
		else if(backButton == e.getSource()) {
			AdminPanel admin = new AdminPanel();
			this.setVisible(false);

		}

	}
}
