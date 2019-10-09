public class Device {
    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }


    public String getInfo() {
        return ("Kod: " + code + " , producent: " + producer + " , typ: " + type + " , cena :" + price);
    }


}

//    i zadanie 2 - metoda getInfo() wyświetla napis
//        niczego nie zwraca
//        w końcu zdeklarowana jest jako void
//        a żeby było zgodnie z treścią zadania, powinniśmy zwrócić Stringa
//        złączyć w jednego wywołania z trzech obiektów