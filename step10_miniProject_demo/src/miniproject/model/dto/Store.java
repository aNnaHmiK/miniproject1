package miniproject.model.dto;

public class Store {
	//업체명
	private String storeName;
	//연락처
	private String storeContact;
	//운용택배사
	private String delivery;
	//소재지
	private String storeLocation;
	//베스트상품
	private String bestProduct;
	
	public Store() {}
	public Store(String storeName, String storeContact, String delivery, String storeLocation, String bestProduct) {
		super();
		
		this.storeName = storeName;
		this.storeContact = storeContact;
		this.delivery = delivery;
		this.storeLocation = storeLocation;
		this.bestProduct = bestProduct;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreContact() {
		return storeContact;
	}
	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	public String getBestProduct() {
		return bestProduct;
	}
	public void setBestProduct(String bestProduct) {
		this.bestProduct = bestProduct;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("업체명 : ");
		builder.append(storeName);
		builder.append(", 업체 연락처 : ");
		builder.append(storeContact);
		builder.append(", 택배회사 : ");
		builder.append(delivery);
		builder.append(", 소재지 : ");
		builder.append(storeLocation);
		builder.append(", 베스트상품 : ");
		builder.append(bestProduct);
		
		return builder.toString();
	}
}
