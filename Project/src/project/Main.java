package project;

import java.util.Scanner;

public class Main 
{
   public static void main(String[] args) throws Exception 
   {
        int pilih,jari2,tinggi,sudut,jari2alas;
        char kembali;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukan Jari-Jari ");
        jari2=input.nextInt();
        System.out.println("Masukan Tinggi ");
        tinggi=input.nextInt();
        System.out.println("Masukan Besar Sudut ");
        sudut=input.nextInt();
       
        do{
        System.out.println("=====MENU=====");
        System.out.println("1. Lingkaran");
        System.out.println("2. Busur");
        System.out.println("3. Bola");
        System.out.println("4. Tembereng 2D");
        System.out.println("5. Juring 2D");
        System.out.println("6. Kerucut");
        System.out.println("7. Kerucut Terpancung");
        System.out.println("8. Tabung");
  
        System.out.print("PILIH :  ");
        pilih = input.nextInt();
        
        switch (pilih){
            case 1 :
                Lingkaran satu = new Lingkaran();
                
                satu.setR(jari2);
                
                System.out.printf("Luas lingkaran = %f cm2", satu.getLuas());
                System.out.printf("\nKeliling lingkaran = %f cm2", satu.getKeliling());
            break;
            case 2 :
                Busur dua = new Busur();
           
                dua.setR(jari2);
                dua.setSudut(sudut);
                
                System.out.printf("\n\nPanjang Busur = %f cm", dua.getPanjangBusur());
            break;
            case 3 :
                Bola tiga = new Bola();
               
                System.out.printf("\n\nVolume Bola = %f cm",tiga.volumeBola(jari2));
                System.out.printf("\n\nLuas Permukaan Tembereng 3D = %f cm",tiga.luasTembereng3D(jari2,tinggi));
                System.out.printf("\n\nVolume Tembereng 3D = %f cm",tiga.volumeTembereng3D(jari2,tinggi));
                System.out.printf("\n\nLuas Permukaan Juring 3D = %f cm",tiga.luasJuring3D(jari2,tinggi));
                System.out.printf("\n\nVolume Juring 3D = %f cm",tiga.volumeJuring3D(jari2,tinggi));
            break;
            case 4 :
                Tembereng2D empat = new Tembereng2D();

                empat.setR(jari2);
                empat.setDerajat(sudut);
                
                System.out.printf("\n\nKeliling Tembereng 2D = %f cm",empat.getKeliling());
                System.out.printf("\nLuas Tembereng 2D = %f cm",empat.getLuas());
            break;
            case 5 :
                Juring2D lima = new Juring2D();
         
                lima.setDerajat(sudut);
                lima.setR(jari2);
                
                System.out.printf("\n\nKeliling Juring 2D = %f cm", lima.getKeliling());
                System.out.printf("\nLuas Juring 2D = %f cm", lima.getLuas());
            break;
            case 6 :
                Kerucut enam = new Kerucut();
                
                enam.setR(jari2);
                enam.setTinggi(tinggi);
                
                System.out.printf("\n\nVolume Kerucut = %f cm", enam.getVolume());
                System.out.printf("\n\nLuas Permukaan Kerucut = %f cm", enam.getLuas());
            break;
            case 7 :
                KerucutTerpancung tujuh = new KerucutTerpancung();
                System.out.println("Masukkan Jari-jari Lingkaran Alas");
                jari2alas=input.nextInt();
               
                tujuh.setR(jari2);
                tujuh.setR2(jari2alas);
                tujuh.setTinggi(tinggi);
                
                System.out.printf("\n\nVolume Kerucut Terpancung = %f cm",tujuh.getVolume());
                System.out.printf("\n\nLuas Permukaan Kerucut Terpancung = %f cm",tujuh.getLuas());
            break;
            case 8 :
                Tabung delapan = new Tabung();
                
                delapan.setTinggi(tinggi);
                delapan.setR(jari2);
                
                System.out.printf("\n\nLuas Permukaan Tabung = %f cm2",delapan.getLuas());
                System.out.printf("\nVolume Tabung = %f cm3",delapan.getVolume());
            break;
   
        }System.out.print("\nUlang? : ");
      kembali = input.next().charAt(0);
    } while (kembali == 'y');
        
  
   }
}