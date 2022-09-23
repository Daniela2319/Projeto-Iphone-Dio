package Estabelecimento;

import Edu.Dio.Equipamento.Musica.Ipod;
import Edu.Dio.Equipamento.Musica.ReproduzirMusica;
import Edu.Dio.Equipamento.Navegador.NavegadorInternet;
import Edu.Dio.Equipamento.Telefone.AparelhoTelefonico;
import EquipamentoIphone.EquipamentoIphone;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();

        ReproduzirMusica musica = iphone;
        AparelhoTelefonico telefonico = iphone;
        NavegadorInternet internet = iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println("*****************************************************");


        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();


        System.out.println("******************************************************");
        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
    }
}
