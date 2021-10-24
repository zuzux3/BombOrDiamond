package App;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	//tworzenie paneli aby mo¿na by³o podzieliæ okno na 4 czêœci
	private static JPanel topPanel = new JPanel();
	private static JPanel botPanel = new JPanel();
	private static JPanel leftBotPanel = new JPanel();
	private static JPanel rightBotPanel = new JPanel();
	
	//tworzenie liczników prób i diamentów
	private JLabel tryCounter = new JLabel("Proba: 0");
	private JLabel diamondCounter = new JLabel("Liczba diamentow: 0");
	
	//tworzenie przycisków
	private JButton btn1 = new JButton ("Czy ten?");
	private JButton btn2 = new JButton ("A moze ten?");
	//tworzenie miejsca, gdzie wyœwietlany bêdzie wynik
	private JTextArea result = new JTextArea(5, 30);
	
	//dodanie konstruktora
	public Frame(String title) {
		//dodanie konstrukcji super
		super(title);
		//ustawianie wygl¹du paneli
		topPanel.setLayout(new GridLayout(1, 2));
		botPanel.setLayout(new GridLayout(1, 2));
		rightBotPanel.setLayout(new GridLayout(1, 1));
		//ustawianie wieloœci okna i lokalizacji
		this.setSize(600, 600);
		this.setLocation(100, 100);
		//ustawianie wyjœcia z aplikacji
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
		
		//dodawanie liczników prób i diamentów oraz wyniku
		leftBotPanel.add(tryCounter);
		leftBotPanel.add(diamondCounter);
		rightBotPanel.add(result);
		
		//dodawanie przycisków do top Panela
		topPanel.add(btn1);
		topPanel.add(btn2);
	}
	
	//metody get i set dla: tryCounter, diamondCounter, result i przycisków
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
