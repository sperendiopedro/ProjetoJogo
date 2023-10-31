package com.mycompany.game;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Caret;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
	
	public Game()
	{
		setTitle("Game.exe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPergunta1 = new JLabel("Para começarmos, existe vida no seu planeta?");
		lblPergunta1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPergunta1.setForeground(new Color(255, 255, 255));
		lblPergunta1.setBounds(41, 117, 505, 38);
		contentPane.add(lblPergunta1);
		
		JCheckBox chcbxA = new JCheckBox("Sim");
		chcbxA.setFont(new Font("Tahoma", Font.BOLD, 13));
		chcbxA.setForeground(new Color(255, 255, 255));
		chcbxA.setBackground(new Color(0, 0, 0));
		chcbxA.setBounds(100, 307, 63, 21);
		chcbxA.addItemListener(new LimparTelaListener());
		contentPane.add(chcbxA);
		
		JCheckBox chckbxB = new JCheckBox("Não");
		chckbxB.setForeground(Color.WHITE);
		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxB.setBackground(Color.BLACK);
		chckbxB.setBounds(230, 308, 51, 21);
		contentPane.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("Talvez futuramente");
		chckbxC.setForeground(Color.WHITE);
		chckbxC.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxC.setBackground(Color.BLACK);
		chckbxC.setBounds(349, 308, 161, 21);
		contentPane.add(chckbxC);
	
	}


	public class LimparTelaListener implements ItemListener {
    @Override
    	public void itemStateChanged(ItemEvent e) {
        	if (e.getStateChange() == ItemEvent.SELECTED) {
            	contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
        	} else if (e.getStateChange() == ItemEvent.DESELECTED) {
        	}
    	}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


