package ch04;

public class ForStarTest3 {
    public static void main (String[] args) {
        /*
        if star = 2
        _*
        **

        if star = 3
        __*
        _**
        ***

        if star = 4
        ___*
        __**
        _***
        ****
     */

        int star = (int)(Math.random() * 5) + 2; //2~6

        System.out.println("star : " + star);
        for (int i = star; i > 0; i--) {
            for (int z = 1; z <= star ; z++) {
                if(z<i) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }



    }
}
