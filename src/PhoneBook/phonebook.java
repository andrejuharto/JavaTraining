package PhoneBook;

import java.util.Scanner;

public class phonebook {
	public static void main(String[] args){
		System.out.println("Selamat Datang di Buku Telepon\n");
	     System.out.println("Masukkan jumlah pelanggan :");
	 	 Scanner input = new Scanner(System.in);
	 	 int JumlahPelanggan = input.nextInt();
	 	 String[][] Pelanggan = new String[JumlahPelanggan][3];
	 	 String Nama;
	 	 String Telepon;
	 	 String Alamat;
	 	 
	 	for(int a=0;a<JumlahPelanggan;a++){
	 		 System.out.println("Masukan Nama Pelanggan ke "+(a+1)+":");
	 		 Nama = input.next();
	 		 Pelanggan[a][0] = Nama;
	 		 System.out.println("Nomor Telepon "+(Nama)+":");
	 		 Telepon = input.next();
	 		 Pelanggan[a][1] = Telepon;
	 		 System.out.println("Alamat "+(Nama));
	 		 Alamat = input.next();
	 		 Pelanggan[a][2] = Alamat;
	 		 
	 	 }
	 	 
	 	 System.out.println("Daftar Nama Pelanggan");
	 	System.out.println("No.\t"+"Nama Pelanggan\t"+"No. Telepon");
	 	 for(int c=0;c<JumlahPelanggan;c++){
	 	 System.out.println((c+1)+"\t"+(Pelanggan[c][0])+"\t\t"+(Pelanggan[c][1]));
	 	 }
	 	 
		int pilihan;
		String NamaDicari;
		String konfirm;
		String NomorDicari;
		String AlamatDicari;
	
		System.out.println("Pencarian Berdasarkan :");
		System.out.println("1. Nama");
		System.out.println("2. Telepon");
		System.out.println("3. Alamat");
		System.out.println("Pilihan Anda : ");
		pilihan = input.nextInt();
		switch(pilihan){
		case 1:{
			do{
			System.out.println("Pencarian Pelanggan berdasarkan Nama");
		    System.out.println("Masukkan Nama Pelanggan yang mau dicari : ");
			NamaDicari = input.next();
			System.out.println("Hasil Pencarian");
			for(int d=0;d<JumlahPelanggan;d++){
				if(NamaDicari.equals(Pelanggan[d][0])){
					System.out.println((d+1)+"\t"+(Pelanggan[d][0])+"\t"+(Pelanggan[d][1])+"\t"+(Pelanggan[d][2]));
				}
				
			}
		
			System.out.println("Ulang Pencarian? (y/n) : ");
			konfirm = input.next();
			if(konfirm.equals("n"))
			{
				System.out.println("Thank you");
			}
			
	
			}while(konfirm.equals("n"));
			break;
		}
		case 2:{
			do{
				System.out.println("Pencarian Pelanggan berdasarkan Nomor Telepon");
			    System.out.println("Masukkan Nomor Telepon yang mau dicari : ");
				NomorDicari = input.next();
				System.out.println("Hasil Pencarian");
				for(int e=0;e<JumlahPelanggan;e++){
					if(NomorDicari.equals(Pelanggan[e][1])){
						System.out.println((e+1)+"\t"+(Pelanggan[e][0])+"\t"+(Pelanggan[e][1])+"\t"+(Pelanggan[e][2]));
					}
					
				}
			
				System.out.println("Ulang Pencarian? (y/n) : ");
				konfirm = input.next();
				if(konfirm.equals("n"))
				{
					System.out.println("Thank you");
				}
			
		
			}while(konfirm.equals("n"));
			break;
		}
		
		case 3: {
			do{
				System.out.println("Pencarian Pelanggan berdasarkan Alamat");
			    System.out.println("Masukkan Alamat yang mau dicari : ");
				AlamatDicari = input.next();
				System.out.println("Hasil Pencarian");
				for(int f=0;f<JumlahPelanggan;f++){
					if(AlamatDicari.equals(Pelanggan[f][2])){
						System.out.println((f+1)+"\t"+(Pelanggan[f][0])+"\t"+(Pelanggan[f][1])+"\t"+(Pelanggan[f][2]));
					}
					
				}
			
				System.out.println("Ulang Pencarian? (y/n) : ");
				konfirm = input.next();
				if(konfirm.equals("n"))
				{
					System.out.println("Thank you");
				}
			
		
		
			}while(konfirm.equals("n"));
			break;
		}
			
			
			
			
		}
		
		
		}
		
	}


