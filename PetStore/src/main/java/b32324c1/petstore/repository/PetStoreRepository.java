package b32324c1.petstore.repository;

import b32324c1.petstore.bo.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetStoreRepository extends JpaRepository<PetStore, Integer> {
}
