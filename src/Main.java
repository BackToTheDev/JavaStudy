import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String food = "백종원 김치찌개 만들기";
        double doubleRating = 4.5;
        double percent = 80;
        int intRating = (int) doubleRating;
        String recipe1 = "돼지고기는 핏물을 빼주세요.";
        String recipe2 = "잘익은 김치 한포기를 꺼내서 잘라주세요.";
        String recipe3 = "냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.";

        System.out.println("[ " + food + " ]");
        System.out.println("별점: " + intRating + " (" + percent + "%)");
        System.out.println("1." + recipe1);
        System.out.println("2." + recipe2);
        System.out.println("3." + recipe3);

    }
}