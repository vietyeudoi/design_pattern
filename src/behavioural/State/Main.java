package behavioural.State;

public class Main {
	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();

		// 1. User clicks Play
		System.out.println(">> User clicks PLAY:");
		player.play();

		System.out.println("\n>> User clicks PLAY again:");
		player.play();

		System.out.println("\n>> User clicks PAUSE:");
		player.pause();

		System.out.println("\n>> User clicks PAUSE again:");
		player.pause();
	}
}