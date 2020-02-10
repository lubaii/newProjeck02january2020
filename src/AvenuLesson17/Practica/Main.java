package AvenuLesson17.Practica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Photo photo1 = new Photo();
        photo1.setPathTpSmallPhoto("https://evo-lutio.livejournal.com/465994.html");
        photo1.setPathToBigPhoto("https://evo-lutio/465994.html");

        Photo photo2 = new Photo();
        photo2.setPathTpSmallPhoto("https://evo-lutio.livejournal.com/465994.html");
        photo2.setPathToBigPhoto("https://evo-lutio/465994.html");

        Tovar planshet = new Tovar();
        planshet.setFullPrice(8900);
        planshet.setDiscoun(22);
        planshet.setName("Графический планшет Lenovo");
        planshet.addPhoto(photo1);
        planshet.addPhoto(photo2);



        User user = new User(1,"Иван","Иванов",simpleDateFormat.parse("23-11-1689"),"С:/1.txt");


        Otziv otziv1 = new Otziv();
        otziv1.setId(22);
        otziv1.setUser(user);
        otziv1.setDatePublish(simpleDateFormat.parse("22-02-2020"));
        otziv1.setRaiting(5);
        otziv1.setLike(1);
        otziv1.setDislike(0);
        otziv1.setPlusText("Планшет понравился");
        otziv1.setMinusTexst("нет");
        otziv1.setComment("буду использовать его дальше");

        planshet.addOtziv(otziv1);


        planshet.printTovar();
        planshet.printOtzuv();



//        private int id;
//        private User user;
//        private Date datePublish;
//        private int raiting;
//        private int like;
//        private int dislike;
//        private String plusText;
//        private String minusTexst;
//        private  String comment;

    }


}
