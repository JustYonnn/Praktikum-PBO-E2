class Kamar extends TipeKamar {
    private String nomorKamar;
    private String status;

    public Kamar(String namaTipe, String nomorKamar) {
        super(namaTipe);
        this.nomorKamar = nomorKamar;
        this.status = "Tersedia";
    }

    public String getNomorKamar(){
        return this.nomorKamar;
    }

    public String getStatus(){
        return this.status;
    }

    public void setNomorKamar(String nomorKamar){
        this.nomorKamar = nomorKamar;
    }

    public void setStatus(String status){
        this.status = status;
    }
}