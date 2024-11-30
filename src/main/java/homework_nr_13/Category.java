package homework_nr_13;

public enum Category {

    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    FOOD("Еда");

    private final String description;
        Category(String description){
            this.description = description;
        }

}
