package Java8_Default_Static_Method2;

//Multiple Inheritance not possible before Java8 but in Java8 it possible
public class Client123 implements Interface1,Interface2,Interface3{

    public void methodA(){
        System.out.println("Inside Method A - " + Client123.class); //overriding the default method in the implementation class.
    }

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA(); //overriding to the child implementation
        client123.methodB();
        client123.methodC();
    }
}
