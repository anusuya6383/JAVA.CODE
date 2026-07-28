public class Demo{
    public static void main(String[]args){
        int age=20;
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
