package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();

        // 생성된 로또 번호 출력
//        System.out.println("===== 정렬 전 =====");
//        System.out.print("로또 번호: ");
//        for (int lottoNumber : lottoNumbers) {
//            System.out.print(lottoNumber + " ");
//        }
//
//        System.out.println();

        // 오름차순 정렬
//        System.out.println("===== 정렬 후 =====");
        System.out.print("로또 번호: ");
        Arrays.sort(lottoNumbers);
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
