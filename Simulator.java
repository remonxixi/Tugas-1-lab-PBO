import java.util.*;

public class Simulator {

    public static void lihatPenumpang(Bus bus) {
        Penumpang[] biasa = bus.getPenumpangBiasa();
        Penumpang[] prioritas = bus.getPenumpangPrioritas();
        System.out.print("Penumpang Biasa : ");
        int sumBiasa = 0;
        for(int i = 0; i < biasa.length; i++) {
            if(biasa[i] != null) {
                System.out.print(biasa[i].getNama() + ", "); 
                sumBiasa++;   
            }
        }
        if (sumBiasa == 0) {
            System.out.print("<kosong>");
        }

        System.out.println();

        System.out.print("Penumpang Prioritas : ");
        int sumPrioritas = 0;
        for(int i = 0; i < prioritas.length; i++) {
            if(prioritas[i] != null) {
                System.out.print(prioritas[i].getNama() + ", ");
                sumPrioritas++;    
            }
        }
        if (sumPrioritas == 0) {
            System.out.print("<kosong>");
        }
        
        System.out.println();

        System.out.println("=====================================");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();  
        System.out.println("============= BUS TRANS KOETARADJA =============");
        boolean flag = true;
        while(flag) {
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar\n");
            System.out.print("Pilihan : ");

            String query = in.next();
            System.out.println();
            System.out.println();

            if (query.equals("1")) {
                System.out.print("Nama : ");
                String nama = in.next();
                System.out.println();
                System.out.print("Umur : ");
                int umur = in.nextInt();
                in.nextLine();
                System.out.println();
                System.out.print("Hamil(y/n) : ");
                String hamilKata = in.next();
                boolean hamil;
                if (hamilKata.equals("y")) {
                    hamil = true;
                } else {
                    hamil = false;
                }
                System.out.println();
                Penumpang penumpang = new Penumpang(nama, umur, hamil);
                boolean bisa = bus.naikPenumpang(penumpang);
                if(bisa) {
                    System.out.println("Penumpang berhasil ditambahkan!");
                    System.out.println();
                    lihatPenumpang(bus);
                } else {
                    System.out.println("Penumpang GAGAL ditambahkan!");
                    System.out.println("Tidak ada kursi yang tersedia");
                    System.out.println("=====================================");
                    System.out.println();
                    System.out.println();
                }
            } else if (query.equals("2")) {
                System.out.print("Nama : ");
                String nama = in.next();
                System.out.println();
                boolean bisa = bus.turunkanPenumpang(nama);
                if (bisa) {
                    System.out.println("Penumpang Berhasil Turun");
                    System.out.println();
                    lihatPenumpang(bus);
                } else {
                    System.out.println("Penumpang tidak ditemukan!");
                    System.out.println("=====================================");
                    System.out.println();
                    System.out.println();
                }
            } else if (query.equals("3")) {
                System.out.println();
                lihatPenumpang(bus);
            } else if (query.equals("4")) {
                flag = !flag;
                break;
            }
        }
    in.close();
    }
}
