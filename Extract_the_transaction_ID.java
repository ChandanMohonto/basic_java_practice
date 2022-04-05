//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>

public class Extract_the_transaction_ID {
    public static void main(String[] args) {
        String colon = "Your trnx is successful. Trnx Id is: TXN123456";  //Splitting colon separated String in Java
        String[] strings = colon.split(":",0);

        for (String strs: strings) {
            System.out.println(strs);
        }

    }
}
