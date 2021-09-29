package ch04;

public class SwitchExample {
    public static void main(String[] args) {
        // 1~6
        int num = (int)(Math.random() * 6) + 1;
//int(정수), String(문자열) 가능 (실수, boolean 은 안됨)
        switch (num) {//num 으로 나온 숫자부터 실행해서 break 나올때까지 실행
            case 1://만약에 1인경우 break 만나기 전까지 실행
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default://else if 로 따지면 else 와 같음, 1~5 제외한 모든 값나오면 실행
                System.out.println("6번이 나왔습니다.");
        }

    }
}
