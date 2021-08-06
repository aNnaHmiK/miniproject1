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
	
	// ��� ��ǰ �˻�
	public ArrayList<CartDTO> getCartList(){
		return CartListdata.getCartList();
	}
	
	// ��ǰ �̸����� �˻�
	public CartDTO getCartList(String productName) {
		ArrayList<CartDTO> productCartList = CartListdata.getCartList();

		for (CartDTO cartList : productCartList) {
			if (cartList.getProductName().contains(productName)) {	//equals �� �ϸ� ����� �̸��� ���缭 �˻��ؾ�������, contains�� ����ϸ� �׾ȿ� ���Ե� �ܾ �˻��ص� ã�� �� �ִ�.
				return cartList;
			}
		}
		return null;
	}
	
	// ���ο� ��ǰ �߰�
	public void CartInsert(CartDTO newCart) throws CartException{
		CartDTO CartList = getCartList(newCart.getProductName());
		
		if (CartList != null) {
			throw new CartException("�ش� ��ǰ�� ������ ��ǰ�� �̹� �����Ͽ�, ������ �߻��Ͽ����ϴ�.");
		}
		CartListdata.insertProduct(newCart);
	}
	
	// ��ǰ ����
	public void productDelete(String productName) {
		CartDTO product = getCartList(productName);
		
		getCartList().remove(product);
	}
	
}
