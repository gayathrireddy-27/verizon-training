class person
{
void mem(String k){
System.out.println("name:"+k);
}
void mem(int i){
System.out.println("age:"+i);
}
void mem(float j)
{
System.out.println("weight:"+j);
}

public static void main(String args[])
{
person p=new person();
p.mem("gayathri");
p.mem(46.8f);
p.mem(21);
}}