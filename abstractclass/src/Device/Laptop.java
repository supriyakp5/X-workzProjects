package Device;

public  abstract class Laptop {

    public class Smartphone extends Laptop {
        @Override
        public void performFunction() {
            System.out.println("smartphone is performing function");
        }
    }
}