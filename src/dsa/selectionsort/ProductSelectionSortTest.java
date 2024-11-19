package dsa.selectionsort;

import java.util.ArrayList;

public class ProductSelectionSortTest {

        public static void selectionSortByPrice(ArrayList<Product> products) {
            int n = products.size();
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (products.get(j).getPrice() < products.get(minIndex).getPrice()) {
                        minIndex = j;
                    }
                }
                Product temp = products.get(minIndex);
                products.set(minIndex, products.get(i));
                products.set(i, temp);
            }
        }

        public static void main(String[] args) {
            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product(1, "Laptop", 1200.99));
            products.add(new Product(2, "Smartphone", 699.50));
            products.add(new Product(3, "Tablet", 450.75));

            System.out.println("Before sorting:");
            for (Product product : products) {
                System.out.println(product);
            }

            selectionSortByPrice(products);

            System.out.println("\nAfter sorting by price:");
            for (Product product : products) {
                System.out.println(product);
            }
        }

}
