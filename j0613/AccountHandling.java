package j0613; //나눌 수 있지만 합친 것!(설계 + 실행 목적)
//설계 목적+실행 목적의 클래스
//은행계좌
class Account{
	String name;//소유자
	String no;//계좌번호=>계산목적X
	long price=1000;//예금잔액 -> int도 가능 이번엔 long 써본 것
	
	//1.기본 기능->잔액 조회=>단순,반복=>매개변수X,반환값X
	void searchPrint() {
		System.out.println(name+"님의 현재 잔액은"+price+"입니다.");
	}
	//2.입금=>저장=>매개변수O,반환값X
	void input(long k) {
		price+=k;//price=1000+5000=6000
		System.out.println(k+"만큼 입금이 완료됨!!!");
	}
	//3.출금=>입력->매개변수O,반환값X
	void output(long k) {
		//잔액을 확인
		//잔액이 0이거나 음수가 되면 안된다.->if
		if (k<0 || (price-k)<=0){
			System.out.println("잔액이 부족합니다.");
		}else {//양수
			price-=k;
			System.out.println(k+"만큼 출금이 완료됨");
		}
	}//output
	//4.계좌정보 출력->명세서 출력->단순,반복
	void print() {
		System.out.println("==계좌정보 확인==");
		System.out.println("소유자=>"+name);
		System.out.println("계좌번호=>"+no);
		System.out.println("잔액=>"+price);
	}
}//class account


public class AccountHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account t=new Account();//내 계좌 정보만 저장 가능한 공간 생성
		t.name="철수";
		t.no="46-123-0987";
		//입금
		t.input(5000);//1000+5000=6000
		t.output(8000);//잔액이 부족
		t.output(4000);//6000-4000=2000
		t.print();

	}

}
