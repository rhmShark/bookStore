import java.util.Scanner;
public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        Customer customer=new Customer();


        System.out.println("Welcome to the E-commerce System!\nPlease enter your ID");
        int ID= input.nextInt();
        input.nextLine();

        System.out.println("Please enter your name");
        String studentName= input.nextLine();
        System.out.println("Please enter your address");
        String studentAddress= input.nextLine();

        Customer c = new Customer(ID, studentName, studentAddress);

        Product electronic=new ElectronicProduct(1,"Smart phone",599.9F,"Samsung",2);
        Product cloth=new ClothingProduct(2,"T-shirt",19.99F,"Medium","Cotton");
        Product book= new BookProduct(3,"oop",39.99F,"O'Reilly","X Publications");
        System.out.println("How many products you want to add to your cart");
        int n = input.nextInt();

      Cart c1=new Cart(customer.getCustomerId(), n);


        for (int i =0; i< c1.getnProducts(); i++){
            System.out.println("Which product would you like to add? 1- Smart phone 2- T-shirt 3- OOP");
            int choice= input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                   c1.addProduct(i,electronic);
                   break;
                case 2:
                    c1.addProduct(i,cloth);

                    break;
                case 3:
                    c1.addProduct(i,book);

                    break;
                default:
                    System.out.println("Invalid product ID please retry with valid one");
                    i--; // Decrement i to retry this iteration
                    continue;

            }


        }


        System.out.println(" Your total is: $" + c1.calculatePrice());

        System.out.println("Do you want to place your order? 1-YES 2-NO");
        int response=input.nextInt();
        if (response==1) {
            Order order = new Order(c.getCustomerId(),1, c1.totalPrice, c1.getnProducts(),c1.getProducts()); // Create Order with customer ID

            order.printOrderInfo();



        } else {
            System.out.println("order canceled ");
        }
        }

    }

