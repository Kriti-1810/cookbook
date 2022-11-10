package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.dao.DishFlavourDao;
import cookbook.cookingmanagementsystem.entity.DishFlavour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishFlavourServiceImpl implements  DishFlavourService{
    @Autowired
    private DishFlavourDao dao;
    @Override
    public DishFlavour addDishFlavour(DishFlavour dishFlavour) {
        dao.save(dishFlavour);
        return dishFlavour;
    }

    @Override
    public DishFlavour viewDishFlavour(Integer dishFlavourId) {
        Optional<DishFlavour> f=dao.findById(dishFlavourId);
        if(f.isPresent())
            return f.get();
        else
            return null;
    }

    @Override
    public List<DishFlavour> viewAllDishFlavour() {
        return dao.findAll();
    }

    @Override
    public DishFlavour modifyDishFlavour(DishFlavour dishFlavour) {
        Integer id=dishFlavour.getDishFlavourId();
        DishFlavour dishFlavour1=dao.findById(id).get();
        dishFlavour1.setFlavourName(dishFlavour.getFlavourName());
        dao.save(dishFlavour1);
        return dishFlavour1;
    }

    @Override
    public void deleteDishFlavour(Integer dishFlavourId) {
        Optional<DishFlavour> f=dao.findById(dishFlavourId);
        if(f.isPresent())
            dao.deleteById(dishFlavourId);
    }
}
