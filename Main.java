public class Main {

    public static void main(String[] args) {

        GatewayPagamento gateway = new GatewayPagamento();

        PagamentoPix pix = new PagamentoPix(150.00, "chave-pix");

        PagamentoCartao cartao = new PagamentoCartao(
                6000.00,
                "1234567890123456",
                "Nome do Titular"
        );

        gateway.realizarCobranca(pix);

        System.out.println();

        gateway.realizarCobranca(cartao);
    }
}