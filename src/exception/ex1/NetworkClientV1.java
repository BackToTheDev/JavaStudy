package exception.ex1;

public class NetworkClientV1 {

    // 상수는 반드시 초기화 시켜줘야하기 때문에 변수에 바로 값을 지정해주던가
    private final String address;
    public boolean connectError;
    public boolean sendError;

    // 아니면 생성자를 통해 초기화를 시켜준 다음 생성자를 통해 값을 넣어주던가 해야한다
    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {

        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패 " + data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }


}
