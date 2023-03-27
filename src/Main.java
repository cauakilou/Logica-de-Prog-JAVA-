
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int alunos;
        double n1, n2, n3, media;
        String n1_str, n2_str, n3_str;
        Scanner scan = new Scanner(System.in);

        for(alunos=1;alunos<=3;alunos++) {
        System.out.println("aluno "+alunos);
        System.out.println("digite a primeira nota: ");
        n1_str = scan.nextLine();
        n1 = Double.parseDouble(n1_str);
        System.out.println("digite a segunda nota: ");
        n2_str = scan.nextLine();
        n2 = Double.parseDouble(n2_str);
        System.out.println("digite a terceira nota: ");
        n3_str = scan.nextLine();
        n3 = Double.parseDouble(n3_str);
        media = (n1+n2+n3) / 3;

        System.out.println("a media do aluno "+alunos+" tem a media "+media);
    }
}
}