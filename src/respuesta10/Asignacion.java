package respuesta10;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Asignacion extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtNumero;
	
	private JButton btnBorrar;
	
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JLabel etiDiez;

	
	public Asignacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 290);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		etiUno = new JLabel("0");
		etiUno.setBounds(23, 11, 23, 26);
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiUno.addMouseListener(this);
		contentPane.setLayout(null);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("1");
		etiDos.setBounds(23, 54, 23, 26);
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("2");
		etiTres.setBounds(23, 91, 23, 26);
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("3");
		etiCuatro.setBounds(23, 128, 23, 26);
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiCuatro.addMouseListener(this);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("4");
		etiCinco.setBounds(23, 165, 23, 26);
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("5");
		etiSeis.setBounds(68, 11, 23, 26);
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("6");
		etiSiete.setBounds(68, 48, 23, 26);
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("7");
		etiOcho.setBounds(68, 91, 23, 26);
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("8");
		etiNueve.setBounds(68, 128, 23, 26);
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
		etiDiez = new JLabel("9");
		etiDiez.setBounds(68, 165, 23, 26);
		etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
		etiDiez.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		etiDiez.addMouseListener(this);
		contentPane.add(etiDiez);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(new Color(255, 0, 0));
		btnBorrar.setBounds(10, 202, 101, 29);
		btnBorrar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnBorrar.addMouseListener(this);
		contentPane.add(btnBorrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(125, 11, 299, 220);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
		
		txtNumero = new JTextArea();
		scrollPane.setViewportView(txtNumero);
		txtNumero.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		txtNumero.setLineWrap(true); 
		txtNumero.setWrapStyleWord(true);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==btnBorrar) {
			txtNumero.setText("");
		}
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==etiUno) {
			txtNumero.setText(txtNumero.getText()+"0");
		} else if(e.getSource()==etiDos) {
			txtNumero.setText(txtNumero.getText()+"1");
		} else if(e.getSource()==etiTres) {
			txtNumero.setText(txtNumero.getText()+"2");
		} else if(e.getSource()==etiCuatro) {
			txtNumero.setText(txtNumero.getText()+"3");
		} else if(e.getSource()==etiCinco) {
			txtNumero.setText(txtNumero.getText()+"4");
		} else if(e.getSource()==etiSeis) {
			txtNumero.setText(txtNumero.getText()+"5");
		} else if(e.getSource()==etiSiete) {
			txtNumero.setText(txtNumero.getText()+"6");
		} else if(e.getSource()==etiOcho) {
			txtNumero.setText(txtNumero.getText()+"7");
		} else if(e.getSource()==etiNueve) {
			txtNumero.setText(txtNumero.getText()+"8");
		} else if(e.getSource()==etiDiez) {
			txtNumero.setText(txtNumero.getText()+"9");
		} 
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
