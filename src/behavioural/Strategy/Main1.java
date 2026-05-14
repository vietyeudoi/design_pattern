package behavioural.Strategy;

public class Main1 {
	public static void main(String[] args) {
		String secretData = "TopSecretPassword123";

		// Start with AES
		FileEncryptor app = new FileEncryptor(new AESEncryption());
		app.processFile("passwords.txt", secretData);

		// Dynamically switch to RSA
		app.setStrategy(new RSAEncryption());
		app.processFile("bank_details.txt", secretData);
	}
}