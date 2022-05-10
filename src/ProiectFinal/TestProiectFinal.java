package ProiectFinal;

//import javax.swing.ImageIcon.*;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;



public class TestProiectFinal {

	private JFrame frame;
	private JTextField txtPaginaPrincipalaA;
	private JTextField txtDorestiIngredienteIn;
	private JTextField textField;
	
	
	/**
	 * Functie pentru verificarea butoanelor apasate si creea de noi obiecte folosind decoratorul
	 * @param Buton_PizzaSimplu Creare Pizza simpla
	 * @param Buton_Salam Buton adaugare salam
	 * @param Buton_Ceapa Buton adaugare ceapa
	 * @param Buton_Masline Buton adaugare masline
	 * @param Buton_Ardei Buton adaugare ardei
	 * @param Afisaj Field de afisare 
	 */
	public void butonApasat(JToggleButton Buton_PizzaSimplu,JToggleButton Buton_Salam,JToggleButton Buton_Ceapa,JToggleButton Buton_Masline,JToggleButton Buton_Ardei,JTextField Afisaj){
		
		if(Buton_PizzaSimplu.isSelected() == true){
			Pizza pi = new SimplePizza();
			System.out.println("Pizza simpla creata: " + Buton_PizzaSimplu.isVisible());
			
			
			Afisaj.setText("Numele produsului: " + pi.getIngredients() + "; Pret: " + pi.getCost());
			
			
			if(toggleButonApasat(Buton_Salam) == true){
				pi=new Salami(pi);
				System.out.println("\n Salam adaugat: " + toggleButonApasat(Buton_Salam));
				System.out.println(pi.getCost());
				
				Afisaj.setText("Numele produsului: " + pi.getIngredients() + "; Pret: " + pi.getCost());
				
			}
			
			if(toggleButonApasat(Buton_Ceapa) == true){
				pi=new Onion(pi);
				System.out.println("\n Ceapa adaugata: " + toggleButonApasat(Buton_Ceapa));
				System.out.println(pi.getCost());
				
				Afisaj.setText("Numele produsului: " + pi.getIngredients() + "; Pret: " + pi.getCost());
				
			}
			
			if(toggleButonApasat(Buton_Masline) == true){
				pi=new Olive(pi);
				System.out.println("\n Masline adaugate: " + toggleButonApasat(Buton_Masline));
				System.out.println(pi.getCost());
				
				Afisaj.setText("Numele produsului: " + pi.getIngredients() + "; Pret: " + pi.getCost());
				
			}
			
			if(toggleButonApasat(Buton_Ardei) == true){
				pi=new Pepper(pi);
				System.out.println("\n Ardei adaugati: " + toggleButonApasat(Buton_Ardei));
				System.out.println(pi.getCost());
				
				Afisaj.setText("Numele produsului: " + pi.getIngredients() + "; Pret: " + pi.getCost());
				
			}
			
		}
		
	}
	
	/**Buton verificare finalizare
	 * 
	 * @param Buton_PizzaSimplu Verificare Buton apasat PizzaSimplu
	 * @param Buton_Salam Verificare Buton apasat salam
	 * @param Buton_Ceapa Verificare Buton apasat ceapa
	 * @param Buton_Masline Verificare Buton apasat masline
	 * @param Buton_Ardei ardei
	 * @param Afisaj Field de afisare
	 * @return
	 */
	public boolean Finalizare(JToggleButton Buton_PizzaSimplu,JToggleButton Buton_Salam,JToggleButton Buton_Ceapa,JToggleButton Buton_Masline,JToggleButton Buton_Ardei,JTextField Afisaj){
		
		if(Buton_PizzaSimplu.isSelected() == true){
			
			return true;
		}
		
		
		return false;
		
	}
	
	
	/**
	 * Functie verificare daca butonul este apasat
	 * @param tb Verificare buton apasat
	 * @return
	 */
	public boolean toggleButonApasat(JToggleButton tb){
		
		return tb.isSelected();
	}
	
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestProiectFinal window = new TestProiectFinal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	
	public TestProiectFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(165, 42, 42));
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtPaginaPrincipalaA = new JTextField();
		txtPaginaPrincipalaA.setBounds(356, 13, 407, 100);
		txtPaginaPrincipalaA.setEditable(false);
		txtPaginaPrincipalaA.setBackground(new Color(65, 105, 225));
		txtPaginaPrincipalaA.setHorizontalAlignment(SwingConstants.CENTER);
		txtPaginaPrincipalaA.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtPaginaPrincipalaA.setText("Pagina principala a pizzeriei");
		txtPaginaPrincipalaA.setColumns(10);
		
		
		//Buton Creare Comanda
		 
		JButton ButonComanda = new JButton("Comand\u0103");  
		
		//Declarea Toggle-urilor pentru aduagarea de ingrediente in plus
		JToggleButton TogglePizzaSimpla = new JToggleButton("Pizza Simpla");
				
		//Nu pot exista ingrediente fara Pizza simpla
		JToggleButton ToogleAdaugaSalam = new JToggleButton("Adauga salam");
		JToggleButton ToogleAdaugaCeapa = new JToggleButton("Adauga ceapa");
		JToggleButton ToogleAdaugaMasline = new JToggleButton("Adauga masline");
		JToggleButton ToogleAdaugaArdei = new JToggleButton("Adauga ardei");
		
		
		//declarare buton de Finalizare Comanda
		JButton FinalizareComanda = new JButton("Finalizare comanda");
		FinalizareComanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if( Finalizare(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField) ){
					
					System.out.println("Pizza Simpla creata! ");
					butonApasat(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField);
					
					TogglePizzaSimpla.setVisible(false);
					txtDorestiIngredienteIn.setVisible(false);
					ToogleAdaugaSalam.setVisible(false);
					ToogleAdaugaCeapa.setVisible(false);
					ToogleAdaugaMasline.setVisible(false);
					ToogleAdaugaArdei.setVisible(false);
					ButonComanda.setVisible(false);
					
				}
				
				else
					{
					
						System.out.println("Butonul de Pizza Simpla nu a fost selectat! ");
						textField.setText("Te rog sa selectezi butonul de Pizza Simpla pentru a continua comanda! ");
					
					}
				
			}
		});
		
		
		//Buton pentru afisarea meniului de pizza simpla si ingredientele ce se pot adauga
		    
		ButonComanda.setFont(new Font("Verdana", Font.PLAIN, 16));
		ButonComanda.setBackground(new Color(0, 153, 255));
		ButonComanda.setBounds(356, 126, 163, 70);
		frame.getContentPane().add(ButonComanda);
		
		ButonComanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TogglePizzaSimpla.setVisible(true);
				
			}
		});
		
		
		//Buton de iesire din aplicatie si implementarea lui
		JButton ButonIesire = new JButton("Iesire");
		ButonIesire.setFont(new Font("Verdana", Font.PLAIN, 16));
		ButonIesire.setBackground(new Color(0, 153, 255));
		ButonIesire.setBounds(600, 126, 163, 70);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(txtPaginaPrincipalaA);
		frame.getContentPane().add(ButonIesire);
		
		ButonIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		//Initializarea butonului de Pizza Simpla
		TogglePizzaSimpla.setVisible(false);
		TogglePizzaSimpla.setFont(new Font("Verdana", Font.PLAIN, 15));
		TogglePizzaSimpla.setBounds(42, 265, 379, 32);
		frame.getContentPane().add(TogglePizzaSimpla);
		
		
		//Initializarea butoanelor de adaugat ingrediente
		ToogleAdaugaSalam.setVisible(false);
		ToogleAdaugaSalam.setFont(new Font("Verdana", Font.PLAIN, 15));
		ToogleAdaugaSalam.setBounds(42, 386, 379, 32);
		frame.getContentPane().add(ToogleAdaugaSalam);
		
		ToogleAdaugaCeapa.setVisible(false);
		ToogleAdaugaCeapa.setFont(new Font("Verdana", Font.PLAIN, 15));
		ToogleAdaugaCeapa.setBounds(42, 431, 379, 32);
		frame.getContentPane().add(ToogleAdaugaCeapa);
		
		
		ToogleAdaugaMasline.setVisible(false);
		ToogleAdaugaMasline.setFont(new Font("Verdana", Font.PLAIN, 15));
		ToogleAdaugaMasline.setBounds(42, 476, 379, 32);
		frame.getContentPane().add(ToogleAdaugaMasline);
		
		
		ToogleAdaugaArdei.setVisible(false);
		ToogleAdaugaArdei.setFont(new Font("Verdana", Font.PLAIN, 15));
		ToogleAdaugaArdei.setBounds(42, 520, 379, 32);
		frame.getContentPane().add(ToogleAdaugaArdei);
			
		
		/**
		 * Actiunea butonului de adaugat ingrediente
		 */
		TogglePizzaSimpla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDorestiIngredienteIn.setVisible(true);
				ToogleAdaugaSalam.setVisible(true);
				ToogleAdaugaCeapa.setVisible(true);
				ToogleAdaugaMasline.setVisible(true);
				ToogleAdaugaArdei.setVisible(true);
				textField.setVisible(true);
				FinalizareComanda.setVisible(true);
				
				//verificarea si creea unui obiect de tip SimplePizza
				butonApasat(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField);
					
			}
		});
		
		
		
		/**
		 * Actiunile butoanelor de adaugat ingrediente
		 */
		ToogleAdaugaSalam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				butonApasat(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField);
				
			}
		});
		
		
		ToogleAdaugaMasline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				butonApasat(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField);
				
			}
		});
		
		ToogleAdaugaArdei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				butonApasat(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField);
				
			}
		});
		
		ToogleAdaugaCeapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				butonApasat(TogglePizzaSimpla,ToogleAdaugaSalam,ToogleAdaugaCeapa,ToogleAdaugaMasline,ToogleAdaugaArdei,textField);
				
			}
		});
		
		
		//inceput meniu ingrediente in plus
		txtDorestiIngredienteIn = new JTextField();
		txtDorestiIngredienteIn.setVisible(false);
		txtDorestiIngredienteIn.setEditable(false);
		txtDorestiIngredienteIn.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDorestiIngredienteIn.setBackground(new Color(0, 153, 255));
		txtDorestiIngredienteIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtDorestiIngredienteIn.setText("Doresti ingrediente in plus?");
		txtDorestiIngredienteIn.setBounds(42, 310, 379, 63);
		frame.getContentPane().add(txtDorestiIngredienteIn);
		txtDorestiIngredienteIn.setColumns(10);
		

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Verdana", Font.ITALIC, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(487, 270, 683, 148);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		
		FinalizareComanda.setFont(new Font("Verdana", Font.BOLD, 16));
		FinalizareComanda.setBounds(913, 481, 231, 71);
		frame.getContentPane().add(FinalizareComanda);
		FinalizareComanda.setVisible(false);
		
		
	}
}