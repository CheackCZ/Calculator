import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtAhoj;
	private double vysledek;
	private char operace;
	private boolean noveCislo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {

		noveCislo = true;
		
		setTitle("Kalkulačka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAhoj = new JTextField();
		txtAhoj.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtAhoj.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAhoj.setForeground(Color.WHITE);
		txtAhoj.setBackground(Color.DARK_GRAY);
		txtAhoj.setBounds(10, 0, 294, 65);
		contentPane.add(txtAhoj);
		txtAhoj.setColumns(10);
		txtAhoj.setText("0");
		
		
		//Z�KLADN� FUNKCE - %, AC, +/-, .
		
		//VYNULOV�N�
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAhoj.setText("0");
			}
		});
		btnAC.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnAC.setForeground(Color.WHITE);
		btnAC.setBackground(new Color(105, 105, 105));
		btnAC.setBounds(10, 64, 74, 61);
		contentPane.add(btnAC);
		
		//PLUS/M�NUS		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cislo = Double.parseDouble(txtAhoj.getText());
				if (cislo % 1 == 0) {
					txtAhoj.setText("" + (int)cislo * (-1));		
				} else {
					txtAhoj.setText("" + cislo * (-1));		
				}
			}
		});
		btnPlusMinus.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnPlusMinus.setForeground(Color.WHITE);
		btnPlusMinus.setBackground(new Color(105, 105, 105));
		btnPlusMinus.setBounds(83, 64, 74, 61);
		contentPane.add(btnPlusMinus);
		
		//PROCENTO
		JButton btnProcento = new JButton("%");
		btnProcento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cislo = Double.parseDouble(txtAhoj.getText());
				if (cislo % 100 != 0) {
						txtAhoj.setText("" + cislo / 100);
				} else if (cislo < 100) {
					txtAhoj.setText("" + cislo / 100);	
				} else {
					txtAhoj.setText("" + (int)cislo / 100);		
				}
			}
		});
		btnProcento.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnProcento.setForeground(Color.WHITE);
		btnProcento.setBackground(new Color(105, 105, 105));
		btnProcento.setBounds(156, 64, 74, 61);
		contentPane.add(btnProcento);
		
		//DESETINN� ��RKA
		JButton btnTecka = new JButton(".");
		btnTecka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAhoj.setText(txtAhoj.getText() + ".");
			}
		});
		btnTecka.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnTecka.setForeground(Color.WHITE);
		btnTecka.setBackground(new Color(105, 105, 105));
		btnTecka.setBounds(156, 304, 74, 61);
		contentPane.add(btnTecka);
		
		
		//NASTAVEN� ��SEL

		//NULA
		JButton btnNula = new JButton("0");
		btnNula.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(noveCislo) {
					txtAhoj.setText("" + 0);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 0);
				}
			}
		});
		btnNula.setForeground(Color.WHITE);
		btnNula.setBackground(new Color(105, 105, 105));
		btnNula.setBounds(10, 304, 147, 61);
		contentPane.add(btnNula);
		
		//SEDM
		JButton btnSedm = new JButton("7");
		btnSedm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 7);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 7);
				}	
			}
		});
		btnSedm.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnSedm.setForeground(Color.WHITE);
		btnSedm.setBackground(new Color(105, 105, 105));
		btnSedm.setBounds(10, 124, 74, 61);
		contentPane.add(btnSedm);
		
		//OSM
		JButton btnOsm = new JButton("8");
		btnOsm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 8);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 8);
				}
			}
		});
		btnOsm.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnOsm.setForeground(Color.WHITE);
		btnOsm.setBackground(new Color(105, 105, 105));
		btnOsm.setBounds(83, 124, 74, 61);
		contentPane.add(btnOsm);
		
		//D�VET
		JButton btnDevet = new JButton("9");
		btnDevet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 9);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 9);
				}
			}
		});
		btnDevet.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnDevet.setForeground(Color.WHITE);
		btnDevet.setBackground(new Color(105, 105, 105));
		btnDevet.setBounds(156, 124, 74, 61);
		contentPane.add(btnDevet);
		
		//�TY�I
		JButton btnCtyri = new JButton("4");
		btnCtyri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 4);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 4);
				}
			}
		});
		btnCtyri.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnCtyri.setForeground(Color.WHITE);
		btnCtyri.setBackground(new Color(105, 105, 105));
		btnCtyri.setBounds(10, 184, 74, 61);
		contentPane.add(btnCtyri);
		
		//P�T
		JButton btnPet = new JButton("5");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 5);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 5);
				}
			}
		});
		btnPet.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnPet.setForeground(Color.WHITE);
		btnPet.setBackground(new Color(105, 105, 105));
		btnPet.setBounds(83, 184, 74, 61);
		contentPane.add(btnPet);
		
		//�EST
		JButton btnSest = new JButton("6");
		btnSest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 6);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 6);
				}
			}
		});
		btnSest.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnSest.setForeground(Color.WHITE);
		btnSest.setBackground(new Color(105, 105, 105));
		btnSest.setBounds(156, 184, 74, 61);
		contentPane.add(btnSest);
		
		//JEDNA
		JButton btnJedna = new JButton("1");
		btnJedna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 1);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 1);
				}
			}
		});
		btnJedna.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnJedna.setForeground(Color.WHITE);
		btnJedna.setBackground(new Color(105, 105, 105));
		btnJedna.setBounds(10, 244, 74, 61);
		contentPane.add(btnJedna);
		
		//DVA
		JButton btnDva = new JButton("2");
		btnDva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 2);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 2);
				}
			}
		});
		btnDva.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnDva.setForeground(Color.WHITE);
		btnDva.setBackground(new Color(105, 105, 105));
		btnDva.setBounds(83, 244, 74, 61);
		contentPane.add(btnDva);
		
		//T�I
		JButton btnTri = new JButton("3");
		btnTri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAhoj.getText().equals("0")) {
					txtAhoj.setText("");
				}
				if(noveCislo) {
					txtAhoj.setText("" + 3);
					noveCislo = false;
				} else {
					txtAhoj.setText(txtAhoj.getText() + 3);
				}
			}
		});
		btnTri.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnTri.setForeground(Color.WHITE);
		btnTri.setBackground(new Color(105, 105, 105));
		btnTri.setBounds(156, 244, 74, 61);
		contentPane.add(btnTri);
		
				
		//OPERACE - D�LENO, KR�T, M�NUS, PLUS, ROVN� SE
		
		//D�LENO
		JButton btnDeleno = new JButton("\u00F7");
		btnDeleno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cislo1 = Double.parseDouble(txtAhoj.getText());
				if (cislo1 % 1 == 0) {
					vysledek = (int)cislo1;
				} else {
					vysledek = cislo1;
				}
				txtAhoj.setText("" + 0);
				operace = '\u00F7';
			}
		});	
		btnDeleno.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnDeleno.setForeground(Color.WHITE);
		btnDeleno.setBackground(new Color(255, 140, 0));
		btnDeleno.setBounds(230, 64, 74, 61);
		contentPane.add(btnDeleno);
		
		//KR�T
		JButton btnKrat = new JButton("x");
		btnKrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cislo1 = Double.parseDouble(txtAhoj.getText());
				if (cislo1 % 1 == 0) {
					vysledek = (int)cislo1;
				} else {
					vysledek = cislo1;
				}
				txtAhoj.setText("" + 0);
				operace = 'x';
			}
		});	
		btnKrat.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnKrat.setForeground(Color.WHITE);
		btnKrat.setBackground(new Color(255, 140, 0));
		btnKrat.setBounds(230, 124, 74, 61);
		contentPane.add(btnKrat);
		
		//M�NUS
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cislo1 = Double.parseDouble(txtAhoj.getText());
				if (cislo1 % 1 == 0) {
					vysledek = (int)cislo1;
				} else {
					vysledek = cislo1;
				}
				txtAhoj.setText("" + 0);
				operace = '-';
			}
		});	
		btnMinus.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnMinus.setForeground(Color.WHITE);
		btnMinus.setBackground(new Color(255, 140, 0));
		btnMinus.setBounds(230, 184, 74, 61);
		contentPane.add(btnMinus);
		
		//PLUS
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cislo1 = Double.parseDouble(txtAhoj.getText());
				if (cislo1 % 1 == 0) {
					vysledek = (int)cislo1;
				} else {
					vysledek = cislo1;
				}
				txtAhoj.setText("" + 0);
				operace = '+';
			}
		});	
		btnPlus.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setBackground(new Color(255, 140, 0));
		btnPlus.setBounds(230, 244, 74, 61);
		contentPane.add(btnPlus);
		
		//ROVN� SE
		JButton btnRovnase = new JButton("=");
		btnRovnase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(operace) {
					case '+': 
						vysledek += Integer.parseInt(txtAhoj.getText());
						if (vysledek % 1 == 0) {
							txtAhoj.setText("" + (int)vysledek);							
						} else {
							txtAhoj.setText("" + vysledek);
						}
					    break;
					case '-':
						vysledek -= Integer.parseInt(txtAhoj.getText());
						if (vysledek % 1 == 0) {
							txtAhoj.setText("" + (int)vysledek);							
						} else {
							txtAhoj.setText("" + vysledek);
						}
						break;
					case 'x':
						vysledek *= Integer.parseInt(txtAhoj.getText());
						if (vysledek % 1 == 0) {
							txtAhoj.setText("" + (int)vysledek);							
						} else {
							txtAhoj.setText("" + vysledek);
						}
						break;
					case '\u00F7':
						vysledek /= Integer.parseInt(txtAhoj.getText());
						if (vysledek % 1 == 0) {
							txtAhoj.setText("" + (int)vysledek);							
						} else {
							txtAhoj.setText("" + vysledek);
						}
						break;
				} 
			}
		});	
		btnRovnase.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnRovnase.setForeground(Color.WHITE);
		btnRovnase.setBackground(new Color(255, 140, 0));
		btnRovnase.setBounds(230, 304, 74, 61);
		contentPane.add(btnRovnase);
	}
}
