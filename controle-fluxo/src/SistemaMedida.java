public class SistemaMedida {
    public static void main(String[] args) {
        byte sigla = 'Z';
        String resultado;

        switch (sigla) {
            case 'P': {
                resultado = "Pequeno";
                break;
            }
            case 'M': {
                resultado = "Médio";
                break;
            }
            case 'G': {
                resultado = "Grande";
                break;
            }
            default:
                resultado = "Valor recebido incorretamente";
        }

        System.out.println(resultado);
    }
}
