package com.billings.supper;

import com.billings.supper.domain.Meal;
import com.billings.supper.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DataBootstrapper {

    @Autowired
    private MealRepository mealRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void bootstrapMeals() {
        mealRepository.save(new Meal("Chicken Noodle Soup", "Some delicious soup!"));
        mealRepository.save(new Meal("Pizza", "Maybe pepperoni or sausage"));
        mealRepository.save(new Meal("Waffles", "you know..."));
    }
}
