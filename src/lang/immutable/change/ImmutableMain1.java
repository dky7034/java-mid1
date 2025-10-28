package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1);
        System.out.println("obj1.value = " + obj1.getValue());
        System.out.println("obj2 = " + obj2);
        System.out.println("obj2.value = " + obj2.getValue());
    }
}
