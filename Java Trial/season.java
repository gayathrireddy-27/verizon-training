import java.util.Scanner;
class season
{
public static void main(String args[])
{
Scanner n= new Scanner(System.in);
System.out.print("enter a number");
int num=n.nextInt();
switch(num){
case 1:
System.out.println("winter");
break;
case 2: 
case 3:
case 4:
case 5:
System.out.println("summer");
break;
case 6:
case 7:
case 8:
case 9:
System.out.println("rainy");
break;
case 10:
case 11:
case 12:
System.out.println("winter");
break;
}
}}