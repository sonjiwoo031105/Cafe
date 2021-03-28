import java.util.Scanner;

class AddOrder {
	private String Topping;
	private int Drink;
	private int Answer;
	
	Scanner scan = new Scanner(System.in);
	
	public AddOrder (String Topping, int Drink, int Answer) {
		this.Topping = Topping;
		this.Drink = Drink;
		this.Answer = Answer;
	}
	
	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		Topping = topping;
	}

	public int getDrink() {
		return Drink;
	}
	public void setDrink(int drink) {
		Drink = drink;
	}

	public int getAnswer() {
		return Answer;
	}
	public void setAnswer(int answer) {
		Answer = answer;
	}

	public void Choice_Drink() {
		System.out.print("1.�Ƹ޸�ī�� (3000)		");
		System.out.print("2.ī��� (3500)		");
		System.out.print("3.īǪġ�� (4000)		");
		System.out.println("4.ī���ī (4000) ");
		System.out.print("5.���� ��ũƼ (4000)		");
		System.out.print("6.Ÿ�� ��ũƼ (4000) 	");
		System.out.print("7.���� ��ũƼ (4500) 	");
		System.out.println("8.��� ��ũƼ (4500) ");
		System.out.print("� ����� �Ͻðڽ��ϱ�? : ");
		
		Drink = scan.nextInt(); 

		switch(Drink) {
		case 1 : System.out.println("�Ƹ޸�ī���Դϴ�."); break;
		case 2 : System.out.println("ī����Դϴ�."); break;
		case 3 : System.out.println("īǪġ���Դϴ�."); break;
		case 4 : System.out.println("ī���ī�Դϴ�."); break;
		case 5 : System.out.println("���� ��ũƼ�Դϴ�."); break;
		case 6 : System.out.println("Ÿ�� ��ũƼ�Դϴ�."); break;
		case 7 : System.out.println("���� ��ũƼ�Դϴ�."); break;
		case 8 : System.out.println("��� ��ũƼ�Դϴ�."); break;
		}
	}
	
	public void Add_Topping() {
		System.out.print("������ �߰��Ͻðڽ��ϱ�? (y/n) : ");
		
		Topping = scan.next();
		
		if(Topping.equals("y") || Topping.equals("Y")) {
			System.out.println("������ �߰��Ͻðڽ��ϱ�?");
			System.out.println("1. �� �߰�");
			System.out.println("2. �÷� �߰�");
			System.out.println("3. Ÿ�ǿ�ī�� �߰�");
			System.out.println("4. ġ���� �߰�");
			System.out.println("5. ���ڳ� ���� �߰�");
			Answer = scan.nextInt();
				switch(Answer) {
				case 1 : System.out.println("���߰��� �մϴ�."); break;
				case 2 : System.out.println("�÷��� �߰��մϴ�."); break;
				case 3 : System.out.println("Ÿ�ǿ�ī���� �߰��մϴ�."); break;
				case 4 : System.out.println("ġ������ �߰��մϴ�."); break;
				case 5 : System.out.println("���ڳ� ������ �߰��մϴ�."); break;
				}
		}
		else if(Topping == "n" || Topping == "N") {
			System.out.println("������ �߰����� �ʾҽ��ϴ�.");
		}
	}
}
