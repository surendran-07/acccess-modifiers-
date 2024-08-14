package surendran01;

public class accessmodifierdemo {
    public int publicField = 1;
    protected int protectedField = 2;
    int defaultField = 3;
    private int privateField = 4;

    public void publicMethod() {
        System.out.println("Public method accessed.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessed.");
    }

    void defaultMethod() {
        System.out.println("Default method accessed.");
    }

    private void privateMethod() {
        System.out.println("Private method accessed.");
    }

    public static void main(String[] args) {
        accessmodifierdemo obj = new accessmodifierdemo();

        // Accessing members with different access modifiers
        System.out.println("Public field: " + obj.publicField);
        System.out.println("Protected field: " + obj.protectedField);
        System.out.println("Default field: " + obj.defaultField);
       // System.out.println("Private field: " + obj.privateField); // Error: privateField is not accessible
    }
}