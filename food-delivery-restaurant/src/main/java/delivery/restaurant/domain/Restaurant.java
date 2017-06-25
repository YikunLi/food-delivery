package delivery.restaurant.domain;

/**
 * Created by liyikun on 2017/6/21.
 */
public class Restaurant {

    private Long id;

    /**
     * The name of restaurant
     */
    private String name;

    /**
     * The notice of restaurant
     */
    private String notice;

    /**
     * The Address of restaurant, include locations
     */
    private Address address;

    /**
     * The Business Hour of restaurant, include opening time and closing time.
     */
    private BusinessHour businessHour;

    /**
     * The menu of restaurant
     */
    private Menu menu;

}
