package AvenuLesson17.Practica;

public class Photo {
    private String pathTpSmallPhoto;
    private String pathToBigPhoto;

    public Photo() {
    }

    public Photo(String pathTpSmallPhoto, String pathToBigPhoto) {
        this.pathTpSmallPhoto = pathTpSmallPhoto;
        this.pathToBigPhoto = pathToBigPhoto;
    }

    public String getPathTpSmallPhoto() {
        return pathTpSmallPhoto;
    }

    public void setPathTpSmallPhoto(String pathTpSmallPhoto) {
        this.pathTpSmallPhoto = pathTpSmallPhoto;
    }

    public String getPathToBigPhoto() {
        return pathToBigPhoto;
    }

    public void setPathToBigPhoto(String pathToBigPhoto) {
        this.pathToBigPhoto = pathToBigPhoto;
    }
}
