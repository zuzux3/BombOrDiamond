package App;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class BombOrDiamond {
	//tworzenie zmiennej która pomo¿e liczyæ diamenty
	private static boolean currentObject;
	//wywo³ywanie klasy frame, aby gra dzia³a³a poprawnie
	public static Frame frame = new Frame("Zagrajmy w gre!");
	//tworzenie wartoœci random, która losowo bêdzie rozmieszcza³a bombê i diamenty
	private static Random random = new Random();
	//tworzenie przycisków
	private static JButton btn1 = frame.getBtn1();
	private static JButton btn2 = frame.getBtn2();
	//definiowanie zmiennych tries, diamonds i bombs
	private static int tries = 0;
	static int diamonds = 0;
	static int bombs = 0;
	
	//tworzenie konstruktora
	public BombOrDiamond() {
		//ustawianie widocznoœci layoutu
		frame.setVisible(true);
		
		//dodawanie ActionListenera do obu przycisków
		btn1.addActionListener(new actionHandler());
		btn2.addActionListener(new actionHandler());
		
	}
	
	//tworzenie klasy actionHandler zachowuj¹cej siê podobnie do ActionListenera
	static class actionHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//dodawanie prób
			tries++;
			//Wyœwietlanie iloœci prób i znalezionych diamentów
			frame.setTryCounter("Proba: " + String.valueOf(tries));
			frame.setDiamondCounter("Liczba diamentow: " + String.valueOf(diamonds));
			
			
			//definiowanie tego co bêdzie siê dzia³o w programie jeœli prób bêdzie mniej ni¿ 20
			if(tries < 20) {
				currentObject = new Random().nextBoolean();
				//definiowanie tego co bêdzie siê dzia³o jeœli currentObject == true
				if(currentObject) {
					diamonds++;
				} else {
					bombs++;
				}
			}
			//definiowanie akcji programu jeœli zmienna tries bêdzie wynosi³a 20
			if(tries == 20) {
				//wyniki gry
				frame.setResult("Gra zakonczona, uzyskano " + String.valueOf(diamonds) +" diamentow.\n Gra zaczê³a siê od nowa!\n");
				tries = 0;
				diamonds = 0;
				
			}
			//wyœwietlanie w konsoli to jaki obiekt by³ w danym momencie
			System.out.println(currentObject);
		}
		
	}
}
