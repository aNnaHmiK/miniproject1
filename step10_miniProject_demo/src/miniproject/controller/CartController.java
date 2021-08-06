package miniproject.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import miniproject.exception.CartException;
import miniproject.model.dto.CartDTO;
import miniproject.model.dto.Product;
import miniproject.model.dto.Store;
import miniproject.service.CartService;
import miniproject.view.EndView;
import miniproject.view.FailView;

public class CartController {
	
	private static CartController instance = new CartController();
	private CartService service = CartService.getInstance();
	private CartController() {}
	
	public static CartController getInstance() {
		return instance;
	}

	// ��ٱ��� ��ü ��� �˻�
	public void getCartList() {
		ArrayList<CartDTO> CartList = service.getCartList();
		
		if(CartList.size() != 0) {
			EndView.cartListView(CartList);
		}else {
			EndView.messageView("��ٱ��ϰ� ����ֽ��ϴ�:(");
		}
	}
	
	// ��ٱ��� Ư�� ��ǰ �˻�
	public void getProduct(String ProductName) {
		CartDTO Product = service.getCartList(ProductName);
		
		if(Product != null) {
			EndView.cartListView(Product);
		}else {
			EndView.messageView("�˻��Ͻ� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	
	// ���ο� ��ǰ ����
	public void insertProduct(CartDTO newProduct) {
		
		if(newProduct != null) {
			try {
				service.CartInsert(newProduct);
				EndView.messageView("��ǰ ��Ͽ� �����Ͽ����ϴ�.");
			}catch(CartException e) {
				FailView.failMessageView(e.getMessage());
			}
		}
	}
	
	// ��ǰ������ ���� 
	public void deleteProduct(String productName) {
		CartDTO Product = service.getCartList(productName);
		
		if(Product != null) {
			service.productDelete(productName);
			EndView.messageView(productName + " ���� ����");
		}else {
			EndView.messageView("�����ϰ��� �ϴ� ��ǰ�� �����ϴ�.");
		}
	}
	
	// ���� �޴�
	public void createMenu() {
		CartController controller = CartController.getInstance();

		Scanner scan = new Scanner(System.in);
		BufferedReader search = new BufferedReader(new InputStreamReader(System.in));

		boolean finish = false;
		while(!finish) {
			System.out.println("\n===================\n���ϴ� �׸��� ���� �ϼ���.\n1.����ǰ�˻�\n2.��ǰ�˻�\n3.��ǰ�߰�\n4.��ǰ����\n0.����\n===================");
			
			try{
				int number = scan.nextInt();

				if(number == 1) {
					System.out.println("���� ��ٱ��� ����Ʈ�Դϴ�");
					controller.getCartList();
				}
				if(number == 2) {
					System.out.println("��ǰ�� �̸��� �Է��ϼ���: ");
					String pName = search.readLine();
					controller.getProduct(pName);
				}
				if (number == 3) {
					System.out.println("��ǰ�� �߰��մϴ�");
					CartDTO newProduct = new CartDTO("04���ÿ�ġ", 
										 new Product("���ÿ�ġ", 539000, "����", "���ڱ��", "�ڡڡڡڡ�", "���ý�Ʈ��" ),
										 new Store("���ý����", "010-4444-4444", "CJ�ù�", "���� ���μ���" , "���ÿ�ġ" ));
					System.out.println("\n04-1. ���� �� ������Ʈ �˻�");
					controller.getCartList();
					controller.insertProduct(newProduct);
					
					System.out.println("\n04-2. ���� �� �˻�");
					controller.getCartList();
				}
				if (number == 4) {
					System.out.println("������ �����Ͻðھ��?");
					String dName = search.readLine();
					System.out.println(dName + "��(��) �����մϴ�");
					controller.deleteProduct(dName);
				}
				if (number == 0) {
					finish = true;
					System.out.println("��ٱ��� �˻��� �����մϴ�");
				}
			}catch(Exception e) {
				System.out.println("�ش� ��ǰ�� �������� �ʽ��ϴ�.");
				break;
			}
		}
		scan.close();

		try {
			search.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
	



