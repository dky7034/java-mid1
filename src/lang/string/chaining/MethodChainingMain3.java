package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        // 메서드 체이닝
        // 메서드 결과로 반환된 참조값을 즉시 사용해서 바로 메서드를 호출
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
        System.out.println("result = " + adder);
    }
}
