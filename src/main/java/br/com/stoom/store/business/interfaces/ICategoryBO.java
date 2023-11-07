package br.com.stoom.store.business.interfaces;

import br.com.stoom.store.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryBO {

    List<Category> findAll();

    Optional<Category> findById(Long id);

    Category create(Category category);

    Category update(Category category);

    void delete(Long id);
}
