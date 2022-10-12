class Theatre1
{
void bookTicket(int amount)
{
System.out.println("Balance is" + (amount-120));
}
}
class Customer
{
public static void main (String[] args)
{
Theatre1 theatre=new Theatre1();
theatre.bookTicket(200);
}
}
