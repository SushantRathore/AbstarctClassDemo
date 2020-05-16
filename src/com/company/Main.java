package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SiddharthPhone phone = new SuryanshPhone();
        phone.call();
        phone.cook();
        phone.dance();
    }
}

//abstrct class ( which contain abstract method)
abstract class SiddharthPhone
{
    public  void  call()
    {
        System.out.println("calling...");
    }

    // abstract method dance
    public abstract void  dance();

    //abstract method cook
    public abstract void  cook();
}

//concrete class (where abstract method are defined)
class SuryanshPhone extends  SiddharthPhone
{
    @Override
    //method definition of dance
    public void dance() {
        System.out.println("dancing...");
    }

    @Override
    //method definition of cook
    public void cook() {
        System.out.println("cooking...");
    }


}
