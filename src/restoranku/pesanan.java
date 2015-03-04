package restoranku;

import java.util.Scanner;

public class pesanan {
	public static void main(String[] args){
		
	 System.out.println("Selamat Datang di Applikasi Restoran\n");
     System.out.println("Masukkan jumlah makanan :");
 	 Scanner input = new Scanner(System.in);
 	 int JumlahMakanan = input.nextInt();
 	 String[][] Makanan = new String[JumlahMakanan][2];
 	 String Makanan1;
 	 String HargaMakanan;
 	 
 	 for(int a=0;a<JumlahMakanan;a++){
 		 System.out.println("Makanan ke "+(a+1)+":");
 		 Makanan1 = input.next();
 		 Makanan[a][0] = Makanan1;
 		 System.out.println("Harga "+(Makanan1)+":");
 		 HargaMakanan = input.next();
 		 Makanan[a][1] = HargaMakanan;
 		 
 		 
 	 }
 	 
 	 System.out.println("Masukkan jumlah minuman :");
 	 
 	 int JumlahMinuman = input.nextInt();
 	 String[][] Minuman = new String[JumlahMinuman][2];
 	 String Minuman1;
 	 String HargaMinuman;
 	String konfirm;
 	 
 	 
 	 for(int b=0;b<JumlahMinuman;b++){
 		 System.out.println("Minuman ke "+(b+1)+": ");
 		 Minuman1=input.next();
 		 Minuman[b][0] = Minuman1;
 		 System.out.println("Harga "+(Minuman1)+": ");
 		 HargaMinuman=input.next();
 		 Minuman[b][1]= HargaMinuman;
 		 
 		 }
 	 
 	 System.out.println("List Makanan");
 	 System.out.println("************");
 	 System.out.println("No.\t"+"Nama Makanan\t"+"Harga");
 	 for(int c=0;c<JumlahMakanan;c++){
 	 System.out.println((c+1)+"\t"+(Makanan[c][0])+"\t\t"+(Makanan[c][1]));
 	 }
 	 
 	 System.out.println("List Minuman");
 	 System.out.println("************");
 	 System.out.println("No.\t"+"Nama Minuman\t"+"Harga");
 	 for(int d=0;d<JumlahMakanan;d++){
 	 System.out.println((d+1)+"\t"+(Minuman[d][0])+"\t\t"+(Minuman[d][1]));
 	 }
 	 
 	 int NomorMakanan;
 	 int NomorMinuman;
 	 int BanyakMakanan;
 	 int BanyakMinuman;
 	 
 	 do{
 	 System.out.println("Nomor Pesan Makanan : ");
 	 NomorMakanan = input.nextInt();
 	 System.out.println("Banyak "+(Makanan[NomorMakanan-1][0]));
 	 BanyakMakanan =input.nextInt();
 	 System.out.println("Nomor Pesan Minuman : ");
 	 NomorMinuman = input.nextInt();
 	 System.out.println("Banyak "+(Minuman[NomorMinuman-1][0]));
 	 BanyakMinuman = input.nextInt();
 	 
 	 System.out.println("Konfirmasi :");
 	 System.out.println("1.\t"+(Makanan[NomorMakanan-1][0]+"\t"+(BanyakMakanan)));
 	 System.out.println("2.\t"+(Minuman[NomorMinuman-1][0]+"\t"+(BanyakMinuman)));
	 
 	 System.out.println("Apakah Data Benar? <y/n> : ");
 	 konfirm = input.next();
 	 
 	 
 	 
 	 }while(konfirm.equals("n"));
 	 
 	 
 	 int total;
 	 int hargamakanan=Integer.parseInt(Makanan[NomorMakanan-1][1]);
 	 int hargaminuman=Integer.parseInt(Minuman[NomorMinuman-1][1]);
 	 
 	 total = (hargamakanan * BanyakMakanan)+ (hargaminuman * BanyakMinuman);
 	 System.out.println("total :"+total);
 	 System.out.println("Terimah kasih");
 	

	
	
		
	
		
	}

}

