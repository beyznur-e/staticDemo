public class ProductValidator { //ana class static olamaz.inner class static olabilir
    static{
        System.out.println("Static yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }


}
