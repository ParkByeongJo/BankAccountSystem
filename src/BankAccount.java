public class BankAccount {
	private int accountNumber;//������¹�ȣ�� ��Ÿ���� �ʵ�
	private String name;//������ �̸��� ��Ÿ���� �ʵ�
	private int balance;//�ܾ��� ��Ÿ���� �ʵ�
	
	/*���¹�ȣ, �����ָ�, �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor - �ܾ��� �����̸� 0���� �ʱ�ȭ*/
	public BankAccount(int accountNumber, String name, int balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
		if(this.balance<0) {
			this.balance=0;
		}
	}
	
	/*���¹�ȣ, �����ָ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor*/
	public BankAccount(int accountNumber, String name) {
		this(accountNumber,name,0);
	}
	
	public int getAccount() {//���¹�ȣ�� �����ϴ� getter�޼ҵ�
		return accountNumber;
	}
	
	public void setName(String name) {//������ �̸��� �����ϴ� setter�޼ҵ�
		this.name=name;
	}
	
	public String getName() {//������ �̸��� �����ϴ� getter�޼ҵ�
		return name;
	}

	public int getBalance() {//�ܾ��� �����ϴ� getter�޼ҵ�
		return balance;
	}
	
	public void deposit(int amount) {//�ݾ��� �Ű������� �޾Ƽ� �Ա��ϵ��� �ϴ� �޼ҵ�
		balance+=amount;
	}
	
    public void withthrow(int amount) {//�ݾ��� �Ű������� �޾Ƽ� ����ϵ��� �ϴ� �޼ҵ�
    	if(balance>amount) {//�ܾ��� ����� �ݾ׺��� Ŭ ��
    		balance-=amount;
    	}
    	else//�ܾ��� ����� �ݾ׺��� ���� ��
    		System.out.println("�ܾ��� �����մϴ�.");
	}
    
    public String toString() {//���¹�ȣ, �����ָ�, �ܾ��� ���ڿ��� ���� 
    	return "���¹�ȣ:"+accountNumber+"\n"+"�����ָ�:"+name+"\n"+"�ܾ�:"+balance+" ";
    }

    /*�ٸ� ������� ��ü�� �۱ݾ��� �Ű������� �޾� �� ���·κ��� �ٸ� ���·� �۱��ϴ� �۾��� �ϴ� �޼ҵ�*/
    public void transfer(BankAccount a, int money) {
    	if(balance>money) {//�ܾ��� �۱��� �ݾ׺��� Ŭ ��
    		a.balance+=money;//Ÿ ������ �ܾ׿� �� ���·κ��� �۱��� �ݾ��� ������
        	balance-=money;//�� ������ �ܾ׿��� �۱ݾ��� ��
    	}
    	else {//�ܾ��� �۱ݾ׺��� ���� ��
    		System.out.println("�ܾ��� �����մϴ�.");
    	}
    }
}