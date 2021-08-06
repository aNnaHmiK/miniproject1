package miniproject.model.dto;

public class CartDTO {

	private String productName;
	private Product product;
	private Store store;
	
	public CartDTO() {
		super();
	}
	
	public CartDTO(String productName, Product product, Store store) {
		super();
		this.productName = productName;
		this.product = product;
		this.store = store;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("[��ٱ��� ���]");
		builder.append(productName);
		builder.append("\t[��ǰ ����]");
		builder.append(product);
		builder.append("\t[��ü ����]");
		builder.append(store);
		
		return builder.toString();		
	}
}
