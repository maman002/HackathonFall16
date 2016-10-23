package MeetUODU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MapClass extends JFrame
{
	
	private JPanel nav, northPanel;
	private JPanel nPanel, wPanel, cPanel;
	private JButton myevents, profileB, parkingB, campusDirectB, scheduleB;
	private JButton dining, perry, starb, fountain, quad, SRC, seal, whitehurst, globe;
	private int points, lvl;
	ButtonListenerClass buttonListener;
	public ArrayList<String> userRReventList = new ArrayList<String>(5);
	  public ArrayList<String> userAcceptEventList = new ArrayList<String>(5);

	  public String eventOccasion, eventDetail;
	  public String eventLocation;
	
	public MapClass(ArrayList<String> p_userRReventList, ArrayList<String> p_userAcceptEventList, String p_eventOccasion, String p_eventDetail)
    { 
		
        super("Old Dominion University");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        userRReventList = p_userRReventList;
        userAcceptEventList = p_userAcceptEventList;
        eventOccasion = p_eventOccasion;
        eventDetail = p_eventDetail;
        
        buttonListener = new ButtonListenerClass();
        nav = new JPanel();
        nav.setLayout(new GridLayout(1,4));
        
       /* northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        northPanel.add(new JLabel(new ImageIcon("ODUlogo4.png")), BorderLayout.CENTER);
        northPanel.add(nav, BorderLayout.EAST);*/
        
        nPanel = new JPanel();
        nPanel.setLayout(new GridLayout(1,1));
        
        wPanel = new JPanel();
        wPanel.setLayout(new GridLayout(9,1));
        
        cPanel = new JPanel();
        cPanel.setLayout(new BorderLayout());
        
        
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
        
        
		//parkingB.addActionListener(buttonListener);
       
        add(nPanel, BorderLayout.NORTH);
        add(wPanel, BorderLayout.WEST);
        //add(cPanel, BorderLayout.CENTER);
        add(new JLabel(new ImageIcon("newmap5.png")), BorderLayout.CENTER);
        
        
      
      	
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

			eventLocation = button.getActionCommand();

			if("Dining Commons".equals(button.getActionCommand()))
			{
				
				dispose();
				
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("Perry Library".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("Starbucks".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("Fountain".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("Quad".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("SRC".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("ODU Seal".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("Whitehurst Beach".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("Omniglobe".equals(button.getActionCommand()))
			{
				
				dispose();
	            new EventMaker(userRReventList, userAcceptEventList, eventLocation);
			}
			if("My Events".equals(button.getActionCommand()))
			{
				
				dispose();
	            new Events(userRReventList, userAcceptEventList, eventLocation, eventOccasion, eventDetail);
			}
			

		}

	}
}