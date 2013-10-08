package javademo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyKeyEvent {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyKeyHandle();

	}

}
class MyKeyHandle extends JFrame implements KeyListener{
	private JTextArea text=new JTextArea();
	public MyKeyHandle(){
		super.setTitle("Welcom to Xhome");
		JScrollPane scr=new JScrollPane(text);
		scr.setBounds(5,5,300,200);
		super.add(scr);
		text.addKeyListener(this);
		super.setSize(310,210);
		super.setVisible(true);
		super.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
	}
	public void keyPressed(KeyEvent e){
		text.append("键盘:\""+KeyEvent.getKeyText(e.getKeyCode())+"\"按下\n");
	}
	public void keyReleased(KeyEvent e){
		text.append("键盘:\""+KeyEvent.getKeyText(e.getKeyCode())+"\"松开\n");
	}
	public void keyTyped(KeyEvent e){
		text.append("输入的内容是:"+e.getKeyChar()+"\n");
	}
};