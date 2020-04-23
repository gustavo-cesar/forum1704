package forum2;

public class AppSmartphone {
	
	public static void main(String[] args) {
		

		/*celular.setPreco(35.0);
		celular.setPreco(90.0);
		celular.setMarca("");*/
		
		Smartphone celularDoGustavo = new Smartphone("A50", "Samsung", 1.00);
		
		celularDoGustavo.setPreco(3.50);
		celularDoGustavo.setNomeSmartphone("S10");
		System.out.println(celularDoGustavo);
		
		try {
			celularDoGustavo.setMarca("xiaomi");
			celularDoGustavo.setPreco(-9.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			celularDoGustavo.setNomeSmartphone("");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	
	}

}
