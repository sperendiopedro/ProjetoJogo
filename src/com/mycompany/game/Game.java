package com.mycompany.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Caret;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
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
		
		JLabel lblPergunta1 = new JLabel("O seu planeta é azul?");
		lblPergunta1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPergunta1.setForeground(new Color(255, 255, 255));
		lblPergunta1.setBounds(179, 174, 233, 38);
		lblPergunta1.setVisible(true) ;
		contentPane.add(lblPergunta1);
		
		JCheckBox chckbxA = new JCheckBox("Sim");
		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxA.setForeground(new Color(255, 255, 255));
		chckbxA.setBackground(new Color(0, 0, 0));
		chckbxA.setBounds(221, 243, 63, 21);
		chckbxA.addItemListener(new CheckboxA());
		contentPane.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("Não");
		chckbxB.setForeground(Color.WHITE);
		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxB.setBackground(Color.BLACK);
		chckbxB.setBounds(317, 243, 51, 21);
		chckbxB.addItemListener(new CheckboxB());
		contentPane.add(chckbxB);
		
	}
	
	public class CheckboxA implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("Existe vida no seu planeta?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 23));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(130, 174, 400, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Sim");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(221, 243, 63, 21);
    		chckbxA.addItemListener(new Terra()); 
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Não");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(317, 243, 51, 21); 
    		chckbxB.addItemListener(new CheckboxAB());
    		contentPane.add(chckbxB);
    
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
	
	public class CheckboxAB implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("O seu planeta tem uma lua chamada de Tritão?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 19));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(65, 174, 500, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Sim");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(221, 243, 63, 21);
    		chckbxA.addItemListener(new Netuno()); 
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Não");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(317, 243, 51, 21); 
    		chckbxB.addItemListener(new Urano()); 
    		contentPane.add(chckbxB);
    
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
		
	public class CheckboxB implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("Descobriram água no seu planeta?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 21));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(105, 169, 505, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Sim");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(221, 243, 63, 21);
    		chckbxA.addItemListener(new Marte());
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Não");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(317, 243, 51, 21); 
    		chckbxB.addItemListener(new CheckboxBB()); 
    		contentPane.add(chckbxB);
	
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
	
	public class CheckboxBB implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("O seu planeta é rochoso ou gasoso?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 23));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(80, 174, 420, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Rochoso");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(200, 243, 80, 21);
    		chckbxA.addItemListener(new CheckboxBBA()); 
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Gasoso");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(300, 243, 80, 21); 
    		chckbxB.addItemListener(new CheckboxBBB());
    		contentPane.add(chckbxB);
	    
	    
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
	
	public class CheckboxBBA implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("Seu planeta tem uma aparencia acinzentada?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 21));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(45, 169, 505, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Sim");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(221, 243, 63, 21);
    		chckbxA.addItemListener(new Mercurio());
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Não");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(317, 243, 51, 21);
    		chckbxB.addItemListener(new Venus());
    		contentPane.add(chckbxB);
	
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
	
	public class CheckboxBBB implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("O seu planeta possui anéis?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 21));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(145, 169, 505, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Sim");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(221, 243, 63, 21);
    		chckbxA.addItemListener(new Saturno());
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Não");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(317, 243, 51, 21);
    		chckbxB.addItemListener(new Jupiter());
    		contentPane.add(chckbxB);
	
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
	
	
	
	public class Mercurio implements ItemListener {
	    @Override
	 	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblMercurio = new JLabel("Esse ficou fácil !");
	            	lblMercurio.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblMercurio.setForeground(new Color(255, 255, 255));
	        		lblMercurio.setBounds(50, 60, 505, 30);
	        		lblMercurio.setVisible(true) ;
	        		contentPane.add(lblMercurio);
	        		
	        		JLabel lblUrano1 = new JLabel("O seu planeta é: ");
	        		lblUrano1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblUrano1.setForeground(new Color(255, 255, 255));
	        		lblUrano1.setBounds(50, 95, 505, 30);
	        		lblUrano1.setVisible(true) ;
	        		contentPane.add(lblUrano1); 
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Mercurio.jpg"));
	        		lblNewLabel.setBounds(145, 120, 302, 273);
	        		contentPane.add(lblNewLabel);
	        		
	        		JLabel lblMercurio2 = new JLabel("Mercurio!");
	            	lblMercurio2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblMercurio2.setForeground(new Color(255, 255, 255));
	        		lblMercurio2.setBounds(260, 395, 505, 30);
	        		lblMercurio2.setVisible(true) ;
	        		contentPane.add(lblMercurio2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	}
			}
		}
	
	public class Venus implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblMarte = new JLabel("O planeta mais perto da terra!");
	            	lblMarte.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblMarte.setForeground(new Color(255, 255, 255));
	        		lblMarte.setBounds(50, 60, 505, 30);
	        		lblMarte.setVisible(true) ;
	        		contentPane.add(lblMarte);
	        		
	        		JLabel lblMarte1 = new JLabel("O seu planeta é: ");
	        		lblMarte1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblMarte1.setForeground(new Color(255, 255, 255));
	        		lblMarte1.setBounds(50, 95, 505, 30);
	        		lblMarte1.setVisible(true) ;
	        		contentPane.add(lblMarte1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Venus.jpeg"));
	        		lblNewLabel.setBounds(160, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		

	        		JLabel lblMarte2 = new JLabel("Vênus!");
	            	lblMarte2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblMarte2.setForeground(new Color(255, 255, 255));
	        		lblMarte2.setBounds(260, 395, 505, 30);
	        		lblMarte2.setVisible(true) ;
	        		contentPane.add(lblMarte2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        		
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	//
	        	}
	    	}
		}   	
	
	
	public class Terra implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblTerra = new JLabel("Dá pra ter mais criatividade que isso!");
	            	lblTerra.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblTerra.setForeground(new Color(255, 255, 255));
	        		lblTerra.setBounds(50, 60, 505, 30);
	        		lblTerra.setVisible(true) ;
	        		contentPane.add(lblTerra);
	        		
	        		JLabel lblTerra1 = new JLabel("O seu planeta é: ");
	        		lblTerra1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblTerra1.setForeground(new Color(255, 255, 255));
	        		lblTerra1.setBounds(50, 95, 505, 30);
	        		lblTerra1.setVisible(true) ;
	        		contentPane.add(lblTerra1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Terra.jpg"));
	        		lblNewLabel.setBounds(138, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		

	        		JLabel lblTerra2 = new JLabel("Terra!");
	            	lblTerra2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblTerra2.setForeground(new Color(255, 255, 255));
	        		lblTerra2.setBounds(260, 395, 505, 30);
	        		lblTerra2.setVisible(true) ;
	        		contentPane.add(lblTerra2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	}
			}
		}		
	
	public class Marte implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblMarte = new JLabel("To water on mars! - Donald Margolis");
	            	lblMarte.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblMarte.setForeground(new Color(255, 255, 255));
	        		lblMarte.setBounds(50, 60, 505, 30);
	        		lblMarte.setVisible(true) ;
	        		contentPane.add(lblMarte);
	        		
	        		JLabel lblMarte1 = new JLabel("O seu planeta é: ");
	        		lblMarte1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblMarte1.setForeground(new Color(255, 255, 255));
	        		lblMarte1.setBounds(50, 95, 505, 30);
	        		lblMarte1.setVisible(true) ;
	        		contentPane.add(lblMarte1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Marte.jpg"));
	        		lblNewLabel.setBounds(138, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		

	        		JLabel lblMarte2 = new JLabel("Marte!");
	            	lblMarte2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblMarte2.setForeground(new Color(255, 255, 255));
	        		lblMarte2.setBounds(260, 395, 505, 30);
	        		lblMarte2.setVisible(true) ;
	        		contentPane.add(lblMarte2);
	        		
	        		JLabel lblMarte3 = new JLabel("Quem pegou a referencia de Breaking bad?");
	            	lblMarte3.setFont(new Font("Tahoma", Font.BOLD, 8));
	        		lblMarte3.setForeground(new Color(255, 255, 255));
	        		lblMarte3.setBounds(200, 415, 505, 30);
	        		lblMarte3.setVisible(true) ;
	        		contentPane.add(lblMarte3);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        		
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	//
	        	}
	    	}
		}   	
	
	public class Jupiter implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblTerra = new JLabel("O maior do sistema solar!");
	            	lblTerra.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblTerra.setForeground(new Color(255, 255, 255));
	        		lblTerra.setBounds(50, 50, 505, 30);
	        		lblTerra.setVisible(true) ;
	        		contentPane.add(lblTerra);
	        		
	        		JLabel lblTerra1 = new JLabel("O seu planeta é: ");
	        		lblTerra1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblTerra1.setForeground(new Color(255, 255, 255));
	        		lblTerra1.setBounds(50, 85, 505, 30);
	        		lblTerra1.setVisible(true) ;
	        		contentPane.add(lblTerra1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Jupiter.jpg"));
	        		lblNewLabel.setBounds(138, 115, 302, 300);
	        		contentPane.add(lblNewLabel);;
	        		

	        		JLabel lblTerra2 = new JLabel("Jupiter!");
	            	lblTerra2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblTerra2.setForeground(new Color(255, 255, 255));
	        		lblTerra2.setBounds(250, 415, 505, 30);
	        		lblTerra2.setVisible(true) ;
	        		contentPane.add(lblTerra2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	}
			}
		}		
	
	public class Saturno implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblTerra = new JLabel("O meu favorito!");
	            	lblTerra.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblTerra.setForeground(new Color(255, 255, 255));
	        		lblTerra.setBounds(50, 60, 505, 30);
	        		lblTerra.setVisible(true) ;
	        		contentPane.add(lblTerra);
	        		
	        		JLabel lblTerra1 = new JLabel("O seu planeta é: ");
	        		lblTerra1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblTerra1.setForeground(new Color(255, 255, 255));
	        		lblTerra1.setBounds(50, 95, 505, 30);
	        		lblTerra1.setVisible(true) ;
	        		contentPane.add(lblTerra1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Saturno.jpg"));
	        		lblNewLabel.setBounds(138, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		

	        		JLabel lblTerra2 = new JLabel("Saturno!");
	            	lblTerra2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblTerra2.setForeground(new Color(255, 255, 255));
	        		lblTerra2.setBounds(260, 395, 505, 30);
	        		lblTerra2.setVisible(true) ;
	        		contentPane.add(lblTerra2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	}
			}
		}		
	
	public class Urano implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblUrano = new JLabel("Esse é bem bonitão");
	            	lblUrano.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblUrano.setForeground(new Color(255, 255, 255));
	        		lblUrano.setBounds(50, 60, 505, 30);
	        		lblUrano.setVisible(true) ;
	        		contentPane.add(lblUrano);
	        		
	        		JLabel lblUrano1 = new JLabel("O seu planeta é: ");
	        		lblUrano1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblUrano1.setForeground(new Color(255, 255, 255));
	        		lblUrano1.setBounds(50, 95, 505, 30);
	        		lblUrano1.setVisible(true) ;
	        		contentPane.add(lblUrano1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Urano.jpg"));
	        		lblNewLabel.setBounds(138, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		
	        		
	        		JLabel lblUrano2 = new JLabel("Urano!");
	            	lblUrano2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblUrano2.setForeground(new Color(255, 255, 255));
	        		lblUrano2.setBounds(260, 395, 505, 30);
	        		lblUrano2.setVisible(true) ;
	        		contentPane.add(lblUrano2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
				}
		    } 
		   }
	public class Netuno implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblUrano = new JLabel("Esse é bem bonitão");
	            	lblUrano.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblUrano.setForeground(new Color(255, 255, 255));
	        		lblUrano.setBounds(50, 60, 505, 30);
	        		lblUrano.setVisible(true) ;
	        		contentPane.add(lblUrano);
	        		
	        		JLabel lblUrano1 = new JLabel("O seu planeta é: ");
	        		lblUrano1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        		lblUrano1.setForeground(new Color(255, 255, 255));
	        		lblUrano1.setBounds(50, 95, 505, 30);
	        		lblUrano1.setVisible(true) ;
	        		contentPane.add(lblUrano1);
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Netuno.jpg"));
	        		lblNewLabel.setBounds(138, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		
	        		
	        		JLabel lblUrano2 = new JLabel("Netuno!");
	            	lblUrano2.setFont(new Font("Tahoma", Font.BOLD, 22));
	        		lblUrano2.setForeground(new Color(255, 255, 255));
	        		lblUrano2.setBounds(260, 395, 505, 30);
	        		lblUrano2.setVisible(true) ;
	        		contentPane.add(lblUrano2);
	        		
	        		JButton btnMenu = new JButton("Voltar");
	        		btnMenu.setBounds(491, 432, 85, 21);
	        		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 10));
	        		contentPane.add(btnMenu);
	        		btnMenu.addActionListener( new ActionListener() {
	        			
	        			public void actionPerformed(ActionEvent e) { 
	        				Teste t1 = new Teste(); 
	        				t1.setVisible(true); 
	        				Game.this.dispose(); 
	        			}
	        		});
	        	}else if (e.getStateChange() == ItemEvent.DESELECTED) {
				}
		    } 
		   }
	

}


