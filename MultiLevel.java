class Level1 {
    public void MethodA() {
        System.out.println("I am Level1");
    }
}
class Level2 extends Level1 {
    public void MethodB() {
        System.out.println("I am Level2");
    }
}
class MultiLevel extends Level2 {
    public void MethodC() {
        System.out.println("I am Level");
    }
    public static void main(String args[]) {
        MultiLevel obj=new MultiLevel();
        obj.MethodC();
        obj.MethodA();
        obj.MethodB(); 
    }

}