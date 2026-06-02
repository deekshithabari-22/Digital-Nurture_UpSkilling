public class PlayInstruments {
    public static void main(String[] args) {
        Playable piano = new Piano();
        Playable guitar = new Guitar();

        piano.play(); // Output: Playing piano...
        guitar.play(); // Output: Playing guitar...
    }
}
