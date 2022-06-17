package j0616;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2차원 배열을 생성 및 가변배열");
		//형식)배열의 자료형 배열명[][]=new 자료형[행수][열수]
		int c[][]=new int[3][3];//c[0][0]=10,c[0][1]=20,,c[2][2]=90
		//2.형식) 배열의 자료형 배열명[][]={{값1,값2,,,}{값1,값2,}{}}//행
		//int b[][]= {{10,20,30},{40,50,60},{70,80,90}};//배열 안쪽에 {}이 3개
		//	가변배열=>행은 정해져 있는데 열은 그때마다 바뀌는 경우
		int b[][]= {{10,20,30},{40,50},{60,70,80,90}};
		//		b[0][0],b[0][1]			b[1][1]			b[2][3]	=>90
		for(int i=0;i<b.length;i++) {//b.length(행의 수)
			//System.out.println("b["+i+"]="+b[i]);//열의 데이터 주소값
			for(int j=0;j<b[i].length;j++) {
				System.out.println("b["+i+"]["+j+"]="+b[i][j]);
			}//inner for
		}//outer for
	}

}
