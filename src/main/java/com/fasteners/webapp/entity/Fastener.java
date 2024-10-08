package com.fasteners.webapp.entity;

public class Fastener {
    private String id;
    private String name;
    private String thread_size;
    private String material;
    private String finish;
    private Integer quantity;
    private Double unit_cost;
    private String category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThread_size() {
        return thread_size;
    }

    public void setThread_size(String thread_size) {
        this.thread_size = thread_size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(Double unit_cost) {
        this.unit_cost = unit_cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Fastener{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", thread_size='" + thread_size + '\'' +
                ", material='" + material + '\'' +
                ", finish='" + finish + '\'' +
                ", quantity=" + quantity +
                ", unit_cost=" + unit_cost +
                ", category='" + category + '\'' +
                '}';
    }
}
