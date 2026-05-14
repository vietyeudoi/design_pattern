package behavioural.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
	private List<String> statuses = new ArrayList<>();

	// This method fires automatically when an observed object calls firePropertyChange
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// We verify that the property that changed was indeed the "status"
		if ("status".equals(evt.getPropertyName())) {

			// We can extract exactly who fired the event and what the new value is
			Connection source = (Connection) evt.getSource();
			String newStatus = (String) evt.getNewValue();

			// Add it to our feed
			statuses.add(source.getName() + " posted: " + newStatus);
			System.out.println("🔔 PING! Your feed was just updated by " + source.getName());
		}
	}

	public void printFeed() {
		System.out.println("\n--- My Social Media Feed ---");
		if (statuses.isEmpty()) {
			System.out.println("(No new updates)");
		} else {
			for (String status : statuses) {
				System.out.println(status);
			}
		}
		System.out.println("----------------------------\n");
	}
}