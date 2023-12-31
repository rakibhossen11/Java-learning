package Constructor;


// java constructor
public class Test {
    private String name;
    Test(){
        System.out.println("Constructor called :");
        name = "Rakib";
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("The name is " + obj.name);
    }
}

// Types of Constructor

// 1. No-Arg Constructor
// 2. Parameterized Constructor
// 3. Default Constructor

// Java private no-arg constructor

class Main{
    int i;

    // constructor with no perameter
    private Main(){
        i = 5;
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Value of i is :" + obj.i);
    }

}

// Java public no-arg constructors
class Company{
    String name;

    // public constructor
    public Company(){
        name = "Rakib";
    }
}

class Main2{
        public static void main(String[] args) {
            // obj is created another class
            Company obj = new Company();
            System.out.println("Company name :" + obj.name);
        }
}

// Java Parameterized Constructor

class Main3{
    String languages;

    // constructor accepting string value
    Main3(String lang){
        languages = lang;
        System.out.println(languages + " Programing languages");
    }

    public static void main(String[] args) {
        // call constructor passing a single value
        Main3 obj1 = new Main3("Java");
        Main3 obj2 = new Main3("JavaScript");
        Main3 obj3 = new Main3("PHP");
    }
}

// Java Default Constructor

class Main4{
    int a;
    boolean b;

    public static void main(String[] args) {
        // A default constructor is called
        Main4 obj = new Main4();

        System.out.println("Defalut value");
        System.out.println("a = "+ obj.a);
        System.out.println("b = "+ obj.b);
    }
}

// Constructors Overloading in Java
class Main5{
    String language;

    // constructor with no parameter
    Main5(){
        this.language = "Java";
    }

    // constructor with a single paremeter
    Main5(String language){
        this.language = language;
    }

    public void getName(){
        System.out.println("Programing language " + this.language);
    }

    public static void main(String[] args) {
        // call constructor with no parameter
        Main5 obj1 = new Main5();

        // call constructor with single parameter
        Main5 obj2 = new Main5("Python");

        obj1.getName();
        obj2.getName();
    }
}