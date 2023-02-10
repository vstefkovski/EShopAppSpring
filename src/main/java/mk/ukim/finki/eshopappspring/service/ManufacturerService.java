package mk.ukim.finki.eshopappspring.service;

import mk.ukim.finki.eshopappspring.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    List<Manufacturer> findAll();

    Optional<Manufacturer> findById(Long id);
}
