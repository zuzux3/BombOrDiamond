package App;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class BombOrDiamond {
	private static boolean currentObject;
	public static Frame frame = new Frame("Zagrajmy w gre!");
	private static Random random = new Random();
	private static JButton btn1 = frame.getBtn1();
	private static JButton btn2 = frame.getBtn2();
	private static int tries = 0;
	static int diamonds = 0;
	static int bombs = 0;
	
	public BombOrDiamond() {
		frame.setVisible(true);
		
		btn1.addActionListener(new actionHandler());
		btn2.addActionListener(new actionHandler());
		
	}
	
	static class actionHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.setTryCounter("Proba: " + String.valueOf(tries));
			frame.setDiamondCounter("Liczba diamentow: " + String.valueOf(diamonds));
			tries++;
			
			if(tries < 20) {
				currentObject = new Random().nextBoolean();
				
				if(currentObject == true) {
					diamonds++;
				} else {
					bombs++;
				}
			}
			
			if(tries == 20) {
				frame.setResult("Gra zakonczona, uzyskano " + String.valueOf(diamonds) +" diamentow.");
				
			}
			
			if(tries == 21) {
				tries = 0;
				diamonds = 0;
			}
			
			System.out.println(currentObject);
		}
		
	}
}
