package j0616;

import java.util.Scanner;//모든 클래스 메모리에 올림(java.util.*)

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int su,su2,su3,su4,su5; -> 불편 =>배열을 사용하라
		int jumsu[]=new int[5];//0~4
		int sum=0;//합계
		double avg=0.0;//평균
		
		Scanner sc=new Scanner(System.in);//키보드
		System.out.println("5과목의 점수를 입력하세요?");//int
		/*5번 반복해서 실행=>for문
		jumsu[0]=sc.nextInt();
		sum+=jumsu[0];//sum=sum[0]+jumsu[0](78)
		
		jumsu[1]=sc.nextInt();
		sum+=jumsu[1];//sum=78+34
		*/
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i]=sc.nextInt();
			sum+=jumsu[i];
		}//for
		//최종 합계,평균
		avg=(double)sum/jumsu.length;//5과목
		System.out.println("합계=>"+sum+",평균=>"+avg);
	}

}
