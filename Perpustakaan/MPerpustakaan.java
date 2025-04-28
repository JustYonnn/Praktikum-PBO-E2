public class MPerpustakaan {
    public static void main(String[] args) {
        Koleksi K1 = new Koleksi("Citsit IF", "Diklat", "2023", "Buku");
        Buku B1 = new Buku("Diklat PBO", "Umri", "1998", "IF46576879", 69, "IF23");
        Majalah M1 = new Majalah("Pusing Infor", "Amrun", "2023", 1, 10);
        JurnalIlmiah J1 = new JurnalIlmiah("Cara IP4", "Umaru", "2025", "HG35767", 1.0, "UNDIP");

        B1.printInfo();
        M1.printInfo();
        J1.printInfo();
        K1.printInfo();
    }
}