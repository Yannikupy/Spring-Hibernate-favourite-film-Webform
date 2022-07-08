package com.borisov.webform.repo;

import com.borisov.webform.models.FavouriteFilm;
import org.springframework.data.repository.CrudRepository;

public interface FavouriteFilmRepository extends CrudRepository<FavouriteFilm, Long> {
}
