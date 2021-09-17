package main;


class Fan2{

    //String color = "Black";
    //int price = 2500;

    //class variable we want to have common value for all the object
    String company = "Bajaj";
    String color;
    int price;
    int numblade;

    Fan2(){
        this.price = 5000;
        System.out.println("hello from default constructor.");
    }

    //constructor - looks like a function, with class name, used for initialisation
    //parameterised constructor
    Fan2(int p,String color){
        System.out.println("hello from constructor.");
        //instance variable -- specific to instances
        this.price = p; //this keyword refers to current objects
        this.color = color;
    }

    Fan2(int p,String color,int numblade){
        System.out.println("hello from constructor.");
        //instance variable -- specific to instances
        this.price = p; //this keyword refers to current objects
        this.color = color;
        this.numblade = numblade;
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


public class HelloWorld4 {



    public static void main(String[] args){
        System.out.println("Hello World!!!!!!!!");

        Fan2 obj1 = new Fan2(3500,"Brown");
        Fan2 obj2 = new Fan2(4500,"White");
        Fan2 obj3 = new Fan2();
        Fan2 obj4 = new Fan2(7500,"White",3);

        System.out.println("The price fan 4 is "+ obj4.price);
        System.out.println("The color fan 4 is "+ obj4.color);
        System.out.println("The company of fan 4 is "+ obj4.company);

        obj4.getSwitchedOn(); //dot notation
        obj4.getRotate();
        obj4.getSwitchedOff();

        System.out.println("The price fan 3 is "+ obj3.price);
        System.out.println("The color fan 3 is "+ obj3.color);
        System.out.println("The company of fan 3 is "+ obj3.company);

        obj3.getSwitchedOn(); //dot notation
        obj3.getRotate();
        obj3.getSwitchedOff();


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
