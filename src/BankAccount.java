public class BankAccount {
	private int accountNumber;//은행계좌번호를 나타내는 필드
	private String name;//예금주 이름을 나타내는 필드
	private int balance;//잔액을 나타내는 필드
	
	/*계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor - 잔액이 음수이면 0으로 초기화*/
	public BankAccount(int accountNumber, String name, int balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
		if(this.balance<0) {
			this.balance=0;
		}
	}
	
	/*계좌번호, 예금주명을 매개변수로 받아 초기화하는 constructor*/
	public BankAccount(int accountNumber, String name) {
		this(accountNumber,name,0);
	}
	
	public int getAccount() {//계좌번호를 리턴하는 getter메소드
		return accountNumber;
	}
	
	public void setName(String name) {//예금주 이름을 설정하는 setter메소드
		this.name=name;
	}
	
	public String getName() {//예금주 이름을 리턴하는 getter메소드
		return name;
	}

	public int getBalance() {//잔액을 리턴하는 getter메소드
		return balance;
	}
	
	public void deposit(int amount) {//금액을 매개변수로 받아서 입금하도록 하는 메소드
		balance+=amount;
	}
	
    public void withthrow(int amount) {//금액을 매개변수로 받아서 출금하도록 하는 메소드
    	if(balance>amount) {//잔액이 출금할 금액보다 클 때
    		balance-=amount;
    	}
    	else//잔액이 출금할 금액보다 작을 때
    		System.out.println("잔액이 부족합니다.");
	}
    
    public String toString() {//계좌번호, 예금주명, 잔액을 문자열로 리턴 
    	return "계좌번호:"+accountNumber+"\n"+"예금주명:"+name+"\n"+"잔액:"+balance+" ";
    }

    /*다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금하는 작업을 하는 메소드*/
    public void transfer(BankAccount a, int money) {
    	if(balance>money) {//잔액이 송금할 금액보다 클 때
    		a.balance+=money;//타 계좌의 잔액에 내 계좌로부터 송금한 금액을 더해줌
        	balance-=money;//내 계좌의 잔액에서 송금액을 뺌
    	}
    	else {//잔액이 송금액보다 작을 때
    		System.out.println("잔액이 부족합니다.");
    	}
    }
}