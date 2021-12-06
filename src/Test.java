import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de cuentas:");
        int max = sc.nextInt();
        sc.nextLine();
      
        Date date = new Date();
        Bank bank = new Bank(max);
        int counter = 0;
        
        do{
            System.out.println("Ingresa la cantidad de tarjetas:");
            int numberOfCards = sc.nextInt();
            sc.nextLine();
            
            Account account = new Account("0000142", 120, date.toString(), numberOfCards);
            for(int i = 0; i<numberOfCards; i++){
                Card card = new Card("01101", date.toString(), "visa");
                account.addCard(card, i);
            }
            
            bank.addAccount(account, counter);
            counter++;
        }while(counter < max);
        
        bank.convertToString();
    }
}
