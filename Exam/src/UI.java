import java.awt.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.*;
import java.io.*;

// Well I tried.....

// Author: Alex Blair

public class UI extends JComponent {
	JFrame frame; 
	int id;
	String Details;
	String type;
	
	public UI()
	{
		initialize();
		frame.setVisible(true);
	}
	
	
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(600,600,600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		
		try{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			URL imgURL = new URL("https://crossfitsonora.files.wordpress.com/2013/10/pink-square.jpg");
			Image img = toolkit.getImage(imgURL);
			img = img.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(img);
			JButton btn1 = new JButton(icon);
			frame.add(btn1);
			
		}
		catch(Exception ex){;}
		
		try{
			Toolkit toolkit2 = Toolkit.getDefaultToolkit();
			URL imgURL2 = new URL("http://lghttp.10957.nexcesscdn.net/804DA9/Accuquilt.com/shop/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/5/0/50643.jpg");
			Image img2 = toolkit2.getImage(imgURL2);
			img2 = img2.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
			ImageIcon icon2 = new ImageIcon(img2);
			JButton btn2 = new JButton(icon2);
			frame.add(btn2);
		}
		catch(Exception ex){;}
		
		try{
			Toolkit toolkit3 = Toolkit.getDefaultToolkit();
			URL imgURL3 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Green_equilateral_triangle_point_up.svg/600px-Green_equilateral_triangle_point_up.svg.png");
			Image img3 = toolkit3.getImage(imgURL3);
			img3 = img3.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
			ImageIcon icon3 = new ImageIcon(img3);
			JButton btn3 = new JButton(icon3);
			frame.add(btn3);
		}
		catch(Exception ex){;}
		
		try{
			Toolkit toolkit4 = Toolkit.getDefaultToolkit();
			URL imgURL4 = new URL("https://upload.wikimedia.org/wikipedia/commons/c/cc/Rectangle_.png");
			Image img4 = toolkit4.getImage(imgURL4);
			img4 = img4.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
			ImageIcon icon4 = new ImageIcon(img4);
			JButton btn4 = new JButton(icon4);
			frame.add(btn4);
		}
		catch(Exception ex){;}
	}
	


	public static void main(String[] args)
	{
		UI u = new UI();
		
		ArrayList<String> shapes = new ArrayList<String>();
		
        try (FileInputStream is = new FileInputStream("c:/Users/ablair18/Desktop/shapes.txt")) {
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader rdr = new BufferedReader(ir);
            String line;
            while ((line = rdr.readLine())!= null) {
                shapes.add(line);    
            	System.out.printf("shape: %s\n", line);
                    
            }
        }
        catch (Exception ex) { System.out.printf("Failed for %s\n", "shapes.txt");}

	}
}

