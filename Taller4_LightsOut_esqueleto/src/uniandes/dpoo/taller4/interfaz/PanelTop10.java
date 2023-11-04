package uniandes.dpoo.taller4.interfaz;

import java.util.Collection;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;

public class PanelTop10 extends JFrame {
	
	private Collection<RegistroTop10> registro;

	public PanelTop10(Top10 top) {
        
        setTitle("TOP 10");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        registro=top.darRegistros();
        
        Iterator<RegistroTop10> iterator = registro.iterator();
        
        JList jugadores= new JList();
        int i=1;
        JLabel label= new JLabel("1 "+ iterator.toString());
        jugadores.add(label);
        while(iterator.hasNext()&&i<=10) {
        	i++;
        	JLabel label1= new JLabel(String.valueOf(i)+" "+iterator.toString());
        	jugadores.add(label1);
        }
        
        this.add(jugadores);
   
    }
	
}
	    


