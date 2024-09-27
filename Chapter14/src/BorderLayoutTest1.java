import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		// 프레임으로 부터 컨테이너 생성.
		Container ct = getContentPane();
		
		// 배치 관리자 객체 생성
		BorderLayout b1 = new BorderLayout(10,10);
		
		// 컨테이너에 레이아웃 설정
		ct.setLayout(b1);
		
		// 5개의 버튼을 생성하여 컨테이너에 배치
		ct.add(new JButton("오른쪽 버튼"), BorderLayout.EAST);
		ct.add(new JButton("왼쪽 버튼"), BorderLayout.WEST);
		ct.add(new JButton("위쪽 버튼"), BorderLayout.NORTH);
		ct.add(new JButton("아래쪽 버튼"), BorderLayout.SOUTH);
		ct.add(new JButton("가운데 버튼"), BorderLayout.CENTER);
		
		setTitle("BorderLayout Test");
		setSize(400,300);
		
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 화면에출력
		setVisible(true);
	}
}
public class BorderLayoutTest1 {

	public static void main(String[] args) {
		
		new BorderLayout1();

	}

}
