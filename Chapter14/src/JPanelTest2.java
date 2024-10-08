import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanel2 extends JFrame {
	public JPanel2() {
		// 프레임으로부터 컨테이너 생성.
		Container ct = getContentPane();
		
		// 배치 관리자 설정. BorderLayoutLayout
		ct.setLayout(new BorderLayout());
		
		// 라디오 버튼이 추가될 판넬 객체 생성.
		JPanel jp1 = new JPanel();
		
		// jp1에 GridLayout 배치 관리자 설정.
		jp1.setLayout(new GridLayout(5, 1));
		
		// 컴포넌트 생성하여 컨테이너에 추가.
		jp1.add(new JRadioButton("자바"));
		jp1.add(new JRadioButton("C언어"));
		jp1.add(new JRadioButton("파이썬"));
		jp1.add(new JRadioButton("자바스크립트"));
		jp1.add(new JRadioButton("JSP"));
		
		JPanel jp2 = new JPanel();
		
		jp2.setLayout(new GridLayout(5, 1));
		
		jp2.add(new JButton("자바"));
		jp2.add(new JButton("C언어"));
		jp2.add(new JButton("파이썬"));
		jp2.add(new JButton("자바스크립트"));
		jp2.add(new JButton("JSP"));
		
		// 레이블이 추가될 판넬 객체 생성
		JPanel jp3 = new JPanel();
		
		// jp3 에 GridLayout 배치 관리자 설정.
		jp3.setLayout(new GridLayout(1, 1));
		
		// 판넬 3에 레이블 추가
		jp3.add(new JLabel("좋아하는 프로그래밍 언어를 선택하세요."));
		
		// 컨테이너에 판넬 올리기 (쟁반에 접시 올리기)
		ct.add(jp1, BorderLayout.WEST);
		ct.add(jp2, BorderLayout.EAST);
		ct.add(jp3, BorderLayout.NORTH);
		
		
		setTitle("JPanel Test");
		setSize(500,300);
		
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 화면에출력
		setVisible(true);
	}
}

public class JPanelTest2 {

	public static void main(String[] args) {
		new JPanel2();
		

	}

}
