package logic.functions;

public class productDetails {
		private String itemPrice;
		private String productName;
		
		productDetails(String productName, String itemPrice) {
			productName = this.productName;
			itemPrice = this.itemPrice;
		}
		
		public String GetproductName() {
			return this.productName;
		}
		
		public String GetitemPrice() {
			return this.itemPrice;
		}
		
		public void SetproductName(String productName) {
			productName = this.productName;
		}
		
		public void SetitemPrice(String itemPrice) {
			itemPrice = this.itemPrice;
		}
		
}
