package edu.neu.cs6510.generator;

public class LookUp {
    private Integer attribute_mapping_id;
    private Integer location_id;
    private Integer year;
    private String value;

    public LookUp(Integer attribute_mapping_id, Integer location_id, Integer year, String value) {
        this.attribute_mapping_id = attribute_mapping_id;
        this.location_id = location_id;
        this.year = year;
        this.value = value;
    }

    public Integer getAttribute_mapping_id() {
        return attribute_mapping_id;
    }

    public void setAttribute_mapping_id(Integer attribute_mapping_id) {
        this.attribute_mapping_id = attribute_mapping_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return attribute_mapping_id + "," + location_id + "," +year  + "," +value+ "\n";
    }
}
