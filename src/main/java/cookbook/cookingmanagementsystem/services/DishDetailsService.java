package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.entity.DishDetails;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DishDetailsService {
    public DishDetails addDishDetails(DishDetails dishDetails);
    public DishDetails viewDishDetails(Integer dishDetailsId);
    public List<DishDetails> viewAllDishDetails();
    public DishDetails modifyDishDetails(DishDetails dishDetails);
    public void deleteDishDetails(Integer dishDetailsId);
}
