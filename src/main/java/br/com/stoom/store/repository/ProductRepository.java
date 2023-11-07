package br.com.stoom.store.repository;

import br.com.stoom.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
