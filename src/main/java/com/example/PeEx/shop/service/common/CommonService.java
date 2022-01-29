package com.example.PeEx.shop.service.common;

import com.example.PeEx.shop.domain.AbstractEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService <E extends AbstractEntity>{

    Optional<E> save(E entity);

    Optional<E> get(Long id);

    List<E> getAll();

    Optional<E> update(E entity);

    Boolean deleteById(Long id);
}
