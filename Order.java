public class Order {
   int  customerId;
  int orderId;
    public   Product[] products;
  public float totalPrice;
   int nProducts;
  public Order(){

  }
 public Order(int customerId){
     this.customerId=customerId;

 }
 public Order(int customerId,int orderId, float totalPrice, int nProducts, Product[] products){

      this.orderId=Math.abs(orderId);
     this.customerId= Math.abs(customerId);
     this.totalPrice=totalPrice;
     this.nProducts=Math.abs(nProducts);
     this.products=products;

     }
    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void printOrderInfo() {

        System.out.println("Here is your order's summary\nOrder ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");

            for (int k = 0; k < nProducts; k++) {
                if (products[k] != null) {
                    System.out.println("- " + products[k].getName() + " ($" + products[k].getPrice() + ")");
                }
            }
            System.out.println("Total Price: $" + totalPrice);
            System.out.println();

    }


}

