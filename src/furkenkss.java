import java.util.Scanner;

//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart
//
//Ödev
//Aynı örneği switch-case kullanmadan yapınız.

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Kaçıncı ayda doğdunuz(1-12):");
        int girilenay=input.nextInt();
        System.out.println(girilenay+" ayının kaçında doğdunuz(1-31):");
        int girilengun=input.nextInt();
        if ((girilenay==1&&(girilengun>=22||girilengun<=31))||girilenay==2&&(girilengun>=1||girilengun<=19)){
            System.out.println("Kova burcusunuz..");
        } else if ((girilenay==2&&(girilengun>=20||girilengun<=28))||girilenay==3&&(girilengun>=1||girilengun<=20)){
            System.out.println("Balık burcusunuz..");
        } else if ((girilenay==3&&(girilengun>=21||girilengun<=31))||girilenay==4&&(girilengun>=1||girilengun<=20)){
            System.out.println("Koç burcusunuz..");
        } else if ((girilenay==4&&(girilengun>=21||girilengun<=30))||girilenay==5&&(girilengun>=1||girilengun<=21)){
            System.out.println("Boğa burcusunuz..");
        } else if ((girilenay==5&&(girilengun>=22||girilengun<=31))||girilenay==6&&(girilengun>=1||girilengun<=22)){
            System.out.println("İkizler burcusunuz..");
        } else if ((girilenay==6&&(girilengun>=23||girilengun<=30))||girilenay==7&&(girilengun>=1||girilengun<=22)){
            System.out.println("Yengeç burcusunuz..");
        } else if ((girilenay==7&&(girilengun>=23||girilengun<=31))||girilenay==8&&(girilengun>=1||girilengun<=22)){
            System.out.println("Aslan burcusunuz..");
        } else if ((girilenay==8&&(girilengun>=23||girilengun<=31))||girilenay==9&&(girilengun>=1||girilengun<=22)){
            System.out.println("Başak burcusunuz..");
        } else if ((girilenay==9&&(girilengun>=23||girilengun<=30))||girilenay==10&&(girilengun>=1||girilengun<=22)){
            System.out.println("Terazi burcusunuz..");
        } else if ((girilenay==10&&(girilengun>=23||girilengun<=31))||girilenay==11&&(girilengun>=1||girilengun<=21)){
            System.out.println("Akrep burcusunuz..");
        } else if ((girilenay==11&&(girilengun>=22||girilengun<=30))||girilenay==12&&(girilengun>=1||girilengun<=21)){
            System.out.println("Yay burcusunuz..");
        } else if ((girilenay==12&&(girilengun>=22||girilengun<=31))||girilenay==1&&(girilengun>=1||girilengun<=21)){
            System.out.println("Koç burcusunuz..");
        }
        else {
            System.out.println("Hatalı Giriş Yaptınız...!!!!!");
        }

    }
}
