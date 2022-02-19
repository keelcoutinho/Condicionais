/*Desenvolva um sistema em que:
*Leia 4 (quatro) números;
*Calcule o quadrado de cada um;
*Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
*Caso contrário, imprima os valores lidos e seus respectivos quadrados. */


Scanner leia = new Scanner(System.in);
float a1, a2, a3, a4;

System.out.println("\n Entre com o primeiro valor: ");
a1 = leia.nextFloat();

System.out.println("\n Entre com o segundo valor: ");
a2 = leia.nextFloat();

System.out.println("\n Entre com o terceiro valor: ");
a3 = leia.nextFloat();

System.out.println("\n Entre com o quarto valor: ");
a4 = leia.nextFloat();


if (Math.pow(a3,2)>= 1000) {
    
    System.out.println("\n O terceiro valor é "+a3+" e seu quadado é: "+ Math.pow(a3,2));
}
else {
    System.out.println("O valor é: "+ a1+ ". O quadrado é: "+ Math.pow(a1,2));
    System.out.println("O valor é: "+ a2+ ". O quadrado é: "+ Math.pow(a2,2));
    System.out.println("O valor é: "+ a3+ ". O quadrado é: "+ Math.pow(a3,2));
    System.out.println("O valor é: "+ a4+ ". O quadrado é: "+ Math.pow(a4,2));
}

    
