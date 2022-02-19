/* Construa um sistema para ler uma variável numérica N 
e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la 
com o valor zero. */


int N;
Scanner leia = new Scanner(System.in);

System.out.println("\n Entre com uma variável numérica: ");
N = leia.nextInt();

if(N > 100) {
    System.out.println(N);
}
else {
    System.out.println(N = 0);
}
