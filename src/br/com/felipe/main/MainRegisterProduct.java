package br.com.felipe.main;

import br.com.felipe.model.Product;

import java.util.Scanner;

public class MainRegisterProduct {
    public static void main(String[] args) {
        try (Scanner reading = new Scanner(System.in)) {
            System.out.println("Register new product:");
            System.out.println("Enter your user type:");
            String typeClient = reading.nextLine();

            if ("manager".equalsIgnoreCase(typeClient)) {
                Product product = registerProduct(reading);
                displayProductDetails(product);
            } else {
                System.out.println("Access denied");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static Product registerProduct(Scanner reading) {
        Product product = new Product();

        System.out.println("Product name:");
        String nameProduct = reading.nextLine();

        System.out.println("Product type:");
        String typeProduct = reading.nextLine();

        System.out.println("Product value:");
        while (!reading.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer value:");
            reading.next(); // Discard invalid input
        }
        int productValue = reading.nextInt();
        reading.nextLine(); // Consume newline left-over

        product.setNameProduct(nameProduct);
        product.setTypeProduct(typeProduct);
        product.setValueProduct(productValue);

        return product;
    }

    private static void displayProductDetails(Product product) {
        String productDescription = String.format("""
                Product: %s
                Value: %d
                Type: %s
                """, product.getNameProduct(), product.getValueProduct(), product.getTypeProduct());

        System.out.println(productDescription);
    }
}