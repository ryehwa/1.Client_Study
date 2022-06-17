package j0610;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.for문의 유형(C++)");//초기식을 for 안쪽
		//for(초기식;조건식;증감식)
		for(int i=1;i<=5;i++) {//조건식에 따라서 실행할 구문이 한 문장 이상
			System.out.println("반복할 for문 연습"+i);
		}
		System.out.println("================");
		System.out.println("2.for문의 유형2(C언어유형)");
		/*int k;//초기식의 변수를 for문 밖에 선언 -> C언어
		//      1)     2)   5)
		for(k=10;k>5;k--) //4)
			System.out.println(k+"테스트");//3)6)
	*/
		System.out.println("3.for문의 유형3");
		int k=10;
		for(;k>5;k--)
			System.out.println(k+"테스트");
		
		System.out.println("4.최소한의 for문 구성(증감식도 생략가능)");
		int c=1; //초기식은 for문 밖에 선언이 가능
		c++; //2 증감식은 for문 밖에 선언할 수 없다.
		for(;c<=20;) {
			System.out.println("20번 반복"+c);
			c++;
		}//for문이 증감식은 생략이 가능하지만 for문 내부에 작성 O
		//블럭 처리를 안하면 바로 그 밑에 문장만 실행함. 그러므로 묶어줘야 함!
		System.out.println("5.for문의 전부 생략 가능");
		//while(true)//for(;;) -> 둘다 무한루프
			//System.out.println("무한루프");
		System.out.println("5.합계,곱을 동시에 구하기");
		//1~100까지의 합을 구하기 -> 1+2+3+4+,,,+100=5050
		//변수? 몇개?
		int sum=0; //1+2+...100
		int gap=1; //곱셈-> 0(X) -> 초기값 0을 주면 다 0이 됨! 그러므로 1부터 시작
		
		for(int i=1;i<=5;i++) { //1~5까지의 덧셈,곱셈
			sum+=i;//sum=sum+i
			gap*=i;//gap=gap*i 곱셈은 그냥 gap이라고 변수 설정한 것임.gop
			System.out.println("중간합계(sum)=>"+sum);
			System.out.println("중간곱(gap)=>"+gap);
			System.out.println("==================");
		}
		System.out.println("최종합계(sum)=>"+sum);
		System.out.println("최종곱(gap)=>"+gap);
		//1~100까지의 합 => 짝수의 합(2,4,6,8,10~), 홀수의 합
		int total=0;
		for(int i=1;i<=100;i+=2) {//증감식을 이용
			//짝수일 때만 합계를 구하라
			//if(i%2==0)   //홀수일 때는 i%2==1
				total+=i;
		}
		System.out.println("total=>"+total);
	}

}
