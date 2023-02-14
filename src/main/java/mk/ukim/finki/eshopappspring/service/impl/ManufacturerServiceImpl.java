package mk.ukim.finki.eshopappspring.service.impl;

import mk.ukim.finki.eshopappspring.model.Manufacturer;
import mk.ukim.finki.eshopappspring.repository.impl.InMemoryManufacturerRepository;
import mk.ukim.finki.eshopappspring.repository.jpa.ManufacturerRepository;
import mk.ukim.finki.eshopappspring.service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }


    @Override
    public List<Manufacturer> findAll() {
        return this.manufacturerRepository.findAll();
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return this.manufacturerRepository.findById(id);
    }

    @Override
    public Optional<Manufacturer> save(String name, String address) {
        return Optional.of(manufacturerRepository.save(new Manufacturer(name, address)));
    }

    @Override
    public void deleteById(Long id) {
    }
}
