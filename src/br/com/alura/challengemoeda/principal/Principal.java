package br.com.alura.challengemoeda.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    static double valor;
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao conversor de moedas :)");

        System.out.println("""
               \s
                ===========================================
               \s
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar >>> Peso colombiano
                6) Peso colombiano >>> Dólar
                7) Sair
               \s
                ============================================        \s
               \s
               \s""");
        System.out.print("Escolha uma opção válida: ");
        int resposta = leitor.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Dólar =>> Peso argentino");
                System.out.print("Digite o valor: ");
                valor = leitor.nextDouble();
                Calcular("USD", "ARG", valor);
                break;
            case 2:
                System.out.println("Peso argentino =>> Dólar");
                System.out.print("Digite o valor: ");
                valor = leitor.nextDouble();
                Calcular("ARG", "USD", valor);
                break;
            case 3:
                System.out.println("Dólar =>> Real brasileiro");
                System.out.print("Digite o valor: ");
                valor = leitor.nextDouble();
                Calcular("USD", "BRL", valor);
                break;
            case 4:
                System.out.println("Real brasileiro =>> Dólar");
                System.out.print("Digite o valor: ");
                valor = leitor.nextDouble();
                Calcular("BRL", "USD", valor);
                break;
            case 5:
                System.out.println("Dólar >>> Peso colombiano");
                System.out.print("Digite o valor: ");
                valor = leitor.nextDouble();
                Calcular("USD", "COP", valor);
                break;
            case 6:
                System.out.println("Peso colombiano >>> Dólar");
                System.out.print("Digite o valor: ");
                valor = leitor.nextDouble();
                Calcular("COP", "USD", valor);
                break;
            case 7:
                System.out.println("Saindo ....");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }

    }

    public static void Calcular(String moeda1, String moeda2, double valor) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/b6131d2fd2a7174b50fbdb5a/pair/" + moeda1 + "/"+ moeda2 + "/" + valor))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
