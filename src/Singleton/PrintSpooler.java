package Singleton;

public class PrintSpooler {
    private static PrintSpooler instance = new PrintSpooler();

    private PrintSpooler(){
        init();
    }
    private void init(){
    }
    public static PrintSpooler getInstance(){
        return instance;
    }
}
