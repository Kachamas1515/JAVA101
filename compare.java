class Compare {
   /* 
   Goal
   1.public static void main (String[] args) {}  => what is meaning there?
   Answer
   public is access modifier
   static is keyword that is when associated with a method, making it a class-related method.
   void is return type
   main is method name
   (String[] args) is array od string type and is an array of type java.lang.String class.
   ------------------------------------------------------------------------------
   2.Difference == , === , .equals()
   Answer 
   //new object in Java Heap
   
   //double quote in  Java String Pool

   //stack vs heap
   => 
   ------------------------------------------------------------------------------
   3.javac or java **JDK**
   Answer 
   javac is the compiler  => javac filenmame
   java is loader/interpreter => java main-class for run
   ------------------------------------------------------------------------------
   4.private protected public 
   Answer picture access modifier
   ------------------------------------------------------------------------------
   5.overide overload
   ------------------------------------------------------------------------------
   6.interface
   ------------------------------------------------------------------------------
   7.abstract
   ------------------------------------------------------------------------------
   8.inherite or extends
   ------------------------------------------------------------------------------
   9.OOP concept
   ------------------------------------------------------------------------------
   10.Data Structure
   ------------------------------------------------------------------------------
   11.Design Pattern and SOLID concept
   ------------------------------------------------------------------------------
   */ 

   public static void main (String[] args) {
        System.out.println("Hello Java :)");
        compareFunction();
   }

   private static void compareFunction() {
    String s1 = "1";
    String s2 = "1";
    String s3 =  new String("1");

        //1.
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s3)); //true

        // 2.
        // System.out.println(s1 === s2); //not has in java lang

        //3.
        System.out.println(s1 == s3); // false 
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
   }
}