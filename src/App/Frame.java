package App;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	//tworzenie paneli aby mo�na by�o podzieli� okno na 4 cz�ci
	private static JPanel topPanel = new JPanel();
	private static JPanel botPanel = new JPanel();
	private static JPanel leftBotPanel = new JPanel();
	private static JPanel rightBotPanel = new JPanel();
	
	//tworzenie licznik�w pr�b i diament�w
	private JLabel tryCounter = new JLabel("Proba: 0");
	private JLabel diamondCounter = new JLabel("Liczba diamentow: 0");
	
	//tworzenie przycisk�w
	private JButton btn1 = new JButton ("Czy ten?");
	private JButton btn2 = new JButton ("A moze ten?");
	//tworzenie miejsca, gdzie wy�wietlany b�dzie wynik
	private JTextArea result = new JTextArea(5, 30);
	
	//dodanie konstruktora
	public Frame(String title) {
		//dodanie konstrukcji super
		super(title);
		//ustawianie wygl�du paneli
		topPanel.setLayout(new GridLayout(1, 2));
		botPanel.setLayout(new GridLayout(1, 2));
		rightBotPanel.setLayout(new GridLayout(1, 1));
		//ustawianie wielo�ci okna i lokalizacji
		this.setSize(600, 600);
		this.setLocation(100, 100);
		//ustawianie wyj�cia z aplikacji
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//tworzenie containera i ustawianie jego layoutu i koloru
		Container mainContainer = this.getContentPane();
		mainContainer.setLayout(new GridLayout(2, 2));
		mainContainer.setBackground(Color.cyan);
		
		//dodawanie top i bottom panela 
		this.add(topPanel);
		this.add(botPanel);
		
		//dodawanie lewego i prawego botPanela do bottom panela
		botPanel.add(leftBotPanel);
		botPanel.add(rightBotPanel);
		
		//dodawanie licznik�w pr�b i diament�w oraz wyniku
		leftBotPanel.add(tryCounter);
		leftBotPanel.add(diamondCounter);
		rightBotPanel.add(result);
		
		//dodawanie przycisk�w do top Panela
		topPanel.add(btn1);
		topPanel.add(btn2);
	}
	
	//metody get i set dla: tryCounter, diamondCounter, result i przycisk�w
	JLabel getTryCounter() {
		return this.tryCounter;
	}
	
	JLabel getDiamondCounter() {
		return this.diamondCounter;
	}
	
	JLabel setTryCounter(String text){
        this.tryCounter.setText(text);
       return this.tryCounter;
	}
	
	JLabel setDiamondCounter(String text) {
		this.diamondCounter.setText(text);
		return this.tryCounter;
	}
	
	JTextArea setResult(String text){
        this.result.append(text);
        return this.result;
    }
	
	JButton getBtn1(){
        return this.btn1;
    }
	
	JButton getBtn2(){
        return this.btn2;
    }
	
	JButton getClickedButton(JButton b){
        return b;
    }

}
