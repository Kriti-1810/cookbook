package cookbook.cookingmanagementsystem.controller;

import cookbook.cookingmanagementsystem.entity.Dish;
import cookbook.cookingmanagementsystem.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("api")
    public class DishController {


        @Autowired
        DishService dishService;

        @GetMapping(path = "getdishes")
        public List<Dish> getDishes() {
            List<Dish> lc = dishService.viewAllDish();
            return lc;
        }

        @GetMapping(path = "getdish/{dishId}")
        public Dish viewDish(@PathVariable int dishId) {
            Dish c = dishService.viewDish(dishId);

            return c;

        }
        @DeleteMapping(path="/deletedish/{dishId}") // variable name
        public void deleteDish(@PathVariable Integer dishId)
        {
            dishService.deleteDish(dishId);

        }
        @PostMapping("adddish")
        public Dish addDish(@RequestBody Dish d)
        {
            Dish d1=dishService.addDish(d);

            return d1;

        }
        @PutMapping(path="/updateDish")
        public Dish modifyDish(@RequestBody Dish d)
        {
           Dish d1=dishService.modifyDish(d);


            return d1;
        }
    }
