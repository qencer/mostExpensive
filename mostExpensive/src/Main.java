public class Main {
          public static void main(String[] args) {

                                            // A program that works to determine
                                            // the price of the most expensive item in a warehouse

            int price1 = 40;                // 1st item value set at $40
            int price2 = 70;                // 2st item value set at $70
            int price3 = 60;                // 3st item value set at $60
            int price4 = 50;                // 4st item value set at $50
            int price5 = 10;                // 5st item value set at $10
            int mostExpensive = price1;     // 1st item the product to the system as 'mostExpensive'

            if (mostExpensive<price2){      // If item 2st is more expensive than item 1st, define item 2st as 'mostExpensive'
                mostExpensive = price2;
            }

            if (mostExpensive<price3){      // If item 3st is more expensive than item 2st, define item 3st as 'mostExpensive'
                mostExpensive = price3;
            }

            if (mostExpensive<price4){      // If item 4st is more expensive than item 3st, define item 4st as 'mostExpensive'
                mostExpensive = price4;
            }

            if (mostExpensive<price5){      // If item 5st is more expensive than item 4st, define item 5st as 'mostExpensive'
                mostExpensive = price5;
            }

            System.out.println("Most Expensive ="+mostExpensive);     // Print the 'most expensive' product as a line to the output of the system
        }


}