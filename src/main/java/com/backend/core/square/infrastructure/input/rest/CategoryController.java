package com.backend.core.square.infrastructure.input.rest;

import org.springframework.web.bind.annotation.RestController;

import com.backend.core.square.application.dtos.category.CategoryResponse;
import com.backend.core.square.application.dtos.category.CreateCategoryRequest;
import com.backend.core.square.application.handlers.category.CategoryHandler;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    
    private final CategoryHandler categoryHandler;

    @GetMapping("/{name}")
    public ResponseEntity<CategoryResponse> findByName(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok( categoryHandler.findByName(name) );
    }
    
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CreateCategoryRequest createCategoryRequest) {
        categoryHandler.createCategory(createCategoryRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    

}
