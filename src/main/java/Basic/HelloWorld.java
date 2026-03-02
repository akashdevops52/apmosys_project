package Basic;

public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello There!!!");
        
        // calling m1 method
        HelloWorld obj = new HelloWorld();
        obj.m1();
    }
    
    public void m1() {
        System.out.println("from m1");
    }
}