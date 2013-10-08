package javademo;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyThread mt1=new MyThread();

		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt1);
		Thread t3=new Thread(mt1);
		t1.start();
		t2.start();
		t3.start();
	}
}
class MyThread implements Runnable{
	private int tickets=5;
	public void run(){
		for(int i=0;i<100;i++){
			this.sale();
		}
	}
	public synchronized void sale(){
		if(tickets>0){
					try{
						Thread.sleep(300);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("买票:tickets="+tickets--);
				}
	}
};