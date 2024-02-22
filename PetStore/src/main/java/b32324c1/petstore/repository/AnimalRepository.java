package b32324c1.petstore.repository;

import b32324c1.petstore.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
