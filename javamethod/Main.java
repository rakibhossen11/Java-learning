package javamethod;

public class Main {

    // create a method
    public int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    // create another method 
    public static int square(int num){
        // return statement
        return num * num;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        // create an object of main
        Main obj = new Main();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: "+result);

        // call another method
        // store returend value to the result
        int result2 = square(15);
        System.out.println("Squared value of 15 is: " + result2);

        // java standerd library method
        System.out.println("Square root of 4 is : " + Math.sqrt(4));
    }
}
