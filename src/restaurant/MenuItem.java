package restaurant;



public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isVegan;

    public menuItem(String name,double price, String description, String category, boolean isVegan) {
        this.name =name;
        this.price = price;
        this.description = description;
        this.isNew = true;
        this.isVegan = isVegan;
    }



}
