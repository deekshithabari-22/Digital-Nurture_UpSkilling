public class MethodOverloading {

    private static int add(int a,int b){
        return a+b;
    }

    private static double add(double a,double b){
        return a+b;
    }

    private static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int val1=add(10,15);
        double val2=add(15.3,14.6);
        int val3=add(10,100,5);

        System.out.println("The output returned by add method which accepts two integers is: "+val1);

        System.out.println("The output returned by add method which accepts two doubles is: "+val2);

        System.out.println("The output returned by add method which accepts three integers is: "+val3);

    }
}
