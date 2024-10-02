import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTFJTA1 extends JFrame implements ActionListener {
	private JTextField input;
	private JTextArea output;
	
	private JLabel jl = new JLabel("입력하세요.");
	
	public JTFJTA1() {
		input = new JTextField(20);	// 20칸
		output = new JTextArea(10, 20);	// 10중 20칸
		output.setEnabled(false); // 수정 불가 설정.
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel pl = new JPanel();
		
		// 판넬에 in, out 추가
		pl.add(input);
		pl.add(output);
		
		// 컨테이너에 판넬과 라벨 추가.
		ct.add(pl);
		ct.add(jl);
		
		// 리스너 등록.
		input.addActionListener(this);
		
		setTitle("텍스트 필드와 텍스트 에어리어");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(output.getLineCount() <= output.getRows()) {
			output.append(e.getActionCommand() + "\n");
			input.setText("");
		} else {
			jl.setText("입력이 종료되었습니다.");
			input.setEditable(false);
		}
		
	}
}
public class JTFJTATest1 {

	public static void main(String[] args) {
		new JTFJTA1();

	}

}
