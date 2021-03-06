package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySearchEngine extends JFrame{
	JPanel p=new JPanel();
	JButton b1,b2,b3,b4;
	JTextArea ta;
	
	public MySearchEngine() {
	super("::MySearchEngine::");
	add(p,"Center");
	p.setLayout(new GridLayout(2,2));
	b1=new JButton("NAVER");
	b2=new JButton("GOOGLE");
	b3=new JButton("DAUM");
	b4=new JButton("YAHOO");
	
	
	
	
	
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	
	MyEventHandler handler=new MyEventHandler();
	b1.addActionListener(handler);
	b2.addActionListener(handler);
	b3.addActionListener(handler);
	b4.addActionListener(handler);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class MyEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==b1) {
				b1.setBackground(Color.green);
			}else if(obj==b2) {
				b2.setBackground(Color.yellow);
			}else if(obj==b3) {
				b3.setBackground(Color.blue);
			}else if(obj==b4) {
				b4.setBackground(Color.magenta);
			}
		}
	}

	public static void main(String[] args) {
		MySearchEngine my=new MySearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
