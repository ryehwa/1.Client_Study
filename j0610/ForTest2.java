package j0610;
//제어문에 또 다른 제어문 => 중첩 for문(=이중 for문)***
//for(int dan=3;dan<=7;dan++) //단 -> 구구단 -> 3단,?
//		for(int times=1)
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("중첩 for문(=이중 for문)");
		//        1)     2)14)
		for(int a=0;a<5;a++) /*바깥루프*/{//13)a=1       //바깥 루프 한번 돌 때 안쪽 루프 5번 돌아감! <5니까.
			//        3)    4)7)10)  6)9)
			for(int b=0;b<5;b++)/*안쪽루프*/{
				System.out.println("a="+a+",b="+b);//5)8)11)
			}//inner for
			System.out.println("================"); //12)
		}//outer for

	}//main

}
