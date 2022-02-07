package javastart.spring;

import org.springframework.data.repository.CrudRepository;

interface BikeRepository extends CrudRepository<Bike, Long> {
}
