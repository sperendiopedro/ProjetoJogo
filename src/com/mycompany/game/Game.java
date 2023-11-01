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
		
		JLabel lblPergunta1 = new JLabel("Para começarmos, existe vida no seu planeta?");
		lblPergunta1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPergunta1.setForeground(new Color(255, 255, 255));
		lblPergunta1.setBounds(41, 117, 505, 38);
		lblPergunta1.setVisible(true) ;
		contentPane.add(lblPergunta1);
		
		JCheckBox chckbxA = new JCheckBox("Sim");
		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxA.setForeground(new Color(255, 255, 255));
		chckbxA.setBackground(new Color(0, 0, 0));
		chckbxA.setBounds(100, 307, 63, 21);
		chckbxA.addItemListener(new CheckboxA());
		contentPane.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("Não");
		chckbxB.setForeground(Color.WHITE);
		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxB.setBackground(Color.BLACK);
		chckbxB.setBounds(230, 308, 51, 21);
		chckbxB.addItemListener(new CheckboxB());
		contentPane.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("Talvez futuramente");
		chckbxC.setForeground(Color.WHITE);
		chckbxC.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxC.setBackground(Color.BLACK);
		chckbxC.setBounds(349, 308, 161, 21);
		chckbxC.addItemListener(new CheckboxC()); 
		contentPane.add(chckbxC);
		
	}
	
	public class CheckboxA implements ItemListener {
    @Override
    	public void itemStateChanged(ItemEvent e) {
        	if (e.getStateChange() == ItemEvent.SELECTED) {
        		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
            	JLabel lblTerra = new JLabel("Eita que criatividade!! Que planeta será???");
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
	
	public class CheckboxB implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	            	contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblPergunta2 = new JLabel("Qual a cor do planeta?");
	            	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 21));
	        		lblPergunta2.setForeground(new Color(255, 255, 255));
	        		lblPergunta2.setBounds(170, 117, 505, 38);
	        		lblPergunta2.setVisible(true) ;
	        		contentPane.add(lblPergunta2);
	        		
	        		JCheckBox chcbxA = new JCheckBox("Azul");
	        		chcbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
	        		chcbxA.setForeground(new Color(255, 255, 255));
	        		chcbxA.setBackground(new Color(0, 0, 0));
	        		chcbxA.setBounds(85, 307, 63, 21);
	        		chcbxA.addItemListener(new CheckboxBA());
	        		contentPane.add(chcbxA);
	        		
	        		JCheckBox chckbxB = new JCheckBox("Vermelho");
	        		chckbxB.setForeground(Color.WHITE);
	        		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
	        		chckbxB.setBackground(Color.BLACK);
	        		chckbxB.setBounds(170, 308, 90, 21);
	        		contentPane.add(chckbxB);
	        		
	        		JCheckBox chckbxC = new JCheckBox("Acinzentado");
	        		chckbxC.setForeground(Color.WHITE);
	        		chckbxC.setFont(new Font("Tahoma", Font.BOLD, 12));
	        		chckbxC.setBackground(Color.BLACK);
	        		chckbxC.setBounds(275, 308, 100, 21);
	        		chckbxC.addItemListener(new CheckboxBC());
	        		contentPane.add(chckbxC);
	        		
	        		JCheckBox chckbxD = new JCheckBox("Tons de bege");
	        		chckbxD.setForeground(Color.WHITE);
	        		chckbxD.setFont(new Font("Tahoma", Font.BOLD, 12));
	        		chckbxD.setBackground(Color.BLACK);
	        		chckbxD.setBounds(395, 308, 161, 21);
	        		contentPane.add(chckbxD);
	        	
	        	} else if (e.getStateChange() == ItemEvent.DESELECTED) {
	        	}
	    	}
		} 
	
	public class CheckboxC implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblMarte = new JLabel("Nem você acredita nisso, vai!");
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
	public class CheckboxBC implements ItemListener {
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
	        		
	        		JLabel lblNewLabel = new JLabel("");
	        		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseWorkspace\\ProjetoJogo\\Imagens\\Mercurio.jpg"));
	        		lblNewLabel.setBounds(145, 120, 302, 273);
	        		contentPane.add(lblNewLabel);;
	        		

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
	
	public class CheckboxBA implements ItemListener {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    		contentPane.removeAll();
            	contentPane.revalidate();
            	contentPane.repaint();
            	
	      	JLabel lblPergunta2 = new JLabel("Seu planeta tem 15 luas?");
        	lblPergunta2.setFont(new Font("Tahoma", Font.BOLD, 21));
    		lblPergunta2.setForeground(new Color(255, 255, 255));
    		lblPergunta2.setBounds(170, 117, 505, 38);
    		lblPergunta2.setVisible(true) ;
    		contentPane.add(lblPergunta2);
    		
    		JCheckBox chckbxA = new JCheckBox("Sim");
    		chckbxA.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxA.setForeground(new Color(255, 255, 255));
    		chckbxA.setBackground(new Color(0, 0, 0));
    		chckbxA.setBounds(220, 307, 63, 21);
    		chckbxA.addItemListener(new CheckboxBAA());
    		contentPane.add(chckbxA);
    		
    		JCheckBox chckbxB = new JCheckBox("Não");
    		chckbxB.setForeground(Color.WHITE);
    		chckbxB.setFont(new Font("Tahoma", Font.BOLD, 12));
    		chckbxB.setBackground(Color.BLACK);
    		chckbxB.setBounds(350, 308, 51, 21);
    		contentPane.add(chckbxB);
	    
	    
			}else if (e.getStateChange() == ItemEvent.DESELECTED) {
			}
	    } 
	   }
	public class CheckboxBAA implements ItemListener {
	    @Override
	    	public void itemStateChanged(ItemEvent e) {
	        	if (e.getStateChange() == ItemEvent.SELECTED) {
	        		contentPane.removeAll();
	            	contentPane.revalidate();
	            	contentPane.repaint();
	            	
	            	JLabel lblUrano = new JLabel("Essa é bonito!");
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
	        	
}


