package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.dao.DishDetailsDao;
import cookbook.cookingmanagementsystem.entity.DishDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DishDetailsServiceImpl implements DishDetailsService{

        @Autowired
        private DishDetailsDao dao;


    @Override
    public DishDetails addDishDetails(DishDetails dishDetails) {
        dao.save(dishDetails);
        return dishDetails;
    }

    public DishDetails viewDishDetails(Integer dishDetailsId)
    {
        Optional<DishDetails> f=dao.findById(dishDetailsId);
        if(f.isPresent())
            return f.get();
        else
            return null;
    }
    public List<DishDetails> viewAllDishDetails()
    {
        return dao.findAll();
    }
    public DishDetails modifyDishDetails(DishDetails dishDetails)
    {
        Integer id=dishDetails.getDishDetailsId();
        DishDetails dishDetails1=dao.findById(id).get();
        dishDetails1.setPrepTime(dishDetails.getPrepTime());
        dishDetails1.setRecipe(dishDetails.getRecipe());
        dishDetails1.setDishType(dishDetails.getDishType());
        dao.save(dishDetails1);
        return dishDetails1;
    }
    public void deleteDishDetails(Integer dishDetailsId)
    {
        Optional<DishDetails> f=dao.findById(dishDetailsId);
        if(f.isPresent())
            dao.deleteById(dishDetailsId);
    }
}
