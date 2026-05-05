public com.javainto;
public class Arjun {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("sasidhar reddy");
    }

    public static void main(String[] args) {
        Arjun emp1 = new Arjun();
        Arjun emp2 = new Arjun();
        Arjun emp3 = new Arjun();
        Arjun emp4 = new Arjun();

        emp4 = emp1;
        System.gc();  // Requesting garbage collection

        System.out.println(emp1);  // Will print: null
        System.out.println(emp2);  // Will print object reference like Arjun@1b6d3586
        System.out.println(emp3);  // Similar output
        System.out.println(emp4);  // Similar output
    }
}
