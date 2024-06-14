import java.util.ArrayList;
import java.util.List;

class FlowerShop {

    private List<Flower> flowers;

    public FlowerShop() {
        flowers = new ArrayList<>();
        flowers.add(new Flower("장미", 2.0));
        flowers.add(new Flower("튤립", 1.5));
        flowers.add(new Flower("수국", 1.8));
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
        for (Flower flower : flowers) {
            if (flower.getType().equals(flowerType)) {
                return flower.getPrice();
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();

        // 꽃 종류만 입력했을 때 가격 계산 예시
        double price1 = shop.calculatePrice("튤립");
        System.out.println("튤립 한 송이 꽃다발 가격: $" + price1);

        // 꽃 종류, 꽃 개수 입력 시 가격 계산 예시
        double price2 = shop.calculatePrice("장미", 10);
        System.out.println("장미 10송이 꽃다발 가격: $" + price2);

        // 꽃 종류, 꽃 개수, 포장 여부 입력 시 가격 계산 예시
        double price3 = shop.calculatePrice("수국", 5, true);
        System.out.println("수국 5송이 꽃다발(포장) 가격: $" + price3);
    }
}

class Flower {
    private String type;
    private double price;

    public Flower(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
