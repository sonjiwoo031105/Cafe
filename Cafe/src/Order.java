import java.util.Scanner;

public class Order {
	private String size;
	private int temp;
	private int number;
	private int where_eat;
	
	Scanner scan = new Scanner(System.in);

	public Order (String size, int temp, int number, int where_eat) {
		this.size = size;
		this.temp = temp;
		this.number = number;
		this.where_eat = where_eat;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getWhere_eat() {
		return where_eat;
	}
	public void setWhere_eat(int where_eat) {
		this.where_eat = where_eat;
	}

	public void Size_Number() {
		System.out.println("������� �������� �Ͻðڽ��ϱ�?");
		System.out.print("M ,L ,XL : ");
		
		size = scan.next();	
		
		System.out.print("������ ������ ��� �帱���? : ");
		
		number = scan.nextInt();
	}
	
	public void HOTorICE() {
		System.out.println("1.HOT  2.ICE");
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		
		temp = scan.nextInt();
		
		if(temp == 1) {
			System.out.println("�߰ſ� ������ �غ��ص帮�ڽ��ϴ�.");
		}else if(temp == 2) {
			System.out.println("���̽��� �غ��ص帮�ڽ��ϴ�.");
		}else {
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void Choice_eat() {
		System.out.println("���忡�� ��ð� ���ǰǰ���? take out �Ͻǲ�����?");
		System.out.print("������ 1��, take out�� 2���� �����ּ��� : ");
		
		where_eat = scan.nextInt();
		
		if(where_eat == 1) {
			System.out.println("���������� �غ��� �帮�ڽ��ϴ�.");
		}else if(where_eat == 2) {
			System.out.println("��ȸ�� ������ �غ��� �帮�ڽ��ϴ�.");
		}else {
			System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "������� " + size + ", ������ ������ " + number + "���̸�, ";
	}
}
