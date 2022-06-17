package j0608;

/*
 * 1.수치형(=숫자)=>정수=>byte->short->int->long
                    소======================>대

 *1)byte=>(-127~128)만 저장==>저장공간 크기(1 byte)
        =>자바에서 기본 데이터 전송단위(채팅->문자열) =>**자바의 입출력(ex 파일첨부)
          *****************************

  2)short ->2byte기억공간 크기(-32768~32767)

 *3)int => 4byte 기억공간 크기만큼 저장이 가능
          (-2147483648~2147483647)=>-21억 ~ 21억
        =>자바에서의 기본 연산단위로 사용(+,-,*,/ =>산술연산자)
        =>형변환과 연관
          *******************************
 *4)long =>8byte 기억공간 크기만큼 저장이 가능
         만약에 long형으로 저장하라=>저장하는 값뒤에 L or l를 써주어야한다.
 */

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수의 개요 및 선언,작성법");
		//변수(Variable)=>메모리상에 문자,숫자,논리적인값을 저장할 공간을 만들어주는 것
		//형식) 자료형(=데이터형) 변수명;  자바스크립트는 자료형X
		//var age;
		int age;//정수값 변수선언(공간 O 아직 저장X)
		age=25;//변수에 값을 저장->할당
		//int age=25; 변수를 선언하면서 동시에 값을 25저장  var age=25
		System.out.println("올해 제나이는 "+age+"살입니다.");//+(결합의 의미)
		//document.write("올해 제나이는 "+age+"살입니다.<br>");
		byte b=23;
		short c=12;//-32768~32767
		int sum=b+c; //35->byte로 충분이 저장이 가능=>형변환 때문
		//Type mismacth(타입이 안맞는다.)
		System.out.println("sum="+sum);
		//주민등록번호를 저장
		long no=1234567890000L;//long형은 자료형은 뒤에 숫자뒤에 L자를 붙여줘야 인식
		System.out.println("no=>"+no);

	}

}
