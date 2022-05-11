
public class Main {
 
    public static void main(String[] args) {
      Tour a = new Tour();
      a.SetTour();
      a.getTour();
      System.out.print(" day la bai cua do viet thang " +   a.getTax()); 
      NoTaxTour b = new NoTaxTour();
      b.SetTour();
      b.getTour();
     System.out.print(" day la bai cua do viet thang " +   b.getTax()); 
    }
 
}
