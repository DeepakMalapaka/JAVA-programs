class car_Inheritance {
    String color="White";
    String model="model 3";
    String company="Tesla";
}
class owner_Inheritance extends car_Inheritance {
    String name="Deepak";
    int ssn=1234567890;
    String dob="12-34-2898";
    public static void main(String args[]) {
        owner_Inheritance obj=new owner_Inheritance();
        System.out.printf("The details of owner are \n name:%s\n dob:%s\n ssn:%d\n",obj.name,obj.dob,obj.ssn);
        System.out.printf("The details of cyber truck are \n color:%s\n model:%s\n company:%s\n",obj.color,obj.model,obj.company);
        System.out.println("Done single Inheritance");
    }
}