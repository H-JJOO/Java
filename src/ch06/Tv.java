package ch06;

public class Tv {
    private String brand = null;//레퍼런스형은 null//boolean 형은 false
    private int inch = 0;//숫자형은 0

    public String getBrand() {//외부로 값을 내보낸다
        return brand;
    }

    public void setBrand(String brand) {//외부에서 들어온 값을 나 자신에게 넣어준다.
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    //getters, setters


}
