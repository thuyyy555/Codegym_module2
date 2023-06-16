package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();
    public static void insertProduct(){
        Product product = new Product();
        System.out.print("Nhập id: ");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        product.setName(scanner.nextLine());;
        System.out.print("Nhập giá: ");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        productArrayList.add(product);
    }
    public static void updateProduct(){
        System.out.println("Nhập id sản phẩm bạn muốn cập nhật: ");
        int updateId = Integer.parseInt(scanner.nextLine());
        for (Product product : productArrayList) {
            if (product.getId() == updateId) {
                System.out.print("Cập nhật tên sản phẩm: ");
                product.setName(scanner.nextLine());
                System.out.print("Cập nhật giá sản phẩm: ");
                product.setPrice(Double.parseDouble(scanner.nextLine()));
            }
        }
        System.out.println("Danh sách sản phẩm sau khi cập nhật: ");
        displayProduct();
    }
    public static void deleteProduct(){
        System.out.println("Nhập id sản phẩm bạn muốn xóa: ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for(int i = 0 ; i < productArrayList.size(); i++){
            if(productArrayList.get(i).getId()==deleteId){
                productArrayList.remove(productArrayList.get(i));
                break;
            }
        }
        System.out.println("Danh sách sản phẩm sau khi xóa: ");
        displayProduct();
    }
    public static void displayProduct(){
        for(int i =0; i<productArrayList.size(); i++){
            System.out.println("Thông tin của sản phẩm thứ "+ i + ": ");
            System.out.println(productArrayList.get(i));
        }
    }
    public static void searchProduct(){
        System.out.println("Nhập id sản phẩm bạn muốn tìm kiếm: ");
        int searchId = Integer.parseInt(scanner.nextLine());
        for (Product product : productArrayList) {
            if (product.getId() == searchId) {
                System.out.println(product);
                break;
            }
        }
    }
    public static void sortProduct(){
        System.out.println("Danh sách sắp xếp theo giá sản phẩm tăng dần: ");
        productArrayList.sort(new ProductComparator());
        displayProduct();
    }
    public static void displayMenu() {
        int choose;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xem danh sách sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp danh sách sản phẩm");
            System.out.println("Nhấn số bất kỳ khác trên để thoát");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    insertProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
            }
        } while (choose >= 1 && choose <= 6);
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
