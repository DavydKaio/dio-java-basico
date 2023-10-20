import java.lang.Math;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;

        while (mesada >= 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                break;
            }

            System.out.println("Doce de valor: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em doces");
    }

    public static double valorAleatorio() {
        return Math.random() * (8 - 2) + 2;
    }
}
