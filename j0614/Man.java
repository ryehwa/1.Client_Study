package j0614;
//추상화=>객체(저장하고 싶은 대상자)=>공통특성(멤버변수)+기능(메서드)
//-->클래스를 만들어내는 과정(=추상화(새로운 자료형을 만드는 것))
public class Man {

	//1.멤버변수
	String name="scott"; //초기값(scott)->james 로 변경 예정
	int age;//40
	boolean isMarried=false;
	int child;
	
	//2.개인정보 출력=>단순,반복=>매개변수X, 반환값X
	void print() {
		System.out.println("이 사람의 나이는 "+age+"살입니다.");
		System.out.println("이 사람의 이름은 "+name+"입니다.");
		System.out.println("이 사람의 결혼유무는 "+isMarried+"입니다.");
		System.out.println("이 사람의 자녀 수는 "+child+"명입니다.");
	}
}
