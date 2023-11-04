package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel implements ActionListener{
	
	public PanelOpciones() {
		
		this.setLayout((new GridLayout(4,1)));
		
		JButton nuevo=new JButton();
		nuevo.setBackground(Color.blue);
		nuevo.setText("NUEVO");
		nuevo.addActionListener(this);
		this.add(nuevo);
		
		JButton reiniciar=new JButton();
		reiniciar.setBackground(Color.blue);
		reiniciar.setText("REINICIAR");
		reiniciar.addActionListener(this);
		this.add(reiniciar);
		
		JButton top=new JButton();
		top.setBackground(Color.blue);
		top.setText("TOP 10");
		top.addActionListener(this);
		this.add(top);
		
		JButton cambio=new JButton();
		cambio.setBackground(Color.blue);
		cambio.setText("CAMBIAR JUGADOR");
		cambio.addActionListener(this);
		this.add(cambio);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
