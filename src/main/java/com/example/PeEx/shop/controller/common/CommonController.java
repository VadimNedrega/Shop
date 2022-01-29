package com.example.PeEx.shop.controller.common;

import com.example.PeEx.shop.domain.AbstractEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommonController <E extends AbstractEntity>{
    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @GetMapping()
    ResponseEntity<E> get(@RequestParam Long id);

    @GetMapping("/all")
    ResponseEntity<List<E>> getAll();

    @PutMapping
    ResponseEntity<E> update(@RequestBody E entity, @RequestParam Long id);

    @DeleteMapping
    Boolean delete(@RequestParam Long id);
}
