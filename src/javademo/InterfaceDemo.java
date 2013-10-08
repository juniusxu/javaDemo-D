package javademo;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		C c=new C();
		c.say();
		c.print();
		
	}

};
interface A{
	String author="xj";
	public String getInfo();
	public void print();
};
abstract class B{
	public abstract void say(); 
} 
class C extends B implements A{
	public void say(){
		System.out.println("hello xj");
		
	}
	public String getInfo(){
		return "HELLO";
	}
	public void print(){
		System.out.println("作者"+author);
	}
	
}