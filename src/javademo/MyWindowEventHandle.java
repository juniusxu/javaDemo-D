package javademo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowEventHandle implements WindowListener {


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowOpened-->窗口被打开");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowClosing-->窗口关闭");
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowClosed-->窗口被关闭");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowIconified->窗口最小化");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowDeiconfied->窗口从最小化恢复");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowActivated->窗口被选中");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("windowDeactivated->取消窗口选中");
	}

}
