package main;

public class Single {

    private String str;

    public Single() {
    }

    public String getStr(){
        System.out.println("Running method getStr");
        return this.str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
