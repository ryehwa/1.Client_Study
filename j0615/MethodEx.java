package j0615;
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
	int calcSum(int kor,int eng,int mat) {
		int t=kor+eng+mat;
		return t; //return (kor+eng+mat);
	}
	//2.평균=>총점/과목수->반환값 O
	double clacAvg(int tot) {
		return (double)(tot/3);
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
		int kor=70;
		int eng=67;
		int mat=78;
		
		//1.총점
		//me.tot=me.kor+me.eng+me.mat;
		int tot=me.calcSum(kor,eng,mat);
		//System.out.println("합계(tot)=>"+me.tot);
		//2.평균
		double avg=me.clacAvg(tot); //215/3
		
		//3.등급
		char grade=me.calcGrade(avg);
		
		//4.모든 값 출력
		me.display(tot,avg,grade);
		
		
	}

}
