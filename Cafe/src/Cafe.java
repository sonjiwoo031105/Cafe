import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Answer = 0;
		
		System.out.print("1.아메리카노 (3000)		");
		System.out.print("2.카페라떼 (3500)		");
		System.out.print("3.카푸치노 (4000)		");
		System.out.println("4.카페모카 (4000) ");
		System.out.print("5.초코 밀크티 (4000)		");
		System.out.print("6.타로 밀크티 (4000) 	");
		System.out.print("7.녹차 밀크티 (4500) 	");
		System.out.println("8.흑당 밀크티 (4500) ");
		System.out.print("어떤 음료로 하시겠습니까? : ");
		int drink = scan.nextInt(); 
		
		System.out.println("");
		System.out.println("사이즈를 무엇으로 하시겠습니까?");
		System.out.print("M ,L ,XL : ");
		String size = scan.next();
		
		System.out.println("");
		System.out.println("1.HOT  2.ICE");
		System.out.print("숫자를 입력하시오 : ");
		int temp = scan.nextInt();
		
		System.out.println("");
		System.out.print("음료의 갯수는 몇개로 드릴까요? : ");
		int number = scan.nextInt();
		
		System.out.println("");
		System.out.println("매장에서 드시고 가실건가요? take out 하실껀가요?");
		System.out.print("매장은 1번, take out은 2번을 눌러주세요 : ");
		int where_eat = scan.nextInt();
		
		System.out.println("");
		System.out.print("토핑을 추가하시겠습니까? (y/n) : ");
		String Topping = scan.next();
		
		System.out.println("");
		if(Topping.equals("y") || Topping.equals("Y")) {
			if(drink == 1 || drink == 2 || drink == 3 || drink == 4) {
				System.out.println("1. 샷 추가(+500)	2. 시럽 추가(+500)"); 
				System.out.print("무엇을 추가하시겠습니까? : ");
				Answer = scan.nextInt();
			}else if(drink == 5 || drink == 6 || drink == 7 || drink == 8) {
				System.out.println("1. 타피오카펄 추가(+500)   2. 치즈폼 추가(+500)   3. 코코넛 젤리 추가(+500)");
				System.out.print("무엇을 추가하시겠습니까? : ");
				Answer = scan.nextInt();
			}
		}
		else if(Topping.equals("n") || Topping.equals("N")){
			System.out.println("토핑을 추가하지 않습니다.");
		}
		
		System.out.println("");
		
		int price = 0;
		
		System.out.print("무엇으로 결제하겠습니까? (1.카드/2.현금) : ");
		int payway = scan.nextInt();		
		
		Payment p1 = new Payment(price, drink, payway, number);
		p1.total_price(drink, Topping);
		p1.What_pay(payway);
		
		System.out.println("");
		
		
	}
}
