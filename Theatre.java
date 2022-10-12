class Theatre 
{
public static void main(String[] args)
{
Theatre preethi = new Theatre();
int balance_amount = preethi.bookTicket(200); 
System.out.println("After booking ticket " + balance_amount);
}
int bookTicket(int ticket) 
{
int ticket_price = 120;
int balance = ticket-ticket_price;
return balance; 
}
}
