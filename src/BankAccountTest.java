import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BankAccount account1=new BankAccount(1,"kim",9000);//���¹�ȣ 1, �����ָ� kim, �ܾ� 9000���� �ʱ�ȭ�� �������  account1 ����
		BankAccount account2=new BankAccount(2,"lee");//���¹�ȣ 2, �����ָ� lee�� �ʱ�ȭ�� ������� account2 ����
		
		System.out.print("�Աݾ� �Է�:");
		int money1=scan.nextInt();
		account2.deposit(money1);//����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
		System.out.print("��ݾ� �Է�:");
		int money2=scan.nextInt();
		account2.withthrow(money2);//����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
		
		System.out.print("�Աݾ� �Է�:");
		int money3=scan.nextInt();
		account2.deposit(money3);//����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
		System.out.print("��ݾ� �Է�:");
		int money4=scan.nextInt();
		account2.withthrow(money4);//����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
		
		System.out.print("�۱ݾ� �Է�:");
		int money5=scan.nextInt();
		account2.transfer(account1, money5);//����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
		System.out.print("�۱ݾ� �Է�:");
		int money6=scan.nextInt();
		account2.transfer(account1, money6);//����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
		
		System.out.println(" ");
		
		account2.setName("park");//account2�� �����ָ��� park���� ����
		
		System.out.println(account2.toString());//account2�� ���¹�ȣ, �����ָ�, �ܾ� ���
		System.out.println(account1.toString());//account1�� ���¹�ȣ, �����ָ�, �ܾ� ���

	}

}