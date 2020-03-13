
class Battery {
    int vol; // 电量
    Battery(int v){
        vol = v;
    }
}
class Radio{
    Battery b;
    Radio(Battery b1){
        b = b1;
    }
    public void openRadio(){
        b.vol--;
    }
    public String toString(){
        return "电量=" + b.vol;
    }
}
public class TestRadio {
    public static void main(String args[]){
        Battery b = new Battery(10); // 电量为10
        Radio r = new Radio(b);
        r.openRadio();
        System.out.println(r);
    }
}
