public void escreve(){
System.out.printf("Os estados possíveis são: %s(%d) %s(%d), %s(%d), %s(%d)\n\n",
       MENSAGENS[SEM_LEITURA], SEM_LEITURA, MENSAGENS[DESLIGADO], DESLIGADO,
    MENSAGENS[LIGADO], LIGADO, MENSAGENS[ALARME], ALARME);

   int st = lerEstado();
   while (st != SEM_LEITURA) {
       System.out.printf("O estado do sensor é: %s\n", MENSAGENS[st]);
       st = lerEstado();
  }
}
