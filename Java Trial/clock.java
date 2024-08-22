import java.util.Scanner;
class clock{
public static void main(String args[]) throws Exception
{
Scanner c= new Scanner(System.in);
System.out.println("enter hours,mins,secs");
int h=c.nextInt();
int m=c.nextInt();
int s=c.nextInt();
System.out.println("clock");
System.out.println("============");
System.out.println("hours:mins:sec");
for(h=h;h<24;h++)
{
for(m=m;m<60;m++)
{
for(s=s;s<60;s++)
{
System.out.print(h +":" + m +":" + s +"\r");
Thread.sleep(1000);
}s=0;
}m=0;
}h=0;
}}

