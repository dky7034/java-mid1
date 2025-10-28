package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 메서드 체이닝
        String string = sb.append("A").append("B").append("C").append("D").insert(4, "Java").delete(4, 8).reverse().toString();

//        sb.append("A");
//        sb.append("B");
//        sb.append("C");
//        sb.append("D");
//        System.out.println("sb = " + sb);
//
//        sb.insert(4, "Java");
//        System.out.println("insertJava = " + sb);
//
//        sb.insert(1, "A");
//        System.out.println("insertA = " + sb);
//
//        sb.delete(4, 8);
//        System.out.println("delete = " + sb);
//
//        sb.reverse();
//        System.out.println("reverse = " + sb);
//
//        // StringBuilder -> String (가변에서 불변으로)
//        String string = sb.toString();

        System.out.println("string = " + string);
    }

}
