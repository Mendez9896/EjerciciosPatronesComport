package singlFactEjer;

import singlFactEjer.FactoryProduct.Prestamos;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CuentaPrincipal.getUniqueInstance().depositar(1000);
		FactoryProduct.make(Prestamos.vivienda).retirar(500);;
		FactoryProduct.make(Prestamos.negocios).retirar(100);;
		FactoryProduct.make(Prestamos.creditos).retirar(150);;
		FactoryProduct.make(Prestamos.financieros).retirar(150);;
	

	}

}
