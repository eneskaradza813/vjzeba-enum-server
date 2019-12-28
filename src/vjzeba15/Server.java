package vjzeba15;

public class Server {

    public enum ServerStatus{Stopped, Running, Unknown}
    
    public int id;
    public String name;
    public ServerStatus status;
    
    public Server() {}
    
    public Server(String pars){
      String[] parsArray = pars.split("&");
      this.id = Integer.parseInt(parsArray[0].split("=")[1]);
      this.name = parsArray[1].split("=")[1].toString();
      
      this.status = getStatus(parsArray[2].split("=")[1].toString());
      
        
    }
    
    public ServerStatus getStatus(String status){
        ServerStatus res = ServerStatus.Unknown;
        
        try{res = ServerStatus.valueOf(status);}
        catch(Exception e){}
        return res;
    }
    public String toString(){
        return "Server id: " + this.id + "\nServer name: " + this.name + "\nServer status: " + this.status + "\n";
    }
}
