package com.cloudblitz.vacancy.controller;

import com.cloudblitz.vacancy.model.Vacancy;
import com.cloudblitz.vacancy.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vacancies")
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @GetMapping
    public List<Vacancy> getAllVacancies() {
        return vacancyService.getAllVacancies();
    }

    @GetMapping("/{id}")
    public Optional<Vacancy> getVacancyById(@PathVariable Long id) {
        return vacancyService.getVacancyById(id);
    }

    @GetMapping("/employer/{employerId}")
    public List<Vacancy> getVacanciesByEmployer(@PathVariable Long employerId) {
        return vacancyService.getVacanciesByEmployer(employerId);
    }

    @PostMapping
    public Vacancy createVacancy(@RequestBody Vacancy vacancy) {
        return vacancyService.createVacancy(vacancy);
    }

    @DeleteMapping("/{id}")
    public void deleteVacancy(@PathVariable Long id) {
        vacancyService.deleteVacancy(id);
    }
}
