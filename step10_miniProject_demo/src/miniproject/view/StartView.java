package miniproject.view;

import miniproject.controller.CartController;

public class StartView {

	public static void main(String[] args) {
		CartController controller = CartController.getInstance();
		controller.createMenu();
	}
}