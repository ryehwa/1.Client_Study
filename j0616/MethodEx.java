package j0616;

//외부의 패키지에 존재하는 클래스를 불러오는 경우 -> ctrl+shift+O
//형식) import 최상위패키지명.하위패키지명...불러올 클래스명;
import java.util.Scanner;

//성적처리 프로그램 작성->국,영,수->합계->평균->등급->모든 정보 출력
public class MethodEx {
	//멤버변수선언=>데이터 저장 목적
	/*
	 * 메서드 작성하는데 매개변수 주는 경우, 안주는 경우 구분해서 작성
	 * 1. 멤버변수로 선언 -> 매개변수가 없는 메서드를 작성 O
	 * 2. 멤버변수가 존재 X -> 지역변수를 만드는 경우
	 * 									ㄴ> 매개변수가 있는 메서드를 작성 O
	 */
	/* 멤버변수 선언 -> 데이터 저장 목적
	int kor,eng,mat,tot; //국,영,수,총점
	double avg; //평균
	char grade; //등급
	*/
	//1.총점(=합계)->계산 목적=>반환값 O
	//static:정적메서드
	static int calcSum(int kor,int eng,int mat) {
		int t=kor+eng+mat;
		return t; //return (kor+eng+mat);
	}
	//2.평균=>총점/과목수->반환값 O
	static double clacAvg(int tot) {
		return (double)(tot/3);
	}
	//2-2)평균2 과목수가 자주 변경이 되는 경우
	static double calcAvg(int tot,int su) {//1.총점 2.과목수
		return(double)(tot/su);
	}
	//3.등급(=학점)->평균->반환값 O
	char calcGrade(double avg) {
		if(avg<=100 && avg>=90) return 'A';
		else if(avg<90 && avg>=80) return 'B';
		else if(avg<80 && avg>=70) return 'C';
		else if(avg<70 && avg>=60) return 'D';
		else return 'F';
	}
	//4.총점,평균,등급을 모두 출력=>단순,반복->매개변수X,반환값X
	void display(int tot,double avg,char grade) {
		System.out.println("합계(tot)=>"+tot);
		System.out.println("평균(avg)=>"+avg);
		System.out.println("등급(grade)=>"+grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성=>멤버 변수에 값을 저장->메서드를 호출하기 위해서
		MethodEx me=new MethodEx(); //1.데이터 저장 및 메서드 호출
		//메서드 내부에서 선언된 변수(=지역변수)
		/*(1)
		int kor=70;
		int eng=67;
		int mat=78;
		*/
		//사용자로부터 값을 입력을 받아서 처리해주는 클래스- Scanner
		//ctrl+shift+O (자동 import 기능) =>외부클래스 패키지 받아오기-> 제일 위에 표시됨.
		Scanner sc=new Scanner(System.in);
		System.out.println("1.국어점수는?");
		//문자(next(단어),nextLine(한 문장))
		//숫자(nextInt(정수),nextDouble(소수점))
		int kor=sc.nextInt();
		
		System.out.println("2.영어점수는?");
		int eng=sc.nextInt();
		
		System.out.println("3.수학점수는?");
		int mat=sc.nextInt();
		
		System.out.println("4.이름은?");
		String name=sc.next();
		System.out.println("이름은 "+name+"이군요!");
		
		//1.총점
		//me.tot=me.kor+me.eng+me.mat;
		//정적메서드:클래스명.정적메서드명(~)
		int tot=MethodEx.calcSum(kor,eng,mat);
		//System.out.println("합계(tot)=>"+me.tot);
		//2.평균
		double avg=MethodEx.clacAvg(tot); //215/3
		
		//일반메서드
		//3.등급
		char grade=me.calcGrade(avg);
		
		//4.모든 값 출력
		me.display(tot,avg,grade);
		
		
	}

}
