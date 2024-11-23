package com.example.dev_porfolio.models;


import jakarta.persistence.Entity;

@Entity
public class Project extends AbstractEntity {

    private String description;
    private String[] techUsed;
    private String imgUrl;
    private String sourceUrl;
    private String previewUrl;

    public Project() {}

    public Project(String description, String[] techUsed) {
        this.description = description;
        this.techUsed = techUsed;
    }

    public Project(String description, String[] techUsed,String imgUrl, String sourceUrl, String previewUrl) {
        this(description, techUsed);
        this.imgUrl = imgUrl;
        this.sourceUrl = sourceUrl;
        this.previewUrl = previewUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getTechUsed() {
        return techUsed;
    }

    public void setTechUsed(String[] techUsed) {
        this.techUsed = techUsed;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

}

