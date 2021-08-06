package miniproject.model;

import java.util.ArrayList;

import miniproject.model.dto.CartDTO;
import miniproject.model.dto.Product;
import miniproject.model.dto.Store;

public class CartModel {
	private static CartModel instance = new CartModel();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	
	private CartModel() {
		cartList.add(new CartDTO("01��Ź���̺�", 
					 new Product("��Ź���̺�", 150000, "����", "����", "�ڡڡڡڡ� ", "�����"),
					 new Store("���̿��۴�ó", "010-1111-1111", "����", "��⵵ ��õ��", "��Ź���̺�")));
		cartList.add(new CartDTO("02������", 
					 new Product("������", 1350000, "����", "���ڱ��", "�ڡڡڡڡ� ", "���̽�"),
					 new Store("���ý����", "010-2222-2222", "CJ", "���μ���", "����������")));
		cartList.add(new CartDTO("03����", 
					 new Product("����ġ����", 23000, "2õ��", "���׸����ǰ", "�ڡڡڡ١� ", "���"),
					 new Store("�ε�", "010-3333-3333", "��ü��", "��󳲵� �λ�", "�Ƿη�����")));
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
