package com.mohibur.problem_solving.controller;

import com.mohibur.common.interfaces.UrlConstant;
import com.mohibur.problem_solving.serviceImpl.SolutionServiceImpl;
import com.mohibur.problem_solving.entity.Solution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstant.SolutionUrl.ROOT)
public class SolutionController {
    @Autowired
    private SolutionServiceImpl solutionService;

    @PostMapping
    public ResponseEntity<Solution> createSolution(@RequestBody Solution solution) {
        return solutionService.createSolution(solution);
    }

    @GetMapping(UrlConstant.ID)
    public ResponseEntity<Solution> getSolution(@PathVariable Long id) {
        return solutionService.getSolutionById(id);
    }

    @GetMapping
    public ResponseEntity<List<Solution>> getAllSolutions() {
        return solutionService.getAllSolutions();
    }

    @PutMapping
    public ResponseEntity<Solution> updateSolution(@RequestBody Solution solution) {
        return solutionService.updateSolution(solution);
    }

    @DeleteMapping(UrlConstant.ID)
    public ResponseEntity<?> deleteSolution(@PathVariable Long id) {
        return solutionService.deleteSolution(id);
    }
}
