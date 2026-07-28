import java.util.Scanner; 

enum Coin{
    One(1),
    Two(2),
    Five(5),
    Ten(10),

    private int value;

    Coin(value){
        this.value = value;
    }

}

public class VendingMachine{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int snackCost = 15;
        int total = 0;
        
        System.out.println("Snack's Cost is :" + snackCost);

        
        while (total < snackCost){
            
            System.out.println("Enter Coin : One, Two, Five, Ten");

            Coin coin = Coin.valueof(sc.next().toUpperCase());

            int Value = switch(Coin){
                case One -> 1;
                case Two -> 2;
                case Five -> 5;
                case Ten -> 10;
            };

            total += Value;

            System.out.println("Total Coin Cost :" + total);
        }

        System.out.println("Paid");
        System.out.println("Change : "+ (total-snackCost));

        sc.close();
    }
}
