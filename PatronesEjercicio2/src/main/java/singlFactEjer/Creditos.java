package singlFactEjer;

public class Creditos extends Product{

	
	@Override
	public void retirar(int monto) {
		CuentaPrincipal.getUniqueInstance().retiro(monto);
		System.out.println("Se realizo un prestamo de creditos por " + monto + " bs");
		
	}


}
