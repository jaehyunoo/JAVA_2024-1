import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUITestt extends JFrame implements ActionListener {
	// 속성으로 텍스트 에어리어와 텍스트 필드를 선언.
	// 이벤트 처리에서 사용해야 하기에 생성자 밖에 속성으로 선언
	// 글 내용을 입력하고, 버튼을 누르면 파일로 생성되어야함.
	
	private JTextField fname;
	private JTextArea contents;
	
	public GUITestt() {
		fname = new JTextField("파일 이름을 입력하세요", 20);	// 20칸
		contents= new JTextArea(10, 20);	// 10중 20칸
		contents.setEnabled(false); // 수정 불가로 만들기
		JButton get = new JButton("파일로 불러오기");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());

		
		
		ct.add(fname);
		ct.add(get);
		ct.add(contents);
		
		
		
		// 리스너 등록.
		get.addActionListener(this);
		
		setTitle("텍스트 필드와 텍스트 에어리어");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 입출력.
		// 파일 이름으로 입력 객체 생성.
		try {
			String s = fname.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fos);
			
			// 파일의 내용을 텍스트 에어리어의 내용으로 설정.
			contents.setText(dis.readUTF());
			fis.close();
			System.out.println(s + "파일을 읽었습니다");
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
public class GUITest2 {

	public static void main(String[] args) {
		new GUITestt();

	}

}
