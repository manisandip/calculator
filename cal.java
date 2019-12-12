public class cal {

    int a = 20 ;// non static variable inside the class and outside the method
    static int b = 30 ; //static variable inside the class but outside the method
    //No return type -with  parameters Instance method


    public static void addition (int a , int b ){

        System.out.print("ADDITION OF  "+a+" and "+b+" = ");
        System.out.println(a+b );
    }
    public static void subtraction ( int a ,int b ){
        System.out.print( "SUBTRACTION OF "+a+" and "+b+" = ");
        System.out.println(a-b );
    }

    public static void multiplication ( int a , int b ){

        System.out.print( "MULTIPLICATION OF "+a+" and "+b+" = ");
        System.out.println( a*b  );
    }
    public static void division (int a ,int b ){
        System.out.print("DIVISION OF  " + a + " and " + b + " = ");

        System.out.println( a/b);
    }
    public static void main (String[] args){
        String con ="CALCULATION : ";//local variable -declared inside the method
        System.out.println(con );
        addition (20 ,30 ); //static method 'addition' come direct in static method area
        subtraction( 100 , 50 ); //static method 'subtraction' come direct in static method area
        multiplication( 30 ,20); //static method 'multiplication' come direct in static method area
        division(50,10 ); //static method 'division' come direct in static method area
}
}