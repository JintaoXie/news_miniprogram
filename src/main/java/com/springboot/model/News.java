package com.springboot.model;

public class News {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.id
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.type_id
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.img_type
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private Integer imgType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.cover_img
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String coverImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.title
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.publisher
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String publisher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.publisher_face
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String publisherFace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.create_time
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.content
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.id
     *
     * @return the value of news.id
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.id
     *
     * @param id the value for news.id
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.type_id
     *
     * @return the value of news.type_id
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.type_id
     *
     * @param typeId the value for news.type_id
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.img_type
     *
     * @return the value of news.img_type
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public Integer getImgType() {
        return imgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.img_type
     *
     * @param imgType the value for news.img_type
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.cover_img
     *
     * @return the value of news.cover_img
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.cover_img
     *
     * @param coverImg the value for news.cover_img
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.title
     *
     * @return the value of news.title
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.title
     *
     * @param title the value for news.title
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.publisher
     *
     * @return the value of news.publisher
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.publisher
     *
     * @param publisher the value for news.publisher
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.publisher_face
     *
     * @return the value of news.publisher_face
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getPublisherFace() {
        return publisherFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.publisher_face
     *
     * @param publisherFace the value for news.publisher_face
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setPublisherFace(String publisherFace) {
        this.publisherFace = publisherFace == null ? null : publisherFace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.create_time
     *
     * @return the value of news.create_time
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.create_time
     *
     * @param createTime the value for news.create_time
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.content
     *
     * @return the value of news.content
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.content
     *
     * @param content the value for news.content
     *
     * @mbg.generated Mon Jun 29 19:37:37 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}