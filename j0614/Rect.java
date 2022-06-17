package j0614;
//직사각형
public class Rect {
	double width;
	double height;
	
	void area() {
		System.out.println("직사각형의 면적="+width*height);
		
		
		
	/*강사님 풀이
	 * 1.공통의 멤버변수
	 * int x,y;
	 * int area;
	 * 
	 * void print(){
	 * System.out.println("x의 값=>"+x+",이고 y값은 "+y);
	 * System.out.println("x*y=>"+(x*y)+"입니다.");
	 * }
	 *2.매개변수 O,반환형 X -> 입력 O => 출력,계산,저장
	 *void area(int a,int b){
	 *x=a;   ->멤버변수=매개변수x=20
	 *y=b;
	 *System.out.println("x*y=>"+(x*y)+"입니다.");
	 *}
	 *3.매개변수O,반환형O -> 계산 목적, 웹프로그래밍에서 많이 활용
	 *int area2(int a,int b){
	 *		int result=a*b;
	 *		return result;  => 형식) return 계산한 값(변수)  or 수식 or 객체
	 *											return이 마지막 문장, return=>반환값
	 *					//System.out.println("result=>"+result)=> return 뒤에 이런 거 나오면 안됨!
	 *}
	*/
	}
}
