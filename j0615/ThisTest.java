package j0615;
//1.메서드(=생성자)를 작성할 때 멤버변수와 매개변수가 서로 같으면 어떻게 구분?
//this.멤버변수=매개변수
public class ThisTest {
	
	private int a=100;//200->400
	
	ThisTest(int a){//멤버변수=매개변수-> 멤버변수 앞에 this.작성!
		this.a=a;//멤버변수=매개변수 a=200
	}
	public void setA(int a) {
		this.a=a;//this.a=400
	}
	public int getA() {return a;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt=new ThisTest(200);//100->200
		tt.setA(400);
		System.out.println("tt.getA()=>"+tt.getA());
	}

}
