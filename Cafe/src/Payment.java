import java.util.Scanner;

class Payment {
	private int price;		//가격
	private int drinkpay;	//음료수 가격
	private int payway;		//결제수단
	private int num;
	
	Scanner scan = new Scanner(System.in);
	
	public Payment(int price, int drink, int payway, int number) {
		this.price = price;
		this.drinkpay = drink;
		this.payway = payway;
		this.num = number;
	} 
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getDrinkpay() {
		return drinkpay;
	}
	public void setDrinkpay(int drinkpay) {
		this.drinkpay = drinkpay;
	}

	public int getPayway() {
		return payway;
	}
	public void setPayway(int payway) {
		this.payway = payway;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public void What_pay(int payway) {		
		if(payway == 1) {
			System.out.println("카드결제입니다.");
		}
		else if(payway == 2) {
			System.out.println("현금결제입니다.");
		}
	} 
	
	public void total_price(int drink, String Topping) {
		switch(drink) {
		case 1 : drinkpay = 3000; break;
		case 2 : drinkpay = 3500; break;
		case 3 : case 4: case 5: case 6: 
			drinkpay = 4000; break;
		case 7 : case 8: drinkpay = 4500; break;
		}
		if(Topping.equals("y") || Topping.equals("Y")) {
			int toppingpay = 500;
			price = drinkpay+ toppingpay;
			System.out.print("총 지불해야 할 금액은 " + (price*num) + "원이며, ");
		}
		else if(Topping.equals("N") || Topping.equals("n")) {
			price = drinkpay;
			System.out.print("총 지불해야 할 금액은 " + (price*num) + "원이며, ");
		}
	} 
}