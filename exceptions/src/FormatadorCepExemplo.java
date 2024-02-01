public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcecao e) {
            System.out.println("O padrão do CEP está incorreto");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoExcecao{

        if(cep.length() != 8)
          throw new CepInvalidoExcecao();
        
          //simulando um cep formatado
          return "23.765-064";

    }
}
