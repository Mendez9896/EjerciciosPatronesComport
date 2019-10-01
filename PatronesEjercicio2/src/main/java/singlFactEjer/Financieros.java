package singlFactEjer;

public class Financieros extends Product{

	
	@Override
	public void retirar(int monto) {
		CuentaPrincipal.getUniqueInstance().retiro(monto);
		System.out.println("Se realizo un prestamo de financiero por " + monto + " bs");
		
	}


}
