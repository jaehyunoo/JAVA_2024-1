import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JLabel1 extends JFrame implements ActionListener{	// 1. 프레임 생성(상속)
	private JLabel result = new JLabel();
	public ImageIcon img1, img2;
	
	public JLabel1() {
		// 2. 컨테이너 생성
		Container ct = getContentPane();
		// 3. 배치 관리자 설정.
		ct.setLayout(new FlowLayout());
		
		// 4.버튼 생성
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		// 이미지 생성.
		img1 = new ImageIcon("images\\apple.jpg");
		img2 = new ImageIcon("images\\pear.jpg");
		
		// 컨테이너에 버튼과 레이블 추가
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		// 버튼에 리슨 등록.
		apple.addActionListener(this);
		pear.addActionListener(this);
		
		setTitle("이미지 이벤트 테스트");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "사과") {
			result.setIcon(img1);
			result.setText("사과입니다");
		}
		if(e.getActionCommand() == "배") {
			result.setIcon(img2);
			result.setText("배입니다");
		}
		
	}
}
public class JLabelTest1 {

	public static void main(String[] args) {
		new JLabel1();

	}

}
