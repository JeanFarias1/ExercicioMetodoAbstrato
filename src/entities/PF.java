package entities;

public class PF extends People {

    private Double gastosComSaude;

    public PF() {
    }

    public PF(double rendaAnual, String name, Double gastosComSaude) {
        super(rendaAnual, name);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double imposto() {
        if (getRendaAnual() < 20.000) {
            return getRendaAnual() * 0.15 - (getGastosComSaude() / 2);
        } else {
            return getRendaAnual() * 0.25 - (getGastosComSaude() / 2);
        }
    }

}
