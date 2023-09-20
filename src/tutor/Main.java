package tutor;

public class Main {
    public static void main(String[] args) {

        Komputer komputer1 = new Komputer();
        Komputer komputer2 = new Komputer();
        
        komputer1.setKomputer("Lenovo Yoga", 9.500000);
        komputer2.setKomputer("Acer Nitro", 13.400000);
        
        Processor processor1 = new Processor("Intel Iris", 4.5);
        
        komputer2.display();
        komputer1.addProcessor(processor1);
        komputer1.display();

        
    }
}
