public class Nomor1{
    public static void main(String[] args){
Scanner scanner = new Scanner (System.in);

int jumlahAnggota;
double tunjangan;

System.out.print("Masukkan jumlah anggota keluarga: ");
         jumlahAnggota= scanner.nextInt();

if (jumlahAnggota <= 3) {
            tunjangan = jumlahAnggota * 100.000;
        } else {
            tunjangan = (3 * 100.000) + ((jumlahAnggota - 3) * 50.000);
        }
System.out.println("Besar tunjangan kesehatan :" + (tunjangan));
    }
}
