package AdapterPatternExample;

public class CustomerSerializeAdapter implements IJsonSerializer {
	
	// adapter amacý : temelde oluþturduðumuz interfaceyi sisteme yeni dahil ettiðimiz class da kullmamýzý saðlar.

	@Override
	public String SerializeObject(Object object) {

      CustomerSerialize customSerializer = new CustomerSerialize(); // CustomSererializer görüldüðü gibi ilk oluþturduðumuz sýnýf adapter içinde kullanýlýyor.
      
      return customSerializer.Serialize(object);		
		
		
	}
	
	
	
	
	
	

}
