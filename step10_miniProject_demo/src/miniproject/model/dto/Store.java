package miniproject.model.dto;

public class Store {
	//��ü��
	private String storeName;
	//����ó
	private String storeContact;
	//����ù��
	private String delivery;
	//������
	private String storeLocation;
	//����Ʈ��ǰ
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
		
		builder.append("��ü�� : ");
		builder.append(storeName);
		builder.append(", ��ü ����ó : ");
		builder.append(storeContact);
		builder.append(", �ù�ȸ�� : ");
		builder.append(delivery);
		builder.append(", ������ : ");
		builder.append(storeLocation);
		builder.append(", ����Ʈ��ǰ : ");
		builder.append(bestProduct);
		
		return builder.toString();
	}
}
