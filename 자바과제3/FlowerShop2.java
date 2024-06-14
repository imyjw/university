import java.util.HashMap;
import java.util.Map;

class FlowerShop {

    private Map<String, Double> flowerPrices;

    public FlowerShop() {
        flowerPrices = new HashMap<>();
        flowerPrices.put("장미", 2.0);
        flowerPrices.put("튤립", 1.5);
        flowerPrices.put("수국", 1.8);
    }

    public double calculatePrice(String flowerType) {
        return getPrice(flowerType);
    }

    public double calculatePrice(String flowerType, int quantity) {
        return getPrice(flowerType) * quantity;
    }

    public double calculatePrice(String flowerType, int quantity, boolean isWrapped) {
        double price = calculatePrice(flowerType, quantity);

        if (isWrapped) {
            price += 5.0; // 포장 가격 5달러로 가정
        }

        return price;
    }

    private double getPrice(String flowerType) {
        return flowerPrices.getOrDefault(flowerType, 0.0);
    }

    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();

        double price1 = shop.calculatePrice("튤립");
        System.out.println("튤립 한 송이 꽃다발 가격: $" + price1);

        double price2 = shop.calculatePrice("장미", 10);
        System.out.println("장미 10송이 꽃다발 가격: $" + price2);

        double price3 = shop.calculatePrice("수국", 5, true);
        System.out.println("수국 5송이 꽃다발(포장) 가격: $" + price3);
    }
}
