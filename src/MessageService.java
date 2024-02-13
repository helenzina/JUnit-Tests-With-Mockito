public class MessageService{

    private Network network;

    public MessageService(Network network){
        this.network=network;
    }

    public boolean sendMessage(String ip, String message){
        if(network.sendMessage(ip,message)){
            return true;
        }else if (network.sendMessage(ip,message)){
           return true;
        }else{
            return false;
        }
        //return network.sendMessage(ip, message);
    }

}

