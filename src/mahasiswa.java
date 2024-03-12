public class mahasiswa {
    private static String nama;
    private static String nim;
    private static String jurusan;

    public mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    static void tampiluniv(){
        System.out.println("universitas muhammadiyah malang");
    }
    static void tampildatamahasiswa(){
        System.out.println("nama: " +nama);
        System.out.println("nim: " +nim);
        System.out.println("jurusan: " +jurusan);
    }

}
