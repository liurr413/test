package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	String s1 = "hello";
		   String s2 = "hello";
		   String s3 = new String("hello");
		   String s4 = s3;
		   System.out.println(s1 == s2);
		   System.out.println(s2 == s3);
		   System.out.println(s3 == s4);
		   System.out.println(s1.equals(s2));
		   System.out.println(s2.equals(s3));
		   System.out.println(s3.equals(s4));*/
			/*Calendar now = Calendar.getInstance();
	        System.out.println("年: " + now.get(Calendar.YEAR));  
	        System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");  
	        System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));  */
	        
		/*Integer i = 100;
		int j = i;
		System.out.println(j);*/
		
		/*int j=80;
		Integer i = new Integer(j);
		System.out.println(i);*/
		System.out.println("循环前");
		
		System.out.println("");
		for(int i=0;i<100;i++){
			
			for(int j=0;j<100;j++){
				System.out.println(i+"---"+j);
				if(i==4 && j==20){
					break;
				}
			}
			if(i==3){
				System.out.println("3");
			}
			if(i==5){
				System.out.println("5");
			}
		}
		System.out.println("跳出来啦");
	}

}
