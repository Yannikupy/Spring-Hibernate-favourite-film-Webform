package com.borisov.webform.controllers;

import com.borisov.webform.models.FavouriteFilm;
import com.borisov.webform.repo.FavouriteFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @Autowired
    private FavouriteFilmRepository favouriteFilmRepository;

    @GetMapping("/film-form")
    public String filmForm(Model model) {
        return "film-add";
    }

    @PostMapping("/film-form")
    public String filmAdd(@RequestParam String First_Name, @RequestParam String Last_Name,
                          @RequestParam String Favourite_Film, Model model){
        FavouriteFilm favouriteFilm = new FavouriteFilm(First_Name, Last_Name, Favourite_Film);
        favouriteFilmRepository.save(favouriteFilm);
        return "result";
    }

}
