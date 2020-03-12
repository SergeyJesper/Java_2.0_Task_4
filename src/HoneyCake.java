public class HoneyCake extends AbstractClassPresents {

    private String fabric;

     public HoneyCake (String title, double price, double weight, String fabric){
        super.title = title;
        super.price = price;
        super.weight = weight;
        this.fabric = fabric;

     }

     public String getFabric(){
         return fabric;
     }


}
