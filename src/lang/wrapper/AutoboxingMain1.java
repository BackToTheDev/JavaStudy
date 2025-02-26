package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> primitive
        int unBoxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);

    }
}
