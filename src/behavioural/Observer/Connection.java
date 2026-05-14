package behavioural.Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
	private String name;
	private String status;

	// The modern, robust way to handle Observers in Java
	private PropertyChangeSupport support;

	public Connection(String name) {
		this.name = name;
		this.status = "";
		this.support = new PropertyChangeSupport(this);
	}

	// Method to allow Observers to subscribe
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	// Method to allow Observers to unsubscribe
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	public void setStatus(String newStatus) {
		String oldStatus = this.status;
		this.status = newStatus;

		// This is the broadcast!
		// It tells all listeners: "The 'status' property changed from X to Y"
		support.firePropertyChange("status", oldStatus, newStatus);
	}

	public String getName() {
		return name;
	}
}