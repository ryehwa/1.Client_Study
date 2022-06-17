package j0610;
//제어문에 또 다른 제어문 => 중첩 for문(=이중 for문)***
//for(int dan=3;dan<=7;dan++) //단 -> 구구단 -> 3단,?
//		for(int times=1)
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("레이블이 없는 Break문(가장 가까운 루프 탈출)");//default
		for(int a=0;a<5;a++) 	{	
			for(int b=0;b<5;b++){
				//추가
				if(b==2) break; //break와 가장 가까운 루프를 탈출->여기서는 for(int b=0;b<5;b++)
				System.out.println("a="+a+",b="+b);
			}//inner for
			System.out.println("================"); 
		}//outer for

	}//main

}
