package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱

        //Wrapper -> primitive
        int unBoxedValue = boxedValue; //오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
