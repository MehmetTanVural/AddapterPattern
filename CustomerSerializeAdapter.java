package AdapterPatternExample;

public class CustomerSerializeAdapter implements IJsonSerializer {
	
	// adapter amac� : temelde olu�turdu�umuz interfaceyi sisteme yeni dahil etti�imiz class da kullmam�z� sa�lar.

	@Override
	public String SerializeObject(Object object) {

      CustomerSerialize customSerializer = new CustomerSerialize(); // CustomSererializer g�r�ld��� gibi ilk olu�turdu�umuz s�n�f adapter i�inde kullan�l�yor.
      
      return customSerializer.Serialize(object);		
		
		
	}
	
	
	
	
	
	

}
