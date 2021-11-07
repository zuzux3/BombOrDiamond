package App;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class BombOrDiamond {
	//tworzenie zmiennej kt�ra pomo�e liczy� diamenty
	private static boolean currentObject;
	//wywo�ywanie klasy frame, aby gra dzia�a�a poprawnie
	public static Frame frame = new Frame("Zagrajmy w gre!");
	//tworzenie warto�ci random, kt�ra losowo b�dzie rozmieszcza�a bomb� i diamenty
	private static Random random = new Random();
	//tworzenie przycisk�w
	private static JButton btn1 = frame.getBtn1();
	private static JButton btn2 = frame.getBtn2();
	//definiowanie zmiennych tries, diamonds i bombs
	private static int tries = 0;
	static int diamonds = 0;
	static int bombs = 0;
	
	//tworzenie konstruktora
	public BombOrDiamond() {
		//ustawianie widoczno�ci layoutu
		frame.setVisible(true);
		
		//dodawanie ActionListenera do obu przycisk�w
		btn1.addActionListener(new actionHandler());
		btn2.addActionListener(new actionHandler());
		
	}
	
	//tworzenie klasy actionHandler zachowuj�cej si� podobnie do ActionListenera
	static class actionHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//dodawanie pr�b
			tries++;
			//Wy�wietlanie ilo�ci pr�b i znalezionych diament�w
			frame.setTryCounter("Proba: " + String.valueOf(tries));
			frame.setDiamondCounter("Liczba diamentow: " + String.valueOf(diamonds));
			
			
			//definiowanie tego co b�dzie si� dzia�o w programie je�li pr�b b�dzie mniej ni� 20
			if(tries < 20) {
				currentObject = new Random().nextBoolean();
				//definiowanie tego co b�dzie si� dzia�o je�li currentObject == true
				if(currentObject) {
					diamonds++;
				} else {
					bombs++;
				}
			}
			//definiowanie akcji programu je�li zmienna tries b�dzie wynosi�a 20
			if(tries == 20) {
				//wyniki gry
				frame.setResult("Gra zakonczona, uzyskano " + String.valueOf(diamonds) +" diamentow.\n Gra zacz�a si� od nowa!\n");
				tries = 0;
				diamonds = 0;
				
			}
			//wy�wietlanie w konsoli to jaki obiekt by� w danym momencie
			System.out.println(currentObject);
		}
		
	}
}
