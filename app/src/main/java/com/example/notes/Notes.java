package com.example.notes;

public class Notes {
    String title;
    String description;
    private Long dateDeleted;

    public Notes(String title, String description) {
        this.title = title;
        this.description = description;
        dateDeleted = null;
    }

    public Notes(String title, String description, Long dateDeleted) {
        this.title = title;
        this.description = description;
        this.dateDeleted = dateDeleted;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(Long dateDeleted) {
        this.dateDeleted = dateDeleted;
    }
}