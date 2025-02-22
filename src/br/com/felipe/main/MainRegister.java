package br.com.felipe.main;

import br.com.felipe.model.UserManager;

import java.util.Scanner;

public class MainRegister {

    // Constantes para mensagens repetidas (boas práticas para evitar repetição de strings)
    private static final String ENTER_YOUR_NAME = "Digite seu nome:";
    private static final String ENTER_YOUR_REGION = "Digite sua região:";
    private static final String ENTER_YOUR_AGE = "Digite sua idade:";
    private static final String ENTER_YOUR_PASSWORD = "Digite sua senha:";
    private static final String REGISTRATION_SUCCESSFUL = "Cadastro realizado com sucesso!";
    private static final String REGISTRATION_FAILED = "Falha no cadastro!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        System.out.println("Cadastro de novo gerente de usuário");

        // Solicita e valida o nome do gerente
        String managerName = getValidatedInput(scanner, ENTER_YOUR_NAME, "Nome");
        // Solicita e valida a região do gerente
        String managerRegion = getValidatedInput(scanner, ENTER_YOUR_REGION, "Região");
        // Solicita e valida a idade do gerente
        String managerAge = getValidatedAge(scanner, ENTER_YOUR_AGE, "Idade");
        // Solicita e valida a senha do gerente
        String password = getValidatedInput(scanner, ENTER_YOUR_PASSWORD, "Senha");

        // Atribui os valores validados ao objeto UserManager
        userManager.setFirstName(managerName);
        userManager.setRegion(managerRegion);
        userManager.setAge(managerAge);
        userManager.setPassword(password);
        userManager.setToCheck(true); // Define que o cadastro foi validado

        // Verifica se o cadastro foi validado com sucesso
        if (userManager.isToCheck()) {
            displayUserDetails(userManager); // Exibe os detalhes do usuário
            System.out.println(REGISTRATION_SUCCESSFUL); // Mensagem de sucesso
        } else {
            System.out.println(REGISTRATION_FAILED); // Mensagem de falha
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }

    /**
     * Método para solicitar e validar entradas do usuário.
     * Garante que o campo não esteja vazio.
     *
     * @param scanner   Objeto Scanner para leitura da entrada.
     * @param prompt    Mensagem exibida ao usuário.
     * @param fieldName Nome do campo para mensagens de erro.
     * @return Entrada válida do usuário.
     */
    private static String getValidatedInput(Scanner scanner, String prompt, String fieldName) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println(fieldName + " não pode estar vazio. Tente novamente.");
            } else {
                return input;
            }
        }
    }

    /**
     * Método para solicitar e validar a idade do usuário.
     * Garante que a idade seja um número válido e positivo.
     *
     * @param scanner   Objeto Scanner para leitura da entrada.
     * @param prompt    Mensagem exibida ao usuário.
     * @param fieldName Nome do campo para mensagens de erro.
     * @return Idade válida do usuário.
     */
    private static String getValidatedAge(Scanner scanner, String prompt, String fieldName) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println(fieldName + " não pode estar vazio. Tente novamente.");
            } else {
                try {
                    int age = Integer.parseInt(input); // Tenta converter a entrada para número
                    if (age <= 0) {
                        System.out.println(fieldName + " deve ser um número positivo. Tente novamente.");
                    } else {
                        return input; // Retorna a idade válida
                    }
                } catch (NumberFormatException e) {
                    System.out.println(fieldName + " deve ser um número válido. Tente novamente.");
                }
            }
        }
    }

    /**
     * Método para exibir os detalhes do usuário cadastrado.
     *
     * @param userManager Objeto UserManager contendo os dados do usuário.
     */
    private static void displayUserDetails(UserManager userManager) {
        System.out.println("Detalhes do usuário:");
        System.out.println("Nome: " + userManager.getFirstName());
        System.out.println("Idade: " + userManager.getAge());
        System.out.println("Região: " + userManager.getRegion());
        System.out.println("Senha: " + userManager.getPassword());
    }
}