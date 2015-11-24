package source;

public class Printer implements IPrintf{

    private String str = null;

    public Printer(String str) {
        this.str = str;
    }

    @Override
    public void printf() {
        System.out.println(str);
    }
}
