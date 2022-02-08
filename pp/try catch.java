//sabeeh k 49 
//Java program that shows the usage of try, catch, throws and finally

class Main {
    public static void main(String[] args)
    {
        int a = 10, b = 0, result;
        try {
            result = a / b;
            System.out.println("result" + result);
        }
  
        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }
  
        finally {
            System.out.println("Process ended");
        }
    }
}
