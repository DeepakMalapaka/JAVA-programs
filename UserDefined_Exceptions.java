public class UserDefined_Exceptions {
    public static void validate(int age)
    {
        if(age<18) {
            throw new ArithmeticException("Not Eligible");
        } 
        else {
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args) {
        validate(7);
    }
}
