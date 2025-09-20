package entities;

public abstract class People {

    private String name;
    private double rendaAnual;

    public People() {
    }

    public People(double rendaAnual, String name) {
        this.rendaAnual = rendaAnual;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();




}
