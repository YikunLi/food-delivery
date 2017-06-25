package delivery.order.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by liyikun on 2017/6/21.
 */
public class Order {

    @Id
    private Long id;

    private Restaurant restaurant;

    private Customer customer;

    private List<LineItem> lineItems;

    private double totalPrice;

    private boolean isFinished;


    public enum BusinessStatus {

        ORDER_NOT_RECEIVE,

        ORDER_RECEIVED,

        PREPARE_FOR_FOOD,

        WAIT_FOR_DELIVERER
    }

    public enum DelivererStatus {

        ORDER_NOT_RECEIVE,

        ORDER_RECEIVED,

        DEPART_FOR_RESTAURANT,

        WAIT_FOR_FOOD,

        DEPART_FOR_CUSTOMER,

        ARRIVED
    }
}
