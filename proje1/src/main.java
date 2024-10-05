public class main {
    public static void main(String[] args) {
        App app = new App();
        App.Ogrenci ogrenci = app.new Ogrenci("Ali Kemal", 123, 1, "Yazilim Mühendisligi", 1234);
        System.out.println("Isim: " + ogrenci.getName());
        System.out.println("Numara: " + ogrenci.getNo());
        System.out.println("Sinif No: " + ogrenci.getClassNo());
        System.out.println("Bolum: " + ogrenci.getDepartment());
        System.out.println("Baslangic yili: " + ogrenci.getStartYear());
        System.out.println("---------------------------------------------------");
        ogrenci.setName("Ali Kemal Calak");
        ogrenci.setNo(456);
        ogrenci.setClassNo(3);
        ogrenci.setDepartment("Yazilim");
        ogrenci.setStartYear(2022);
        ogrenci.print();
        System.out.println("---------------------------------------------------");
        System.out.println("Ogrencinin adi: " + ogrenci.getName() + "\nNumarasi: " + ogrenci.getNo() + "\nSinif No: " + ogrenci.getClassNo() + "\nBolum: " + ogrenci.getDepartment() + "\nBaslangic yili: " + ogrenci.getStartYear());
    }
}
