public class Tugas213 {

    public static void main(String[] args) {
        int bulan = 12;
        int hasil = jumlahMarmut(bulan);
        System.out.println("Pasangan marmut bulan ke-" + bulan + " : " + hasil);
    }

    static int jumlahMarmut(int bulan) {
        if (bulan == 0) {
            return 1;
        }
        if (bulan == 1) {
            return 1;
        }
        return jumlahMarmut(bulan - 1) + jumlahMarmut(bulan - 2);
    }
}
