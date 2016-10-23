package MeetUODU;


//Megan Witherow

//import statements

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.LayerUI;
import javax.swing.text.Document;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main extends JFrame implements ActionListener
{

	//field declarations
	private JPanel mainPanel;
	private JPanel loginPanel, infoPanel, emailPanel, passPanel;
	private JPanel registerPanel, rEmailPanel, rPassPanel, rRepassPanel;

	private JButton loginButton, registerButton; 
	private JLabel loginLabel, registerLabel,infoLabel, emailLabel, passLabel, rpassL, remailL, rrepassL;
	private JTextField loginField,remailF;
	private JPasswordField passwordField;
	private boolean loginFlag;
	private int a, b, c, d, e;
	public ArrayList<String> userRReventList = new ArrayList<String>(5);
	  public ArrayList<String> userAcceptEventList = new ArrayList<String>(5);

	private String emailText, passText2;
	char[] passText;

	/**Constructor*/
	public Main()
	{
		setTitle("Welcome to MeetU@ODU!");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		loginFlag = false;

		a=0;
		b=0;
		c=0;
		d=0;
		e=0;

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1,2));
		///////////////////////////////////////////////////////
		infoLabel = new JLabel("Please login.");

		infoPanel= new JPanel();
		infoPanel.setLayout(new GridLayout(1,1));


		infoPanel.setBorder(new TitledBorder(null, "Welcome to MapMyCampus", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, 
				new Font ( "Verdana", Font.BOLD, 22 ), Color.BLACK));

		infoPanel.add(infoLabel);

		///////////////////////////////////////////////////////////////////
		loginPanel = new JPanel();

		//set Layout
		loginPanel.setLayout(new GridLayout(4,1));

		emailPanel = new JPanel();
		emailPanel.setLayout(new GridLayout(1,2));
		passPanel = new JPanel();
		passPanel.setLayout(new GridLayout(1,2));

		emailLabel = new JLabel("Email Address:");
		passLabel = new JLabel("Password:");



		//set colors
		//loginPanel.setBackground(Color.BLACK);
		//loginPanel.setForeground(Color.WHITE);

		loginPanel.setBorder(new TitledBorder(null, "Login", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, 
				new Font ( "Verdana", Font.BOLD, 20 ), Color.BLACK));



		ButtonListenerClass buttonListener = new ButtonListenerClass();



		loginLabel = new JLabel("Please enter your email address and password:");
		loginField = new JTextField(20);
		//loginField.addActionListener(new emailLis());
		passwordField = new JPasswordField(20);
		//passwordField.addActionListener(new emailLis());
		
		loginButton = new JButton("Login");


		loginButton.addActionListener(buttonListener);
		//nest
		JPanel tempPanel = new JPanel();




		tempPanel.add(loginButton);


		//add components
		passPanel.add(passLabel);
		passPanel.add(passwordField);
		emailPanel.add(emailLabel);
		emailPanel.add(loginField);


		loginPanel.add(emailPanel);
		loginPanel.add(passPanel);
		loginPanel.add(tempPanel);
		////////////////////////////////////////////////////////////////////////////////////////

		registerPanel = new JPanel();
		registerPanel.setLayout(new GridLayout(4,1));

		registerPanel.setBorder(new TitledBorder(null, "Register", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, 
				new Font ( "Verdana", Font.BOLD, 20 ), Color.BLACK));



		rEmailPanel = new JPanel();
		rEmailPanel.setLayout(new GridLayout(1,2));
		rPassPanel = new JPanel();
		rPassPanel.setLayout(new GridLayout(1,2));
		rRepassPanel= new JPanel();
		rRepassPanel.setLayout(new GridLayout(1,2));

		rpassL = new JLabel("Enter password:");
		remailL = new JLabel("Enter email address:");
		rrepassL = new JLabel("ReEnter password:");

		remailF = new JTextField(20);
		
		

		//rpassF = new JPasswordField(20);
		//rrepassF  = new JPasswordField(20);




		//rRepassPanel.add(rrepassL);
		//rRepassPanel.add(rrepassF);
		//rPassPanel.add(rpassL);
		//rPassPanel.add(rpassF);
		//rEmailPanel.add(remailL);
		//rEmailPanel.add(remailF);

		registerButton = new JButton("Register");
		registerButton.addActionListener(buttonListener);
		//nest
		JPanel tempPanel2 = new JPanel();


		//set colors
		//tempPanel.setBackground(Color.BLACK);
		//tempPanel.setForeground(Color.WHITE);

		/*tempPanel2.add(registerButton);


		registerPanel.add(rEmailPanel);
		registerPanel.add(rPassPanel);
		registerPanel.add(rRepassPanel);
		registerPanel.add(tempPanel2);

*/



		//////////////////////////////////////////////////////////

		//add components
		mainPanel.add(loginPanel);
		//mainPanel.add(registerPanel);

		//add panels
		add(infoPanel, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);


		setSize(500, 250); //set the window size
		
		setLocationRelativeTo(null);
		setVisible(true);

	}



	public static void main(String[] args) 
	{
		
		SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run()
            {
                new Main().setVisible(true);
            }

        });
	
	}
	
	/*private class emailLis implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			emailText = "0";
			emailText = loginField.getText();
			
			//passText = passwordField.getPassword();
			System.out.println("emailLis");
			System.out.println(emailText);
		}
		
	}*/



	private class ButtonListenerClass implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent button) 
		{


			if("Login".equals(button.getActionCommand()))
			{
				//debug statement
				System.out.println("Login" );
				

				if (emailText == emailText)
				{
					loginFlag = true;
					System.out.println("Welcome back!");
					dispose();
		            new MapClass(userRReventList, userAcceptEventList, "", "");

				}
				else
				{
					loginFlag = false;
				}
				
				/*ArrayList<String> userName = new ArrayList<String>(5);
				ArrayList<String> userPass = new ArrayList<String>(5);

				String usrnm, pswd, pswdTest;
				int userIndex, pswdIndex;
				int i = 0;

				userName.add("Megan");
				userName.add("Mary");
				userName.add("Matt");
				userName.add("Charles");

				userPass.add("Pass1");
				userPass.add("Pass2");
				userPass.add("Pass3");
				userPass.add("Pass4");

				usrnm = loginField.getText();
				pswd = passwordField.getText();
				
				boolean ifValid = userName.contains(usrnm);

				if (ifValid == true)
				{
				//while (i == 0)
				
					pswdIndex = userName.indexOf(usrnm);
					pswdTest = userPass.get(pswdIndex);
					if (pswd == pswdTest)
					{
						System.out.print("Welcome");
						i = 1; 
						dispose();
			            new MapClass(userRReventList, userAcceptEventList, "", "");
					}
					
				}
					else
					{
						System.out.print("Invalid Login");
						//i = 0; 
						System.exit(0);
					}*/
				}
			}
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
		
				
				
				
				
				
		/*		
			}
			if("Register".equals(button.getActionCommand()))
			{

				//debug statement
				System.out.println("Register" );
				dispose();
	            new MapClass(userRReventList, userAcceptEventList, "", "");


			}

		}

	}*/


	/*@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}*/
