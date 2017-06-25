package delivery.restaurant.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by liyikun on 2017/6/21.
 */
public interface RestaurantRepository extends MongoRepository<Restaurant, Long> {

    List<Restaurant> findAll();

    List<Restaurant> findRestaurantsByName(String name);
}
