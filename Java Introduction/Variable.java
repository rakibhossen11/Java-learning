/*
Java variables and literals 
*/

public class Variable {
    // create variables in java
    int speedlimite = 80;
    // can create this also
    // int speedlimites;
    // speedlimites = 80;
    int a = 1;
    double b = 2.5;
    char c = 'c';

    // Java literals

    // 1. Boolean Literals
    boolean flag1 = false;
    boolean flag2 = true;

    // 2. Integer Literals
    // There are 4 types of integer literals in Java:
    // binary (base 2)
    // decimal (base 10)
    // octal (base 8)
    // hexadecimal (base 16)
    // binary
    int binaryNumber = 0b10010;
    // octal
    int octalNumber = 027;

    // decimal
    int decNumber = 34;

    // hexadecimal
    int hexNumber = 0x2F; // 0x represents hexadecimal
    // binary
    int binNumber = 0b10010; // 0b represents binary

    // In Java, binary starts with 0b, octal starts with 0, and hexadecimal starts
    // with 0x.

    // 3. Floating-point Literals
    /**
 * Main
 */
public class Main{
    public static void main(String[] args){
        double myDouble = 3.4;
        float myFloat = 3.4F;
        // 3.445*10^2
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubleScientific);

    }
}

// 4. Character Literals
char letter = 'a';

// 5. String literals

}
