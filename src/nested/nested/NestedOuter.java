package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스는 다른 클래스를 단순히 중첩해 둔 것일 뿐임.
    // 쉽게 이야기해서, 둘은 아무런 관계가 없음.
    // 같은 클래스에 있으니, 정적 중첩 클래스에서 외부클래스의 private에 접근할 수 있다는 특징이 있을 뿐임.
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버는 접근할 수 없음
//            System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있음
            System.out.println(outClassValue);
        }

    }
}
