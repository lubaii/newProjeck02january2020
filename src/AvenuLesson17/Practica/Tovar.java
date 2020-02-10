package AvenuLesson17.Practica;

public class Tovar {
    private int articul;
    private String name;
    private int fullPrice;
    private int discoun;
    private Photo[] photos= new Photo[20];
    private Otziv[] otzivs = new Otziv[2000];

    public Tovar() {
    }

    public Tovar(int articul, String name, int fullPrice, int discoun) {
        this.articul = articul;
        this.name = name;
        this.fullPrice = fullPrice;
        this.discoun = discoun;
    }

    public void addPhoto(Photo photo){
        for (int i = 0; i<photos.length; i++){
            if(photos[i]==null){
                photos[i]=photo;
                break;
            }
        }
    }

    public void addOtziv(Otziv otziv){
        for (int i = 0; i<otzivs.length; i++){
            if(otzivs[i]==null){
                otzivs[i]=otziv;
                break;
            }

        }
    }


    public int getArticul() {
        return articul;
    }

    public void setArticul(int articul) {
        this.articul = articul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getDiscoun() {
        return discoun;
    }

    public void setDiscoun(int discoun) {
        this.discoun = discoun;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

    public void printTovar(){
        System.out.printf("Товар %s , цена полная - %d, скидка - %d ", name, fullPrice,discoun);
        System.out.println();
        for(Photo photo:photos){
            if(photo!=null){
            System.out.printf("Фото: путь  к фото1 -%s, путь к фото 2 - %s",photo.getPathTpSmallPhoto(),photo.getPathToBigPhoto());
            System.out.println();}

        }
    }
    //        private int id;
//        private User user;
//        private Date datePublish;
//        private int raiting;
//        private int like;
//        private int dislike;
//        private String plusText;
//        private String minusTexst;
//        private  String comment;
    public void printOtzuv(){
        for(Otziv otziv : otzivs){
            if(otziv!=null){
                //System.out.println(otziv.getId(),otziv.getUser(),otziv.getDatePublish(),otziv.getRaiting(),otziv.getLike(),otziv.getDislike(),otziv.getPlusText(),otziv.getMinusTexst(),otziv.getComment());

                //System.out.printf("Id - %d"+otziv.getUser()+" "+ otziv.setDatePublish();"-,raiting -%d, like - %d,dislike -%d,plusTxst - %s,minustexts-%s,comment- %s",otziv.getId(),otziv.getUser(),otziv.getDatePublish(),otziv.getRaiting(),otziv.getLike(),otziv.getDislike(),otziv.getPlusText(),otziv.getMinusTexst(),otziv.getComment());
                System.out.printf("Id - %d "+otziv.getUser().toString()+" "+ otziv.getDatePublish()+"-,raiting -%d, like - %d,dislike -%d,plusTxst - %s,minustexts-%s,comment- %s",otziv.getId(),otziv.getRaiting(),otziv.getLike(),otziv.getDislike(),otziv.getPlusText(),otziv.getMinusTexst(),otziv.getComment());
            }
        }
    }
}

