/* A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
3 grupos de indústrias que são altamente poluentes do meio ambiente. O índice de 
poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias 
do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 
0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas 
atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação 
adequada aos diferentes grupos de empresas.*/


float poluente;
		
Scanner leia = new Scanner(System.in);
System.out.println("\n Entre com o indice de poluente: ");
poluente = leia.nextFloat();

if(poluente >= 0.3 && poluente < 0.4) {
    System.out.println("As indústrias do 1° grupo deverão ser intimadas e "
            + "terem as atividades suspensas.");
}
else if(poluente >=0.4 && poluente < 0.5) {
    System.out.println("As indústrias do 1° e do 2° grupo deverão ser intimadas e "
            + "terem as atividades suspensas.");
}
else if(poluente >= 0.5) {
    System.out.println("Todas as indústrias deverão ser intimadas e terem suas "
            + "atividades suspensas.");
}
else {
    System.out.println("Nenhuma indústria deverá ser intimada.");
}