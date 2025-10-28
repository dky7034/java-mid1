package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        // 참조값인데.. 덧셈이 된다?! -> String 클래스의 특이성, 자바에서 편의상 특별히 + 연산을 제공함
        System.out.println("result2 = " + result2);
    }
}
