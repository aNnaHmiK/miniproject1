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

	// 장바구니 전체 목록 검색
	public void getCartList() {
		ArrayList<CartDTO> CartList = service.getCartList();
		
		if(CartList.size() != 0) {
			EndView.cartListView(CartList);
		}else {
			EndView.messageView("장바구니가 비어있습니다:(");
		}
	}
	
	// 장바구니 특정 상품 검색
	public void getProduct(String ProductName) {
		CartDTO Product = service.getCartList(ProductName);
		
		if(Product != null) {
			EndView.cartListView(Product);
		}else {
			EndView.messageView("검색하신 상품은 존재하지 않습니다.");
		}
	}
	
	// 새로운 상품 저장
	public void insertProduct(CartDTO newProduct) {
		
		if(newProduct != null) {
			try {
				service.CartInsert(newProduct);
				EndView.messageView("상품 등록에 성공하였습니다.");
			}catch(CartException e) {
				FailView.failMessageView(e.getMessage());
			}
		}
	}
	
	// 상품명으로 삭제 
	public void deleteProduct(String productName) {
		CartDTO Product = service.getCartList(productName);
		
		if(Product != null) {
			service.productDelete(productName);
			EndView.messageView(productName + " 삭제 성공");
		}else {
			EndView.messageView("삭제하고자 하는 상품이 없습니다.");
		}
	}
	
	// 실행 메뉴
	public void createMenu() {
		CartController controller = CartController.getInstance();

		Scanner scan = new Scanner(System.in);
		BufferedReader search = new BufferedReader(new InputStreamReader(System.in));

		boolean finish = false;
		while(!finish) {
			System.out.println("\n===================\n원하는 항목을 선택 하세요.\n1.모든상품검색\n2.상품검색\n3.상품추가\n4.상품삭제\n0.종료\n===================");
			
			try{
				int number = scan.nextInt();

				if(number == 1) {
					System.out.println("현재 장바구니 리스트입니다");
					controller.getCartList();
				}
				if(number == 2) {
					System.out.println("상품의 이름을 입력하세요: ");
					String pName = search.readLine();
					controller.getProduct(pName);
				}
				if (number == 3) {
					System.out.println("상품을 추가합니다");
					CartDTO newProduct = new CartDTO("04애플워치", 
										 new Product("애플워치", 539000, "무료", "전자기기", "★★★★★", "애플스트랩" ),
										 new Store("애플스토어", "010-4444-4444", "CJ택배", "서울 가로수길" , "애플워치" ));
					System.out.println("\n04-1. 저장 전 프로젝트 검색");
					controller.getCartList();
					controller.insertProduct(newProduct);
					
					System.out.println("\n04-2. 저장 후 검색");
					controller.getCartList();
				}
				if (number == 4) {
					System.out.println("무엇을 삭제하시겠어요?");
					String dName = search.readLine();
					System.out.println(dName + "을(를) 삭제합니다");
					controller.deleteProduct(dName);
				}
				if (number == 0) {
					finish = true;
					System.out.println("장바구니 검색을 종료합니다");
				}
			}catch(Exception e) {
				System.out.println("해당 상품은 존재하지 않습니다.");
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
	



