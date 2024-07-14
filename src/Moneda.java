public class Moneda {
    private String codigo;
    private double tasaCambio;

    public Moneda(String codigo, double tasaCambio) {
        this.codigo = codigo;
        this.tasaCambio = tasaCambio;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }
}
