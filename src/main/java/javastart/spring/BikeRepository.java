package javastart.spring;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class BikeRepository {
    private final EntityManager entityManager;

    public BikeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Bike bike){
        entityManager.persist(bike);
    }

}
