package CoreJava;

class abc{
    public void playMusic(){
        System.out.println("Play the Music...");
    }
    public String getMeAPen(int cost){
        if (cost>= 10)
        return "Pen";
        else
            return "Nothing";
    }
}


public class Demo2 {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.playMusic();  // Call method from parent class
        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}
