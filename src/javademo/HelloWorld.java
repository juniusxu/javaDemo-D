package javademo;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// printfHello();
		// printfArryaLength();
		// bubbleSort();
		
		int score[]={12,32,11,4,45,121,89,33};
		int age[]={234,52,23,1,565,7,98,232};
		//sort(score);
		java.util.Arrays.sort(score);
		print(score);
		System.out.println("\n==================================================================");
		sort(age);
		print(age);
		
	}//main
	
	public static void sort(int temp[]){
		//数组排序
		for(int i=1;i<temp.length;i++)
			for(int j=0;j<temp.length;j++)
				if(temp[i]<temp[j]){
					int x=temp[i];
					temp[i]=temp[j];
					temp[j]=x;					
				}
	}
	public static void print(int temp[]){
		//输出数组
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+"\t");
		
	}
	public static void bubbleSort(){
		//冒泡排序，输出每一趟结果
		int score[]={213,23,54,2,6,4,234,34,1};
		for(int i=1;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if(score[j]>score[i]){
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}//if
			}//for j
			System.out.print("第"+i+"次排序结果为：\t");
			for(int j=0;j<score.length;j++)
				System.out.print(score[j]+"\t");
			System.out.println();
		}//for i
		
			
		System.out.println("最终排序结果为：");
		for(int i=0;i<score.length;i++)
			System.out.print(score[i]+"\t");		
	}
	
	public static void printArrayLength(){
		//输出数组长度
		int a[] = null;
		a = new int[3];
		int x=0;
		
		for(x=0;x<3;x++)
			{
				a[x]=x*2+1;
			
				System.out.println("a["+x+"]="+a[x]);
			}
		System.out.println("数组长度为:"+a.length);
	}

	public static void printHello(){
		//helloworld
		System.out.println("Hello, world!");
		System.out.println("恭喜你成功运行了第一个java应用程序!");	
	}
}//HelloWorld

