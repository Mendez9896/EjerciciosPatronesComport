package singlFactEjer;

public class FactoryProduct {

	public FactoryProduct() {
		// TODO Auto-generated constructor stub
	}
	public enum Prestamos{
		vivienda, negocios, creditos, financieros; 
	}
	
	public static Product make(Prestamos type) {
		Product product;
		switch (type) {
		case vivienda:
			product = new Vivienda();
			break;
		case negocios:
			product = new Negocios();
			break;
		case creditos:
			product = new Creditos();
			break;
		case financieros:
			product = new Financieros();
			break;
		default:
			product = new Creditos();
			break;
		}
		return product;
		
	}

	
	
}


