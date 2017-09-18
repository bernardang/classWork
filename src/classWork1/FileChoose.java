 package classWork1;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class FileChoose extends JFrame {

private BufferedImage originalBI;
public FileChoose()
{

	setSize(400,200);
	setLocation(600,300);
	
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	JPanel da= new JPanel();
	JButton b1 = new JButton("Open File")  ;
	JFileChooser fc = new JFileChooser();
	da.add(b1);
	add(da,BorderLayout.WEST);
	fc.setCurrentDirectory(new File("c:\\temp"));
	  FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    fc.setFileFilter(filter);
	
	setVisible(true);
	b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			int returnValue = fc.showOpenDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION){
				try{
					originalBI = ImageIO.read(fc.getSelectedFile());
					
				}catch(IOException ioe){
					
				}
			}
			else{
				
			}
			;
	}});
	

	
}
public static void main(String [] args){
	new FileChoose();
}
}
