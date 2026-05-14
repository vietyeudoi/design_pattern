package behavioural.State;

public class PausedState implements State {
	@Override
	public void play(MediaPlayer player) {
		System.out.println("Action: Starting media playback...");
		// Update the UI icon
		player.setIcon("⏸️ (Pause Button)");
		// Transition to the new state
		player.setState(new PlayingState());
	}

	@Override
	public void pause(MediaPlayer player) {
		// We are already paused, so we do nothing
		System.out.println("Action: Already paused. Ignoring click.");
	}
}