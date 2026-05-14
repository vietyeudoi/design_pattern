package behavioural.State;

public class PlayingState implements State {
	@Override
	public void play(MediaPlayer player) {
		// We are already playing, so we do nothing
		System.out.println("Action: Already playing. Ignoring click.");
	}

	@Override
	public void pause(MediaPlayer player) {
		System.out.println("Action: Pausing media...");
		// Update the UI icon
		player.setIcon("▶️ (Play Button)");
		// Transition back to the paused state
		player.setState(new PausedState());
	}
}