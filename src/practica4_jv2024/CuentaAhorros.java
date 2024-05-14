package practica4_jv2024;

public class CuentaAhorros extends CuentaBancaria {
    private boolean activa;

    public CuentaAhorros(double saldoInicial, double tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 10000;
    }

    @Override
    public void consignar(double cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Error: La cuenta de ahorros está inactiva.");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Error: La cuenta de ahorros está inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (getNumRetiros() > 4) {
            setComisionMensual(1000);
        }
        super.extractoMensual();
        activa = getSaldo() >= 10000;
    }

    public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public String toString() {
        return "CuentaAhorros: " + super.toString() + ", Activa=" + activa;
    }
}
