//The given program will throw a Main method not found Error and giveing class for Main method it will be as follows

public class Main {
    public static void main(String[] args) {         //Main method

        Parent p = new Child();
        p.method2();   //Callng parent method2
    }
}

class Parent{                //Parent Class
    private void method1() {           //method1 declare private in parent  
        System.out.println ( "Parent's method1()" );  
    }
 
    public void method2() {             //method1 declare public in parent  
        System.out.println ( "Parent's method2()" ); 
        method1();
    }
}

class Child extends Parent {  
    public void method1() 
    {            //method1 declare public in child  
        System.out.println ( "Child's method1()" );
    }
}

//Output:C
 Parent's method2()
 Parent's method1()
