public class Main {
    public static void main(String[] args) {

Product product= new Product(2,"Laptop","toshiba laptop",5000,5,"kırmızı");

Product product1=new Product();
product1.setName("Laptop");
product1.setId(1);
product1.setDescription("Toshiba Laptop");
product1.setRenk("Kırmızı");
product1.setPrice(5000);
product1.setStockAmount(10);


System.out.println("Ürün kodu: "+product.getKod());
        System.out.println("Ürün kodu: "+product1.getKod());

    }
}