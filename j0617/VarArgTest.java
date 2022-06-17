package j0617;

//동적 배열 + 오버로딩 => 새로 추가된 문법
//동적 배열 : 데이터 넣으면 자동으로 늘어나고 삭제하면 자동으로 줄어드는 배열
public class VarArgTest {

	//오버로딩->매개변수의 갯수만 달라지는 경우(자료형은 같다)
	/*
	public void print(String a) {
		System.out.println("a=>"+a);
	}
	public void print(String a,String b) {
		System.out.println("a=>"+a+",b=>"+b);
	}
	public void print(String a,String b,String c) {
		System.out.println("a=>"+a+",b=>"+b+",c=>"+c);
	}
	*/
	//동적배열의 값을 출력=>반드시 자료형이 같아야 한다.(배열)
	//일반적인 메서드 작성방법과 동일->(자료형..배열명)//배열표시[] (x)
	//다른 매개변수와 같이 사용하는 경우에는 반드시 매개변수 뒤에 와야 한다.
	//public void print(String str2,String ...names){} //OK
	//public void print(String ...name,String str2({}//(X)
	public void print(String ...names) {//매개변수의 갯수와 상관없이 메서드 하나로 통합
		/*
		 * String names[]={"홍길동"} //vat.print("홍길동");
		 * String names[]={"홍길동","테스트"} //vat.print("홍길동","테스트");
		 */
		for(String str:names)
			System.out.println(str+"\t");
		System.out.println();
	}
	public void print2(String names[]) {//고정배열을 매개변수로 사용
		for(String str:names)
			System.out.println(str+"\t");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgTest vat=new VarArgTest();
		//추가
		String str[]= {"배열의 활용","동적배열","API문서 참조하는 법"};
		vat.print2(str);
		//--------------------------------------------------------------
		vat.print("홍길동");
		vat.print("홍길동","테스트");
		vat.print("홍길동","테스트","임시"); //같은 메서드라도 갯수 맞춰서 알아서 찾아감-3개는 3개짜리,,
		vat.print("홍길동","테스트","임시","임시2");
		vat.print("홍길동","테스트","임시","임시2","임시3");
		vat.print("홍길동","테스트","임시","임시2","임시3","임시4");

	}

}
