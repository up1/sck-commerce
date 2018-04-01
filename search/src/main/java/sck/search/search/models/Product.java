package sck.search.search.models;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.annotation.*;

@Document(indexName = "sck_lazada", type = "products")
public class Product {

    @Id
    private String id;
    private String productId;
    private double price;
    private String name;
    private String imgUrl;
    private String brand;
    private int rating;

    public String getProductId(){
        return productId;
    }

    public void setProductId(){
        this.productId = productId;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }    

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }   

    public String getImgUrl(){
        return imgUrl;
    }

    public void setImgUrl(){
        this.imgUrl = imgUrl;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(){
        this.brand = brand;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(){
        this.rating = rating;
    }
}