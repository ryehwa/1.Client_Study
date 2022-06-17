package j0616;

public class IFtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입출력-> 사용자로 값을 입력 -> scanner객체(6장 생성자 후에 사용)
		//짝수,홀수 판별(어떤수 /2==>2의 배수, /3==0(3의 배수)

		int su=29;
		//if (su%2==1) //조건식(변수,연산자(관계,논리))
		//		System.out.println(su+"은 짝수입니다.");
		//하나의 조건식에 따라서 처리해야 할 문장이 하나 이상일 때 {  }
		//% :나머지, su%2==0 -> su를 2로 나눴을 때 나머지가 0
		if(su%2==0) {
			System.out.println(su+"은 짝수입니다.");
			System.out.println("블럭처리 연습1");
		}else {
			System.out.println(su+"은 홀수입니다.");
			System.out.println("블럭처리 연습2");
		System.out.println(su);
		}
		//1:1 대응 방식 -> if에 2문장 들어가면 else도 2문장!, 2문장 이상이면 {}로 묶어주기
		//위에 if도 { }블럭 처리하면 아래 else도 하는 게 원칙!
		System.out.println("==삼항연산자로 변경===");
		String su2=(su%2==0)?"짝수입니다.":"홀수입니다.";
		//조건? A:B -> A:true, B:false
		System.out.println("입력받은 값(su2)=>"+su2);
		System.out.println("if연습");//순차문
		//추가
		System.out.println("==정적메서드를 불러와서 사용==");
		//단순,보편적인 기능->절대값,최대값,최소값,,->정적메서드(java,lang,Math)
		//API문서(개발자 문서)=>shift+F2(클래스명 쓰고 커서를 안쪽에 넣고)
		int abs=-500;
		
		abs=(abs<0)?-abs:abs;
		System.out.println("절대값 abs=>"+abs);
		
		abs=Math.abs(-2500);//클래스명.정적메서드명(~)
		System.out.println("절대값 abs=>"+abs);
		
		//최대값 java.lang.max(int a,int b)=>최대값
		int max=Math.max(34,98);
		System.out.println("최대값(max)=>"+max);
		
		int min=Math.min(34,98);
		System.out.println("최대값(min)=>"+min);
		//가장 기본적인 기능->정적 메서드->불러다 사용
		//업무에 필요->일반 메서드 작성
		
	}

}
