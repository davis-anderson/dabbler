package com.project.dabbler.brewery;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/breweries")
public class BreweryController {

    @GetMapping
    public List<Brewery> getAllBreweries() {
        List<Brewery> breweries = Arrays.asList(
                new Brewery(1L,
                    "Bald Man",
                    "Eagan",
                    Drink.BEER,
                    Type.HAZY,
                    "Tupelo Honey",
                    5,
                    "https://www.baldmanbrewing.com/"),
                new Brewery(2L,
                    "Bauhaus",
                    "Northeast Minneapolis",
                    Drink.BEER,
                    Type.PILSNER,
                    "Wonderstuff",
                    5,
                    "https://www.bauhausbrewlabs.com/"),
                new Brewery(3L,
                    "Dangerous Man",
                    "Northeast Minneapolis",
                    Drink.BEER,
                    Type.PORTER,
                    "Peanut Butter Porter",
                    10,
                    "https://dangerousmanbrewing.com/")
                );
        return breweries;
    }

    /*@PostMapping
    public void setNewBrewery() {

        );
    }*/
}
