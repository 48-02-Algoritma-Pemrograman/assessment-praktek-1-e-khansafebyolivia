public class Nomor2{
    public static void main(String[] args){
        
Scanner scanner = new Scanner(System.in);
int totalTransaksi;
double totalJenglot = 0 , totalLabubu = 0, totalVoodo = 0, totalUang = 0, harga = 0, jumlah ;
String produk;


while (true){
    System.out.println("Masukkan nama produk [Labubu/Jenglot/Voodo] :");
       produk = scanner.nextLine();
}
   
 switch (produk){
    case "Labubu":
      harga = 300.000;
        totalLabubu += harga * jumlah;
     break;

    case "Jenglot":
      harga = 250.000;
    totalJenglot += harga * jumlah;
    break;

    case "Voodo":
        harga = 200.000;
    totalVoodo += harga * jumlah;
    break;
 
     default:
        System.out.println("Produk tidak dikenali");

    double totalHarga = harga * jumlah;
            if (totalHarga >= 500000) {
                totalHarga *= 0.90;
            } else if (totalHarga >= 1000000) {
                totalHarga *= 0.85;
            }

         totalUang += totalHarga;
            totalTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            String lanjut = scanner.nextLine();
            
        }

    
        System.out.println("Total transaksi yang terjadi = " + totalTransaksi);
        System.out.println("Jumlah uang yang diterima = " + totalUang);

         String produkTerbesar = "Tidak ada transaksi";
        double omzetTerbesar = Math.max(totalLabubu, Math.max(totalJenglot, totalVoodo));

        if (omzetTerbesar == totalLabubu) {
            produkTerbesar = "Labubu";
        } else if (omzetTerbesar == totalJenglot) {
            produkTerbesar = "Jenglot";
        } else if (omzetTerbesar == totalVoodo) {
            produkTerbesar = "Voodo";
        }

        System.out.println("Produk dengan omzet paling besar: " + produkTerbesar);

    }
}
