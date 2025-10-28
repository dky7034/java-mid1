package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String newStr = str.concat("java");
        System.out.println("str = " + str); // hello
        System.out.println("newStr = " + newStr); // hellojava
    }
}
