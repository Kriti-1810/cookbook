package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.entity.DishFlavour;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DishFlavourService {
    public DishFlavour addDishFlavour(DishFlavour dishFlavour);
    public DishFlavour viewDishFlavour(Integer dishFlavourId);
    public List<DishFlavour> viewAllDishFlavour();
    public DishFlavour modifyDishFlavour(DishFlavour dishFlavour);
    public void deleteDishFlavour(Integer dishFlavourId);
}
