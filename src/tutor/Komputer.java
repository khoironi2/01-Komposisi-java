package tutor;
// Komposisi : Bentuk khusus dari Agregasi
public class Komputer {
    private String nama;
    private double harga;
    private Processor proc;
    private Monitor mon;
    private Mouse mous;

   public Komputer(){
        proc = new Processor("AMD Ryzen 9", 3.5); // Komposisi
        mon = new Monitor("BenQ 32 inch"); // Komposisi
        mous = new Mouse("Logitech G502"); // Komposisi
    }

    public void setKomputer(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void addProcessor(Processor proc){
        this.proc = proc;
    }

    public void display(){
        System.out.println("Merk : " + this.nama + " Harga : " + this.harga);
        System.out.println("Processor : " + proc.getNamaProcessor() + proc.getKecepatan() + "Ghz");
        System.out.println("Monitor : " + mon.getNamaMonitor());
        System.out.println("Mouse : " + mous.getNamaMouse());
    }
}
