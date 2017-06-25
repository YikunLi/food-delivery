package delivery.order.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by liyikun on 2017/6/21.
 */
public interface OrderRepository extends MongoRepository<Order, Long> {

    List<Order> findOrdersByCustomerId(Long id);

    Order findOrderById(Long id);
}
