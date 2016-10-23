package mapMyCampusODU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MapClass extends JFrame
{
	
	private JPanel nav, northPanel;
	private JPanel nPanel, wPanel, cPanel;
	private JButton myevents, profileB, parkingB, campusDirectB, scheduleB;
	private JButton dining, perry, starb, fountain, quad, SRC, seal, whitehurst, globe;
	private int points, lvl;
	ButtonListenerClass buttonListener;
	private String loc;
	private int a,b,c,d,e;
	
	public MapClass(int pts, int p_lvl, String p_loc, int p_a, int p_b, int p_c, int p_d, int p_e)
    { 
		
        super("Old Dominion University");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        lvl = p_lvl;
        points = pts;
        
        a= p_a;
        b= p_b;
        c= p_c;
        d= p_d;
        e= p_e;
        
        
        buttonListener = new ButtonListenerClass();
        loc = p_loc;
        nav = new JPanel();
        nav.setLayout(new GridLayout(1,4));
        setUpNav();
        
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
        add(cPanel, BorderLayout.CENTER);
        //add(new JLabel(new ImageIcon("Mapx1000px.png")), BorderLayout.CENTER);
        
        
      
      	
        //pack();
      	setSize(1000, 750);
      	setLocationRelativeTo(null);
        setVisible(true);
    }
	
	public void setUpNav()
	{
		profileB = new JButton("Profile");
		profileB.addActionListener(buttonListener);
		
		campusDirectB = new JButton("Campus Directory");
		campusDirectB.addActionListener(buttonListener);
		
		parkingB = new JButton("Parking");
		parkingB.addActionListener(buttonListener);
		
		scheduleB = new JButton("Rewards");
		scheduleB.addActionListener(buttonListener);
		
		nav.add(profileB);
		nav.add(campusDirectB);
		nav.add(parkingB);
		nav.add(scheduleB);
	}
	
	
	
	
	
	
	
	private class ButtonListenerClass implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent button) 
		{


			if("Profile".equals(button.getActionCommand()))
			{
				
				dispose();
	            new ProfileClass("Witherow", points, lvl, loc, a, b, c,d,e);
			}
			if("Campus Directory".equals(button.getActionCommand()))
			{

				dispose();
	            new DirectClass(points, lvl, loc, a, b, c,d,e);


			}
			if("Parking".equals(button.getActionCommand()))
			{

				dispose();
	            new ParkingClass(points, lvl, loc, a, b, c,d,e);


			}
			if("Rewards".equals(button.getActionCommand()))
			{

				dispose();
	            new Rewards(points, lvl,loc, a, b, c,d,e);


			}

		}

	}
}
