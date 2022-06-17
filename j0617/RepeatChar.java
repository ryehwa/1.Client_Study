package j0617;

import java.util.Scanner; //import 최상위패키지명.하위패키지명..클래스명
//불러올 클래스의 위치를 import로 불러오기
import j0617.sub.PrintTest;
public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;//문자열 받기->char ch;
		int n; //반복할 횟수
		Scanner sc=new Scanner(System.in);
		System.out.println("반복할 문자열을 입력?");
		str=sc.next();//nextLine()도 가능->나중에 설명
		
		System.out.println("반복할 숫자를 입력?");
		n=sc.nextInt();//5
		
	
		/*(1)
		for(int i=1;i<=n;i++)
		System.out.print(str);*/
		/*일반 메서드 호출 시(2)
		RepeatChar rc=new RepeatChar();
		rc.charPrint(str, n);
		*/
		//3) RepeatChar.charPrint(str, n);//정적메서드->클래스명.정적메서드명(~)
		PrintTest.charPrint(str,n);//접근 권한 때문에 안보였다. PrintTest 가서 static 앞에 public 붙여주고 옴.
	}
	//일반메서드
	/*
	 * static void charPrint(String str,int n) {
		for(int i=1;i<=n;i++)
			System.out.print(str);
	}
	 */

}
