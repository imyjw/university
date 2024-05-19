class FlowerShop {

    public double calculatePrice(String flowerType) {
        return getPrice(flowerType);
    }// 꽃 종류만 입력했을 때 가격 계산 (1개로 생각)

    public double calculatePrice(String flowerType, int quantity) {
        return getPrice(flowerType) * quantity;
    }    // 꽃종류,꽃개수 입력했을 때 가격 계산

    public double calculatePrice(String flowerType, int quantity, boolean isWrapped) {
        double price = calculatePrice(flowerType, quantity);

        if (isWrapped) {
            price += 5.0; // 포장 가격 5달러로 가정
        }

        return price;
    }// 꽃 종류, 개수, 포장 여부 입력했을 때 가격 계산

    private double getPrice(String flowerType) {
        switch (flowerType) {
            case "장미":
                return 2.0;
            case "튤립":
                return 1.5;
            case "수국":
                return 1.8;
            default:
                return 0.0;
        }
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
