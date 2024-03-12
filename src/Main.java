import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner inputuser= new Scanner(System.in);
        int input;
        while (true){
        System.out.println("1. tambah data mahasiswa ");
        System.out.println("2. tampilkan data mahasiswa ");
        System.out.println("3. exit ");
        System.out.println("pilihan anda: ");
        input=inputuser.nextInt();

        switch (input) {
            case 1:
                System.out.println("masukkan nama mahasiswa: ");
                String namammahasiswa = inputuser.next();
                System.out.println("masukkan nim: ");
                String nimmahasiswa = inputuser.next();
                inputuser.nextLine();
                if (nimmahasiswa.length() == 15) {
                    System.out.print("masukkan jurusan mahasiswa: ");
                    inputuser.nextLine();
                    String jurusanmahasiswa = inputuser.nextLine();
                    mahasiswa Mahasiswa = new mahasiswa(namammahasiswa, nimmahasiswa, jurusanmahasiswa);
                } else {
                    System.out.println("nim harus 15 digit🧐 ");
                }
                break;
            case 2:
                mahasiswa.tampiluniv();
                mahasiswa.tampildatamahasiswa();
                break;
            case 3:
                System.out.println("program selesai: ");
                break;


        }



            }


        }
    }





