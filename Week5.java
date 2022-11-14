import java.util.Scanner;

class Week5 {

    int number;

    void calculateNumber(){


    }

    public static void main(String[] args) {

        char letter = 'A';
        char number = '5';
        char letterTwo = '\u0041'; 
        char ch = 'a'; 
        char chTwo = (char)65.1; // Decimal 65.1 is assigned to ch
        int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51 
        String message = "Welcome to Java";
        String myString = message + " and " + "HTML";
        
    

        //0011110000111111
        //hexadecimal 0-9 and A-F
        //01AF


        System.out.println("Hello");
        System.out.println("everyone");
        System.out.println(letterTwo);
        System.out.println(++ch); 
        System.out.println("He said \"Java is fun\"");
        System.out.println(chTwo); // ch is character A
        System.out.println("i is " + i); // i is 101
        System.out.println('a' < 'b');
        System.out.println(Math.pow(5,2));
        System.out.println("The length of " + message + " is " + message.length());
        System.out.println(message.charAt(0));
        System.out.println(myString);

        message += " and Java is fun"; // message = message + " and Java is fun";

        System.out.println(message);
        System.out.println(message.equals(myString));

        message = "Welcome to Java";  
        message = message.substring(0, 11) + "HTML"; 
        System.out.println(message);

        String intString = "123";
        int intValue = Integer.parseInt(intString); 
        System.out.println(intValue);

        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString); 
        System.out.println(doubleValue);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How much is your salary?");
        double salary = input.nextDouble();

    }

}