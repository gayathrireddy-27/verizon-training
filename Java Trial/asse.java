class asse
{
public static void main(String args[])
{
System.out.println( withdrawMoney(100,500));
System.out.println( withdrawMoney(800,500));
}
static public double withdrawMoney(double balance,double amount)
{
assert balance >=amount;
return balance-amount;
}
}