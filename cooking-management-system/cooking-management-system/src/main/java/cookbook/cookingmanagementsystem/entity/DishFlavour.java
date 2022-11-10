package cookbook.cookingmanagementsystem.entity;

import javax.persistence.*;

@Entity
public class DishFlavour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int dishFlavourId;
    private String flavourName;
    public DishFlavour(int dishFlavourId, String flavourName) {
        this.dishFlavourId = dishFlavourId;
        this.flavourName = flavourName;
    }

    public DishFlavour() {

    }

    public int getDishFlavourId() {
        return dishFlavourId;
    }

    public void setDishFlavourId(int dishFlavourId) {
        this.dishFlavourId = dishFlavourId;
    }


    public String getFlavourName() {
        return flavourName;
    }

    public void setFlavourName(String flavourName) {
        this.flavourName = flavourName;
    }

    @Override
    public String toString() {
        return "DishFlavour{" +
                "dishFlavourId=" + dishFlavourId +
                ", flavourName='" + flavourName + '\'' +
                '}';
    }
}
