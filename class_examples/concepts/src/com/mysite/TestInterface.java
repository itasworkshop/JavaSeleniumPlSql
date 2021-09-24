package com.mysite;

//interface are contract - between interface and class, we are just defining functionality not implementing
interface RBIInterestCalculator{

    //to be implemented by class
    //these are abstract method
    public String myInterestEMI(int rate);
}

interface RBIInterestCalculator1{

    //to be implemented by class
    //these are abstract method
    //public String myInterestEMI1(int rate);
}

//one class can implement multiple interfaces
class HDFCBank implements RBIInterestCalculator,RBIInterestCalculator1{


    public String myInterestEMI(int rate) {
        return "HDFC EMI" + rate;
    }
}

class ICICIBank implements RBIInterestCalculator{

    @Override
    public String myInterestEMI(int rate) {
        return "ICICI EMI" + rate;
    }
}

public class TestInterface{

    public static void main(String[] args){
        HDFCBank hdfc = new HDFCBank();
        System.out.println(hdfc.myInterestEMI(5));

        ICICIBank icici = new ICICIBank();
        System.out.println(icici.myInterestEMI(7));
    }
}
