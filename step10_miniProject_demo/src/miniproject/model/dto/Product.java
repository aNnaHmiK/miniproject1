package miniproject.model.dto;

public class Product {
	// ��ǰ��
	private String productName;
	// ����
	private int Price;
	// ��ۺ� ���Ῡ��
	private String shippingFee;
	// ��ǰ ī�װ�
	private String category;
	// �����ı�(����)
	private String grade;
	// ��õ���û�ǰ
	private String recommendation;
	
	public Product() { }
	public Product(String productName, int Price, String shippingFee, String category, String grade,
			String recommendation) {
		super();
		
		this.productName = productName;
		this.Price = Price;
		this.shippingFee = shippingFee;
		this.category = category;
		this.grade = grade;
		this.recommendation = recommendation;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	public String getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(String shippingFee) {
		this.shippingFee = shippingFee;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("��ǰ�� : ");
		builder.append(productName);
		builder.append(", ��ǰ���� : ");
		builder.append(Price);
		builder.append(", ��ۺ� : ");
		builder.append(shippingFee);
		builder.append(", ī�װ� : ");
		builder.append(category);
		builder.append(", �����ı� (����) : ");
		builder.append(grade);
		builder.append(", ��õ ���� ��ǰ : ");
		builder.append(recommendation);
		
		return builder.toString();
	}
}
