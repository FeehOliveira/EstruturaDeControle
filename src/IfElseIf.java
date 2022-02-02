import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");

        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0 ) {
            System.out.println("Nota Inválida! ");
        }else if (nota >= 8){
            System.out.println("Conceito A");
            System.out.println("Parabens!");
        }else if(nota >=6){
            System.out.println("Conceito B ");
        }else if(nota >=4){
            System.out.println("Conceito C");
        }else{
            System.out.println("Aluno Reprovado! ");
        }


    }
}
