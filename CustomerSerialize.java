package AdapterPatternExample;

public class CustomerSerialize {
	
	// sisteme sonradan dahil olan yap� gibi d���nelim bu yap� interfaceyi kullanmak i�in adaptere ihtiya� duyacak direkt kullanamicak.
	
	
	public String Serialize(Object object)
	{
		
		return "serialized with CustomSerializer";
	}

}
