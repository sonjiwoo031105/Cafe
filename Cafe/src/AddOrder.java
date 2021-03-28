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
		System.out.print("1.아메리카노 (3000)		");
		System.out.print("2.카페라떼 (3500)		");
		System.out.print("3.카푸치노 (4000)		");
		System.out.println("4.카페모카 (4000) ");
		System.out.print("5.초코 밀크티 (4000)		");
		System.out.print("6.타로 밀크티 (4000) 	");
		System.out.print("7.녹차 밀크티 (4500) 	");
		System.out.println("8.흑당 밀크티 (4500) ");
		System.out.print("어떤 음료로 하시겠습니까? : ");
		
		Drink = scan.nextInt(); 

		switch(Drink) {
		case 1 : System.out.println("아메리카노입니다."); break;
		case 2 : System.out.println("카페라떼입니다."); break;
		case 3 : System.out.println("카푸치노입니다."); break;
		case 4 : System.out.println("카페모카입니다."); break;
		case 5 : System.out.println("초코 밀크티입니다."); break;
		case 6 : System.out.println("타로 밀크티입니다."); break;
		case 7 : System.out.println("녹차 밀크티입니다."); break;
		case 8 : System.out.println("흑당 밀크티입니다."); break;
		}
	}
	
	public void Add_Topping() {
		System.out.print("토핑을 추가하시겠습니까? (y/n) : ");
		
		Topping = scan.next();
		
		if(Topping.equals("y") || Topping.equals("Y")) {
			System.out.println("무엇을 추가하시겠습니까?");
			System.out.println("1. 샷 추가");
			System.out.println("2. 시럽 추가");
			System.out.println("3. 타피오카펄 추가");
			System.out.println("4. 치즈폼 추가");
			System.out.println("5. 코코넛 젤리 추가");
			Answer = scan.nextInt();
				switch(Answer) {
				case 1 : System.out.println("샷추가를 합니다."); break;
				case 2 : System.out.println("시럽을 추가합니다."); break;
				case 3 : System.out.println("타피오카펄을 추가합니다."); break;
				case 4 : System.out.println("치즈폼을 추가합니다."); break;
				case 5 : System.out.println("코코넛 젤리를 추가합니다."); break;
				}
		}
		else if(Topping == "n" || Topping == "N") {
			System.out.println("토핑을 추가하지 않았습니다.");
		}
	}
}
