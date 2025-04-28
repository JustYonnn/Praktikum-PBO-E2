class TipeKamar {
    protected String idTipe;
    protected static int counter = 1;
    protected String namaTipe;
    protected double hargaPerMalam;

    public TipeKamar(String namaTipe) {
        this.idTipe = "Typ-" + counter++;
        this.namaTipe = namaTipe;
    }

    public String getIdTipe(){
        return this.idTipe;
    }

    public String getNamaTipe(){
        return this.namaTipe;
    }

    public double getHargaPerMalam(){
        return this.hargaPerMalam;
    }

    public void setIdTipe(String idTipe){
        this.idTipe = idTipe;
    }

    public void setNamaTipe(String namaTipe){
        this.namaTipe = namaTipe;
    }

    public void setHargaPerMalam(){
        switch (this.namaTipe.toLowerCase()) {
            case "standard":
                this.hargaPerMalam = 500000.00;
                break;
            case "suite":
                this.hargaPerMalam = 1000000.00;
                break;
            case "deluxe":
                this.hargaPerMalam = 750000.00;
                break;
            default:
                System.out.println("Tipe kamar tidak tersedia!");
        }
    }
}