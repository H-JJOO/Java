package other;

public class PracTestAdd {
    private String num1;
    private String num2;

    public PracTestAdd(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.num1, this.num2 );
    }



}

