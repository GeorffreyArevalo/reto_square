
package com.backend.core.square.infrastructure.input.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.core.square.application.dtos.plate.CreatePlateRequest;
import com.backend.core.square.application.dtos.plate.PlateResponse;
import com.backend.core.square.application.handlers.plate.PlateHandler;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/plate")
@RequiredArgsConstructor
public class PlateController {

    private final PlateHandler plateHandler;

    @GetMapping("/{id}")
    public ResponseEntity<PlateResponse> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok( plateHandler.findById(id) );
    }
    
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CreatePlateRequest createPlateRequest) {
        plateHandler.save(createPlateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
        


}
