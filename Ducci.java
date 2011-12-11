/**
 * Ducci - eine Klasse für die Duccifolge
 **/
class Ducci {

  /**
   * Hätte Java mehrere Rückgabewerte, müsste man 
   * hier nicht den Schrittzähler hinschreiben...
   **/
  private static int c = 0;
  /**
   * @param args
   **/
  public static void main(String args[]) {
    // args in Iinteger parsen
    int[] zahlen = new int[args.length];
    for (int i = 0;i<args.length;i++) {
      zahlen[i] = Integer.parseInt(args[i]);
    }
    ducci(zahlen);
    System.out.println("Folge terminiert nach " +
                    c + " Schritten");
  }
  /**
   * @param zahlen - Int-Array für Ducci-Folge
   **/
  public static void ducci(int zahlen[]) {
    if (zahlen.length > 0) {
      ducciSeq(zahlen);
    } 
  }
  /**
   * @param zahlen - s.o.
   **/
  public static void ducciSeq(int zahlen[]) {
    int i = 0;
    // Array nicht leer
    int tmp = zahlen[0];
    // Rekursion für eine Zeile
    int rek = ducciStep(zahlen,i,tmp);
    if (rek != 0) {
      ducciSeq(zahlen);
    }
  }
  /**
  * @param zahlen - s.o.
  * @param i - Zählvariable für das Int-Array
  * @param tmp - erstes Element von zahlen zur Ringbildung
  **/
  public static int ducciStep(int zahlen[],int i,int tmp) {
    // Solange der Zeiger nicht am Ende des Array angekommen ist
    if ((i+1) < (zahlen.length)) {
      // Berechnung einzelner Zahl m. Ausgabe, dann Rekursion
      zahlen[i] = Math.abs(zahlen[i] - zahlen[i+1]);
      System.out.printf("%2d ",zahlen[i]);
      return  ducciStep(zahlen, i+1, tmp) + zahlen[i];
    }
    // Wir sind am Ende der Zeile/des Array angelangt
    zahlen[i] = Math.abs(zahlen[i] - tmp);
    // Schritte zählen
    c++;
    System.out.printf("%2d %n",zahlen[i]);
    return zahlen[i];
  }
}
