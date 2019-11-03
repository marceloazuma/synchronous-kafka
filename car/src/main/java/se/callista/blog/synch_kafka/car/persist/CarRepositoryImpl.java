package se.callista.blog.synch_kafka.car.persist;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import se.callista.blog.synch_kafka.car.model.Car;

@Repository
public class CarRepositoryImpl implements CarRepository {

  Map<String, Car> cars = new HashMap<>();

  @PostConstruct
  private void initCars() {
    cars.put("12345678901234567", new Car("12345678901234567", "ABC123", 1000));
    cars.put("76543210987654321", new Car("76543210987654321", "ZYX987", 5000));
    cars.put("45678901234567890", new Car("45678901234567890", "DEF456", 10000));
    cars.put("78901234567890123", new Car("78901234567890123", "GHI789", 20000));
  }

  @Override
  public Car getCar(String vin) {
    return cars.get(vin);
  }

}
