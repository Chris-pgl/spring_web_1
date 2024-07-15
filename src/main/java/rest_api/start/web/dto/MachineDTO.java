package rest_api.start.web.dto;

public class MachineDTO {

    String name;
    String description;
    int price;
    
    public MachineDTO() {
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MachineDTO [name=" + name + ", description=" + description + ", price=" + price + "]";
    }

    
    
}
