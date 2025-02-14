enum Houses {
    GAUR_CITY_PENTHOUSE(500000),
    GODREJ_SECURE_CITY_FLAT(750000),
    DDA_lIG(20000),
    DLF_APARTMENT(5000000);

    private final int price;

    Houses(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Question_1 {
    public static void main(String[] args) {
        System.out.println("House locations & Their Prices:");

        for (Houses house : Houses.values()) {
            System.out.println(house + " costs ₹" + house.getPrice());
        }
    }
}
