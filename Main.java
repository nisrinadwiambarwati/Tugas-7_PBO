interface InterfaceBahasaProgram {
    public void fungsi();
    public void methode();    
}

 class Java implements InterfaceBahasaProgram{
  
    public void fungsi() {
        System.out.println("Fungsi java");
    }
   
    public void methode() {
        System.out.println("Methode java");
    }
}

 class TurboC implements InterfaceBahasaProgram{
    
    public void fungsi() {
        System.out.println("Fungsi Turbo C");
    }

  
    public void methode() {
        System.out.println("Methode Turbo C");
    }
}

 class Main {
    public static void main(String[] args){
     
        InterfaceBahasaProgram bahasaJava = new Java();
        bahasaJava.fungsi();  //Fungsi java
        bahasaJava.methode();  //Methode java
        
        InterfaceBahasaProgram bahasaC = new TurboC();
        bahasaC.fungsi();   //Fungsi Turbo C
        bahasaC.methode();  //Methode Turbo C
    }
}