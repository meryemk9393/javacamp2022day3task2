public class ProductManager {



    public void add(Product product){
        ProductValidator productValidator=new ProductValidator();

        if (productValidator.isValid(product)){
            System.out.print("Ürün Eklendi");
        }else{

            System.out.println("Ürün eklenemedi");

        }
    }
}
