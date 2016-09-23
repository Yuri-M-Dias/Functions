switch (nOpc) {
       case 1:
         lamp[0].acende();
         break;
       case 2:
         lamp[0].apaga();
       break;
       case 3:
         lamp[0].mostraResultado();
       break;
       default:
         System.out.printf("\n --> Valor Incorreto");
         //esperando 2 segundos (delay)
         try { Thread.sleep (2000); }
         catch (InterruptedException ex) {}
       break;    	
}
