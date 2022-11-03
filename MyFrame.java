import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener{
	
	static int guess1;
	JTextField textField;
	JTextField History;
	JTextField History2;
	JTextField History3;
	JTextField History4;
	JButton btn;
	public static JLabel lbl;
	JFrame frameObj; 
	public static JLabel lbl2;
	public static JLabel lbl3;
	public static JLabel lbl4;
	JButton btn2;
	//JTextField text2;
	String s;
	int j;
	int H;
	int mpya;
	
	
	MyFrame(){
		
		Random rand = new Random();
        H = rand.nextInt(100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		frameObj = new JFrame(); 
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(40,40));
		textField.setBackground(Color.yellow);
		
		
		
		
		//text2 = new JTextField();
		
		
		btn = new JButton("submit");
		//MyFrame f = new MyFrame();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History2.setPreferredSize(new Dimension(200,30));
				History2.setEditable(false);
				History2.setBackground(Color.green);
				frameObj.add(History2);
				
				History3.setPreferredSize(new Dimension(200,30));
				History3.setEditable(false);
				History3.setBackground(Color.pink);
				frameObj.add(History3);
				
				History4.setPreferredSize(new Dimension(200,30));
				History4.setEditable(false);
				History4.setBackground(Color.green);
				frameObj.add(History4);
			
                
				//s = textField.getText();
				if(j==0) {
					s = textField.getText();
					History.setText("Your 1st guess is :"+ s);
					int G = Integer.parseInt(textField.getText());
					if (G == H) {
	                    lbl2.setText("You guessed right");
	                } else if (G > H ){
	                    lbl2.setText("Your guess is above");
	                } else if(G < H ) {
	                    lbl2.setText("Your guess is below ");
	                }
				}
				if(j==1) {
					s = textField.getText();
					int G = Integer.parseInt(textField.getText());
					
					
					History2.setText("Your 2nd guess is :" +s);
					
					if (G == H) {
	                    lbl2.setText("You guessed right");
	                } else if (G > H ){
	                    lbl2.setText("Your guess is above");
	                } else if(G < H ) {
	                    lbl2.setText("Your guess is below ");
	                }
					
				}
				if(j==2) {
					s = textField.getText();
					int G = Integer.parseInt(textField.getText());
					
					
					History3.setText("Your 3rd guess is :" +s);
					
					if (G == H) {
	                    lbl2.setText("You guessed right");
	                } else if (G > H ){
	                    lbl2.setText("Your guess is above");
	                } else if(G < H ) {
	                    lbl2.setText("Your guess is below ");
	                }
				}
				if(j==3) {
					s = textField.getText();
					int G = Integer.parseInt(textField.getText());
					
					
					History4.setText("Your 4th guess is :"+ s);
					
					if (G == H) {
	                    lbl2.setText("You guessed right");
	                } else if (G > H ){
	                    lbl2.setText("Your guess is above");
	                } else if(G < H ) {
	                    lbl2.setText("Your guess is below ");
	                }
				}
				 if(j==4) {
	                	lbl2.setText("You have exhausted your trials\n the number was" + H);
	                }
				
				j++;
				
			}
	});
	
	btn2 = new JButton("Restart");
	btn2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			mpya = rand.nextInt(100);
			H = mpya;
			textField.setText("");
			lbl2.setText("");
			lbl3.setText("");
			History.setText("");
			History2.setText("");
			History3.setText("");
			History4.setText("");
			
			//History.remove(History);
			j =0;
			
		}
		});
		
		
		
		lbl = new JLabel();
		lbl2 = new JLabel("");
		lbl3 = new JLabel();
		lbl3.setBounds(200, 100, 100, 50);
		lbl4 = new JLabel("");
		
		History = new JTextField("your guess: ");
		History2 = new JTextField("your guess: ");
		History3 = new JTextField("your guess: ");
		History4 = new JTextField("your guess: ");
		History.setPreferredSize(new Dimension(200,30));
		History.setEditable(false);
		History.setBackground(Color.pink);		
		
		frameObj.add(lbl);
		frameObj.add(textField);
		frameObj.add(btn);frameObj.add(btn2);
		
		frameObj.add(lbl2);
		frameObj.add(lbl3);
		frameObj.add(lbl4);
		frameObj.add(History);
		
		frameObj.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));
		
		frameObj.setSize(560, 400);    
	    frameObj.setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			
		}
		
		
		
		
	}
	
}
