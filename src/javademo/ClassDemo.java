package javademo;

class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void tell(){
		System.out.println("姓名："+name+"\t年龄:"+age);
		
	}
	public String getName(){
		return name;		
	}
	public void setName(String n){
		name=n;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int n){
		if(n>0&&n<200)
			age=n;
	}
}
public class ClassDemo {
	
	public static void main(String args[]){

		/*||||||||||
		 * Oparate op=new Oparate(args);
		System.out.println(op.login());*/
		
		
		/*======
		 * Node node=new Node("火车头");
		Node n1=new Node("1");
		Node n2=new Node("2");
		Node n3=new Node("3");
		node.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		printNode(node);*/
		
		
		/*0000000000000000000000
		 * Link l=new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out.println("=============删之前================");
		l.printNode();
		l.deleteNode("C");
		l.deleteNode("D");
		System.out.println();
		System.out.println("===========删之后==================");
		l.printNode();
		System.out.println();
		System.out.println("查询节点:"+l.contains("A"));
		000000000000000000000*/
		
		Array a=null;
		a=new Array(5);
		System.out.print(a.add(12)+"\t");
		System.out.print(a.add(45)+"\t");
		System.out.print(a.add(4)+"\t");
		System.out.print(a.add(56)+"\t");
		System.out.print(a.add(32)+"\t");
		System.out.print(a.add(2)+"\t");
		print(a.getArray());
	}
	public static void print(int i[]){
		for(int x=0;x<i.length;x++)
			System.out.print(i[x]+"\t");
	}
	/*======
	 * public static void printNode(Node node){
		System.out.println(node.getData()+"\t");
		if(node.getNext()!=null)
			printNode(node.getNext());
	}*/
};
class Array{
	private int temp[];
	private int foot;
	public Array(int len){
		if(len>0)
			this.temp=new int[len];
		else
			this.temp=new int[1];
	}
	public boolean add(int i){
		if(this.foot<this.temp.length){
			this.temp[foot]=i;
			foot++;
			return true;
		}
		else 
			return false;
	}
	public int[] getArray(){
		return this.temp;
	}
};
/*00000000000000000000000000
 * class Link{
	class Node{
		private String data;
		private Node next;
		public Node(String data){
			this.data=data;
		}
		public void add(Node newNode){
			if(this.next==null)
				this.next=newNode;
			else
				this.next.add(newNode);
		}
		public void print(){
			System.out.print(this.data+"\t");
			if(this.next!=null)
				this.next.print();
		}
		public boolean  search(String data){
			if(data.equals(this.data))
				return true;
			else{
				if(this.next!=null)
					return this.next.search(data);
				else
					return false;
			}
		}
		public void delete(Node pre,String data){
			if(data.equals(this.data))
				pre.next=this.next;
			else{
				if(this.next!=null)
					this.next.delete(this,data);
			}
		}
	};
	private Node root;
	public void addNode(String data){
		Node newNode=new Node(data);
		if(this.root==null)
			this.root=newNode;
		else
			this.root.add(newNode);
	}
	public void printNode(){
		if(this.root!=null)
			this.root.print();
	}
	public boolean contains(String name){
		return this.root.search(name);
	}
	public void deleteNode(String data){
		if(this.root.data.equals(data))
			this.root=this.root.next;
		else
			this.root.next.delete(root,data);
	}
	
};0000000000000000000000000*/
/*=====
 * class Node{
	private String data;
	private Node next;
	public Node(String data){
		this.data=data;
	}
	public String getData(){
		return this.data;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Node getNext(){
		return this.next;
	}
};*/

/*||||||||||||
 * class Check{

	public boolean validate(String name,String password){
		if(name.equals("xj")&&password.equals("123"))
			return true;
		else return false;
	}
};
class Oparate{
	private String info[];
	
	public Oparate(String info[]){
		this.info=info;
	}
	public String login(){
		Check check=new Check();
		this.isExit();
		String name=this.info[0];
		String password=this.info[1];
		String str=null;
		if(check.validate(name, password))
			str="欢迎"+name+"光临";
		else
			str="用户名密码不匹配";
		
		return str;
	}
	public void isExit(){
		if(this.info.length!=2){
			System.out.println("输入的格式有问题");
			
			System.exit(1);
		}
	}
};*/