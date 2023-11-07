package br.com.stoom.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.stoom.store.model.Brand;
import br.com.stoom.store.repository.BrandRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Optional<Brand> findById(Long id) {
        return brandRepository.findById(id);
    }

    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    public Brand update(Long id, Brand brand) {
        if (!brandRepository.existsById(id)) {
            throw new IllegalArgumentException("Marca não encontrada.");
        }

        brand.setId(id);
        return brandRepository.save(brand);
    }

    public void delete(Long id) {
        if (!brandRepository.existsById(id)) {
            throw new IllegalArgumentException("Marca não encontrada.");
        }

        brandRepository.deleteById(id);
    }
}
