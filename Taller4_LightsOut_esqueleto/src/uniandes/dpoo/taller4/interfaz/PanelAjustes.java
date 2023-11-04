package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelAjustes extends JPanel implements ActionListener  {
	
	
	
	public PanelAjustes() {
		this.setBackground(Color.BLUE);
		this.setSize(900, 100);
		this.setLayout(new FlowLayout());
		
		JLabel label1= new JLabel("Tamaño: ");
		this.add(label1);
		JComboBox<String> tamanio = new JComboBox<String>();
		tamanio.addItem("2x2");
		tamanio.addItem("3x3");
		tamanio.addItem("4x4");
		tamanio.addItem("5x5");
		tamanio.addItem("6x6");
		tamanio.addItem("7x7");
		tamanio.addItem("8x8");
		tamanio.addItem("9x9");
		tamanio.addItem("10x10");
		tamanio.addActionListener(this);
		this.add(tamanio);
		
		JLabel label2= new JLabel("Dificultad: ");
		this.add(label2);
		
		JRadioButton facil = new JRadioButton();
		facil.addActionListener(this);
		this.add(facil);
		JLabel label3= new JLabel("fácil");
		this.add(label3);
		
		JRadioButton medio = new JRadioButton();
		facil.addActionListener(this);
		this.add(medio);
		JLabel label4= new JLabel("medio");
		this.add(label4);
		
		JRadioButton dificil = new JRadioButton();
		facil.addActionListener(this);
		this.add(dificil);
		JLabel label5= new JLabel("difícil");
		this.add(label5);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
	
