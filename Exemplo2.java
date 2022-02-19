/*Elabore um sistema que leia as variáveis C e N, respectivamente 
código e número de horas trabalhadas de um operário. E calcule o salário sabendo-se
que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora 
excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total 
e o salário excedente.*/


int C;
double N;
Scanner leia = new Scanner(System.in);

System.out.println("\n Entre com o código: ");
C = leia.nextInt();



System.out.println("\n Entre com a quantidade de horas trabalhadas: ");
N = leia.nextDouble();
double salario = N*10;
double e = (N - 50)*20;

if (N > 50) {
System.out.println("O valor do salário é: R$"+salario+ 
        ". O valor excedente é: R$"+e+ ". O salario total: R$"+(salario+e) );	
}
else if (N > 0 && N <= 50) {
    System.out.print("O valor do salário é: R$"+salario+
            ". O valor excedente é: R$"+(e=0));
}
else {
    System.out.println("Você não digitou um valor válido!");
}
