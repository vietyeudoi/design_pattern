package behavioural.State;

public class MediaPlayer {
	private State state;
	private String icon;

	public MediaPlayer() {
		// We initialize the player in a paused state
		this.state = new PausedState();
		this.icon = "▶️ (Play Button)";
		System.out.println("--- Media Player Started ---");
		System.out.println("Current UI Icon: " + icon + "\n");
	}

	// Setters for the states to transition the player
	public void setState(State state) {
		this.state = state;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		System.out.println(" [UI Update] Icon changed to: " + icon);
	}

	// --- DELEGATION ---
	// The player doesn't use if/else. It just asks its state what to do.

	public void play() {
		state.play(this);
	}

	public void pause() {
		state.pause(this);
	}
}