package j0609;
//삼항 연산자,대입 연산자(=배정연산자)
public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("대입,삼항연산자");
		//byte, short, int, long
		int a=5, b=7,x=10,y=-10;
		//삼항연산자 -> 조건식에 따라서 변수에 저장된 값을 선택해서 저장시키는 연산자
		//형식) 자료형 변수명=(조건식)? 참인값:거짓인값;
		int absX=(x>=0)?x:x; //절대값 10->10 -(-10)=10
		int absY=(y>=0)?y:-y; //abs:absolute약자로 그냥 변수 이름으로 쓴 것!
		System.out.println("x=10일때 x의 절대값=>"+absX);
		System.out.println("y=-10일때 y의 절대값=>"+absY);
		/*
		 * int c=a+b 		a=a+1,a=a-1,a=a*1,a=a/1,a=a%1
		 * 						ㄴ> 자기 변수에 값을 계산한 후 자기 변수에 대입(저장)
		 * 						a=a+1 -> a++	or  a+=1 (대부분 a++씀, 짧으니까)
		 * 						a=a-1  -> a--		or  a-=1  (대부분 a--)
		 * 						a=a+2 -> a+=2				  (2이상 부터는 이걸로)
		 * 						a=a-2  -> a-=2
		 */
		a+=b;//a=a+b; //+=, -=, *=, /= (연산자 하나 -> 실행속도 더 빠름)
		System.out.println("a=>"+a); //5+7=12
		
		a-=b; //a=a-b -> a=12-7
		System.out.println("a=>"+a); //5
		
		a*=b; //a=a*b -> a=5*7
		System.out.println("a=>"+a); //35
		
		a/=b; //a=a/b -> a=35/7
		System.out.println("a=>"+a); //5
		
		

	}

}
