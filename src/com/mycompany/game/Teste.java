package com.mycompany.game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teste extends JFrame {
	
	 
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setTitle("Menu Iniciar"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 600, 500); //first two number are the location, the last two numbers are the size.
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
	
		JLabel lblInicio = new JLabel("Bem vindo ao 'Planet guesser'. ");
		lblInicio.setForeground(new Color(255, 255, 255));
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblInicio.setBounds(131, 83, 326, 43);
		contentPane.add(lblInicio);	
		
		JTextPane txtInstrucoes = new JTextPane();
		txtInstrucoes.setEnabled(true);
		txtInstrucoes.setEditable(false);
		txtInstrucoes.setText("Neste jogo, você responderá um rápido questionario e tentaremos advinhar qual planeta você está pensando.");
		txtInstrucoes.setForeground(Color.WHITE);
		txtInstrucoes.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtInstrucoes.setBackground(Color.BLACK);
		txtInstrucoes.setBounds(11, 144, 566, 74);
		contentPane.add(txtInstrucoes);
		
		JLabel lblinicio2 = new JLabel("Clique para continuar:");
		lblinicio2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblinicio2.setForeground(new Color(255, 255, 255));
		lblinicio2.setBounds(233, 250, 122, 13);
		contentPane.add(lblinicio2); 
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) { 
				Game g1 = new Game(); 
				g1.setVisible(true);
				Teste.this.dispose();

			} 
		});
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnIniciar.setBounds(252, 273, 85, 21);
		contentPane.add(btnIniciar);
		
		
	}
}
