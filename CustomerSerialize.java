package AdapterPatternExample;

public class CustomerSerialize {
	
	// sisteme sonradan dahil olan yapý gibi düþünelim bu yapý interfaceyi kullanmak için adaptere ihtiyaç duyacak direkt kullanamicak.
	
	
	public String Serialize(Object object)
	{
		
		return "serialized with CustomSerializer";
	}

}
