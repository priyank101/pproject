abstract class g
{
abstract void add();
void print()
{
System.out.println("heeello");
}
}
public class h extends g
{
void add()
{
System.out.println("world");
}
}
class good
{
public static void main(String[] args)
{
h h1=new h();
h1.print();
h1.add();
}
}