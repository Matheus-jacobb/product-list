package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class main {
    public static void main(String[] args) {

        List <Product> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        Integer nproducts = sc.nextInt();
        char cui;

        for(int i=0; i<nproducts; i++){
            System.out.println("Product #" + (i+1) + "data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            cui = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

                if (cui == 'u'){
                    try {
                        System.out.print("Manufactore date (DD/MM/YYYY): ");
                        sc.nextLine();
                        String date = sc.nextLine();
                        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                        Date dt;
                        dt = data.parse(date);
                        list.add(new UsedProduct(name, price, dt));
                        //System.out.println(data.format(dt));  retorna a data dd/MM/yyyy
                    }
                     catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else if (cui == 'i'){
                    System.out.print("Customs fee: ");
                    double customFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customFee));
                }
                else{
                    list.add(new Product(name, price));
                }
        }
        System.out.println("");
        System.out.println("PRICE TAGS: ");


        for (Product prod : list){

            System.out.println(prod);
                // System.out.println(prod.getName() + " $ " + prod.getPrice() + "(Customs fee: $ ");
        }
        sc.close();
        }
      }
