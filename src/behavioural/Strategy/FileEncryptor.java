package behavioural.Strategy;

public class FileEncryptor {
	// Composition: The context holds a strategy
	private EncryptionStrategy strategy;

	public FileEncryptor(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	// This allows dynamically swapping the algorithm at runtime
	public void setStrategy(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	// The context delegates the actual work to the strategy
	public void processFile(String fileName, String data) {
		System.out.println("\nProcessing file: " + fileName);
		String encryptedData = strategy.encrypt(data);
		System.out.println("Result: " + encryptedData);
	}
}