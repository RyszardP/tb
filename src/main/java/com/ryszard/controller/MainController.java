package com.ryszard.controller;

import com.ryszard.model.City;
import com.ryszard.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "TravelBot")
public class MainController {

    @Autowired
    CityRepository cityRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    List<City> getCities(){
        List<City> cities = cityRepository.findAll();
        return cities;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,  produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    City addCity(@Valid @RequestBody City city){
        return cityRepository.save(city);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    City editCity(@Valid @RequestBody City city){
        return cityRepository.save(city);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    public void deleteCity(@PathVariable("id") int id){
        cityRepository.delete(cityRepository.getOne(id));
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    Optional<City> getCity(@PathVariable("id") int id){
        return cityRepository.findById(id);
    }

}
