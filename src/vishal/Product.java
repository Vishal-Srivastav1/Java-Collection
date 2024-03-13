package vishal;
//GenerallStore -->products



public class Product {
  private int ProductId;
  private String ProductName;
  private int Qty;
  private double PriceperKG,OverAllPrice;
  private  int Count;
  
	public Product(int count,int productId, String productName, int qty,double priceperKG,double overAllPrice) {
		this.Count=count;
		this.ProductId = productId;
		this.ProductName = productName;
		this.Qty = qty;
		this.PriceperKG = priceperKG;
		this.OverAllPrice=overAllPrice;
		
	}
	


	 public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public double getPriceperKG() {
		return PriceperKG;
	}

	public void setPriceperKG(float priceperKG) {
		PriceperKG = priceperKG;
	}

	public double getOverAllPrice() {
		return OverAllPrice;
	}

	public void setOverAllPrice(float overAllPrice) {
		OverAllPrice = overAllPrice;
	}


	 //displayFormat  
                public static void displayFormat()   
                {  
                   
                    System.out.format("-----------------------------------------------------------------------------------------------------------------");  
                    System.out.print("\n|NO\t Product ID \t\t  Name\t\tQuantity\t\tRate \t\t\tTotal Price\t|\n");  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------\n");  
                }  
                   
                // display  
                public void display()   
                {               
                    System.out.format("| %-9s %-9s             %-9s      %5d               %9.2f             %11.2f\t\t|\n" ,Count,ProductId,ProductName,Qty,PriceperKG,OverAllPrice);  
                }  
    }  
	
    
     

