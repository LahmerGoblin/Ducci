/**
 * @author Arne Brüsch 4153615
 * @author Gerrit Sieker
 * Ducci - eine Klasse für die Duccifolge
 **/
class Ducci {
    public static void main(String args[]) {
        // args in Iinteger parsen
        int[] zahlen = new int[args.length];
        for (int i = 0;i<args.length;i++) {
            zahlen[i] = Integer.parseInt(args[i]);
        }
        ducci(zahlen);
    }
    public static void ducci(int zahlen[]) {
        if (zahlen.length > 0) {
            ducciSeq(zahlen);
        } 
    }
    public static void ducciSeq(int zahlen[]) {
        int i = 0;
        int c = 0;
            int tmp = zahlen[0];
            if (ducciStep(zahlen,i,tmp)!= 0) {
                ducciSeq(zahlen);
            }
    }
    public static void ducciStep(int zahlen[],int i,int tmp) {
        if ((i+1) < (zahlen.length)) {
            zahlen[i] = Math.abs(zahlen[i] - zahlen[i+1]);
            System.out.print(zahlen[i] + " ");
            return  ducciStep(zahlen, i+1, tmp) + zahlen[i];
        }
        zahlen[i] = Math.abs(zahlen[i] - tmp);
        System.out.println(zahlen[i]);
        //return zahlen[i];
    }
}
