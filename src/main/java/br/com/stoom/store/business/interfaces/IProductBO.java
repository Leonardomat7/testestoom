package br.com.stoom.store.business.interfaces;

import br.com.stoom.store.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductBO {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product create(Product product);

    Product update(Product product);

    void delete(Long id);
}
