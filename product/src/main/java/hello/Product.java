
package hello;

import org.springframework.data.annotation.Id;

public class Product {

	@Id private String id;
    
  private String name;
  private Double price;
	private String imgUrl;
  private String brand;
  private Integer rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
  }
    
    public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String name) {
		this.name = name;
  }
    
  public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Integer getRatting() {
		return rating;
	}

	public void setRatting(Integer rating) {
		this.rating = rating;
  }

}