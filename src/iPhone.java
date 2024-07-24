public class iPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical rpm = new ReprodutorMusical();
        rpm.tocar();
        rpm.pausar();
        rpm.selecionarMusica("musica");

        AparelhoTelefonico apt = new AparelhoTelefonico();
        apt.ligar("numero");
        apt.atender();
        apt.iniciarCorreioVoz();

        NavegadorInternet nvg = new NavegadorInternet();
        nvg.exibirPagina("url");
        nvg.adicionarNovaAba();
        nvg.atualizarPagina();
    }
}
