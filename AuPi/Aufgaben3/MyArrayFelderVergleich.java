import org.w3c.dom.css.Counter;

public class MyArrayFelderVergleich {

    public static void main(String[] args){
        int[] feld1 = {-10, 0, 10, 20};
        int[] feld2 = {-15, 6, 10, 30};
        int[] feld3 = {1, 2, 3, 2, 1};

        //Ausgabe Aufgabe 5a)
        System.out.println(testFeld(feld1));//false
        System.out.println(testFeld(feld2));//false
        System.out.println(testFeld(feld3));//true

        //Ausgabe Aufgabe 5b)
        System.out.println(summe(feld1));//Summe=20
        System.out.println(summe(feld2));//Summe=31
        System.out.println(summe(feld3));//Summe= 9

        //Ausgabe Aufgabe 5c)
        System.out.println(sucheHaeufigkeit(feld1,3));//0
        System.out.println(sucheHaeufigkeit(feld2,10));//1
        System.out.println(sucheHaeufigkeit(feld3,2));//2

    }
    //Aufgabe5 a)
    //Regel1 Länge ist größer oder gleich 4
    //Regel2 erstes Feldindexwert ist gleich letztes Feldindexwert
    //Regel3 zweites Feldindexwert ist gleich vorletztes Feldindexwert
    public static boolean  testFeld(int[] feld)
    {
        //Regel1
        if(feld.length >= 4 ){
            //Regel2
           if(feld[0] == feld[feld.length-1]){
               //Regel3
               if(feld[1] == feld[feld.length-2]){
                   return true;
               }
               return false;
           }
          return false;

        }
        return false;
    }

    //Aufgabe5 b)
    /*
    Schreiben Sie eine Methode public static int summe(int[]feld),
    die die Summe aller Komponentenwerte des Feldes ausgibt.
     */
    public static int summe(int[]feld){

        int summe= 0;
        for(int i=0; i<feld.length;i++){ //feld[0][1][2][3]
            summe+=feld[i]; //summe=summe+feld[i];
        }
        return summe;
    }


    //Aufgabe5 c)
    /*
    Schreiben Sie eine Java-Funktion, die für ein Feld
    von ganzen Zahlen int[] a und einer gegebenen ganzen
    Zahl int suchwert die Häufigkeit des Vorkommens von
    suchwert in a zurückliefert.
     */

    public static int sucheHaeufigkeit(int[] feld,int suchwert ){
        int counter=0;
        for(int i = 0; i < feld.length; i++){
            if(feld[i] == suchwert){
                counter++;

            }
        }
        return counter;
    }
}