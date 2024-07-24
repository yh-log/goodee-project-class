package test.ex05_again;

public class OtherCode {
	
//	https://school.programmers.co.kr/learn/courses/30/lessons/120830/solution_groups?language=java
//	나중에 코드 해석해보기 (주석 달아서)
	
	   public int solution(int n, int k) {
	        int lambTotalPrice = totalPrice(Menu.LAMB, n);
	        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
	        int discountPrice = discount(Menu.DRINK, n);

	        int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
	        return totalPay;
	    }

	    private int totalPrice(Menu menu, int quantity) {
	     return menu.getPrice() * quantity;   
	    }

	    private int discount(Menu menu, int lambQuantity) {
	        // 양꼬치 10인분에 음료수 하나
	        int point = lambQuantity / 10;

	        return menu.getPrice() * point;
	    }
	}

	enum Menu {

	    LAMB("양꼬치", 12000),
	    DRINK("음료수", 2000);

	    private final String name;
	    private final int price;

	    Menu(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getPrice() {
	        return price;
	    }
	}
	

//	또 다른 사람 코드 -> 만약에 범위 설정을 해줘야 하는 코드면 어떻게해야할지 생각해보기
//	class Solution {
//	    public int solution(int n, int k) {
//	        return n * 12000 + k * 2000 - (n / 10 * 2000);
//	    }
//	}



