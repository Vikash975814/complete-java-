class BaseClass {
    BaseClass() {
        System.out.println("Base class constructor");
    }
}

class SubClass extends BaseClass {
    SubClass() {
        System.out.println("Subclass constructor");
    }
}

public class Vikas {
    public static void main(String[] args) {
      BaseClass obj = new BaseClass();
    }
}
