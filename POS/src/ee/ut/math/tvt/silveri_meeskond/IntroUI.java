package ee.ut.math.tvt.silveri_meeskond;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IntroUI {
	
	public static void introWindow() throws IOException {
		
		Properties p=new Properties();
		p.load(new FileInputStream("application.properties"));
		
		Properties p2=new Properties();
		p2.load(new FileInputStream("version.properties"));
		
		JFrame frame = new JFrame("Team Introduction");
	    frame.setSize(300, 300);
	    frame.setLocation(400, 150); 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel=new JPanel(new GridBagLayout());
	    
	    JLabel label;
	    GridBagConstraints c = new GridBagConstraints();

	    label=new JLabel("Name: ");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    panel.add(label, c);
	    
	    label=new JLabel(p.getProperty("name"));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 0;
	    panel.add(label, c);

	    label = new JLabel("Team leader: ");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 1;
	    panel.add(label, c);
	    
	    label=new JLabel(p.getProperty("teamLeader"));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 1;
	    panel.add(label, c);

	    label = new JLabel("Team leader's email: ");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 2;
	    panel.add(label, c);
	    
	    label=new JLabel(p.getProperty("teamLeaderEmail"));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 2;
	    panel.add(label, c);

	    label = new JLabel("Members: ");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 3;
	    panel.add(label, c);
	    
	    String[] members=p.getProperty("members").split(",");
	    int y=3;
	    for(String member:members){
	    	label = new JLabel(member);
	    	c.fill = GridBagConstraints.HORIZONTAL;
	    	c.gridx=1;
	    	c.gridy=y;
	    	panel.add(label, c);
	    	y++;
	    }
	    
	    label=new JLabel("Software version: ");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 7;
	    panel.add(label, c);	
	    
	    label=new JLabel(p2.getProperty("build.number")); //???
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 7;
	    panel.add(label, c);	
	    
	    // Pange mingi mõistlikum (ja väiksem!) pilt 
	    
//	    label = new JLabel(new ImageIcon(ImageIO.read(new File(p.getProperty("logo")))));
//	    c.fill = GridBagConstraints.HORIZONTAL;
//	    c.gridx = 0;
//	    c.gridy = 8;
//	    panel.add(label,c);
 
	    frame.add(panel);
	    frame.setVisible(true); 
	}


}
