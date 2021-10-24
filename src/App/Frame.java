package App;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	private static JPanel topPanel = new JPanel();
	private static JPanel botPanel = new JPanel();
	private static JPanel leftBotPanel = new JPanel();
	private static JPanel rightBotPanel = new JPanel();
	
	private JLabel tryCounter = new JLabel("Proba: 0");
	private JLabel diamondCounter = new JLabel("Liczba diamentow: 0");
	
	private JButton btn1 = new JButton ("Czy ten?");
	private JButton btn2 = new JButton ("A moze ten?");
	private JTextArea result = new JTextArea(5, 30);
	
	public Frame(String title) {
		super(title);
		
		topPanel.setLayout(new GridLayout(1, 2));
		botPanel.setLayout(new GridLayout(1, 2));
		rightBotPanel.setLayout(new GridLayout(1, 1));
		
		this.setSize(600, 600);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container mainContainer = this.getContentPane();
		mainContainer.setLayout(new GridLayout(2, 2));
		mainContainer.setBackground(Color.cyan);
		
		this.add(topPanel);
		this.add(botPanel);
		
		botPanel.add(leftBotPanel);
		botPanel.add(rightBotPanel);
		
		leftBotPanel.add(tryCounter);
		leftBotPanel.add(diamondCounter);
		rightBotPanel.add(result);
		
		topPanel.add(btn1);
		topPanel.add(btn2);
	}
	
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
	
	JButton getB1(){
        return this.btn1;
    }
	
	JButton getB2(){
        return this.btn2;
    }
	
	JButton getClickedButton(JButton b){
        return b;
    }

}
