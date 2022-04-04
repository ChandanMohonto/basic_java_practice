//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

public class Laptop_purchase_price {
    public static void main(String[] args) {

        String price_3 = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        price_3 = price_3.replaceAll("[^\\d]", " ");
        price_3 = price_3.trim();
        price_3 = price_3.replaceAll(" +", " ");
        String[] arr = (price_3.split(" "));
        double laptop_price = Double.parseDouble(arr[1]);
        double discount_persent = Double.parseDouble(arr[2]);

        double discount_price;
        double total_discount_price;
         discount_price = ((laptop_price*discount_persent)/100 );
         total_discount_price =( laptop_price - discount_price);

        System.out.println(" Discount is : " + discount_price + " taka" );
        System.out.println(" After discount " + discount_price + " taka the laptop price is "  + " = " + total_discount_price + " taka");



    }


}
