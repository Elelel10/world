package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * 퐁씨 성을 가진 사람들이 이용할 수 있는 어플리케이션
 * 작성자 : 홍길동
 * 작성일 : 22-07-19
 * 버전 : 1.1
 */

public class PongApp extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta;
	
	JLabel lb;
	JTextField tfName;
	JButton btApp,btSave;
	
	public PongApp() {
		super("::PongApp::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		add(pN,"North");
		pN.setBackground(Color.cyan);
		
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
		lb=new JLabel("이   름 : ");
		tfName=new JTextField(20);
		btApp=new JButton("등   록");
		btSave=new JButton("저   장");
				
		pN.add(lb);
		pN.add(tfName);
		pN.add(btApp);
		pN.add(btSave);
		//리스너 부착----
		MyEventHandler handler=new MyEventHandler();
		btApp.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler);//입력 후 엔터 치면 ActionEvent 발생
		
		setSize(500,500);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-----------------
	/**버튼에 대한 이벤트를 처리하는 클래스*/
	class MyEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btApp||obj==tfName) {
				//setTitle("add");
				//1)tfName에 입력한 값 얻어오기
				//public String getText()
				String name=tfName.getText();
				//System.out.println(name);
				name=name.trim();//앞뒤 공백 제거해서 재할당
				try {
					//2)입력한 값의 '성'을 추출하여 '퐁'씨면 "~님 환영합니다"타이틀에 출력
					char fname=name.charAt(0);
					if(fname=='퐁') {
						setTitle(name+"님 환영합니다");
						//ta.setText(name);
						ta.append(name+"\n");
					}else if(fname=='콩') {
						//사용자 정의 예외 객체를 발생시킨다.==> throw new 예외객체();
						//예외가 발생되면 해당 예외를 try~catch해야 한다.
						throw new NotSupportedNameException("콩씨는 절대로 등록할 수 없음!!!");
						
					}else {
						throw new NotSupportedNameException("퐁씨가 아닌 성씨분들은 이용에 제약이 있습니다");
					}
				}catch(NotSupportedNameException ex) {
					String msg=ex.getMessage();
					setTitle(msg);
					//메시지 박스 띄우기
					JOptionPane.showMessageDialog(p, msg);
				}finally {
					tfName.setText("");
					tfName.requestFocus();//입력 포커스 추가
				}
				//3)tfName에서 얻어온 값을 ta에 붙이기
				//public void setText(String t)
				
			}else if(obj==btSave) {
				//setTitle("save");
				String content=ta.getText();
				if(content.trim().isEmpty()) {//내용이 없다면
					JOptionPane.showMessageDialog(p, "저장할 내용이 없어요");
					return;
				}
				//내용이 있다면
				String fileName="C:/myjava/PongList.txt";
				try {
				FileWriter fw=new FileWriter(fileName);
				fw.write(content);
				fw.flush();
				fw.close();
				setTitle(fileName+"에 저장완료!!");
				}catch(IOException ex) {
					setTitle("파일 쓰기 중 에러: "+ex.getMessage());
				}
			}
		}
	}

	public static void main(String[] args) {
		new PongApp();
	}

}
