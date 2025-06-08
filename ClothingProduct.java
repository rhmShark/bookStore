public class ClothingProduct extends Product{
 private String size;
 private  String fabric;
    public ClothingProduct(int productId, String name, float price, String size, String fabric) {
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.size = size;
        this.fabric = fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
