package j0610;
/*
 * <문제1> 1부터 100까지의 합을 구하시오. -> step1
 * <문제2> 1부터 100까지의 합 중에서 3의 배수 또는 5의 배수의 합을 구하시오. ->step2
 * 										i%2==0(2의 배수), 3의 배수:i%3==0, 5의 배수: i%5==0
 * <문제3> 
 * 1부터 100까지의 합 중에서 3의 배수 또는 5의 배수의 합을 구한 값 중에서
 * 합계가 200을 넘어가는 최소의 값을 구하시오.(부분 점수) -> step3
 */

public class SumBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0 || i%5==0)/*step2 추가*/{
			sum+=i; //sum=sum+i
			System.out.print(i+"\t");
			}
			//200이 넘어가는 순간 더 이상 for문을 실행X->벗어나라.
			if(sum>200) break;
		}
		System.out.println("sum=>"+sum);

	}

}
