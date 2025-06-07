import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        System.out.println("Conversor de Temperatura");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Escolha a opção (1 ou 2): ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
            System.out.printf("Resultado: %.2f ºC = %.2f ºF%n", celsius, fahrenheit);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = conversor.fahrenheitParaCelsius(fahrenheit);
            System.out.printf("Resultado: %.2f ºF = %.2f ºC%n", fahrenheit, celsius);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
