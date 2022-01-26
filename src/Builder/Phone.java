package Builder;

public class Phone {
    String data;

    public Phone() {
        data = "";
    }

    public String aboutPhone(){
        return data;
    }

    public void appendData(String str){
        data += str;
    }
}
