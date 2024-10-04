import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	
	public JButton2(){
		// 이미지 아이콘 객체 생성.
		ImageIcon apple = new ImageIcon("images/apple.jpg");
		ImageIcon banana = new ImageIcon("images/banana.jpg");
		ImageIcon pear = new ImageIcon("images/pear.jpg");
		ImageIcon persimmom = new ImageIcon("images/persimmom.jpg");
		ImageIcon grape = new ImageIcon("images/grape.jpg");
		
		// 컨테이너 생성
				Container ct = getContentPane();
		

		
		// 버튼 객체 생성.
		JButton appleb = new JButton("사과",apple); 
		JButton bananab = new JButton("바나나",banana); 
		JButton pearb = new JButton("배",pear); 
		JButton persimmomb = new JButton("감",persimmom); 
		JButton grapeb = new JButton("포도",grape);
		
		// 텍스트 필드 생성
		jtf = new JTextField(10);
		
		
		ct.add(appleb);
		ct.add(bananab);
		ct.add(pearb);
		ct.add(persimmomb);
		ct.add(grapeb);
		ct.add(jtf);
		
		// 배치 관리자는 GridLayout
		ct.setLayout(new GridLayout(3, 2,10, 10));
		
		appleb.addActionListener(this);
		bananab.addActionListener(this);
		pearb.addActionListener(this);
		persimmomb.addActionListener(this);
		grapeb.addActionListener(this);
		
		
		// 화면에 보이기
		setTitle("JButton Test");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
		
	}
}
public class JButtonTest2 {

	public static void main(String[] args) {
		new JButton2();

	}

}
