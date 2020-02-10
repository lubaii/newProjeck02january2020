package AvenuLesson17.Practica;

import java.util.Date;

public class Otziv {
    private int id;
    private User user;
    private Date datePublish;
    private int raiting;
    private int like;
    private int dislike;
    private String plusText;
    private String minusTexst;
    private  String comment;

    public Otziv() {
    }

    public Otziv(int id, User user, Date datePublish, int raiting, int like, int dislike, String plusText, String minusTexst, String comment) {
        this.id = id;
        this.user = user;
        this.datePublish = datePublish;
        this.raiting = raiting;
        this.like = like;
        this.dislike = dislike;
        this.plusText = plusText;
        this.minusTexst = minusTexst;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getPlusText() {
        return plusText;
    }

    public void setPlusText(String plusText) {
        this.plusText = plusText;
    }

    public String getMinusTexst() {
        return minusTexst;
    }

    public void setMinusTexst(String minusTexst) {
        this.minusTexst = minusTexst;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
