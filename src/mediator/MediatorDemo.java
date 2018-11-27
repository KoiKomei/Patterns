package mediator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MediatorDemo extends JFrame implements ActionListener{

	Mediator med=new PartecipantMeditor();
	
	MediatorDemo(){
		JPanel p=new JPanel();
		p.setSize(600, 400);
		p.add(new BtnView(this, med));
		p.add(new BtnBook(this, med));
		p.add(new BtnSearch(this,med));
		getContentPane().add(new LblDisplay(med), "North");
		getContentPane().add(p, "South");
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Command cmd=(Command) arg0.getSource();
		cmd.execute();
		
	}
	
	public static void main(String[] args) {
		new MediatorDemo();		
	}

}
