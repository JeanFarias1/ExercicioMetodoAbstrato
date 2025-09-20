package entities;

public class PJ extends People {

    private Integer numeroDeFuncionarios;

    public PJ() {
    }

    public PJ(double rendaAnual, String name, Integer numeroDeFuncionarios) {
        super(rendaAnual, name);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        if (numeroDeFuncionarios < 10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }
}
