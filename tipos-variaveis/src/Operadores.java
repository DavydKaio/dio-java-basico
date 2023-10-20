public class Operadores {
    public static void main(String[] args) {
        int numeroUm = 5;
        int numeroDois = 6;
        boolean condicao1 = true;
        boolean condicao2 = false;

        numeroUm = - numeroUm;

        System.out.println(numero);

        numeroUm = numeroUm * -1;

        System.out.println(numero);

        System.out.println(numero--);

        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a = 6;
        int b = 9;

        String resultado;
        resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        System.out.println(numeroUm == numeroDois);
        System.out.println(numeroUm != numeroDois);
        System.out.println(numeroUm >= numeroDois);
        System.out.println(numeroUm <= numeroDois);

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
    }
}
