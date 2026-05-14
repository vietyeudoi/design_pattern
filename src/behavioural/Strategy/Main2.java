package behavioural.Strategy;

public class Main2 {
	public static void main(String[] args) {
		String document = "Confidential Report";

		// 1. We can pass a Lambda directly into the constructor
		// This acts as an anonymous, on-the-fly strategy!
		FileEncryptor app = new FileEncryptor(data -> {
			System.out.println("Applying simple Caesar Cipher shift...");
			return "SHIFTED_[" + data + "]";
		});

		app.processFile("report.doc", document);

		// 2. We can dynamically set a new Lambda strategy later
		app.setStrategy(data -> {
			System.out.println("Applying Base64 Encoding...");
			return "BASE64_[" + data + "]";
		});

		app.processFile("report_v2.doc", document);
	}
}