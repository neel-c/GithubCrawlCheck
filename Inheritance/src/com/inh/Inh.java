package com.inh;

class Fruit
{
    public Fruit()
    {
        System.out.println("Super class constructor");
        System.out.println("Super class object hashcode :" +
                           this.hashCode());
        System.out.println(this.getClass().getSimpleName());
    }
    
    public void print() {
    	System.out.println("aaaaaaaaaaaaaaaaaa");
    }
}
 
// sub class
class Apple extends Fruit
{
    public Apple()
    {
        System.out.println("Subclass constructor invoked");
        System.out.println("Sub class object hashcode :" +
                           this.hashCode());
        System.out.println(this.hashCode() + "   " +
                           super.hashCode());
 
        System.out.println(this.getClass().getSimpleName() + "  " +
                           super.getClass().getSimpleName());
    }
    
    @Override
    public void print() {
    	System.out.println("bbbbbbbbbbbbb");
    }
}
 
// driver class
public class Inh
{
    public static void main(String[] args)
    {
    	Fruit myApple = new Apple();
    	myApple.print();
    }
}
