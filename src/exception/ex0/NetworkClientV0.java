package exception.ex0;

public class NetworkClientV0 {

    // 상수는 반드시 초기화 시켜줘야하기 때문에 변수에 바로 값을 지정해주던가
    private final String address;

    // 아니면 생성자를 통해 초기화를 시켜준 다음 생성자를 통해 값을 넣어주던가 해야한다
    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }


}
