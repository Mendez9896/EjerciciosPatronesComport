package singlFactEjer;

public class Negocios extends Product{

	
	@Override
	public void retirar(int monto) {
		CuentaPrincipal.getUniqueInstance().retiro(monto);
		System.out.println("Se realizo un prestamo de negocios por " + monto + " bs");
	}


}
