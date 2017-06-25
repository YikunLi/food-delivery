package delivery.restaurant.service;

import delivery.restaurant.domain.Menu;
import delivery.restaurant.domain.Restaurant;

import java.util.List;

/**
 * Created by liyikun on 2017/6/21.
 */
public interface RestaurantService {

    /**
     * @param name
     * @return
     */
    List<Restaurant> findRestaurantsByName(String name);

    List<Restaurant> findRestaurants();

    Menu findMenuByRestaurantId(Long id);

}
