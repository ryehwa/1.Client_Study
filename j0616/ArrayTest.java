package j0616;

public class ArrayTest {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//int su,su2,su3;
		//형식)자료형 배열명[]=new 자료형[갯수]
		//초기값 자동 설정=> int -> 0, double->0.0, boolean ->false 자동으로 초기화
		int su[]=new int[3];//0,1,2 =>배열 선언
		System.out.println("su=>"+su); //주소값 나오면-객체 =>배열은 객체-주소값 존재
		su[0]=10;su[1]=20;su[2]=30; //->su에 0번째 요소에 10, 1번째 요소에 20,,,
		System.out.println("su[1]=>"+su[1]);
		System.out.println("su[2]=>"+su[2]);
		int su4=23; //지역변수는 반드시 선언->값을 저장시켜야 한다.
		System.out.println(su4);
		//형식2)자료형 배열명[]={값1,값2,값3,값4};//생성,초기화 동시에
		int c[]= {10,20,30,40,50,60,70,80,90,100,110,120,130};
		/*
		 * int c[]=new int[13];
		 * c[0]=10;c[1]=20;,,,,,;c[12]=130; -> 갯수 많으면 힘들어! 그럴 땐 형식2) 사용
		 * 
		 * 배열명.length=>배열의 길이를 자동으로 계산해 주는 것이 좋다.
		 * 배열에 for문 쓰는 이유: 배열의 인덱스를 이용해서 다양한 값을 출력시킬 수 있다(장점)
		 * (단점) 배열
		 */
		for(int i=3;i<c.length-1;i++)
			System.out.println("c["+i+"]="+c[i]);
		//확장 for문(=향상된 for문)=>단순히 배열,객체의 값을 꺼내와서 출력
		//형식) for(배열의 자료형 출력할 변수명:출력대상자(배열 or 컬렉션 객체)
		for(int num:c)//첨자계산하고와 상관없이 단지 배열의 값만 확인
			System.out.print("num="+num+"\t"	);
	}

}
