import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Answer = 0;
		
		System.out.print("1.�Ƹ޸�ī�� (3000)		");
		System.out.print("2.ī��� (3500)		");
		System.out.print("3.īǪġ�� (4000)		");
		System.out.println("4.ī���ī (4000) ");
		System.out.print("5.���� ��ũƼ (4000)		");
		System.out.print("6.Ÿ�� ��ũƼ (4000) 	");
		System.out.print("7.���� ��ũƼ (4500) 	");
		System.out.println("8.��� ��ũƼ (4500) ");
		System.out.print("� ����� �Ͻðڽ��ϱ�? : ");
		int drink = scan.nextInt(); 
		
		System.out.println("");
		System.out.println("����� �������� �Ͻðڽ��ϱ�?");
		System.out.print("M ,L ,XL : ");
		String size = scan.next();
		
		System.out.println("");
		System.out.println("1.HOT  2.ICE");
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int temp = scan.nextInt();
		
		System.out.println("");
		System.out.print("������ ������ ��� �帱���? : ");
		int number = scan.nextInt();
		
		System.out.println("");
		System.out.println("���忡�� ��ð� ���ǰǰ���? take out �Ͻǲ�����?");
		System.out.print("������ 1��, take out�� 2���� �����ּ��� : ");
		int where_eat = scan.nextInt();
		
		System.out.println("");
		System.out.print("������ �߰��Ͻðڽ��ϱ�? (y/n) : ");
		String Topping = scan.next();
		
		System.out.println("");
		if(Topping.equals("y") || Topping.equals("Y")) {
			if(drink == 1 || drink == 2 || drink == 3 || drink == 4) {
				System.out.println("1. �� �߰�(+500)	2. �÷� �߰�(+500)"); 
				System.out.print("������ �߰��Ͻðڽ��ϱ�? : ");
				Answer = scan.nextInt();
			}else if(drink == 5 || drink == 6 || drink == 7 || drink == 8) {
				System.out.println("1. Ÿ�ǿ�ī�� �߰�(+500)   2. ġ���� �߰�(+500)   3. ���ڳ� ���� �߰�(+500)");
				System.out.print("������ �߰��Ͻðڽ��ϱ�? : ");
				Answer = scan.nextInt();
			}
		}
		else if(Topping.equals("n") || Topping.equals("N")){
			System.out.println("������ �߰����� �ʽ��ϴ�.");
		}
		
		System.out.println("");
		
		int price = 0;
		
		System.out.print("�������� �����ϰڽ��ϱ�? (1.ī��/2.����) : ");
		int payway = scan.nextInt();		
		
		Payment p1 = new Payment(price, drink, payway, number);
		p1.total_price(drink, Topping);
		p1.What_pay(payway);
		
		System.out.println("");
		
		
	}
}