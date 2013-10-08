package javademo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;

public class PointDemo {

	public static void main(String[] args){
		BufferedReader buf1=null;
		buf1=new BufferedReader(new InputStreamReader(System.in));
		String str1=null;
		System.out.println("请输入源文件路径：");
		try{
			str1=buf1.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		BufferedReader buf2=null;
		buf2=new BufferedReader(new InputStreamReader(System.in));
		String str2=null;
		System.out.println("请输入目标文件路径：");
		try{
			str2=buf2.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		File f1=new File(str1);
		File f2=new File(str2);
		if(!f1.exists()){
			System.out.println("源文件不存在");
			System.exit(1);
		}
		
		InputStream input=null;
		OutputStream out=null;
		try{
			input=new FileInputStream(f1);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try{
			out=new FileOutputStream(f2);
		}catch(FileNotFoundException e){
			e.printStackTrace();	
		}
		if(input!=null&&out!=null){
			int temp=0;
			try{
				while((temp=input.read())!=-1)
					out.write(temp);
				System.out.println("复制完成");
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("复制失败");
			}
			try{
				input.close();
				out.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
