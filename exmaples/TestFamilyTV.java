
class TV {
    int channel;
    void setChannel(int m){
        channel = m;
    }
    int getChannel(int m){
        return channel;
    }
}

class Family {
    TV homeTV[];
    int tvNum;
    Family(){
        homeTV = new TV[10];
        tvNum = 0;
    }
    void buyTV(TV tv){
        int i = homeTV.length;
        homeTV[i] = tv;
    }
    void remoteControl(int i, int m)
    {
        homeTV[i].setChannel(m);
    }
}
public class TestFamilyTV{
    public static void main(String args[]){
        Family f = new Family();
        TV t1 = new TV();
        TV t2 = new TV();
        f.buyTV(t1);
        f.buyTV(t2);


    }
}