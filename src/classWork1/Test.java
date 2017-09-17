package classWork1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test{

	public Test(){
		frame();
	}
	public void frame (){
		JFrame f = new JFrame ();
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton b1 = new  JButton ("Action Listener");
		
		JFrame g = new JFrame();
		JPanel d = new JPanel();
		g.setSize(400,400);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b3 = new  JButton ("Action");
		d.add(b3);
		g.add(d);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				f.setVisible(false);
				
				g.setVisible(true);
				
				
		}});
		
		p.add(b1);
		f.add(p);
	}
	public static void main(String [] args){
		new Test();
	}
}
