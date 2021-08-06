package miniproject.model.dto;

public class Product {
	// 상품명
	private String productName;
	// 가격
	private int Price;
	// 배송비 무료여부
	private String shippingFee;
	// 상품 카테고리
	private String category;
	// 구매후기(별점)
	private String grade;
	// 추천관련상품
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
		
		builder.append("상품명 : ");
		builder.append(productName);
		builder.append(", 상품가격 : ");
		builder.append(Price);
		builder.append(", 배송비 : ");
		builder.append(shippingFee);
		builder.append(", 카테고리 : ");
		builder.append(category);
		builder.append(", 구매후기 (별점) : ");
		builder.append(grade);
		builder.append(", 추천 관련 상품 : ");
		builder.append(recommendation);
		
		return builder.toString();
	}
}
