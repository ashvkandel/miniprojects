/*
public class Main {
    public static void main(String[] args)  {




        System.out.println("HELLO WORLD !");
        System.out.println("Java Tutorials!!");


        // variables in JAVA //

         primitive and references
        primitive :- that can store values in memory.
        reference :- that can be stored as an address and can be accessed.


        int age=18;
        System.out.println(age);
// type of error may occur :- incompatible types //

        int no=9;
        System.out.println("The number given is "+ no);

     double c=11.11;
     double t=10.00;

     System.out.println("The price of the pen ranges from " +c +  " to " +t);


// char are used for single characters //

        char a='H';
        char b='P';
        System.out.println("The PC name is " +a +b);

        boolean isPresent=true;
        boolean isHappy =false;

        System.out.println(isPresent);

        // string :- a series of characters //

        String x="Ashv";
        String y="Kandel";
        System.out.println("Myself "+x +" " + y);

        // A brief para use variables datatype  //

        String name="Ashv Kandel";
        int m=4;

        System.out.println("Hello ! My name is " +name);
        System.out.println("currently pursuing  BTech in CSE major ");
        System.out.println("The duration is of " +m  +" " + " years ");




        // ChatGPT questions  //


        System.out.println("About :-");

        int age=18;
        String name="Ashv";
        String city="Ahmedabad";

        System.out.println("Hello ,JAVA!");
        System.out.println("Myself " +name + " and I'm " +age + " living in the beautiful city "+city);




        int x=12;
        int y=35;
        double z=x+y;

        System.out.println("The sum of " +x + " & " +y +" is " +z);


// taking the input from user //

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter your age:");
        String age=scanner.nextLine();
        System.out.println("Hola are you really "+age +" years old ?");




        System.out.print("Enter your current language studying:");
        String name=scanner.nextLine();

        System.out.println("Wow "+name +" is one of the cool languages !");


        System.out.print("Are you Superstitious(True/False) ?");
        boolean isSuperstitious =scanner.nextBoolean();
        System.out.println("He/She is totally "+isSuperstitious);

        scanner.close();



        // program to print ar. of a rectangle //

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the length:");
        double len=scanner.nextDouble();
        System.out.print("Enter the breadth");
        double br=scanner.nextDouble();

        double ar=len*br;
        System.out.println("The area of the rectangle is:"+ar);


        scanner.close();




        // program to print age after 10 years //

       Scanner scanner=new Scanner(System.in);

        System.out.println("Hello ! What's your name ?");
        String name=scanner.nextLine();

        System.out.println("Hey "+name +" can you please enter your age ?");

        int age=scanner.nextInt();

        System.out.println("Ok");
        int aft=age+10;
        System.out.println("So "+name+" you will be "+aft+" after ten years.");

        scanner.close();



        // program to calculate simple interest //

       Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Principal amount:");
        double p=sc.nextDouble();
        System.out.println("Enter the Rate of the Interest:");
        double r=sc.nextDouble();
        System.out.println("Enter the Tenure:");
        int t=sc.nextInt();

        double si=(p*r*t)/100;

        System.out.println("The simple interest calculated is something "+si);

        sc.close();


        // to print average of three numbers //

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first no:");
        double num1=sc.nextDouble();
        System.out.println("Enter second no:");
        double num2=sc.nextDouble();
        System.out.println("Enter third no:");
        double num3=sc.nextDouble();

        double av=(num1+num2+num3)/3;

        System.out.println("The average of above three numbers is "+av);

        sc.close();


        // Calculator program in JAVA //

        Scanner sc= new Scanner(System.in);

        System.out.println("HELLO ! Let's create an operational program");

        System.out.println("Enter numbers to add:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("OK!");
        int sum=x+y;
        System.out.println("The sum of two numbers is "+sum);
        System.out.println("Similarly");
        System.out.println("Enter numbers to subtract:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("OK!");
        int sub=x1-y1;
        System.out.println("The difference between two numbers is "+sub);

        System.out.println("Now turns out time for another operation !");
        System.out.println("Enter numbers to multipy:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("OK!");
        int pr=x2*y2;
        System.out.println("The product of above two numbers is "+pr);
        System.out.println("Enter numbers to Divide:");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        System.out.println("OK!");
        int r=x3/y3;
        System.out.println("The quotient of above two numbers is "+r);



        sc.close();


        // to remember the simplification //

        // [P-E-M-D-A-S]// {with Divison first from left}



        // program of shopping cart //

        Scanner sc= new Scanner(System.in);

        System.out.println("Hey there !");
        System.out.println("What items you would like to buy today ? ");
        System.out.println("( Pizza 🍕/ Burger 🍔 /Chips Packet 🍟/Cookies 🍪/Ice Cream 🍨/Chocolates 🍫)");
        System.out.println("Type Here:");
        String item=sc.nextLine();
        System.out.println("OK! 👍");
        System.out.println("Great pick !");
        System.out.println("That will be of $5.45 ");
        System.out.println("How many quantities do you want ?");
        int n=sc.nextInt();

        double total=n*5.45;

        System.out.println("That would be a total of $"+total);
        System.out.println("Thank you for purchasing !😊" );






        sc.close();



        // conditional operators //

        // problem to check the eligibility to vote //

        Scanner sc=new Scanner(System.in);

        System.out.println("So, What's your age ?");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible to vote ");
        }
        else {
            System.out.println("You are not eligible to vote");
        }



        // program to compare two numbers //

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1=sc.nextInt();
        System.out.println("Enter your second  number:");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num2+" is greater than "+num2);
        }
        else if(num1==num2)
        {
            System.out.println("Both numbers are equal");
        }
        else
        {
            System.out.println(num2+" is greater than "+num1);
        }


        // to check an even or an odd number //

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any number you want:");
        double num=sc.nextDouble();

        if(num%2==0)
        {
            System.out.println("The number entered is even");
        } else
        {
            System.out.println("The number entered is odd ");
        }



        // program to convert minutes into hours  //

        Scanner sc=new Scanner(System.in);

        System.out.println("Do you want to convert the time ? (True/False)");
        boolean isSay=sc.nextBoolean();
        if(isSay==true)
        {
            System.out.println("OK 👍");


            System.out.println("Enter the time in HH:");
            int hh=sc.nextInt();
            int a=hh*60;
            System.out.println("Time: "+a +" mins");


            System.out.println("Enter the time in MM:");
            double mm=sc.nextInt();
            double b=mm/60;
            System.out.println("Time: "+b+" hours");


        }
        else
        {
            System.out.println("As you wish !");
        }


// program to check the greatest among three numbers //

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number:");
        double x=sc.nextDouble();
        System.out.println("Enter the second number:");
        double y=sc.nextDouble();
        System.out.println("Enter the third number:");
        double z=sc.nextDouble();

        System.out.println("OK!👍");

        System.out.println("Three numbers selected ");

        if(x>y && y>z)
        {
            System.out.println(x+" is the greatest among selected numbers.");

        }
        else if(y>x && x>z )
        {
            System.out.println(y+" is the greatest among selected numbers.");

        }
        else
        {
            System.out.println(z+" is the greatest among selected numbers.");
        }




        //to print the next character with the help of user defined value //


        Scanner sc=new Scanner(System.in);

        System.out.println("Hey there !");
        System.out.println("Enter any character you want:");

        char ch=sc.next().charAt(0);
        char next=(char)(ch+1); //ch+1 stores int value // // then char Unicode to char value //
        System.out.println("Entered value is "+ch +"," +" next character is "+next );




        // to check whether a given character is vowel or consonant //

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any alphabet you want:");
        char ch=sc.next().charAt(0);

        System.out.println("You have entered alphabet "+ch);


        if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'
                ||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'

        ){
            System.out.println("You have picked a vowel");

        }
        else {
            System.out.println("You have picked a consonant");
        }



        // to print any random number //

        Random random=new Random();

        int rn=random.nextInt(1,10); // origin is inclusive //

        System.out.print("Random number is "+rn);


        // Guess the number challenge //

        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Guess the number challenge ");
        System.out.println("You have only three attempts to guess,play smartly!");
        System.out.println("Guess any number between 1-100");

        int guess=random.nextInt(1,101);
        boolean found=false;


        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter the number you guessed: ");
            int anyNum=sc.nextInt();

            if(anyNum==guess)
            {
                System.out.println("You have guessed it correctly !");
                found=true;
                break;
            }
            else if(anyNum<guess)
            {
                System.out.println("Incorrect! It is smaller than random number.");
            }
            else
            {
                System.out.println("Incorrect! It is greater than random number.");
            }

        }
        if(!found) // not to compare //
        {
            System.out.println("You failed ! The number was "+guess);
        }



        // MATHS CLASS //

        // program to calculate the hypotenuse of right angle triangle//

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the base:");
        double base=sc.nextDouble();
        System.out.println("Enter the altitude:");
        double alt=sc.nextDouble();

        double hyp=Math.sqrt(Math.pow(base,2)+Math.pow(alt,2));

        System.out.println("The hypotenuse is:"+hyp);

        sc.close();



        // program to find the area of circle and volume of sphere//

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius:");
        double rad=sc.nextDouble();

        double ar=Math.PI*Math.pow(rad,2);

        System.out.println("The area of circle :"+ar);

        System.out.println("VOLUME OF A SPHERE");

        System.out.println("Do you wish to continue with the same radius ?[true/false]");
        boolean isYes=sc.nextBoolean();

        if(isYes==true)
        {
            double vol1=1.33*Math.PI*Math.pow(rad,3);
            System.out.println("Volume of sphere is:"+vol1);
        }
        else {
            System.out.println("OK 👍");
            System.out.println("Enter new radius:");
            double rad2=sc.nextDouble();
            double vol2=1.33*Math.PI*Math.pow(rad2,3);
            System.out.println("Volume of sphere is:"+vol2);

        }
        sc.close();

        // printf statement :- only used to format the output //


        String name="Sophie";
        int age=35;

        System.out.printf("Hello %s \n",name);

        System.out.printf("You are %d years old",age);




        // padding of any number //

        // format :- %0any_int d,variable


        int a=9;
        int b=19;
        int c=1;

        System.out.printf("%02d \n",a);  // can be upto any number //
        System.out.printf("%02d \n",b);
        System.out.printf("%02d \n",c);




        //compound interest calculator//


        Scanner sc=new Scanner(System.in);

        System.out.println("Hey there ! 😀");
        System.out.println("Enter the principal amount:");
        int p=sc.nextInt();
        System.out.println("Enter the rate of interest(in %):");
        double r=sc.nextDouble()/100;
        System.out.println("Enter the number of times compounded:");
        int n=sc.nextInt();
        System.out.println("Enter the tenure:");
        int t=sc.nextInt();


        double amt=p*Math.pow(1+r/n,n*t);
        System.out.println("Compounded amount after "+t+" years is :"+amt);




        // to find the largest number among three using nested if-else statement //

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number you wish:");
        int num1=sc.nextInt();

        System.out.println("Enter the second number you wish:");
        int num2=sc.nextInt();

        System.out.println("Enter the third number you wish:");
        int num3=sc.nextInt();

        System.out.println("Ok! 👍");

        if(num1>num2){
            if(num1>num3){
            System.out.println("The greatest number is "+num1);
            }
            else {
                System.out.println("The greatest number is "+num3);
            }

        }

        else {
            if(num2>num3){
                System.out.println("The greatest number is "+num2);
            }
            else{
                System.out.println("The greatest number is "+num3);
            }


        }




        // loan eligibility using if else nested statements //

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your current age:");
        int age=sc.nextInt();



    if(age>=21){
            System.out.println("Enter your current salary (CTC):");
            double sal=sc.nextDouble();

            if(sal>25000){
                System.out.println("Enter your credit score:");
                int cr=sc.nextInt();


                if(cr>=700){
                    System.out.println("You are eligible for the loan.");
                }
                else{
                    System.out.println("Credit score too low.");
                }

            }
            else{
                System.out.println("Salary too low to be eligible.");
            }

        }
        else{
            System.out.println("Age criteria is not satisfied");
        }


        // ATM withdrawal system //

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the pin:");
        int pin = sc.nextInt();


        if (pin == 1206) {

            int num = random.nextInt(1000, 45000);
            System.out.println("Current Balance:" + num);

            for (int i = 1; i <= 3; i++) {

                System.out.print("Enter the amount to be withdrawn:₹");
                int num1 = sc.nextInt();

                if (num1 > 0 && num1 < num) {
                    System.out.println("OK!👍 Wait for a second. ");
                    System.out.println("Transaction successful !");
                    int num2 = num - num1;
                    System.out.println("Balance left:₹" + num2);

                } else {
                    System.out.println("Insufficient Balance to be withdrawn. ");
                }
            }
        }
            else {
            System.out.println("You have entered wrong pin. Try again !");
        }




        // Movie ticket discount system //


        Scanner sc=new Scanner(System.in);

        System.out.println("Hello 😊:");
        System.out.println("Welcome to FetchMovies.com !");
        System.out.print("Enter the movie name you want to watch:");
        String mov=sc.nextLine();

        System.out.println("Please enter your age:");
        int age=sc.nextInt();
        if(age<=10 || age>=60){
            System.out.print("Enter the day of the week to watch the movie:");
            int day=sc.nextInt();



            if(day==7){
                System.out.println("You have weekend discount !");

                System.out.println("Enter the amount you paid :");
                double amt=sc.nextDouble();
                double dis=amt*0.9;
                System.out.println("The price for the movie ticket :"+dis);
            }
            else{
                System.out.println("Sorry we have discounts for Saturdays only.");
            }

            }
        else{
            System.out.println("No discount available for such range of age!");
        }


         // some good functions //

        String x="GERMANY";

        int length=x.length();
        System.out.println(length);


        int index=x.indexOf("M");
        System.out.println(index);

        String index1=x.concat(" IS THE BEST");

        System.out.println(index1);

        char ch=x.charAt(5);
        System.out.println(ch);

        System.out.println(x.toLowerCase());

        System.out.println(x.substring(2, 5));     // RMA
        System.out.println(x.replace("G", "J"));  // JERMANY
        System.out.println(x.contains("MANY"));   // true
        System.out.println(x.isEmpty());           // false




        String s = "HelloWorld";

// Q1: Print the length of s
// Q2: Print the character at index 4
// Q3: Print s in all lowercase
// Q4: Print s in all uppercase
// Q5: Does s contain "World"? Print true/false


        System.out.println(s.length());

        System.out.println(s.charAt(4));

        System.out.println(s.toLowerCase());

        System.out.println(s.toUpperCase());

        System.out.println(s.contains("World"));




        String s = "Java is Awesome";

// Q6: Print only the word "Awesome" using substring()
// Q7: Replace "Java" with "Python" and print it
// Q8: Find the index of 'A' (capital A)
// Q9: Concatenate " and Fun!" to s and print
// Q10: Print the first 4 characters only

        System.out.println(s.substring(8,15));

        System.out.println(s.replace("Java","Python"));

        System.out.println(s.indexOf("A"));

        System.out.println(s.concat(" and Fun ! "));

        System.out.println(s.substring(0,4));




        // ternary operator  :- It returns 1 out of 2 values if the condition is true //


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age:");
        int age=sc.nextInt();


        String eligible=(age>=18)?"Can vote":"Cannot vote";
        System.out.println(eligible);




        // Revision //


        // Temperature conversion//
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the temperature (in C):");
        double temp = sc.nextDouble();
        sc.nextLine();

        double k = temp + 273.15;
        double f = (9.0 / 5) * temp + 32;


        System.out.println("Do you want to convert it into Kelvin or Fahrenheit?:");
        String ans = sc.nextLine();


        if (ans.equals("Kelvin")) {
            System.out.println("Temperature is " + k);
        } else {
            System.out.println("Temperature is " + f);
        }


        // use of equal fn is for string values  //



        // switch operator//

        Scanner sc=new Scanner(System.in);




        System.out.println("Enter any day:");
        String day=sc.nextLine();


        switch(day){

            case "Monday":
                System.out.println("Regular Working day");
                break;

            case "Tuesday":
                System.out.println("Regular Working day");
                break;


            case "Wednesday":
                System.out.println("Regular Working day");
                break;


            case "Thursday":
                System.out.println("Regular Working day");
                break;

            case "Friday":
                System.out.println("Regular Working day");
                break;

            case "Saturday":
                System.out.println("Weekend");
                break;

            case "Sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("You have entered wrong value.");

        }

sc.close();




 // enhanced switch //

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any day:");
        String day=sc.nextLine();

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday":
                System.out.println("Oh no it's weekday");
                break;

            case "Saturday","Sunday":
                System.out.println("Weekend 😊");
                break;
            default:
                System.out.println("You have enter incorrect value!");

        }



                       // Loops //

        // while loop //


        Scanner sc=new Scanner(System.in);

        System.out.println("Guess the first letter of my name ");
        System.out.print("Type here : ");
        String letter =sc.nextLine();

        while(!letter.equals("A")){

            System.out.println("Type here again:");
            letter = sc.nextLine().toUpperCase();
        }
        System.out.println("Correct !");

        sc.close();




        // Number guessing game //

        Scanner sc=new Scanner(System.in);

        System.out.println("GUESS THE NUMBER CHALLENGE.");
        System.out.println("Are you ready ?(yes/no) ");

        String ans=sc.nextLine();

        if(ans.equals("yes")){
            System.out.println("OK ! Let's get started.");

            System.out.println("Try to guess the number ~");
            int num=sc.nextInt();

            while(num!=35){
                System.out.println("Try again please! ");
                num=sc.nextInt();

            }
            System.out.println("Correct.");

        }

        else{
            System.out.println("Okay, whenever you are ready ");
        }



        // few more Claude Questions //

        // 1. Multiplication of any number //


     Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number whose multiples you want : ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            int m=i*num;
            System.out.println(m);
        }
        System.out.println("Multiples of "+num);


    // 2. User input(num) and sum of the number's digit //

        //3. Factorial using for loop //

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number whose factorial is required :");
        int n=sc.nextInt();

        int fact =1;

        for(int i=1;i<=n;i++){

            fact=fact*i;

        }
        System.out.println("The factorial of " +n+ "is "+fact );


// only upto the datatype storage //

        // Birthday Countdown ! //


        Scanner sc=new Scanner(System.in);

        System.out.println("Birthday Countdown !");

        System.out.print("From where to begin the countdown ?:");
        int count=sc.nextInt();

        for(int i=count;i>=0;i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }



        System.out.println("Happy Birthday Ashv ❤🎉");



            // BREAK AND CONTINUE (USED IN LOOPS) //

 for(int i=1;i<10;i++){
     System.out.println(i);
     if(i==5){
         break;
     }
 }



        // NESTED LOOPS // { VERY USEFUL IN MATRICES AND DSA}


            for (int i = 1; i <= 3; i++) {

                for (int j = 1; j <= 10; j++) {
                    System.out.print(j+" ");
                }

            }



        // Building the Matrix //


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want :");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns you want :");
        int cl = sc.nextInt();
        System.out.print("Enter what symbol's matrix you want :");
        String sym;
        sym = sc.next();

        System.out.println("OK!");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cl; j++) {
                System.out.print(sym + " ");

            }
            System.out.println();
        }
// Sum of the matrix will be solved by using the array concept //




        // YT Questions //

        // solid rectangle //

        for (int i = 0; i <4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print( "*"+" ");

            }
            System.out.println();
        }



        // half pyramid or right angle triangle //

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many rows do you want ~");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }





        // Inverted Pyramid //


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many rows ~ ");
        int rows =sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows;j++){       // no of columns dependent upon no if rows //
                System.out.print("*"+" ");
            }
            System.out.println();

        }



        // 180 degree inverted //

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many rows ~ ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++) {
                System.out.print(" ");
            }
                for (int k=1;k<=i;k++){
                    System.out.print("*");

                }
                System.out.println();

        }




        // Number pattern //

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



        // Inverted Number pattern //

      int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

          // Butterfly pattern //  (highly logical)

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the nno. of rows ~ ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }


            int spaces = 2 * (n - i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");

            }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }


            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }


            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }




        // parallelogram //

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        // Number pyramid //

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



        // Diamond//

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }





        // METHODS IN JAVA //


        // block of reusable code used for programming//

        // to print JAVA installation method //



        // practice //

for(int i=1;i<=4;i++) {


    for(int j=1;j<=i;j++){
        System.out.print("*"+" ");
    }
    System.out.println();  // right angled triangle //
}




      // Revision //


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the price of 1st item : ");
        int a=sc.nextInt();
        System.out.print("Enter the price of second item :");
        int b= sc.nextInt();
        System.out.print("Enter the price of third item :");
        int c=sc.nextInt();

        int total=a+b+c;

        System.out.println("The sum of all the items is : "+total);

        if(a+b+c>=1000){
            System.out.println("After discount :"+(total-100));
        }
        else{
            System.out.println("No discount below purchase of rupees one thousand !");
        }





        // random numbers //

        Random random=new Random();

        int r=random.nextInt(1,101);
        System.out.println(r);

        // five random numbers in a loop //



        for(int i=1;i<6;i++){
            System.out.println(random.nextInt(1,75));
        }



        System.out.println(Math.sqrt(64)); // square root of a number//

        System.out.println(Math.round(18.4)); // round off a decimal number //

        System.out.println(Math.max(19.57,19.00)); // max between two numbers //

        System.out.println(Math.pow(6,3));




        // GRADING //

        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to the Student portal !");

        System.out.print("Enter the attendance(%): ");
        double att=sc.nextDouble();



        if(att>=75){
            System.out.println("OK !");

            System.out.print("Enter the marks obtained:");
            double marks=sc.nextDouble();

            if(marks>=90){
                System.out.println("Grade obtained:AA");
            }
            else if (marks>=80){
                System.out.println("Grade obtained:AB");
            }
            else if (marks >=70){
                System.out.println("Grade obtained:BB");
            }
            else if(marks>=60){
                System.out.println("Grade obtained:BC");
            }
            else if(marks>=50){
                System.out.println("Grade obtained:CC");
            }
            else if(marks<50){
                System.out.println("FAIL");
            }


        }

        else {
            System.out.println("Not eligible to view the grades.");
        }


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any string:");
        String s=sc.nextLine();

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("a"));
        System.out.println(s.indexOf(" "));




       // Number guessing game //


        // break and continue concept //


        for(int i=1;i<=20;i++) {
             if(i==18){
                 break;
             }
             if(i%3==0){
                 continue;
             }
            System.out.println(i);
        }



        // right angled triangle //

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }




        int i=1;

        while(i<=50){
            if(i%2==0){
                System.out.println(i);
            }
           i++;
        }




    }
}

*/

// public class Main{
//    public static void main(String[] args) {
//
//        // method :- a block of reusable code used whenever in need using () //
//
//
//        happyashv();
//        happyashv();
//    }
//        static void happyashv(){
//        System.out.println("ASHV ,Let's finish this buisness ! ");
//        System.out.println("Let's finish JAVA ! ");
//    }
//
//
//}

//public class Main{
//    public static void main(String[] args){
//
//        introduction("Ashv",19);
//        introduction("Nihal",18);
//
//    }
//
//    static void introduction(String name ,int age ){
//        System.out.println("Hello!");
//        System.out.printf("My name is %s \n ",name);
//        System.out.printf("& I am %d years old \n",age);
//
//    }


// }

//public class Main{
//    public static void main(String[] args){
//        math(3,9);
//
//    }
//
//    static void math(int num, int num1){
//
//        System.out.printf("Number %d is to be squared \n ",num);
//        System.out.printf("The square of "+num+" is: "+num1);
//
//    }
//
//
//}

// the above method was not used in return type i.e. using void  //

// now return type //

//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println(square(4));
//        System.out.println(cube(6));
//    }
//    static int square(int num )
//    {return num*num;}
//    static double cube(double num)
//    {return num * num * num;}
//
//}

//
//public class Main{
//    public static void main(String[] args){
//
//        String identity=westeros("Ashv","Kandel");
//        System.out.printf("Your full name is %s",identity);
//    }
//    static String westeros(String firstname,String lastname)
//    {
//        return(firstname+ " "+ lastname);
//    }
//
//}


// to find the sum of two numbers //

//public class Main{
//    public static void main(String[] args) {
//        int op=sum(14,100);
//        System.out.println(op);
//    }
//    static int sum(int a ,int b){
//        return a+b;
//
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//
//        verify(11);
//    }
//static void verify(int age)
//{
//    if(age>18){
//        System.out.println("You are eligible to vote !");
//    }
//    else{
//        System.out.println("Not eligible!");
//    }
//
//}
//
//
//}

// to reverse a string // (imp question)

// even number concept using methods //

//public class Main{
//    public static void main(String[] args)
//    {
//        System.out.print( isEven(18));
//
//    }
//    static boolean isEven(int n)
//    {
//        if(n%2==0){
//            return true;
//       }
//        else {
//            return false;
//        }
//    }
//
//}
//


// greater of two numbers using methods //

//
//public class Main{
//    public static void main(String[] args){
//
//
//        int maximum=maxOfTwo(111,5000);
//        System.out.println(maximum);
//
//
//    }
//    static int maxOfTwo(int x,int y){
//        return Math.max(x,y);
//    }
//
//}



// multiplication of a table using methods //
//
//public class Main{
//    public static void main()
//    {
//
//      multiply(5);
//
//    }
//    static int multiply(int n){
//
//        for(int i=1;i<=10;i++){
//            int m=n*i;
//            System.out.println(m);
//        }
//
//        return 0;
//
//    }
//
//}



//
//public class Main{
//    public static void main(){
//
//
//        System.out.println(findArea(18));
//    }
//    static double findArea(int s){
//
//        return s*s;
//    }
//
// similarly the other mensuration concepts //
//
//}

// to reverse a given string using methods //

//public class Main{
//    public static void main(String[] args){
//
//      String org=updated("Computer Science");
//      String newstring=new StringBuilder(org).reverse().toString();
//        System.out.println(newstring);
//
//
//    }
//    static String updated(String str){
//        return(str);
//
//    }
//}

// to check if the number is a palindromic number //

// arrays //

import java.util.Arrays;
import java.util.Scanner;

//
//public class Main {
//
//    public static void main(String args[]) {
//        String phones[] = {"iPhone", "Samsung", "OnePlus"};
//        // arrays are stored in such manner //
//
//        System.out.println(phones[0]); // indexing of elements //
//
//        System.out.println(phones.length); // length of an array //
//
//        // adding an element in an array //
//
//
//
//
//        //  important inbuilt//
//
//        Arrays.sort(phones); // sorting according to alphabetical order//
//        Arrays.fill(phones,"Motorola");
//
//
//        for(int i=0;i<phones.length;i++){
//            System.out.println(phones[i]); // to print all the array elements //
//        }
//
//
// }
//
//
//
//
//
//
// }
//
//public class Main{
//    public static void main(){
//
//
//        String array1[] ={"LENOVO","ASUS","MSI"};
//        System.out.println(array1[0]);
//
//        for(int i=0;i<=2;i++){
//            System.out.println(array1[i]); // for printing the whole created array //
//        }
//
//    }


// }

// user input for an array , searching in an array , 2D array //

//public class Main{
//    public static void main(){

//        Scanner sc=new Scanner(System.in);
//
//
//
//
//        String array1[]=new String[5];
//
//        for(int i=0;i<=4;i++){
//            System.out.print("Enter the phone name:");
//            array1[i]=sc.nextLine();
//
//        }
//
//        for(int i=0;i<=4;i++){
//            System.out.println(array1[i]);  //can be done using enhanced for loop //
//
//        }

        // searching an arrays' element //

//
//int array2[]={1,3,5,7,9};
//
//int ourTarget=1;
//boolean found=false;
//
//
//for(int i=0;i<array2.length;i++){  // indices and size issue //
//    if(ourTarget==array2[i]){
//        System.out.println("Element found at "+i);
//        found=true;
//        break;
//    }
//
//}
//
//if(!found){
//    System.out.println("Element doesn't exist");
//}


// let that be for another datatype //

//    String array3[]={"AC","TV","FRIDGE","WM"};
//boolean isFound=false;
//
//for(int i=0;i<array3.length;i++){
//    if(array3[i].equals("Chair")){
//        System.out.println("Element exists at "+i);
//        isFound=true;
//        break;
//
//    }
//
//
//
//    }
//        if(!isFound){
//            System.out.println("Element doesn't exists !");
//
//}







//    }
//
//}

//
//public class Main{
//    public static void main(String args []){
//
//        // varargs concept //
//
//        // variable arguments basically means same name and varying no. of arguments //
//
//        set(10,78,90);
//        System.out.println(set(10,70,90));
//
//    }
//
//
//    static int set(int ...numbers){
//        int sum=0;
//
//        for(int i=0;i<numbers.length;i++){
//            sum=sum+numbers[i];  // the initial number + argument
//
//
//        }
//        return sum;
//
//    }
//
//
//
//}

// similarly for average of numbers using varargs //

//public class Main{
//    public static void main(){
//
//        avg(10,11,15,9);
//        System.out.println(avg(10,11,15,9));
//    }
//
//    static double avg(double ...array1){
//
//
//        double average;
//        double sum=0;
//
//        for(int i=0;i<array1.length;i++) {
//
//
//            sum = sum + array1[i];
//
//        }
//        return sum/array1.length;
//    }


//}

// 2D arrays //
//
//public class Main{
//    public static void main(){
//        // creation of multiple arrays //
//
//        Scanner sc=new Scanner(System.in);
//
//        String array1[]=new String[3];
//
//        for(int i=0;i<array1.length;i++) {
//            System.out.print("Enter the accessory:");
//            array1[i]= sc.nextLine();
//
//        }
//
//        String array2[]=new String[3];
//        for(int i=0;i<array1.length;i++){
//            System.out.print("Enter the price:");
//            array2[i]=sc.nextLine();
//
//        }
//
//        String market[][]={array1,array2};
//
//
//        for(String[] dummy1:market){
//            for(String dummy2:dummy1){
//                System.out.print(dummy2+ ' ');
//
//            }
//            System.out.println();
//        }
//
//
//
//
//
//
//
//        }

// }






//creation of 2D array (any one)//

//public class Main{
//    public static void main(){
//
//        int keypad1[]=new int[]{1,2,3};
//        int keypad2[]=new int[]{4,5,6};
//        int keypad3[]=new int[]{7,8,9};
//        int keypad4[]=new int[]{0,0,0};
//
//        int numberpad[][]={keypad1,keypad2,keypad3,keypad4};
//
//        for(int[]num:numberpad){
//            for(int newnum:num){
//                System.out.print(newnum+" ");
//
//            }
//            System.out.println();
//
//        }
//
//    }
//
//}
//



 /* public class Main{
    public static void main() {

        Scanner sc = new Scanner(System.in);


        String gameName[];

        gameName = new String[]{"GTA V", "NFS", "RDR II", "MORTAL KOMBAT", "F1 SIMULATION"};

        String price[];

        price = new String[]{"7000", "6000", "5000", "3000", "4500", "2000"};

        String Name[][] = {gameName, price};
        for (String[] name : Name) {        // enhanced for loop //

            for (String newName : name) {
                System.out.print(newName + " ");

            }
            System.out.println();
        }


        // searching in that particular array //


        System.out.print("Enter your price range (e.g. 3000-6000): ");
        String priceRange = sc.nextLine();

        String[] rangeParts = priceRange.split("-");
        int minPrice = Integer.parseInt(rangeParts[0].trim());
        int maxPrice = Integer.parseInt(rangeParts[1].trim());

        boolean found = false;

        for (int i= 0; i < Name[1].length; i++) {
            int currentPrice = Integer.parseInt(Name[1][i]);
            if (currentPrice >= minPrice && currentPrice <= maxPrice) {
                System.out.println(Name[0][i] + " - Rs." + Name[1][i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No games found in this price range.");
        }


    }
}
*/



// Quiz Program //

public class Main{
    static void main(){

        // creation of questions using arrays //

        String[] qs ={"1.WHAT WAS THE FIRST SOCIAL MEDIA PLATFORM ?",
                      "2.WHAT IS THE FULL FORM OF CSS ?",
                      "3.WHEN WAS THE PYTHON LANGUAGE INTRODUCED ? ",
                      "4.WHAT IS UX ?",
                      "5.USA CONSISTS OF HOW MANY STATES ?"
                     };

        // creation of multiple options using 2D arrays //

        String[][] options = {{"(a)Facebook", " (b)SixDegrees.com", "(c)Twitter", "(d)Hike"},
                {"(a) Cascading Style Sheet","(b)Central Styles Sheets","(c)Custom Style Script","(d)Clone Stroopers Standing"},
                {"(a) 1991","(b)1992","(c) 1999","(d)1981"},
                {"(a) Unidentified Xylophonist","(b) User Graphix","(c)User Experience","(d) Unidentified Graphix"},
                {"(a)35","(b)40","(c)28","(d)50"}
        };


        String answers[]={"b","a","a","c","d"};
        int score=0;


        for(int i=0;i<qs.length;i++){
            System.out.println(qs[i]);

            for(String newOptions:options[i]){         // enhanced for loop //
                System.out.print(newOptions+" ");

            }

            System.out.println();


            Scanner sc=new Scanner(System.in);
            System.out.print("option:");
            String ans=sc.nextLine();

            if(ans.equals(answers[i])){
                System.out.println();
                System.out.println("CORRECT !");
                System.out.println();
                score++;
            }

            else{
                System.out.println();
                System.out.println("INCORRECT !");
                System.out.println();
            }



        }

        System.out.println("Obtained score ~ "+score+" out of "+qs.length);








    }

}







