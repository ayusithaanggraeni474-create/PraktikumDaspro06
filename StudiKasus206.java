import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;

        System.out.print("Nama Mahasiswa : ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, lainnya) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen yang di upload (0-4) : ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
            || jenisKegiatan.equalsIgnoreCase("BAKORMA")
            || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.println("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;

                System.out.println("Status : Dokumen tidak lengkap (Kurang "
                        + kurang + "dokumen). Dana penghargaan tidak diberikan.");

            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Memenuhi ketentuan. "
                        + "Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tidak memenuhi ketentuan peringkat. "
                        + "Dana penghargaan tidak di berikan.");

                }
            }
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak loloss): ");
            statusPKM = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;

                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + kurang + " dokumen). Dana penghargaan tidak diberikan.");

            } else {
                if (statusPKM == 1) {
                    System.out.println("Status : PKM lolos pendanaan. "
                        + "Dana penghargaan diberikan. ");
                } else {
                    System.out.println("Status : PKM tidak lolos pendanaan. "
                        + "Dana penghargaan tidak diberikan. ");
                }
            }
        } else {
            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;

                System.out.println("Status : Dokumen tidak lengkap (Kurang "
                    + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                System.out.println("Status : Jenis kegiatan tidak memenuhi ketentuan. "
                    + "Dana penghargaan tidak diberikan. ");
            }
        }
    }
}

    

