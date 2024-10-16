import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf;
	
	public JMenu1() {
		Container ct = getContentPane();
		
		ct.setLayout(new BorderLayout());
		
		// 1. JMenuBar() 객체 생성.
		JMenuBar jmb = new JMenuBar();
		
		// 2. JMenu 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		// 3. 서브 메뉴 JMenuItem 객체로 생성
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this); // 이벤트 리스너 등록
		menu1.add(jmi); // menu1 메뉴에 추가
		
		// 3. 서브 메뉴 JMenuItem 객체로 생성
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this); // 이벤트 리스너 등록
		menu1.add(jmi); // menu1 메뉴에 추가
		
		// 4. menu1 메뉴를 JMenuBar에 추가
		jmb.add(menu1);
		
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this); // 이벤트 리스너 등록
		menu2.add(jmi); // menu2 메뉴에 추가
		
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this); // 이벤트 리스너 등록
		menu2.add(jmi); // menu2 메뉴에 추가
				
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this); // 이벤트 리스너 등록
		menu2.add(jmi); // menu2 메뉴에 추가
		
		// 3. 서브 메뉴 JCeckBoxMenuItem 객체 생성
		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);
		
		// 3. 서브 메뉴 JRadiobuttonMenuItem 객체 생성
		JRadioButtonMenuItem jcbmb = new JRadioButtonMenuItem("수정가능상태");
		jcbmb.addActionListener(this);
		menu2.add(jcbmb);
		
		jmb.add(menu2); // 4. menu2 메뉴를 JMenuBar에 추가
		
		// 5. setJMenuBar()메소드로 메뉴바를 프레임에 추가
		setJMenuBar(jmb);
		
		jtf = new JTextField();
		ct.add(jtf,BorderLayout.SOUTH);
		
		setTitle("JMenuTest1");
		setSize(300,200);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jtf.setText(s);
	}
}
public class JMenuTest1 {

	public static void main(String[] args) {
		new JMenu1();

	}

}
