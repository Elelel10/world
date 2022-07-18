package day09;
import javax.swing.*;
import java.awt.*;
//CLI : Command Line Interface 도스 콘솔에서 실행되는 프로그램
//GUI : Graphic User Interface 그래픽 환경을 갖춘 프로그램
//JFrame : Window 계열의 컨테이너
//		   반드시 사이즈를 정해주고 setVisible(true)를 주어야 화면에 보여짐

//JPanel; Panel계열의 컨테이너
public class MyGui extends JFrame{
	JPanel p;
	JButton bt1,bt2,bt3;//Component
	Icon icon1,icon2,icon3,icon4,icon5;
	JTextField tf1,tf2;
	JTextArea ta1,ta2;
	
	public MyGui() {
		super("::MyGui Program v1.1::");
		p=new JPanel();
		add(p);//JFrame의 중앙에 판넬이 붙는다.
		p.setBackground(Color.yellow);//배경색
		icon1=new ImageIcon("1번.PNG");//버튼에 사진
		icon2=new ImageIcon("2번.PNG");
		icon3=new ImageIcon("3번.PNG");
		icon4=new ImageIcon("4번.PNG");
		icon5=new ImageIcon("5번.PNG");
		
		bt1=new JButton(icon1);//버튼에 글
		
		bt2=new JButton("Home",icon3);
		bt2.setHorizontalTextPosition(JButton.CENTER);//버튼 글 위치(수평의 중앙)
		bt2.setVerticalTextPosition(JButton.TOP);//수직의 탑
		
		bt3=new JButton("Login",icon2);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setVerticalTextPosition(JButton.BOTTOM);
		bt3.setPressedIcon(icon4);
		bt3.setRolloverIcon(icon5);
		
		p.add(bt1);//화면에 버튼 넣음
		p.add(bt2);
		p.add(bt3);
		
		tf1=new JTextField(20);//글 적는 곳 폭
		tf1.setBackground(Color.gray);
		tf2=new JTextField("네이버를 검색하세요",30);
		tf2.setBackground(Color.blue);//배경색
		tf2.setForeground(Color.white);//글자색
		
		p.add(tf1);
		p.add(tf2);
		
		ta1=new JTextArea("안녕하세요. 반갑습니다~",5,20);
		ta2=new JTextArea(10,30);//rows=10,columns=30
		//JTextArea는 JScrollPane을 붙여야 스크롤바가 붙는다.
		JScrollPane sp=new JScrollPane(ta1);
		p.add(sp);
		//p.add(ta1);
		p.add(ta2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫기 처리-프로세스 종료
	}///////////////생성자
	
	public static void main(String[] args) {
		MyGui my=new MyGui();//JFrame
		my.setSize(500,500);//폭,높이
		my.setVisible(true);
	}

}
