package other;

public class PracTest4 {
    private String shape;
    private String value;

    public PracTest4(String shape, String value) {
        this.shape = shape;
        this.value = value;
    }

    public String getShape() {
        return this.shape;
    }

    public String getValue() {
        return this.value;
    }

    public int getPoint() {
        switch (value) {
            case "A":
                return 1;
            case "J": case "Q": case "K":
                return 10;
            default:
                return Integer.parseInt(value);
        }
    }
}
