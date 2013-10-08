package javademo;

public class Productor {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Info i=new Info();
		Producer pro=new Producer(i);
		Consumer con=new Consumer(i);
		new Thread(pro).start();
		new Thread(con).start();

	}

}
class Info{
	private String name="xj";
	private String content="xiaoc";
	private boolean flag=false;
	public synchronized void set(String name,String content){
		if(!flag){
			try{
				super.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.setName(name);
		try{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.setContent(content);
		flag=false;
		super.notify();
	}
	public synchronized void get(){
		if(flag){
			try{
				super.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		try{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(this.getName()+"-->"+this.getContent());
		flag=true;
		super.notify();
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
};
class Producer implements Runnable{
	private Info info=null;
	public Producer(Info info){
		this.info=info;
	}
	public void run(){
		boolean flag=false;
		for(int i=0;i<50;i++){
			if(flag){
				
				this.info.set("xuj","PHP程序员");
				flag=false;
			}else{
				
				this.info.set("CCC","book.chengcc.com");
				flag=true;
			}
		}
	}
};
class Consumer implements Runnable{
	private Info info=null;
	public Consumer(Info info){
		this.info=info;
	}
	public void run(){
		for(int i=0;i<50;i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			this.info.get();
		}
	}
};