package com.example.darkestdungeon.controller;

import com.example.darkestdungeon.Repository.HeroiRepository;
import com.example.darkestdungeon.Repository.QuirkRepository;
import com.example.darkestdungeon.model.Heroi;
import com.example.darkestdungeon.model.Quirk;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private HeroiRepository heroiRepository;
    private QuirkRepository quirkRepository;

    public ApiController(HeroiRepository heroiRepository, QuirkRepository quirkRepository) {
        this.heroiRepository = heroiRepository;
        this.quirkRepository = quirkRepository;
    }

    @GetMapping("/herois")
    public List<Heroi> getHerois() {
        return heroiRepository.findAll();
    }

    @GetMapping("/quirks")
    public List<Quirk> getQuirks() {
        return quirkRepository.findAll();
    }
}
