
public class Cart {
  int customerId;
  int nProducts;
 float  totalPrice;
 private Product[] products;

 public Cart(int customerId,int nProducts){
     this.customerId=customerId;
     this.nProducts=nProducts;
     this.products=new Product[nProducts];


 }

    public Cart(int customerId) {
        this.customerId = customerId;
    }


    public void setnProducts(int nProducts) {
        this.nProducts =Math.abs(nProducts);
        products =new Product[nProducts];
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setProducts(Product[] products) {
        this.products = products;

    }


    public Product[] getProducts() {
        return products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void addProduct(int j,Product product) {
     for (;j<nProducts;j++) {
         if (products[j]==null) {

             products[j] = product;
             break;
         } else {
             System.out.println("Invalid product index. Cannot add product.");
         }


     }
    }


//   public void removeProduct (Product product) {
//       for (int j = 0; j < nProducts; j++) {
//           if (products[j] == product)
//               products[j] = null;
//           break;
//       }
//   }
      public float calculatePrice(){
     totalPrice=0.0F;
           for (int k=0;k<nProducts;k++) {
               if (products[k]!=null) {
                   this.totalPrice += products[k].getPrice();
               }
           }
           return totalPrice;
           }
//    public void placeOrder(int response,Order o) {
//
//        if(response==1){
//     o.printOrderInfo();
//        }
//         if(response==2){
//            System.out.println("Thanks....\n bye");
//
//        }


    }





