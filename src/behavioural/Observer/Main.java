package behavioural.Observer;

public class Main {
	public static void main(String[] args) {
		// 1. Create the Subjects
		Connection alice = new Connection("Alice");
		Connection bob = new Connection("Bob");

		// 2. Create the Observer
		SocialMediaFeed myFeed = new SocialMediaFeed();

		// 3. Initially, they are not connected.
		System.out.println(">> Alice changes status BEFORE we subscribe:");
		alice.setStatus("Having a great morning!");
		myFeed.printFeed(); // Feed will be empty

		// 4. Subscribe our feed to listen to Alice and Bob
		alice.addPropertyChangeListener(myFeed);
		bob.addPropertyChangeListener(myFeed);

		// 5. Now, watch what happens when they update their statuses
		System.out.println(">> Connections change statuses AFTER we subscribe:");
		bob.setStatus("Just ate a huge sandwich.");
		alice.setStatus("Going for a run! 🏃");

		// 6. The feed caught everything automatically!
		myFeed.printFeed();
	}
}