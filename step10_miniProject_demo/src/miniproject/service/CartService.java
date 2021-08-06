package miniproject.service;

import java.util.ArrayList;

import miniproject.exception.CartException;
import miniproject.model.CartModel;
import miniproject.model.dto.CartDTO;
//import miniproject.view.EndView;

public class CartService {

	private static CartService Instance = new CartService();

	private CartModel CartListdata = CartModel.getInstance();
	private CartService() {}
	public static CartService getInstance() {
		return Instance;
	}
	
	// 모든 상품 검색
	public ArrayList<CartDTO> getCartList(){
		return CartListdata.getCartList();
	}
	
	// 상품 이름으로 검색
	public CartDTO getCartList(String productName) {
		ArrayList<CartDTO> productCartList = CartListdata.getCartList();

		for (CartDTO cartList : productCartList) {
			if (cartList.getProductName().contains(productName)) {	//equals 로 하면 저장된 이름을 맞춰서 검색해야하지만, contains를 사용하면 그안에 포함된 단어만 검색해도 찾을 수 있다.
				return cartList;
			}
		}
		return null;
	}
	
	// 새로운 상품 추가
	public void CartInsert(CartDTO newCart) throws CartException{
		CartDTO CartList = getCartList(newCart.getProductName());
		
		if (CartList != null) {
			throw new CartException("해당 상품과 동일한 상품이 이미 존재하여, 문제가 발생하였습니다.");
		}
		CartListdata.insertProduct(newCart);
	}
	
	// 상품 삭제
	public void productDelete(String productName) {
		CartDTO product = getCartList(productName);
		
		getCartList().remove(product);
	}
	
}
