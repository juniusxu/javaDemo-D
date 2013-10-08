package javademo;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Computer.plugin(new Flash());
		Computer.plugin(new Print());
	}
	

}
interface USB{
	public void start();
	public void stop();
};
class Computer{
	public static void plugin(USB usb){
		usb.start();
		System.out.println("-----------USB设备工作------------");
		usb.stop();
	}
};
class Flash implements USB{
	public void start(){
		System.out.println("U盘开始工作");
	}
	public void stop(){
		System.out.println("U盘停止工作");
	}
};
class Print implements USB{
	public void start(){
		System.out.println("打印机开始工作");
	}
	public void stop(){
		System.out.println("打印机止工作");
	}
};