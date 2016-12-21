import java.util.*;
public class ticket_cw
{
    
    Scanner keyboard = new Scanner(System.in);

    private String firstname;
    private int tickets_purchased;
    private int price;
    private int new_price;

    public ticket_cw()
    {

        
    }

    public void processTicket() {

        //enter firstname
        enterFirstname();
        //enter tickets_bought
        enterTickets_purchased();
        //calculate price
        calculatePrice();
        //calculate new price
        calculateNew_price();
        //decide if they have won the backstage pass
        //display firstname, cost, if they have won the backstage pass
        displayResults();

    }

    public void enterFirstname() {

        System.out.print("Please enter your first name: ");
        firstname = keyboard.nextLine();

    }

    public void enterTickets_purchased() {

        System.out.print("How many tickets have you purchased: ");
        tickets_purchased = Integer.parseInt(keyboard.nextLine());

    }
    
    public void calculatePrice() {
        
        price = 15 * tickets_purchased;
        
    }
    
    public void calculateNew_price() {
        
        new_price = price / 100 * 90;
    }
    
    public void displayResults() {
        
       
    }
}