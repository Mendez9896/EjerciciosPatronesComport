package singlFactEjer;

public class Vivienda extends Product{

	
	@Override
	public void retirar(int monto) {
		CuentaPrincipal.getUniqueInstance().retiro(monto);
		System.out.println("Se realizo un prestamo de vivienda por " + monto + " bs");
		
	}


}
