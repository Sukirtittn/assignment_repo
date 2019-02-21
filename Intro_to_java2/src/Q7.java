    public class Q7 {
    int seconds;
    int days;
    int hours;
    int mins;
    public void convert_seconds(int secs) {
     mins=secs/60;
     while(mins>=60)
     {
         hours++;
         mins=mins-60;
         while(hours>=24)
         {
             days++;
             hours=hours-24;
         }
     }
     seconds=secs%60;
        System.out.println("Input seconds: "+secs+" are equal to:\n");
        System.out.println("Days: "+days+" ,Hours: "+hours+" ,Minutes: "+mins+" ,Seconds: "+seconds);
    }
    public static void main(String[] args) {
        Q7 q = new Q7();
        q.convert_seconds(90090);
    }

}
