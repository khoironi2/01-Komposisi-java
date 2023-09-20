package tutor;

public class Processor {
    private String nama;
    private double kecepatan;

    Processor(String nama, double kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public String getNamaProcessor(){
        return this.nama;
    }
    public void setNamaProcessor(String nama){
        this.nama = nama;
    }

    public double getKecepatan(){
        return this.kecepatan;
    }
}
