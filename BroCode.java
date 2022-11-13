package brocode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BroCode {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        //1. kurzus sout
        /*
        System.out.print("\"I \\ love pizza!\"\n"); // \n új sor, \t tabulátor, \\ a \ jel, \" a " karakter
        System.out.println("It's really good!");
         */
        //2. kurzus
        /*
        int x; //declaration
        x=123; //assignemt
        int y = 123; //initialization
        
        System.out.println("my number is: " + x);
        
        int q = 1234567890;
        long w = 1234567890123456789L;
        System.out.println(q);
        System.out.println(w);
        
        float e = 3.14f;
        System.out.println(e);
        
        double r = 3.14;
        System.out.println(r);
        
        boolean t = false;
        System.out.println(t);
        
        char symbol = '@';
        System.out.println(symbol);
        
        String name = "Bro";
        System.out.println("Hello " + name);
         */
        // 3. kurzus
        /*
        String x = "water";
        String y = "Kool-Aid";
        String temp=null;
        
        temp = x;
        x=y;
        y=temp;
        
        System.out.println("x: "+x);
        System.out.println("y: "+y);
         */
        // 4.kurzus
        /*
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("How old are you? ");
        int age = scan.nextInt();
        scan.nextLine(); //Az int után a gép tesz egy (\n) sortörést és a nextInt csak a számot olvassa be a törést nem míg a nextLine meg a következő törésig mindent. Példa a hibára: 21\n -> \n -> \npizza\n -> semmi.
        System.out.println("What is your favorite food");
        String food = scan.nextLine();
        
        
        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + " years old");
        System.out.println("You like " + food);
         */
        // 5.kurzus
        /*
        int friends = 10;
        
        friends++;
        friends--;
        friends = friends + 1;
        friends = friends - 1;
        friends = friends * 2;
        friends = friends / 2;
        friends = friends % 3;
        
        System.out.println(friends);
         */
        // 6. kurzus !!gui!!
        /*
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + "years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
         */
        // 7. kurzus
        /*
        double x = 3.14;
        double y = -10;
        
        double z = Math.max(x, y);
        double a = Math.min(x, y);
        double b = Math.abs(y);
        double c = Math.sqrt(x);
        double d = Math.round(x);
        double e = Math.ceil(x);
        double f = Math.floor(x);
        
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        double x1;
        double y1;
        double z1;
        
        System.out.println("Enter side x: ");
        x = scan.nextDouble();
        System.out.println("Enter side y: ");
        y = scan.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is : " + z);
        
        scan.close();
         */
        // 8. kurzus
        /*
        Random rnd = new Random();
        
        //int x = rnd.nextInt(6)+1;
        //double y = rnd.nextDouble();
        boolean z = rnd.nextBoolean();
        
        System.out.println(z);
         */
        // 9. kurzus
        /*
        // if statment = performs a block of code if it's condition evaluates to be true
        
        int age = 75;
        
        if (age == 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }
         */
        // 10. kurzus
        /*
        // switch = statement that allows a variable to be tested for equality against a list of values
        
        String day = "Friday";
        switch(day){
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thuesday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("That is not a day!");
        }
         */
        // 11. kurzus
        /*
        // logical operators = used to connect two or more expressions
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition
        
        int temp = 25;
        
        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }
        
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scan.next();
        
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
        
        System.out.println("You are playing a game! Press q or Q to quit");
        String response2 = scan.next();
        
        if (!response2.equals("q") && !response2.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }
         */
        // 12. kurzus
        /*
        // while loop = executes a block of code as long as it's condition remains true
        
        String name = "";
        
        while(name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scan.nextLine();
        }
        
        do{
            System.out.println("Enter your name: ");
            name = scan.nextLine();
        }while(name.isEmpty());
        
        System.out.println("Hello " + name);
         */
        // 13. kurzus
        /*
        // for loop = executes a block of code a limited amount of time
        
        for (int i = 10; i >= 0;) { // i = index (index, tárgymutató, mutatóujj, hatványkitevő)
            System.out.println(i);
            i--;
        }
        System.out.println("Happy new year!");
         */
        // 14. kurzus 
        /*
        // nested loops = a loop inside of a loop
        
        int rows;
        int columns;
        String symbol = "";
        
        System.out.println("Enter # of rows: ");
        rows = scan.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scan.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scan.next();
        
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
         */
        // 15. kurzus
        /*
        // array = used to store a multiple values in a single variable
        
        String[] cars = {"Camaro","Corvette","Tesla","BMW"};
        
        cars[0] = "Mustang";
        
        System.out.println(cars[3]);
        
        String[] kocsik = new String[3];
        
        kocsik[0]= "Camaro";
        kocsik[1]= "Corvette";
        kocsik[2]= "Tesla";
        
        System.out.println(kocsik[2]);
        
        for (int i = 0; i < kocsik.length; i++) {
            System.out.println(kocsik[i]);
        }
         */
        // 16. kurzus
        /*
        // 2d array = an array of arrays
        
        String[][] cars = new String[3][3];
        
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
        System.out.println("");
        
        String[][] kocsik = {{"Camaro","Corvette","Silverado"},{"Mustang","Ranger","F-150"},{"Ferrari","Lambo","Tesla"}};
         */
        // 17. kurzus
        /*
        // String = a reference data type that can store one or more characters
        // Reference data types have access to useful methods
        
        String name = "Bro";
        
        //boolean result = name.equalsIgnoreCase("bro");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("B");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim(); //Deleting empty spaces
        String result = name.replace('o', 'a');
        
        System.out.println(result);
         */
        //18. kurzus
        /*
        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used withcollections (ex.ArrayList)
        
        //primitive         //wrapper
        //---------         //-------
        //boolean           Boolean
        //char              Character
        //int               Integer
        //double            Double
        
        //autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        
        if (a) { // unboxing
            System.out.println("This is true");
        }
         */
        // 19. kurzus
        /*
        //ArrayList = a resizable array.
        //            Elements can be added and removed after compilation phase
        //            store reference data types
        
        ArrayList<Integer> számok = new ArrayList<Integer>(); //import java.util.ArrayList;
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");
        
        food.set(0, "Sushi");
        food.remove(2);
        food.clear();
        
        for (int i = 0; i < food.size(); i++) { //size és nem length
            System.out.println(food.get(i));
        }
         */
        // 20. kurzus
        /*
        //2D ArrayList = a dynamic list of lists
        //You can change the size of these lists during runtime
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        
        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");
        
        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("caffee");
        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
        
        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(groceryList.size()-1).get(groceryList.get(groceryList.size()-1).size()-1));
         */
        //21. kurzus
        /*
        // for-each = traversing technique to interate through the elements in array/collection
        //            less steps, more readable
        //            less felxible
        
        //String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        
        for (String i : animals) {
            System.out.println(i);
        }
         */
        // 22. kurzus
        /*
        // method = a block of codethat is executed whenever it is called upon
        String name = "Bro";
        int age = 21;
        hello(name,age);
        
        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
        System.out.println(add(x,y));
         */
        //23. kurzus 
        /*
        //overloaded methods = methods that share the same name but have different parameters
        //                     method name + parameters = method signature
        
        double x = add(1.0, 2.0, 1.0, 1.0);
        System.out.println(x);
         */
        //24. kurzus
        /*
        //printf() = an optional method to control, format, and display text to the console window
        //           two arguments = fromat string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]
        
        System.out.printf("This is a format string %d",123);
        System.out.println();
        System.out.printf("%d This is a format string",123);
        System.out.println();
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 20000;
        
        //[conversion-character]
        System.out.printf("%b",myBoolean);
        System.out.println();
        System.out.printf("%c",myChar);
        System.out.println();
        System.out.printf("%s",myString);
        System.out.println();
        System.out.printf("%d",myInt);//?digit talán?
        System.out.println();
        System.out.printf("%f",myDouble);//float
        System.out.println();
        
        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %10s",myString);
        System.out.println("");
        
        //[precision]
        //sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.2f ",myDouble); //Hány ttizedes jegyik menjen
        //System.out.println("");
        
        //[flags]
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numerical value
        // 0 : numeric values are zero-padded
        // , : coma grouping separator if numbers > 1000
        System.out.printf("You have this much money %,f ",myDouble);
        System.out.println("");
         */
        //25. kurzus 
        /*
        final double PI = 3.14159;
        //PI = 4;
        System.out.println(PI);
         */
        //26. kurzus
        /*
        //object = an instance of a class that may contain attributes and methods
        //example: (phone, desk, computer, coffee cup)
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.color);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
        
        //myCar1.drive();
        myCar1.brake();
         */
        //27. kurzus
        /*
        //constructor = special method that is called when an object is instantiated (created)
        
        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Morty",16,50);
        
        System.out.println(human1.name);
        System.out.println(human2.name);
        human2.eat();
        human1.drink();
         */
        //28. kurzus
        /*
        //local = declared inside a method
        //        visible only to that method
        
        //global = declared outside a method, but within a class
        //        visible to all parts of class
        
        DiceRollerLocal diceRollerL = new DiceRollerLocal();
        DiceRollerGlobal diceRollerG = new DiceRollerGlobal();
         */
        //29. kurzus
        /*
        //overloaded constructors =     multiple constructors within a class with the same name, but have different parameters
        //                              name + parameters = signature
        Pizza[] arr;
        arr = new Pizza[4];
        arr[0] = new Pizza("thicc crust pizza", "tomato", "mozzarella", "pepperoni");
        arr[1] = new Pizza("thicc crust pizza", "tomato", "mozzarella");
        arr[2] = new Pizza("thicc crust pizza", "tomato");
        arr[3] = new Pizza("thicc crust pizza");

        for (int i = 0; i < 4; i++) {
            System.out.println("Here are the ingredients of your pizza: ");
            System.out.println(arr[i].bread);
            System.out.println(arr[i].sauce);
            System.out.println(arr[i].cheese);
            System.out.println(arr[i].toppings);
            System.out.println("");
        }
         */
        //30. kurzus
        /*
        // to String() = speacial method that all objects inherit, that returns a string that "textually represents" an object.
        //               Can be used both implicitly and explicitly (hallgatólagosan és kifejezetten)
        
        Auto auto = new Auto();
        
        System.out.println(auto); //implicitly
        System.out.println(auto.toString()); //explicitly
         */
        //31. kurzus
        //Food[] refrigerator = new Food[3];
        /*
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");
        
        Food[] refrigerator = {food1,food2,food3};
        
        //refrigerator[0]=food1;
        //refrigerator[1]=food2;
        //refrigerator[2]=food3;
        
        System.out.println(refrigerator[0].name);
        
        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i].name);
            
        }
         */
        //32. kurzus
        /*
        //object passing
        Garage garage = new Garage();
        Kocsi car1 = new Kocsi("BMW");
        Kocsi car2 = new Kocsi("Tesla");

        garage.park(car1);
        garage.park(car2);
        */
        
        //33. kurzus
        /*
        //static =  modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member
        
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        
        System.out.println(Friend.numberOfFriends);
        System.out.println(friend1.numberOfFriends); //nem ajánlott
        
        Friend.displayFriends();
        */
        
        //34. kurzus
        
        //inheritance =     the process where one class acquires. the attributes and the methods of another.
        
        Car34 car34 = new Car34();
        
        
    }

    // 22. kurzus
    /*
    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are "+ age + " years old");
    }
    
    static int add(int x, int y){
        int z = x + y;
        return z;
        //return x+y;
    }
     */
    // 23. kurzus
    /*
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method #4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method #5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #6");
        return a+b+c+d;
    }
     */
}
