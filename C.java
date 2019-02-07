class A
{
void eat()
{
System.out.println("Eating");
}
}
class B extends A
{
void bark()
{
System.out.println("Barking");
}
}
class C
{
public static void main(String[]args)
{
B b=new B();
b.eat();
b.bark();
}
}