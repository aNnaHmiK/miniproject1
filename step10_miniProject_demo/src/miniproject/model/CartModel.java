package miniproject.model;

import java.util.ArrayList;

import miniproject.model.dto.CartDTO;
import miniproject.model.dto.Product;
import miniproject.model.dto.Store;

public class CartModel {
	private static CartModel instance = new CartModel();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	
	private CartModel() {
		cartList.add(new CartDTO("01협탁테이블", 
					 new Product("협탁테이블", 150000, "무료", "가구", "★★★★☆ ", "무드등"),
					 new Store("오이엔퍼니처", "010-1111-1111", "한진", "경기도 이천시", "협탁테이블")));
		cartList.add(new CartDTO("02아이폰", 
					 new Product("아이폰", 1350000, "무료", "전자기기", "★★★★★ ", "케이스"),
					 new Store("애플스토어", "010-2222-2222", "CJ", "가로수길", "에어팟프로")));
		cartList.add(new CartDTO("03인형", 
					 new Product("어피치인형", 23000, "2천원", "인테리어소품", "★★★☆☆ ", "쿠션"),
					 new Store("인디샵", "010-3333-3333", "우체국", "경상남도 부산", "뽀로로인형")));
	}

	public static CartModel getInstance() {
		return instance;
	}
	
	public ArrayList<CartDTO> getCartList(){
		return cartList;
	}
	
	public void insertProduct(CartDTO newProduct) {
		cartList.add(newProduct);
	}
}
