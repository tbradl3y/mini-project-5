class Main {
  public static void main(String[] args) {
    colorRace(6);
    finishLine(1);
  }
// The person is going over to 5 individual people and telling them to start their engines, and asking whether their ready to launch, as in to start the race. 
  public static void colorRace(int n) {
    if (n == 0) {
      System.out.println("Start coloring!");
    } else {
      System.out.println(n);
      n--;
      colorRace(n);
   }
  } //The. 
  public static void finishLine(int x){
    if (x==0){
      System.out.println("Tommy in first place, Luis coming in second,bobby bouche in third, bobby shmurda in fourth, and cheif keef in dead last!");
    }else{
      System.out.println(" Tommy has colored his picture pefectly!");
      System.out.println("Luis is close to finished colroing his picture!");
      System.out.println("bobby bouche is ripping up his paper!");
      System.out.println("bobby shmurda is coloring out of the lines!");
      System.out.println("in dead last place not coloring at all cheif keef!");
      x--;
      finishLine(x);
    }
  }
}
