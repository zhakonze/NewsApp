package com.example.anroid.news;

public class News {
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mAuthor;
    private String mPublisher;
    private String mCategory;

    public News(String title, String date, String url, String author, String publisher, String category) {
        mTitle = title;
        mDate = date;
        mUrl = url;
        mAuthor = author;
        mPublisher = publisher;
        mCategory = category;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getAuthor() { return mAuthor; }

    public void setAuthor(String author) { mAuthor = author; }

    public String getPublisher() {
        return mPublisher;
    }

    public void setpublisher(String publisher) {
        mPublisher = publisher;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setSection(String category) {
        mCategory = category;
    }

    @Override
    public String toString() {
        return  " title "    + getTitle();

    }
}
