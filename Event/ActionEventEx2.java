
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 독립적인 클래스로 이벤트 처리기를 작성
class MyFrame2 extends JFrame {
	private JPanel panel;
	private JButton button;	

	public MyFrame2() {		
		setTitle("이벤트 예제");
		setSize(300, 200);		
		//setBounds(400, 300, 300, 200); // 프레임 위치, 크기
		
		panel = new JPanel();
		button = new JButton("버튼을 누르시오");

		// Action 이벤트 리스너 객체 생성
		//MyListener listener = new MyListener();
		
		// Action 이벤트 리스너 등록
		button.addActionListener(new MyListener2()); // 이벤트 리스너 등록 
		panel.add(button);		
		// panel.add(button);
		
		add(panel);
		setVisible(true);
	}
	
} 

//이벤트 처리하기 
//독립적인 클래스로 이벤트 처리기를 작성
class MyListener2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		// 이벤트 객체가 제공하는 메소드들 중 getSource() 이용
		// getSource() 이벤트 소스 알아 내기.  Object EventObject.getSource()
		// 발생한 이벤트의 소스(JButton) 컴포넌트 레퍼런스(주소값) 리턴. Object 반환. 타입변환 필요			
		JButton btn = (JButton) e.getSource();		
		if (btn.getText() == "버튼을 누르시오") 		
			btn.setText("마침내 버튼이 눌려졌습니다.");
		else
			btn.setText("버튼을 누르시오");
	}
}

public class ActionEventEx2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}