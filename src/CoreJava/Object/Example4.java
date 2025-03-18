package CoreJava.Object;

  class Computer{
      public void playMusic(){
          System.out.println("Playing Music..");
      }
      public String getmePen(int cost){
          return "Pen";
      }
  }

public class Example4 {
    public static void main(String[] args) {
        Computer cc = new Computer();
        cc.playMusic();
    }
}
