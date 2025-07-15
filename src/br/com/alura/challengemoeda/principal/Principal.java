package br.com.alura.challengemoeda.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao conversor de moedas :)");

        System.out.println("""
                
                ===========================================
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar >>> Peso colombiano
                6) Peso colombiano >>> Dólar
                7) Sair
                
                ============================================         
                
                """);
        System.out.print("Escolha uma opção válida: ");
        int resposta = leitor.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("um rescolhido");
                break;
            case 2:
                System.out.println("dois escolhido");
                break;
            case 3:
                System.out.println("dois escolhido");
                break;
            case 4:
                System.out.println("dois escolhido");
                break;
            case 5:
                System.out.println("dois escolhido");
                break;
            case 6:
                System.out.println("dois escolhido");
                break;
            case 7:
                System.out.println("Saindo ....");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }
        /*
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/b6131d2fd2a7174b50fbdb5a/pair/BRL/USD/20"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

         */

    }
}
