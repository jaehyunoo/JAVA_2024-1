import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// GUI 클래스
/*
 *  독립된 이벤트 처리 클래스.
 */
// 이벤트 처리 클래스
// 1) 처리할 이벤트 종류 결정.
// 2) 이벤트에 적합한 이벤트 리스너 인터페이스를 사용.
class EventClass implements ActionListener{
	JLabel jl;
	
	public EventClass(JLabel jl) {
		this.jl = jl;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
}

// GUI 클래스
					
class Event3 extends JFrame {
	JLabel jl;
	
	public Event3() {
		// 2.컨테이너 생성
		Container ct1 = getContentPane();
		
		// 3. 배치 관리자 설정
		FlowLayout fl1 = new FlowLayout();
		
		ct1.setLayout(fl1);
		
		// 4. 버튼, 레이블 생성.
		JButton jb1 = new JButton("사랑합니다");
		JButton jb2 = new JButton("행복합니다");
		jl = new JLabel("버튼을 누르세요");
		
		// 3) 이벤트를 받아 들일 버튼에 리스너 등록
		jb1.addActionListener(new EventClass(jl));
		jb2.addActionListener(new EventClass(jl));
		
		// 5. 컨테이너에 등록
		ct1.add(jb1);
		ct1.add(jb2);
		ct1.add(jl);
		
		setTitle("Event 테스트");
		setSize(300,200);
		
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 화면에출력
		setVisible(true);
		
	}

}



//메인 클래스
public class EventTest3 {

	public static void main(String[] args) {
		new Event3();

	}

}
