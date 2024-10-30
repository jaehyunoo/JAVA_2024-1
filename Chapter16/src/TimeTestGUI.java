import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyTime extends JFrame implements ActionListener{
	private JLabel jl1 = new JLabel("당신의 생일을 공백으로 구분하여 입력");
	private JTextField jf1 = new JTextField();
	private JTextArea jt1 = new JTextArea(3,20);
	private JTextArea jt2 = new JTextArea(3,20);
	public MyTime() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		jp1.setLayout(new GridLayout(1,1));
		jp2.setLayout(new GridLayout(1,1));
		jp3.setLayout(new GridLayout(1,1));
		
		JButton jb1 = new JButton("현재");
		JButton jb2 = new JButton("100살");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jp1.add(jl1);
		jp1.add(jf1);
		jp2.add(jb1);
		jp2.add(jt1);
		jp3.add(jb2);
		jp3.add(jt2);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jp1,BorderLayout.NORTH);
		ct.add(jp2,BorderLayout.CENTER);
		ct.add(jp3,BorderLayout.SOUTH);
		
		setTitle("나이 계산");
		
		setSize(400,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String birth = jf1.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		// 내 생년 월일
		LocalDate my_birth = LocalDate.of(year, month, day);
		// 현재 날짜
		LocalDate current = LocalDate.now();
		// 100살이 되는 날
		LocalDate hundred = my_birth.plusYears(100);
		
		if(e.getActionCommand() == "현재")
		{
			jt1.append("당신의 생일 : " + toString(my_birth)+"\n");
			jt1.append("오늘 날짜는 : " + toString(current)+"\n");
			jt1.append("생일부터 오늘까지의 일 : " + my_birth.until(current,ChronoUnit.DAYS)+"\n");
			jt1.append("생일부터 오늘까지의 년 : " + my_birth.until(current,ChronoUnit.YEARS)+"\n");
			
		}else {
			jt2.append("당신이 100살이 되는날은: " + toString(hundred)+"\n");
			jt2.append("100살까지 남은 주(week) 수 : " + current.until(hundred,ChronoUnit.WEEKS)+"\n");
			jt2.append("100살까지 남은 일 수 : " + current.until(hundred,ChronoUnit.DAYS)+"\n");
		}
	}
	private String toString(LocalDate my_birth) {

		return my_birth.getYear() + "년 " + my_birth.getMonthValue() + "월 " + my_birth.getDayOfMonth() + "일"; 
	}
}

public class TimeTestGUI {

	public static void main(String[] args) {
		new MyTime();
		
	}

}
