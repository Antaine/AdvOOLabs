package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		RSACypher cypher = new RSACypher();

		String s = "ATTACK THE CASTLE WALL AFTER TEA.";
		byte[] t = cypher.encrypt(s.getBytes());
		System.out.println(new String(t));
		System.out.println(new String(cypher.decrypt(t)));
	}

}
