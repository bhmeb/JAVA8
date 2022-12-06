package Java8_Default_Static_Method2;

public class Client14 implements Interface1,Interface4{

    //Note
    //If both interface has same method
    //Then we need to implement them the method
    //either it will be conflict.

    public void methodA(){
        System.out.println("Inside Method A - " + Client14.class);
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }

}
