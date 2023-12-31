public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) {
            throw new CepInvalidException();
        }
        return "23.765-064";
    }
}
