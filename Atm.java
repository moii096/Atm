package atm;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int bakiye=1000 ,input=0 , miktar ;
		String userName, password;
		int right =3 ;
		Scanner scan=new Scanner (System.in);
		
		  while (right>0) {
			  
		 
	            System.out.println("Patika Dev Bankasına Hoş Geldiniz.");
	            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
	         
	            userName = scan.nextLine();
	            
	            System.out.print("Lütfen parolanızı giriniz: ");
	            password = scan.nextLine();
	             
		
		
		
		
	            if (userName.equals("patika") && password.equals("12345")) {
	                do {                    
	                
	                System.out.println("***********************************");
	                System.out.println("1.Para yatırma\n2.Para çekme\n3.Bakiye sorgulama\n4.Çıkış yapma");
	                System.out.println("***********************************");
	                System.out.println("Lütfen yapacağınız işlemi seçiniz");
	               input = scan.nextInt();
	                
			switch(input) {
			case 1 :
				System.out.println("Yatirmak istediginiz miktari giriniz :");
				miktar=scan.nextInt();
				bakiye+=miktar ;
				System.out.println("Yeni bakiyeniz  :" + bakiye  );
				break ;
			case 2 :
				System.out.println("Cekmek istediginiz miktari giriniz :");
				miktar=scan.nextInt();
				if (miktar>bakiye) {
                System.out.println("Yetersiz bakiye");
				}else {
				bakiye-=miktar ;
				System.out.println("Yeni bakiyeniz : "   +bakiye );
				break ;
			}
			case 3 :
			System.out.println("Guncel bakiyeniz :"   +bakiye  +"TL");
			break ;
			}
	                }
			while (input!=4);
			System.out.println("Cikis yapiliyor tesekkurler");
			break ;
			
			}else {
			System.out.println("Gecersiz islem girdiniz");
		
		
			
		}  if (right == 0) {
            
            System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
            
        }else {
            System.out.println("Hatalı giriş lütfen tekrar deneyiniz.");
            System.out.println("Kalan toplam hakkınız: "+ right);
        }
		}
	            }
}