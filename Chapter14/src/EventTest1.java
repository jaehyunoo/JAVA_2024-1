import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// GUI 클래스
/*
 *  GUI 클래스에 이벤트 처리
 */

// GUI 클래스
					// 1) 처리할 이벤트 종류 결정.
					// 2) 이벤트에 적합한 이벤트 리스너 인터페이스를 사용.
class Event1 extends JFrame implements ActionListener{ // 1. 프레임생성
	JLabel jl;
	
	public Event1() {
		// 2.컨테이너 생성
		Container ct1 = getContentPane();
		
		// 3. 배치 관리자 설정
		FlowLayout fl1 = new FlowLayout();
		
		ct1.setLayout(fl1);
		
		// 4. 버튼, 레이블 생성.
		JButton jb = new JButton("버튼");
		
		jl = new JLabel("버튼을 누르세요");
		// 3) 이벤트를 받아 들일 버튼에 리스너 등록
		jb.addActionListener(this);
		
		// 5. 컨테이너에 등록
		ct1.add(jb);
		ct1.add(jl);
		
		setTitle("Event 테스트");
		setSize(500,500);
		
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 화면에출력
		setVisible(true);
		
	}
	
		// 4) 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
		@Override
		public void actionPerformed(ActionEvent e) {
			jl.setText("안녕하세요");
		}

	
}



//메인 클래스
public class EventTest1 {

	public static void main(String[] args) {
		new Event1();

	}

}
