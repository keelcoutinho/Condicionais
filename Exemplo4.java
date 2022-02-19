/*Faça um sistema que leia um número inteiro e mostre uma mensagem 
indicando se este número é par ou ímpar, e se é positivo ou negativo.*/


int inteiro;
Scanner leia = new Scanner(System.in);

System.out.println("\n Entre com um número: ");
inteiro = leia.nextInt();

if (inteiro % 2 == 0) {
    if (inteiro >= 0) {
        System.out.println("O número é par e positivo.");
    }
    else {
        System.out.println("O número é par e negativo");
    }
    
}
else if (inteiro % 2 == 1) {
    if (inteiro >= 0) {
        System.out.println("O número é impar e positivo");
    }
    else {
        System.out.println("O número é impar e negativo");
    }
}
else {
    System.out.println("Não foi digitado um valor válido.");
}

