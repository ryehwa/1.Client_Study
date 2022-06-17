package j0610;
//제어문에 또 다른 제어문 => 중첩 for문(=이중 for문)***
//for(int dan=3;dan<=7;dan++) //단 -> 구구단 -> 3단,?
//		for(int times=1)
public class ConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("레이블이 없는 Continue문(가장 가까운 루프 탈출)");
		A:
		for(int a=0;a<5;a++) 	{	
			for(int b=0;b<5;b++){
				//추가
				if(b==2) continue A; //안쪽 루프를 건너뜀 -> A로 가는 것이므로! 안쪽 루프 건너뛰고 밖의 루프로 가버림.
				//ㄴ> 이건 레이블 있는 continue문! 레이블 넣는 거 간단해서 그냥 넣어본 것! A 빼면 레이블 없는 continue문.
				System.out.println("a="+a+",b="+b);
			}//inner for
			System.out.println("================"); 
		}//outer for

	}//main

}
