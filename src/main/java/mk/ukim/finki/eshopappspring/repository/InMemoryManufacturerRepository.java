package mk.ukim.finki.eshopappspring.repository;

import mk.ukim.finki.eshopappspring.bootstrap.DataHolder;
import mk.ukim.finki.eshopappspring.model.Manufacturer;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryManufacturerRepository {

    public List<Manufacturer> findAll() {
        return DataHolder.manufacturers;
    }

    public Optional<Manufacturer> findById(Long id) {
        return DataHolder.manufacturers.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();
    }
}