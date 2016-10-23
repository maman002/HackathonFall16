package MeetUODU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;


public class EventMaker extends JFrame
{
	private JPanel nav, northPanel;
	private JLabel lab1, lab2, lab3, lab4, lab5;
	private JPanel nPanel, wPanel, cPanel, invites;
	private JButton myevents, submit;
	private JButton dining, perry, starb, fountain, quad, SRC, seal, whitehurst, globe;
	private int points, lvl;
	ButtonListenerClass buttonListener;
	private String loc;
	private int a,b,c,d,e;
	private JComboBox oBox;
	private String selection;
	private JTextField title, inv1, inv2, inv3, inv4, inv5;
	public ArrayList<String> userRReventList = new ArrayList<String>(5);
	  public ArrayList<String> userAcceptEventList = new ArrayList<String>(5);
	  
	  public String eventOccasion;
	  public String eventDetail;
	  public String eventLocation;
	  public String event;
	
	public EventMaker(ArrayList<String> p_userRReventList, ArrayList<String> p_userAcceptEventList, String p_eventLocation)
    { 
		
        super("Old Dominion University");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        userRReventList = p_userRReventList;
        userAcceptEventList = p_userAcceptEventList;
        
        eventLocation = p_eventLocation;
        buttonListener = new ButtonListenerClass();
     
        nav = new JPanel();
        nav.setLayout(new GridLayout(1,4));
        

        
        title = new JTextField(32);
        inv1 = new JTextField(32);
        inv2 = new JTextField(32);
        inv3 = new JTextField(32);
        inv4 = new JTextField(32);
        inv5 = new JTextField(32);
        
       /* northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        northPanel.add(new JLabel(new ImageIcon("ODUlogo4.png")), BorderLayout.CENTER);
        northPanel.add(nav, BorderLayout.EAST);*/
        
        nPanel = new JPanel();
        nPanel.setLayout(new GridLayout(1,1));
        
        wPanel = new JPanel();
        wPanel.setLayout(new GridLayout(9,1));
        
        cPanel = new JPanel();
        cPanel.setLayout(new GridLayout(4,1));
        
        invites = new JPanel();
        invites.setLayout(new GridLayout(5,2));
        
        
        lab1 = new JLabel("Invitee 1");
        lab2 = new JLabel("Invitee 2");
        lab3 = new JLabel("Invitee 3");
        lab4 = new JLabel("Invitee 4");
        lab5 = new JLabel("Invitee 5");
        
        
        invites.add(lab1);invites.add(inv1);
        invites.add(lab2);invites.add(inv2);
        invites.add(lab3);invites.add(inv3);
        invites.add(lab4);invites.add(inv4);
        invites.add(lab5);invites.add(inv5);
        
        
        
        
        
        
        
        
        
        dining = new JButton("Dining Commons");
        dining.addActionListener(buttonListener);
        perry = new JButton("Perry Library");
        perry.addActionListener(buttonListener);
        starb = new JButton("Starbucks");
        starb.addActionListener(buttonListener);
        fountain = new JButton("Fountain");
        fountain.addActionListener(buttonListener);
        quad = new JButton("Quad");
        quad.addActionListener(buttonListener);
        SRC = new JButton("SRC");
        SRC.addActionListener(buttonListener);
        seal = new JButton("ODU Seal");
        seal.addActionListener(buttonListener);
        whitehurst = new JButton("Whitehurst Beach");
        whitehurst.addActionListener(buttonListener);
        globe = new JButton("Omniglobe");
        globe.addActionListener(buttonListener);
        submit = new JButton("Submit");
        submit.addActionListener(buttonListener);
        
        myevents = new JButton("My Events");
        myevents.addActionListener(buttonListener);
        
        nPanel.add(myevents);
        wPanel.add(dining);
        wPanel.add(perry);
        wPanel.add(starb);
        wPanel.add(fountain);
        wPanel.add(quad);
        wPanel.add(SRC);
        wPanel.add(seal);
        wPanel.add(whitehurst);
        wPanel.add(globe);
        
        ComboListenerClass comboListener = new ComboListenerClass();
        String[] occasions = {"No Selection","Study", "Sports", "Food", "Arts/Entertainment"};
    	oBox = new JComboBox(occasions);
    	oBox.addItemListener(comboListener);
        
    	cPanel.add(oBox);
    	cPanel.add(title);
    	cPanel.add(invites);
    	cPanel.add(submit);
		//parkingB.addActionListener(buttonListener);
       
        add(nPanel, BorderLayout.NORTH);
        add(wPanel, BorderLayout.WEST);
        add(cPanel, BorderLayout.CENTER);

        
        
      
      	
        //pack();
      	setSize(1100, 700);
      	setLocationRelativeTo(null);
        setVisible(true);
    }
	

	
	
	
	
	
	
	
	private class ButtonListenerClass implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent button) 
		{


			if("Submit".equals(button.getActionCommand()))
			{
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
				eventDetail = title.getText();
				//System.out.print(eventDetail);
				event = eventLocation + " - " + eventOccasion + " - " + eventDetail;
				userRReventList.add(event);
			}


		}

	}
	
	
	
	
	private class ComboListenerClass implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent comboBox)
		{	
			
			eventOccasion = (String) oBox.getSelectedItem();
			
			//get the input
			eventOccasion = (String) oBox.getSelectedItem();

			//debug statement
			System.out.println(eventOccasion);

	
		}
	}
}

