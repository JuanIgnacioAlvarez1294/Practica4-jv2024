package practica4_jv2024;

public class CuentaCorriente extends CuentaBancaria {
    private double sobregiro;

    public CuentaCorriente(double saldoInicial, double tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.sobregiro = 0;
    }

    @Override
    public void retirar(double cantidad) {
        super.retirar(cantidad);
        if (getSaldo() < 0) {
            sobregiro -= getSaldo();
            setComisionMensual(0); // Desactivar comisión mensual si hay sobregiro
        }
    }

    @Override
    public void consignar(double cantidad) {
        super.consignar(cantidad);
        if (getSaldo() >= 0) {
            sobregiro = 0;
            setComisionMensual(getComisionMensual()); // Restablecer comisión mensual
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
        if (getSaldo() < 0) {
            sobregiro -= getSaldo();
            setComisionMensual(0); // Desactivar comisión mensual si hay sobregiro
        }
    }

    public double getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(double sobregiro) {
		this.sobregiro = sobregiro;
	}

	public String toString() {
        return "CuentaCorriente: " + super.toString() + ", Sobregiro=" + sobregiro;
    }
}
