package bryly;

public class Bryly {
    public static void main(String[] args) {
    	punktmat pkt = new punktmat(2f);
      	walec wal = new walec(2f, 4f);
        kula kul = new kula(2f, 6f);
        pret pre = new pret(2f, 8f);
    
 // Wyświetlenie na konsoli informacji zawierającej opis, masę, wartość głównego momentu bezwładności:

System.out.printf("%s o masie %f, glownym momencie bezwl. %f\n", pkt.opis(), pkt.getMasa(), pkt.momentbezwl());
System.out.printf("%s o masie %f, promieniu %f, glownym momencie bezwl. %f\n", wal.opis(), wal.getMasa(), wal.getPromien(), wal.momentbezwl());
System.out.printf("%s o masie %f, promieniu %f, glownym momencie bezwl. %f\n", kul.opis(), kul.getMasa(), kul.getPromien(), kul.momentbezwl());
System.out.printf("%s o masie %f, dlugosci %f, glownym momencie bezwl. %f\n", pre.opis(), pre.getMasa(), pre.getDlugosc(), pre.momentbezwl());

    punktmat[] obiekty = new punktmat[3];
    obiekty[0]=new walec(2f, 4f);
    obiekty[1]=new kula(2f, 6f);
    obiekty[2]=new pret(2f, 8f);

 	int i=0;
          for(punktmat p:obiekty)
          {
            System.out.println("Bryla numer: " +i+ " to: " +p.opis());
            System.out.println("Masa tej bryly wynosi " +p.getMasa());
            System.out.println("Glowny moment bezwladnosci tej bryly wynosi " +p.momentbezwl());
            System.out.println("Moment bezwladnosci z tw. Steinera tej bryly wynosi " +p.steiner(5f));
       
            if (p.getClass().getTypeName() == "bryly.walec")
            {
              System.out.println("Promien tej bryly to " +((bryly.walec)p).getPromien());
            }
            else if (p.getClass().getTypeName() == "bryly.kula")
            {
              System.out.println("Promien tej bryly to " +((bryly.kula)p).getPromien());
            }
            else if (p.getClass().getTypeName() == "bryly.pret")
            {
              System.out.println("Dlugosc tej bryly to " +((bryly.pret)p).getDlugosc());
            }
            i++;
          }
  }
}