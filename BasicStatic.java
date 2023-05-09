class MyClass {
	 MyClass() {
	        System.out.println("Constructor");
	    }
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

}

public class vikas {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}
