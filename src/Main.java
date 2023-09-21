public class Main {
    public static void main(String[] args) {

        FilaDeImpressao filaDeImpressao = FilaDeImpressao.getInstancia();

        filaDeImpressao.ImprimeDocumento();
        filaDeImpressao.ImprimeDocumento();
        filaDeImpressao.RemoveDocumento();
        filaDeImpressao.RemoveTodosDocumentos();
    }
}
