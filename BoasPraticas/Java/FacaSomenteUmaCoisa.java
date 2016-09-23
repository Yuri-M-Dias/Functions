public static void fatorar(int numero) {
  int fator = 1;
  for (int i = numero; i > 1; i--) {
    fator *= i;
  }
  System.out.println(numero + "! = " + fator);
}

public void mostraResultado(){
    //Se o estado da lampada for Verdadeiro
    if(this.estadoDaLampada){
      System.out.printf("\n\nA lampada esta acessa!\n\n");
    }
    else{
      System.out.printf("\n\nA lampada esta apagada!\n\n");
    }
}
