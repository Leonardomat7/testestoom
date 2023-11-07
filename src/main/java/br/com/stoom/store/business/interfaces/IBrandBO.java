package br.com.stoom.store.business.interfaces;

import br.com.stoom.store.model.Brand;

import java.util.List;
import java.util.Optional;

public interface IBrandBO {

    List<Brand> findAll();

    Optional<Brand> findById(Long id);

    Brand create(Brand brand);

    Brand update(Brand brand);

    void delete(Long id);
}
