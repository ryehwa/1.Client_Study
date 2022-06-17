package j0608;

//실수를 저장하는 자료형 2가지 float,double
public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실수값을 저장");
		//자료형과 상관없이 똑같은 변수명 사용금지
		//byte f; int f;
		float f=5.3f;  double f2=5.3;
		//double f=5.3;
		System.out.println("f=>"+f+",f2=>"+f2);
		System.out.println("float,double의 차이점");
		float m_float=123456.789123f;//소수점 둘째자리까지 저장
		double m_double=123456.789123;//정밀한값을 저장->double
		System.out.println("m_float=>"+m_float+",m_double="+m_double);
	}

}
