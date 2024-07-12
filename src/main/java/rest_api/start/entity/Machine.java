package rest_api.start.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Machine {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @Column(nullable= false, length= 60)
    String name;

    @Column(nullable= false)
    String description;

    @Column(nullable= false)
    int price;

    public Machine() {
    }

    public Machine(String name, String description, int price) {
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        return "Machina{\n" +
                "id=" + id + ",\n" +
                "name='" + name + '\'' + ",\n" +
                "description=" + description + ",\n" +
                "price=" + price + "\n" +
                "}";
    }
    
}
    /* 
	 * Machine:
	 * - id : INT
     * 	 * - name : STRING
     * - description : STRING
	 * - price : INT
	 */