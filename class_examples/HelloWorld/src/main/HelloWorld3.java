package main;


class Fan1{

    //String color = "Black";
    //int price = 2500;

    //class variable we want to have common value for all the object
    String company = "Bajaj";
    String color;
    int price;

    //constructor - looks like a function, with class name, used for initialisation
    Fan1(int p,String color){
        System.out.println("hello from constructor.");
        //instance variable -- specific to instances
        this.price = p; //this keyword refers to current objects
        this.color = color;
    }

    public void getSwitchedOn(){
        System.out.println("getting switched on.");
    }

    public void getRotate(){
        System.out.println("rotating ............");
    }

    public void getSwitchedOff(){
        System.out.println("getting switched off.");
    }

}


public class HelloWorld3 {



    public static void main(String[] args){
        System.out.println("Hello World!!!!!!!!");

        Fan1 obj1 = new Fan1(3500,"Brown");
        Fan1 obj2 = new Fan1(4500,"White");


        System.out.println("The price fan 1 is "+ obj1.price);
        System.out.println("The color fan 1 is "+ obj1.color);
        System.out.println("The company of fan 1 is "+ obj1.company);

        obj1.getSwitchedOn(); //dot notation
        obj1.getRotate();
        obj1.getSwitchedOff();

        System.out.println("The price fan 2 is "+ obj2.price);
        System.out.println("The color fan 2 is "+ obj2.color);
        System.out.println("The company of fan 2 is "+ obj2.company);

        obj2.getSwitchedOn(); //dot notation
        obj2.getRotate();
        obj2.getSwitchedOff();

    }
}
