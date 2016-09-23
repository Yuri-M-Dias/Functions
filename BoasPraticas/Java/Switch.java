switch( operacao )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
}
