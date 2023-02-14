package mk.ukim.finki.eshopappspring.repository.jpa;

import mk.ukim.finki.eshopappspring.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
