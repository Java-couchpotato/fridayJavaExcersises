package orders;

public class Orders {
    private final String id;
    private final int time;
    private final String restaurantId;

    public String getId() {
        return id;
    }

    public int getTime() {
        return time;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public Orders(String id, int time, String restuarantId) {
        this.id = id;
        this.time = time;
        this.restaurantId = restuarantId;
    }
}
