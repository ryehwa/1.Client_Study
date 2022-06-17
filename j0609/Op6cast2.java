package j0609;
//형변환2+printf() 메서드
public class Op6cast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=30;
		//printf(출력양식,,,출력할 대상자)
		//decimal:10진수   char       String        float
		//->%d(정수값),  %c(문자),%s(문자열),%f(소수점)
		System.out.printf("첫번째 숫자=%d",num1); //첫번째 숫자=20
		System.out.println();//출력할 값X => 줄바꿈만 일어남. ln:줄바꿈
		System.out.print('\n'); //특수기호에 맞게 실행-> \n :줄바꿈
		System.out.printf
		("첫번째 숫자=%d,두번째숫자=%d",num1,num2);
		//형 변환 예외사항
		char ch='A'; //65 =>char->int
		//byte,short,int,long(음수 포함) : -128~127 ->자동형변환 문제없음
		//char(0~65535 양수만 있음)->int(4byte)으로 자동형변환 예외조항
		System.out.println();
		System.out.printf("문자 %c의 유니코드값은 %d\n",ch,(int)ch);
		//ㄴ> 줄바꿈 따로 안쓰고 자체적으로 마지막에 \n 써서 줄바꿈 주기!
		//ㄴ>원래 위의껀 자동형변환 일어나야 하는데 
		//printformat 안에서는 자동형변환이 안일어나기 때문에 강제 형변환 해야 함.
		//char은 양수만 있는데 음수도 포함한 int로 자동형변환하는 데 어려움이 있다. printf안에서만!
		int ch2=ch; //char->int
		System.out.println("ch=>"+ch2);
		//종합문제->총점
		//변수->1.계산할 때 2.입출력 프로그램 작성 시 3.현재 프로그램의 상태 저장
		int java=90,jsp=85,oracle=90;
		int sum=java+jsp+oracle;
		System.out.printf("sum=%d입니다.\n",sum);
		//평균
		int avg=sum/3; //int 정수만 저장하므로 소수점 잘림. => double로!
		double avg2=sum/3; //88.0 ->sum자체가 int이므로 소수점 잘림->double로 형변환 시켰기 때문에 괜히 .0 붙는 것!
		double avg3=(double)sum/3;
		//    / 후에 앞에 (double)형으로 줄 것
		//(double)(sum/3): 수식에 ()로 묶어서 하나로 보면 이미 정수로 값이 나온 sum/3을 double로 형 변환하는 것이기 때문에 의미가 없음.=88.0
		//(double)sum/3: 정수인 sum을 double로 형 변환 후 /3 하기! -> 정밀 값 나옴!=88.3333333333
		System.out.println("avg=>"+avg+",avg2=>"+avg2);
		System.out.println("avg3=>"+avg3);
		
		//형식)-> %f ->%전체자리수.소수점자리수f => %.2f(소수점 둘째자리까지)
		System.out.printf("평균(avg3):%5.2f\n",avg3);
		//88.33=> 소수점까지 5자리 수!
		// 값을 정확히 모른다면 전체자리 수 생략 후 쓰면 됨! 
		//=System.out.printf("평균(avg3):%.2f",avg3);
		//전체자리수는 선택 사항, 쓰느 경우에 출력 X 값은 공백으로 채워짐!
		System.out.println("abc\t123\b456");
		// \t : 탭키만큼 거리를 둬라 \b:backspace -> 백스페이스는 눈에 안보임-> 네모로 보여주는 것
		System.out.println("\"HelloTest\""); //문자열 앞뒤에 " " 표시
	}

}
