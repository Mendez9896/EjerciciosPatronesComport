package singlFactEjer;

public class CuentaPrincipal {
	
	private static CuentaPrincipal instance = null;
	private int saldo;
	
	public void depositar(int monto) {
		saldo += monto;
	}
	
	public void retiro(int monto) {
		if(monto > saldo) {
			System.out.println("Fondos insuficientes");
		}else {
			saldo -= monto;
		}
	}
	
	
	
	private CuentaPrincipal() {
		System.out.println("Creating cuenta");
	}
	public static synchronized CuentaPrincipal getUniqueInstance() {
		if(instance == null) {
			instance = new CuentaPrincipal();
		}
		return instance;
	}

	public void myInstance() {
		System.out.println("Using cuenta");
	}
	
}
