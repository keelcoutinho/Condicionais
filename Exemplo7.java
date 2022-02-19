/* Receber valores de base e altura de um triângulo e verificar se são 
valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área 
do triângulo.*/


int base;
int altura;
Scanner leia = new Scanner(System.in);

System.out.println("\n Entre com a base do triangulo: ");
base = leia.nextInt();
System.out.println("\n Entre com a altura do triangulo: ");
altura = leia.nextInt();

if(base > 0 && altura > 0) {
    System.out.println("A área do triangulo é: "+ base*altura);
}
else {
    System.out.println("Não é possível calcular a área do triangulo");
}
