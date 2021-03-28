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
		System.out.println("사이즈는 무엇으로 하시겠습니까?");
		System.out.print("M ,L ,XL : ");
		
		size = scan.next();	
		
		System.out.print("음료의 갯수는 몇개로 드릴까요? : ");
		
		number = scan.nextInt();
	}
	
	public void HOTorICE() {
		System.out.println("1.HOT  2.ICE");
		System.out.print("숫자를 입력하시오 : ");
		
		temp = scan.nextInt();
		
		if(temp == 1) {
			System.out.println("뜨거운 것으로 준비해드리겠습니다.");
		}else if(temp == 2) {
			System.out.println("아이스로 준비해드리겠습니다.");
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
	
	public void Choice_eat() {
		System.out.println("매장에서 드시고 가실건가요? take out 하실껀가요?");
		System.out.print("매장은 1번, take out은 2번을 눌러주세요 : ");
		
		where_eat = scan.nextInt();
		
		if(where_eat == 1) {
			System.out.println("매장컵으로 준비해 드리겠습니다.");
		}else if(where_eat == 2) {
			System.out.println("일회용 컵으로 준비해 드리겠습니다.");
		}else {
			System.out.println("숫자를 잘못 입력하였습니다.");
		}
	}
	
	@Override
	public String toString() {
		return "사이즈는 " + size + ", 음료의 갯수는 " + number + "잔이며, ";
	}
}
