public class Exception_handling {
    public static void main(String[] args) {
        //Arithematic Exception 
        try {
            int a=10/0;
            System.out.println(a);
        } catch (Exception ae) {
            System.out.println(ae);
        }
        //Array out of bound exception
        try {
            int a[]={1,2,3,4,5};
            System.out.println(a[10]);
        } catch (Exception be) {
            System.out.println(be);
        }
        try {
            String s=null;
            System.out.println(s.length());
        } catch (Exception se) {
            System.out.println(se);
        }
    }
}
