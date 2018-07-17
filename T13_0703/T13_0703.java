import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T13_0703 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] score= {100,90,80,70,60,50};
		System.out.println("size:"+score.length);
		
		String[] scoreName= {"ll","ee","qq","aa"};
		
		int[][] intArray= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		
		int input=1;
		
		int intArray2[][] =new int[4][];
		intArray2[0]=new int[3];
		intArray2[1]=new int[2];
		intArray2[2]=new int[3];
		intArray2[3]=new int[2];
		
		
		System.out.println("======01");
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		System.out.println("======02");
		for(int i:score) {
			System.out.println(i);
		}
		System.out.println("======03");
		for(String s1: scoreName) {
			System.out.println(s1);
		}
		System.out.println("======04");
		for(int i=0;i<intArray.length;i++) {
			for(int k=0;k<intArray[i].length;k++) {
				System.out.println("intArray["+i+"]["+k+"]="+intArray[i][k]);
				
				}
			}
		System.out.println("======05");
			for(int i=0;i<intArray2.length;i++) {
				for(int j=0;j<intArray2[i].length;j++) {
					intArray2[i][j]=(i+1)*10+j;
				}
			}
			for(int i=0;i<intArray2.length;i++) {
				for(int j=0;j<intArray2[i].length;j++) {
					System.out.print(intArray2[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("======06");
		
		System.out.println("======08");
		Scanner scan=new Scanner(System.in);
		System.out.println("输入姓名和学号");
		System.out.println("姓名是 ： "+scan.next());
		System.out.println("学号是 ： "+scan.nextInt());
		
		
		System.out.println("======9");
		try{
			Exception e=new Exception("故意抛出的异常");
			throw e;
		}catch(Exception e) {
			System.out.println("错误信息："+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("程序正常结束");
		System.out.println("======07");
		InputStreamReader rd=new InputStreamReader (System.in);
		try {
			while(true) {
				input=rd.read();
				if(input==-1){
					break;
					}
			}
				System.out.println((char)input);
			}
			
			catch(IOException e) {
				System.out.println("发生错误");
			}
		
		}
	}


