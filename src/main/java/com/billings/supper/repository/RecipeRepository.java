package com.billings.supper.repository;

import com.billings.supper.domain.Recipe;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recipe", path = "recipe")
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {
}
