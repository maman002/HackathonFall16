package MeetUODU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Events extends JFrame
{
	
	private JPanel nPanel, wPanel, cPanel, ePanel, fPanel, f1Panel, f2Panel, gPanel;
	private JButton myevents, profileB, parkingB, campusDirectB, scheduleB;
	private JButton dining, perry, starb, fountain, quad, SRC, seal, whitehurst, globe, home;
	private JButton a1, a2, a3, r1, r2, r3;
	private int points, lvl;
	ButtonListenerClass buttonListener;
	public ArrayList<String> userRReventList = new ArrayList<String>(5);
	  public ArrayList<String> userAcceptEventList = new ArrayList<String>(5);
	  public String eventLocation;
	  public String eventOccasion, eventDetail, event;
	
	public Events(ArrayList<String> p_userRReventList, ArrayList<String> p_userAcceptEventList, String p_eventLocation, String p_eventOccasion, String p_eventDetail)
    { 
		
        super("Old Dominion University");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
 
        userRReventList = p_userRReventList;
        userAcceptEventList = p_userAcceptEventList;
        eventLocation = p_eventLocation;
        eventOccasion = p_eventOccasion;
        eventDetail = p_eventDetail;
      
        
        buttonListener = new ButtonListenerClass();

        
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
        
        a1= new JButton("Accept");
        a1.addActionListener(buttonListener);
        a2= new JButton("Accept");
        a2.addActionListener(buttonListener);
        a3= new JButton("Accept");
        a3.addActionListener(buttonListener);
        r1= new JButton("Decline");
        r1.addActionListener(buttonListener);
        r2= new JButton("Decline");
        r2.addActionListener(buttonListener);
        r3= new JButton("Decline");
        r3.addActionListener(buttonListener);
        
        
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
        
        home = new JButton("Home");
        home.addActionListener(buttonListener);
        
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
        //add(new JLabel(new ImageIcon("newmap5.png")), BorderLayout.CENTER);
         ePanel = new JPanel();
         ePanel.setLayout(new GridLayout(4,1));
         
         fPanel = new JPanel();
         fPanel.setLayout(new GridLayout(1,2));
         f1Panel = new JPanel();
         f1Panel.setLayout(new GridLayout(5,1));
         f2Panel = new JPanel();
         f2Panel.setLayout(new GridLayout(5,2));
         
         f2Panel.add(a1);    f2Panel.add(r1);
         f2Panel.add(a2);      f2Panel.add(r2);
         f2Panel.add(a3);   f2Panel.add(r3);
     
   
      
         
         gPanel = new JPanel();
         gPanel.setLayout(new GridLayout(5,1));
         
        int rr = 0;
        int a = 0;
        ePanel.add(new JLabel("Response Required"));
       // while (rr < 5)
        //{	
        	for (String str : userRReventList) 
        	{
        		f1Panel.add(new JLabel(str));
        	//	f1Panel.add(new JButton("Accept"));
        	//	f1Panel.add(new JButton("Decline"));
        	}
       
        //}
        	fPanel.add(f1Panel);
        	fPanel.add(f2Panel);
        	
        	ePanel.add(fPanel);
        ePanel.add(new JLabel("Accepted Events"));
        //while (a < 5)
        //{	
        	for (String str : userAcceptEventList) 
        	{
        		gPanel.add(new JLabel(str));
        	}
        	//a++;
        //}
        	rr = userRReventList.size();
        	if (rr == 1)
        	{
        		a1.setVisible(true);
        		r1.setVisible(true);
        		a2.setVisible(false);
        		r2.setVisible(false);
        		a3.setVisible(false);
        		r3.setVisible(false);
        	}
        	else if (rr ==2)
        	{
        		a1.setVisible(true);
        		r1.setVisible(true);
        		a2.setVisible(true);
        		r2.setVisible(true);
        		a3.setVisible(false);
        		r3.setVisible(false);
        		
        	}
        	else if (rr == 3)
        	{
        		a1.setVisible(true);
        		r1.setVisible(true);
        		a2.setVisible(true);
        		r2.setVisible(true);
        		a3.setVisible(true);
        		r3.setVisible(true);
        	}
        	else
        	{
        		a1.setVisible(false);
        		r1.setVisible(false);
        		a2.setVisible(false);
        		r2.setVisible(false);
        		a3.setVisible(false);
        		r3.setVisible(false);
        	}
        	ePanel.add(gPanel);
      cPanel.add(ePanel, BorderLayout.CENTER);
      cPanel.add(home, BorderLayout.SOUTH);
      add(cPanel);
      
      	
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
			
			if("Home".equals(button.getActionCommand()))
			{
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
			}


			if(button.getSource() == a1)
			{
				String eEvent = userRReventList.get(0);
				//add the event to that user's accepted events
				userAcceptEventList.add(eEvent);

				//remove the event from the Response Required list
				int removeIndex = userRReventList.indexOf(eEvent);
				userRReventList.remove(removeIndex);
				
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
				
			}
			if(button.getSource() == a2)
			{
				String eEvent = userRReventList.get(1);
				//add the event to that user's accepted events
				userAcceptEventList.add(eEvent);

				//remove the event from the Response Required list
				int removeIndex = userRReventList.indexOf(eEvent);
				userRReventList.remove(removeIndex);
				
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
				
			}

			if(button.getSource() == a3)
			{
				String eEvent = userRReventList.get(2);
				//add the event to that user's accepted events
				userAcceptEventList.add(eEvent);

				//remove the event from the Response Required list
				int removeIndex = userRReventList.indexOf(eEvent);
				userRReventList.remove(removeIndex);
				
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
			}
			if(button.getSource() == r1)
			{
				String eEvent = userRReventList.get(0);
				
				//remove the event from the Response Required list
				int removeIndex = userRReventList.indexOf(eEvent);
				userRReventList.remove(removeIndex);
				
				
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
				
			}
			if(button.getSource() == r2)
			{
				String eEvent = userRReventList.get(1);
				
				//remove the event from the Response Required list
				int removeIndex = userRReventList.indexOf(eEvent);
				userRReventList.remove(removeIndex);
				
				
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
				
			}
			if(button.getSource() == r3)
			{
				String eEvent = userRReventList.get(2);
				//remove the event from the Response Required list
				int removeIndex = userRReventList.indexOf(eEvent);
				userRReventList.remove(removeIndex);
				
				
				dispose();
				new MapClass(userRReventList, userAcceptEventList, eventOccasion, eventDetail);
				
			}



			

		}

	}
}