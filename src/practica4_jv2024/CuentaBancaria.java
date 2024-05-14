package practica4_jv2024;

public class CuentaBancaria {
    private double saldo;
    private int numConsignaciones;
    private int numRetiros;
    private double tasaAnual;
    private double comisionMensual;

    public CuentaBancaria(double saldoInicial, double tasaAnual) {
        this.saldo = saldoInicial;
        this.numConsignaciones = 0;
        this.numRetiros = 0;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = 0.0;
    }
    
    public CuentaBancaria() {
    	
    }

    public void consignar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numConsignaciones++;
            System.out.println("Consignación realizada. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: La cantidad a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                numRetiros++;
                System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
            } else {
                System.out.println("Error: Fondos insuficientes.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        }
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldo * tasaAnual) / 12 / 100;
        saldo += interesMensual;
        System.out.println("Interés mensual calculado y saldo actualizado: " + saldo);
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
        System.out.println("Extracto mensual generado. Nuevo saldo: " + saldo);
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numConsignaciones);
        System.out.println("Número de retiros: " + numRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConsignaciones() {
		return numConsignaciones;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		this.numConsignaciones = numConsignaciones;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public double getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(double tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public double getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(double comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", numConsignaciones=" + numConsignaciones + ", numRetiros="
				+ numRetiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
    
}