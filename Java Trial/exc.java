import java.io.*;
class exc
{
public static void main(String args[]) throws Exception
{
try{
FileReader f=new FileReader("a.txt");
}
catch (IOException ie)
{System.out.println("ioexception");
}
catch (Exception e)
{
System.out.println("parent exception");
}}}