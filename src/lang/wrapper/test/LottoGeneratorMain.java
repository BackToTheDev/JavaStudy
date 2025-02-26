package lang.wrapper.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        //생성된 로또 번호 출력
        System.out.print("로또 번호: ");
        for (int i = 0; i < lottoNumbers.length; i++) {
            int lottoNumber = lottoNumbers[i];
            System.out.print(lottoNumber + " ");
        }
    }
}
