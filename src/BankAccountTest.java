import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BankAccount account1=new BankAccount(1,"kim",9000);//계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌  account1 생성
		BankAccount account2=new BankAccount(2,"lee");//계좌번호 2, 예금주명 lee로 초기화한 은행계좌 account2 생성
		
		System.out.print("입금액 입력:");
		int money1=scan.nextInt();
		account2.deposit(money1);//사용자로부터 입금액을 입력받아 account2에 입금
		System.out.print("출금액 입력:");
		int money2=scan.nextInt();
		account2.withthrow(money2);//사용자로부터 출금액을 입력받아 account2에서 출금
		
		System.out.print("입금액 입력:");
		int money3=scan.nextInt();
		account2.deposit(money3);//사용자로부터 입금액을 입력받아 account2에 입금
		System.out.print("출금액 입력:");
		int money4=scan.nextInt();
		account2.withthrow(money4);//사용자로부터 출금액을 입력받아 account2에서 출금
		
		System.out.print("송금액 입력:");
		int money5=scan.nextInt();
		account2.transfer(account1, money5);//사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.print("송금액 입력:");
		int money6=scan.nextInt();
		account2.transfer(account1, money6);//사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		
		System.out.println(" ");
		
		account2.setName("park");//account2의 예금주명을 park으로 수정
		
		System.out.println(account2.toString());//account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(account1.toString());//account1의 계좌번호, 예금주명, 잔액 출력

	}

}