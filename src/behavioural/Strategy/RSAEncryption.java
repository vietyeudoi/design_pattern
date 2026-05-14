package behavioural.Strategy;

public class RSAEncryption implements EncryptionStrategy {
	@Override
	public String encrypt(String data) {
		System.out.println("Applying Rivest-Shamir-Adleman (RSA) encryption...");
		return "RSA_ENCRYPTED_[" + data + "]";
	}
}