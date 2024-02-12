public class MessageService{

    private Network network;

    public MessageService(Network network){
        this.network=network;
    }

    public boolean sendMessage(String ip, String message){
        return network.sendMessage(ip, message);
    }

}

