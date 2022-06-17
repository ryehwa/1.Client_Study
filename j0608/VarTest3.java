package j0608;
//논리형(=boolean)(불린)(참거짓), 문자형(char)- 한글자 저장, 한글자 이상=>String
public class VarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("논리적인 값 저장(LogicTest)");
       boolean b=true; //소문자만 입력 가능-> True,TRUE(X)
       boolean b2=2>3;//false-> 관계 연산자를 통해서 값 저장 가능
       System.out.println("b=>"+b+",b2->"+b2);
       System.out.println("문자형");//char,String
       char c1='A'; //내부적으로 'A'-> 65로 저장 (컴퓨터 자체적으로 본인의 언어로!), B->66,C->67,,,
       char c2=65;//아스키코드값=>'A'임!  65->'A','B' int c2=66(연산 가능 숫자)
     //문자 형태의 16진수 형태로 입력 받아 문자로 저장 ('\u0000 ~ \uFFFF')  //u=unicode
       char c3='\u0041'; // u를 쓴 뒤 뒤에서 자리수를 맞춤(남는 부분은 0 채움)
       System.out.println("c1=>"+c1+",c2->"+c2+",c3->"+c3);
       //문자열=> 문자+문자 => 'a'+'b'=> "ab"
       //문자열+문자열= 문자열
       //숫자+문자열=문자열
       String s1="자바 기초 문법";
       String s2="연산자";
       //빈 문자열=> 문자열 내부에 공백이 들어간 문자열
       String s3=s1+" "+s2;// like || ' ' || in 오라클
       System.out.println("s3=>"+s3);
	}

}
