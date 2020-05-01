package es.sarascript.listsdemo;

class Item {

        // Definimos los campos que va a tener cada elemento de la ListView

    private String title;
    private int number;
    private String urlImage;

        // Para crear el constuctor vacío -> code - generate - constructor (Seleccionamos el método)

    public Item() {
    }

        // Para crear el constuctor completo -> code - generate - constructor (Seleccionamos todas las varibles)

    public Item(String title, int number, String urlImage) {
        this.title = title;
        this.number = number;
        this.urlImage = urlImage;
    }

        // Para crear los getters and setters -> code - generate - getters and setters (Seleccionamos todas las varibles)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
