package miniproject.view;

import java.util.ArrayList;

import miniproject.model.dto.CartDTO;

public class EndView {
	
	// ��� ��ǰ ���
	public static void cartListView(ArrayList<CartDTO> allCartList) {
		for(CartDTO CartList : allCartList) {
			System.out.println(CartList);
		}
	}
	
	//Ư�� ��ǰ ���
	public static void cartListView(CartDTO CartList) {
		System.out.println(CartList); 
	}
	
	// ���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}
}
