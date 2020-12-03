public class Bus {
    private Penumpang[] arrPenumpangBiasa;
    private Penumpang[] arrPenumpangPrioritas;

    public Bus() {
        arrPenumpangBiasa = new Penumpang[4];
        arrPenumpangPrioritas = new Penumpang[2];
    }

    public Penumpang[] getPenumpangBiasa() {
        return arrPenumpangBiasa;
    }

    public Penumpang[] getPenumpangPrioritas() {
        return arrPenumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa() {
        int sum = 0;
        for(int i = 0; i < arrPenumpangBiasa.length; i++) {
            if (arrPenumpangBiasa[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    public int getJumlahPenumpangPrioritas() {
        int sum = 0;
        for(int i = 0; i < arrPenumpangPrioritas.length; i++) {
            if (arrPenumpangPrioritas[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    public boolean naikPenumpang(Penumpang penumpang) {
        if (penumpang.getUmur() > 60 || penumpang.getUmur() < 10 || penumpang.getHamil()) {
            for (int i = 0; i < arrPenumpangPrioritas.length; i++) {
                if (arrPenumpangPrioritas[i] == null) {
                    arrPenumpangPrioritas[i] = penumpang;
                    return true;
                }
            }
        } else {
            for (int i = 0; i < arrPenumpangBiasa.length; i++) {
                if (arrPenumpangBiasa[i] == null) {
                    arrPenumpangBiasa[i] = penumpang;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean turunkanPenumpang(String nama) {
        for (int i = 0; i < arrPenumpangBiasa.length; i++) {
            if (arrPenumpangBiasa[i] != null) {
                if (arrPenumpangBiasa[i].getNama().equalsIgnoreCase(nama)) {
                    arrPenumpangBiasa[i] = null;
                    return true;
                }
            }
        }
        for (int i = 0; i < arrPenumpangPrioritas.length; i++) {
            if (arrPenumpangPrioritas[i] != null) {
                if (arrPenumpangPrioritas[i].getNama().equalsIgnoreCase(nama)) {
                    arrPenumpangPrioritas[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
