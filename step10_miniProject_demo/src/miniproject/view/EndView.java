package miniproject.view;

import java.util.ArrayList;

import miniproject.model.dto.CartDTO;

public class EndView {
	
	// 모든 상품 출력
	public static void cartListView(ArrayList<CartDTO> allCartList) {
		for(CartDTO CartList : allCartList) {
			System.out.println(CartList);
		}
	}
	
	//특정 상품 출력
	public static void cartListView(CartDTO CartList) {
		System.out.println(CartList); 
	}
	
	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}
}
