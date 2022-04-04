//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
//   If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
//   After your purchase what will be your total cost?
import java.util.Scanner;

public class Total_cost_of_shirt_sharee {
    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk." +
                " If you buy 2 shirt and 1 sharee, then 400 tk will be discounted." +
                " After your purchase what will be your total cost?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double shirt_price = Double.parseDouble(arr[0]);
        double sharee_price = Double.parseDouble(arr[1]);
        double shirt_quantity = Double.parseDouble(arr[2]);
        double sharee_quantity = Double.parseDouble(arr[3]);
        double discount= Double.parseDouble(arr[4]);

        double total = shirt_price + sharee_price;

        double UserIn_1;
        double  UserIn_2;

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter how many shirt and sharee do you buy : ");
        System.out.print(" 1. Enter Number of Shirt : ");
        UserIn_1 = input.nextDouble();
        System.out.print(" 2. Enter Number of Sharee : ");
        UserIn_2 = input.nextDouble();


        if ( shirt_quantity == UserIn_1 && sharee_quantity == UserIn_2   ) {
            double discount_price;
            discount_price = ( total - discount);
            System.out.println("After  Discount Your Price is : " + discount_price);
        } else {
            System.out.println("Total price is : " + total);
        }

        // **************      please ignore this comments   ****************
        //      System.out.println(" " + shirt_quantity);
        //       System.out.println(" " + sharee_quantity);
        //       System.out.println(" " + discount);
        //       System.out.println(" " + total);


    }
}
