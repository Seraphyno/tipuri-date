package tipuri.date;

import java.util.Date;

public class TipuriDeDate {
  
  public static void main(String[] args) {
    //tipuri de date primitive
    char c = 'a';
    boolean bool = true;
    byte b = 1;
    short s = 1;
    int i = 127;
    long l1 = 20000000001l; //notatia cu l mic
    long l2 = 20_000_000_001L; //notatia cu l mare si _ intre cifre
    float f1 = 123.1323f; //notatia cu f mic
    float f2 = 123.1323F; //notatia cu F mare
    double d = 123.2;
    
    //tipuri de date de tip referinta
    Date azi = new Date();
    String hello = "Hello!";
  }
}
