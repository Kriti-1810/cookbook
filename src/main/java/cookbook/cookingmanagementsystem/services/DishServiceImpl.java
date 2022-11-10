package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.dao.DishDao;
import cookbook.cookingmanagementsystem.dao.DishDetailsDao;
import cookbook.cookingmanagementsystem.dao.DishFlavourDao;
import cookbook.cookingmanagementsystem.entity.Dish;
import cookbook.cookingmanagementsystem.entity.DishDetails;
import cookbook.cookingmanagementsystem.entity.DishFlavour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DishServiceImpl implements  DishService{
    @Autowired
    private DishDao dao;
    @Autowired
    private DishFlavourDao dishFlavourDao;
    @Autowired
    private DishDetailsDao dishDetailsDao;

    @Override
    public Dish addDish(Dish dish) {
        dao.save(dish);
        return dish;
    }

    @Override
    public Dish viewDish(Integer dishId) {
        Optional<Dish> f=dao.findById(dishId);
        if(f.isPresent())
            return f.get();
        else
            return null;
    }

    @Override
    public List<Dish> viewAllDish() {
        return dao.findAll();
    }

    @Override
    public Dish modifyDish(Dish dish) {
        Integer id=dish.getDishId();
      Dish dish1=dao.findById(id).get();
        dish1.setDishName(dish.getDishName());
        dish1.setDateOfCooking(dish.getDateOfCooking());
        dao.save(dish1);
        return dish1;
    }

    @Override
    public void deleteDish(Integer dishId) {
        Optional<Dish> f=dao.findById(dishId);
        if(f.isPresent())
            dao.deleteById(dishId);
    }

    @Override
    public Dish addDishFlavourToDish(Integer dishId, DishFlavour dishFlavour) {
        dishFlavour = dishFlavourDao.save(dishFlavour);
        Dish dish = dao.findById(dishId).get();
        dish.setDishFlavour(dishFlavour);
        return dao.save(dish);

    }
    @Override
    public Dish addDishDetailToDish(Integer dishId, DishDetails dishDetails) {
        dishDetails = dishDetailsDao.save(dishDetails);
        Dish dish = dao.findById(dishId).get();
        dish.setDishDetails(dishDetails);
        return dao.save(dish);
    }
}
