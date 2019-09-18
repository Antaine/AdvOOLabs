package ie.gmit.sw;

public class CypherRunner {

	public static void main(String[] args)  throws CypherException {
		// TODO Auto-generated method stub
		Cypherator cc = new CypherKeyImpl(key);

		String message = "ATTACK THE CASTLE WALL AFTER DRINKS";
		String enc = cc.encrypt(message);

		System.out.println(enc);
		System.out.println(cc.decrypt(enc));
	}

}
