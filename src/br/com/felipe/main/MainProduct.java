package br.com.felipe.main;

import br.com.felipe.model.Product;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {

        Product product = new Product();
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter your type user:");
        String typeClient = reading.nextLine();


        if (typeClient.equals("manager")){

            System.out.println("Name product:");
            String nameProduct = reading.nextLine();

            System.out.println("Type product:");
            String typeProduct = reading.nextLine();

            System.out.println("Product value:");
            int productValue = reading.nextInt();

            product.setNameProduct(nameProduct);
            product.setValueProduct(productValue);
            product.setTypeProduct(typeProduct);

            String productDescription = product.getNameProduct()+ """
                    custa
                    """+product.getValueProduct();

            System.out.println(productDescription);

        }else {
            System.out.println("Access denied");
        }
    }
}
