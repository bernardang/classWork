 package classWork1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class FileChoose extends JFrame {
public FileChoose()
{
	setSize(400,400);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JFileChooser fc = new JFileChooser();
	fc.setCurrentDirectory(new File("c:\\temp"));
	  FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    fc.setFileFilter(filter);
	JButton b1 = new JButton("Open File")  ;
	
	b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			int returnValue = fc.Been there before(this);
			
	}});
	
	add(b1);
}
}
