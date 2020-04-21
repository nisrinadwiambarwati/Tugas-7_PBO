interface Karakter {
    //membuat interface beserta 3 method di dalamnya

    void tampilKarakterA();
    void tampilKarakterB();
    void tampilKarakterC();
}

abstract class Anjing implements Karakter{
    //mmbuat class abstract yg mengimplementasikan method di interface

    public void tampilKarakterC(){
       System.out.println("Saya adalah binatang ");
   }
}

class Binatang extends Anjing {
    //membuat class binatang untuk mewariskan metho dari anjing
    //yg telah di implementasikan dari interfave karakter 
    
    public void tampilKarakterA(){
       System.out.println("Saya mempunyai kaki empat ");
   }
    
    public void tampilKarakterB(){
       System.out.println("Saya suka menggonggong ");
   }
}

class Mein {
    //main class Mein.java file

    public static void main(String args[]){
       
          Anjing obj = new Binatang();
          //meninstalasi objek

          obj.tampilKarakterA();
          obj.tampilKarakterB();
          obj.tampilKarakterC();
          //gunakan method tampilkan output hasil
    }
 
}