/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o 
estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de 
R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P 
(peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e 
na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais 
variáveis com o conteúdo ZERO. */


double peso = 50;
double P;		
Scanner leia = new Scanner(System.in);

System.out.println("\n Entre com o peso: ");
P = leia.nextFloat();
double E = P - peso;
double M = E * 4.00;


if (P > peso) {
System.out.println("\n O peso excedente é: "+E +" Kg"+ " O valor da multa a ser pago é de R$"+M );	
}
else if (P>0 && P <= 50) {
    E = 0;
    M = 0;
    System.out.println("\n Não pagará multa.");
    System.out.println("\n O peso excedente é: "+E);
    System.out.println("\n O valor da multa é: "+M);
}
else {
    System.out.println("\n Este não é um valor válido");
    
}
