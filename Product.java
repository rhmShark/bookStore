public class Product {
 protected int productId;
 protected float price;
 protected String name;
public Product(){

}
 public Product (String name, float price, int productId){
     this.name=name;
     this.price=Math.abs(price);
     this.productId=Math.abs(productId );
 }
  public void setProductId(int productId){
      this.productId= Math.abs(productId);
  }
    public void setPrice(float price){
        this.price= Math.abs(price);
    }
    public void setName(String name){
        this.name= name;
    }
    public int getProductId() {
        return productId;
    }
    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
