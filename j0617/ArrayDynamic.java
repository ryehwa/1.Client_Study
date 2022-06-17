package j0617;

/*
 * 배열-> 1.고정배열(처음부터 배열의 크기가 정해져 있는 배열)
 * 					=> 중간에 크기 변경 X ex) int su[]=new int[4];
 * 			  2. 동적 배열 -> 배열에 값을 저장시키면 자동으로 크기가 증가,감소되는 배열
 * 					=> ex) 컬렉션 객체
 * 				ex)String x[]; x[0]=10
 */
				
public class ArrayDynamic {

	public static void main(String x[]) {//main의 String은 변경 X
		// TODO Auto-generated method stub
		//run configuration=>동적 배열 예제를 실행할 때 사용
		//여기서 위의 x[]는 이미 만들어진 것이라 넣을 방법이 없음!->run configuration 
		int sum=0;
		
		//문자열->숫자로 변환
		//Integer.parseInt(변환할 문자열 상수)=>문자열=>숫자로 변환
		//숫자(10)->문자열("10") => 형식) String.valueOf(숫자)
		/*(1)
		String str=x[0];//"10"
		String str2=x[1];//"20"
		String str3=x[2];//"30"   -> run configuration에서 따로 설정 =>동적 배열을 할 때만 사용!
		
		int num=Integer.parseInt(str);
		int num2=Integer.parseInt(str2);
		int num3=Integer.parseInt(str3);
		
		sum=num+num2+num3;
		
		System.out.println("str=>"+num);
		System.out.println("str2=>"+num2);
		System.out.println("str3=>"+num3);
		
			System.out.println("sum=>"+sum);
		*/
		//(2) 
		  	int str=Integer.parseInt(x[0]);
			int str2=Integer.parseInt(x[1]);
			int str3=Integer.parseInt(x[2]);
			
			sum=str+str2+str3;
			
			//추가
			String str4=String.valueOf(str);//10->"10"(숫자->문자열)
			//"10.5" -> 10.5 => Double.parseDouble("10.5") // parse :쪼개다
			double str5=Double.parseDouble("10.5"); //=>문자열 -> 소수
		
		
		//String(참조형)과 int(기본자료형)는 서로 관련이 없다.(자료형이 다르다->다른 자료형끼리는 형 변환 안됨.)
		//sum=(int)str+(int)str2+(int)str3;
		
		System.out.println("str=>"+str);
		System.out.println("str2=>"+str2);
		System.out.println("str3=>"+str3);
		//추가
		System.out.println("sum=>"+sum);//60
		System.out.println("str4=>"+str4);
		System.out.println("str5=>"+str5);

	}

}
