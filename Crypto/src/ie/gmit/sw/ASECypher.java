package ie.gmit.sw;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class ASECypher extends AbstractCypher {

	public ASECypher() throws Throwable {
		super();
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		Key key = keyGen.generateKey();
		Cipher cypher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cypher.init(Cipher.DECRYPT_MODE, key);

	}

}
