import java.util.Scanner;
public class TestDenklem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		int DenklemSayisi;
		
			Scanner oku=new Scanner(System.in);
		  	System.out.print("Kac Adet Denklem Girilecektir : ");
		  		DenklemSayisi=oku.nextInt();
		   
		  		// Object Array
		�kinciDerecedenDenklemler Denklemler[] = new �kinciDerecedenDenklemler [DenklemSayisi];
		
		for(int i=0;i<Denklemler.length;i++){
			System.out.println();
			System.out.println("(ax�+bx+c) olmak �zere a, b ve c s�ralanacak �ekilde say�lar� ekrana giriniz.");
			
			System.out.print(i+1 + ". denklem icin a degerini giriniz : ");
				double a = oku.nextDouble();

			System.out.print(i+1 + ". denklem icin b degerini giriniz : ");
				double b = oku.nextDouble();
			
			System.out.print(i+1 + ". denklem icin c degerini giriniz : ");
				double c = oku.nextDouble();
				
				�kinciDerecedenDenklemler g = new �kinciDerecedenDenklemler(a, b, c);
				Denklemler[i] = g;
				System.out.println(Denklemler[i]);	
				System.out.println("Denklemin K�kleri : ");
				Denklemler[i].KokBulma();
		}
		
		System.out.print("\n1. Denklemde x yerine 15 yaz�l�rsa :  ");
		Denklemler[1].DegerBulma(15);
		
		
		
		System.out.println("Girilen ilk 2 denklem i�in Toplama i�lemi Yapilirsa : ");
		Denklemler[1].Topla(Denklemler[2]);
		System.out.println("Girilen ilk 2 denklem i�in ��kartma i�lemi Yapilirsa : ");
		Denklemler[1].C�kar(Denklemler[2]);
		
		
	
		
	
	

		�kinciDerecedenDenklemler D1 = new �kinciDerecedenDenklemler (1,-3,-4);
		�kinciDerecedenDenklemler D2 = new �kinciDerecedenDenklemler (1,-1,0);
		�kinciDerecedenDenklemler D3 = new �kinciDerecedenDenklemler (1,6,9);
		
		System.out.println(D1);
		System.out.println(D2);
		System.out.println(D3+"\n");
		System.out.println("Denklemlerin Toplami Sonucu Olusan Yeni  \n" + D1.Topla(D2));
		System.out.println("\nDenklemlerin Farki Sonucu Olusan Yeni  \n" + D1.C�kar(D3) + "\n");
		System.out.println("Denklemlerin k�kleri : ");
		
		System.out.println("\n1.Denklemde x yerine 5 yazilirsa sonus : ");
		D1.DegerBulma(5);
		System.out.println("2.Denklemde x yerine 10 yazilirsa sonuc :");
		D1.DegerBulma(10);
		System.out.println("3. Denklemde x yerinde -15 yazilirsa socuc :");
		D3.DegerBulma(-15);
			
	}
}
