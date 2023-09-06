package ch09nested.example.no7;

public class Chatting {
    class Chat{
        void start(){}
        void sendMessage(String message){}
    }

    void startChat(String chatId){
//        String nickName = "Null"; // final 을 사용해서 하나의 nickname으로 표시해야 한다
//        nickName = chatId;
        final String nickName = chatId;

        Chat chat = new Chat(){
            @Override
            public void start(){
                while(true){
                    String inputData = "안녕";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }




}
