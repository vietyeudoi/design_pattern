package behavioural.Strategy;

public class AESEncryption implements EncryptionStrategy {
	@Override
	public String encrypt(String data) {
		System.out.println("Applying Advanced Encryption Standard (AES)...");
		return "AES_ENCRYPTED_[" + data + "]";
	}
}