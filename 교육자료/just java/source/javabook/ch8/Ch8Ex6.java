package javabook.ch8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ch8Ex6 extends JFrame{
	int index=0;
	String[] msgs = {"첫번째 문장","두번째 문장","세번째 문장"};
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(msgs[0]);
	
	public Ch8Ex6() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				index--;
				changeText();
			}	
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				index++;
				changeText();
			}
		});
		button3.setEnabled(false);
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}

	public void changeText() {
		if(index > 2) 
			index = 0;
		else if(index < 0) {
			index = 2;
		}
		button3.setText(msgs[index]);
	}
	
	public static void main(String[] args) {
		Ch8Ex6 app = new Ch8Ex6();
	}

}
