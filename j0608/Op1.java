package j0608;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("산술,증감연산자");
		//int a=3,b=4;
		//int c=a+b;//byte c=a+b -> 기본 연산 자료형이 int
		//System.out.println("c=>"+c);//7
		//원의 면적=>r*r*3.141592 => int 저장 X double형으로 저장 -> 소수점으로 나오므로 (r:radius 반지름)
		// +,-,*,/ : 계산 결과 값이 int 범위를 벗어나지 않는 한 기본 자료형은 int
		double area=5*5*3.141592;
		System.out.println("area=>"+area);
		int a=4;
		int b=a++; // ++이 뒤에 붙었으니 a 나중 계산 -> 순서대로!
		/*
		 * int b=a;
		 * a=a+1 --> a+=1 (javascript)
		 */
		System.out.println("중간 a=>"+a+",b=>"+b);
		int c=++a;
		/*
		 * a=a+1 -> a=5+1 ->6
		 * int c=a -> c=6
		 * //++이 앞에 붙었으므로 a먼저 계산 -> 위에서 아래로, 왼쪽에서 오른쪽으로 읽는 순서대로!
		 */
		System.out.println("최종 a=>"+a+",b=>"+b+",c=>"+c);
	}

}
