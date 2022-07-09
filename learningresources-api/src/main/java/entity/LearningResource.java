package entity;


public class LearningResource {
    int id;
    int costPrice;
    int sellPrice;
    int createdDate,publishedDate,retiredDate;
    String name;

    public LearningResource(int id, int costPrice, int sellPrice, int createdDate, int publishedDate, int retiredDate, String name) {
        this.id = id;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.createdDate = createdDate;
        this.publishedDate = publishedDate;
        this.retiredDate = retiredDate;
        this.name = name;
    }

}
