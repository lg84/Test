public class Product {

    private Long id;
    private String productName;
    private float price;
    private int weight;
    private String color;
    private int productCount;

    public Product(Long id,String productName,float price,int weight,String color,int productCount){
        this.id=id;
        this.productName=productName;
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.productCount=productCount;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    public void setProductCount(int productCount){
        this.productCount=productCount;

    }
}
