package com.billings.supper.repository;

import com.billings.supper.domain.Meal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "meal", path = "meal")
public interface MealRepository extends PagingAndSortingRepository<Meal, Long> {

    List<Meal> findByName(@Param("name") String name);
}
