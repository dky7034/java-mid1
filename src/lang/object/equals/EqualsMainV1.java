package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // 동일성 (메모리 주소 / 참조값 비교)
        System.out.println("equality = " + (user1.equals(user2))); // 동등성 (논리적으로 같은지 비교) - 오버라이딩 필요!!

    }
}
