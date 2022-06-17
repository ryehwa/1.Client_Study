package j0615;
//아파트.빌라에 거주하는 사람들의 정보를 저장(추상화,캡슐화,생성자 오버로딩+this)

class Person{
	//1.멤버변수
	String name;
	int age;
	//String addr; ->주소
	//(),(name),(age),(name,age)
	//(),(name),(age),(addr),(name,age),(age,addr),(name,addr),(name,age,addr)
	
	//2.생성자=>멤버변수에 값을 저장시키는 역할(초기화)
	Person(){//자기 메소드 내에 자기 객체 직접적으로 사용 못함.this 사용!
		this.name="홍길동"; //p1.name="홍길동";
		this.age=23;//p1.age=23;
		System.out.println("난 Person클래스의 기본 생성자입니다.");
	}//기본 생성자
	Person(String name){//Person p2=new Person("테스트");
		this.name=name;//name="테스트";
		this.age=24;       //p2.age=24; this는 생성된 객체 의미->밑에서 객체 이름 어떻게 지을 지 모르기 때문에 범용적 의미를 가진 this로 지칭.
		System.out.println("난 매개변수 1개짜리 문자열처리생성자 호출됨");
	}
	Person(int age){
		this.age=age;
		this.name="테스트김";
		System.out.println("난 매개변수 1개짜리 정수형처리생성자 호출됨");
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("난 매개변수 2개짜리 생성자 호출됨");
	}
	
	//3. Setter Method  //public void set대문자첫글자~ : 그냥 외우기!
	public void setName(String name) {//p2.setName("김씨")
		this.name=name; //p2.name="김씨";
		
	}
	public void setAge(int age) {//p1.setAge(24)
		if(age<0) {
			System.out.println("나이는 음수 입력 불가");
			this.age=23; //p1.age=23; 이 줄의 age=>멤버변수
			return;
		}
		this.age=age; //양수
	}
	//Getter Method
	public String getName() {return this.name;}//p1.getName
	public int getAge() {return this.age;}
	//단순,반복
	void print() {//p1.print() 호출
		System.out.println("이름=>"+this.name);
		System.out.println("나이=>"+this.age);
		System.out.println("============");
	}
}
public class PersonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스명 객체명=new 생성자();=>객체를 생성하면서 기본 생성자 호출
		Person p1=new Person();
		System.out.println("p1=>"+p1); //p1=>j0615.Person@156643d4
		//p1.setName("홍길동");
		p1.setAge(24);//수정목적
		p1.print();
		//Person클래스의 p2객체 생성하면서
		Person p2=new Person("테스트");
		p2.print();
		//p3객체 생성하면서 인수 2개짜리 생성자를 호출하라
		Person p3=new Person("임시3",38);
		p3.print();
	}

}
