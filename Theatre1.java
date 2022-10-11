class Theatre1 
{ 
public static void main(String[] args) 
{ 
Theatre1 raja =new Theatre1(); 
int balance = raja.bookTicket(200);
 } 
int bookTicket(int price)
 { 
int ticket_price=120; 
int balance= price-ticket_price; 
System.out.println("Balance amount"+balance);
 return balance;
 } 
}
