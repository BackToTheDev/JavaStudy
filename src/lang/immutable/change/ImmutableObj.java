package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //자기 자신의 값을 바꾸는게 아니라 새로운 객체를 생성해서 값을 넣어준다.
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        ImmutableObj immutableObj = new ImmutableObj(result);
        return immutableObj;
    }

    public int getValue() {
        return value;
    }


}
