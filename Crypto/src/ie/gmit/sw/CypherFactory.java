package ie.gmit.sw;

public class CypherFactory {
	private static CypherFactory f = new CypherFactory();

	private CypherFactory() {
	}

	public static CypherFactory getInstance() {
		return f;
	}

	public Cypherable getCypher(CypherMode mode) throws Throwable {
		
		if(mode == CypherMode.Symmetric)
		{
			return new AESCypher();
		}
		
		else {
			return new RSACypher();
		}
	}
}
