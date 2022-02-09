package schritt4;

public class KeineKraftException extends Exception {
    private String aktion;
    private String name;
public  KeineKraftException(String name, String aktion){
    this.aktion=aktion;
    this.name=name;
    }
    public String getmessage(){
    return  name + " ist zu schwach zum " + aktion ;
    }
}
