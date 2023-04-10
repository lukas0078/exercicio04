import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 07/04/2023 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ent = new Scanner(System.in);
        
        int nota1, nota2, nota3, nota4;
        int media, i, contAluno = 0;
        for( i = 0; i < 4; i++){

            contAluno++;

            System.out.println("Aluno" + contAluno + ", digiti sua 1 nota ");
            nota1 = ent.nextInt();

            System.out.println("Aluno" + contAluno + ", digiti sua 2 nota ");
            nota2 = ent.nextInt();

            System.out.println("Aluno" + contAluno + ", digiti sua 3 nota ");
            nota3 = ent.nextInt();

            System.out.println("Aluno" + contAluno + ", digiti sua 4 nota ");
            nota4 = ent.nextInt();

            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("media do aluno e : " + contAluno + "  é  " + media);

            if( (media >= 0) && (media <3) ){
                System.out.println("Nota E");
            } else if(media < 5){
                System.out.println("Nota D");
            } else if(media < 7){
                System.out.println("Nota C");
            } else if(media < 8){
                System.out.println("Nota B");
            } else if(media <= 10){
                System.out.println("Nota A");
            }
        }
}
}