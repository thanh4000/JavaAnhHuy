import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;


class Product {
    private
        int productCode;
        String productName;
        int unitPrice;
     
        Product(int productCode, String productName, int unitPrice) {
            this.productCode = productCode;
            this.productName = productName;
            this.unitPrice = unitPrice;
        }

        //getters of Product class
        int getProductCode() {
            return productCode;
        }

        String getProductName() {
            return productName;
        }

        int getUnitPrice() {
            return unitPrice;
        }

     
        void setProductCode(int productCode) {
            this.productCode = productCode;
        }

        void setProductName(String productName) {
            this.productName = productName;
        }

        void setUnitPrice(int unitPrice) {
            this.unitPrice = unitPrice;
        }
        
        
};


class ListOfProduct {
    private
        ArrayList<Product> list;
    
    ListOfProduct() {
        list = new ArrayList<Product>();
    }
    
    //a hàm thêm mới 1 phần tử vào danh sách
    
    void addProduct(Product product) {
        list.add(product);
    }
    
    
    Product getProduct(int productCode) {
        for (Product product : list) {
            if (product.getProductCode() == productCode) {
                return product;
            }
        }
        return null;
    }
    
    
    void removeProduct(int productCode) {
        for (Product product : list) {
            if (product.getProductCode() == productCode) {
                list.remove(product);
                break;
            }
        }
    }
    
    
    void printList() {
        for (Product product : list) {
            System.out.println(product.getProductCode());
        }
    }

    
    boolean searchProduct(String productName) {
        for (Product product : list) {
            if (product.getProductName() == productName) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {

        //b tạo danh sách có 10 phần tử
        ListOfProduct listOfProduct = new ListOfProduct();
        listOfProduct.addProduct(new Product(1, "product 1", 1000));
        listOfProduct.addProduct(new Product(2, "product 2", 2000));
        listOfProduct.addProduct(new Product(3, "product 3", 3000));
        listOfProduct.addProduct(new Product(4, "product 4", 4000));
        listOfProduct.addProduct(new Product(5, "product 5", 5000));
        listOfProduct.addProduct(new Product(6, "product 6", 6000));
        listOfProduct.addProduct(new Product(7, "product 7", 7000));
        listOfProduct.addProduct(new Product(8, "product 8", 8000));
        listOfProduct.addProduct(new Product(9, "product 9", 9000));
        listOfProduct.addProduct(new Product(10, "product 10", 10000));
        
        

        //c duyệt và in ra các sản phẩm trong danh sách
    
        listOfProduct.printList();

        
        //d tìm kiếm 1 phần tử trong danh sách
        var pCode = listOfProduct.getProduct(1).getProductCode();
        
        
        listOfProduct.removeProduct(1);
        System.out.println("remove product has productCode: " + pCode);

        
        System.out.println("search product has product name = product 1: " + listOfProduct.searchProduct("product 1"));
    
        
        System.out.println("search product has product name = product 2: " + listOfProduct.searchProduct("product 2"));
    }
};

//