import java.util.Scanner;
public class TestDenklem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		int DenklemSayisi;
		
			Scanner oku=new Scanner(System.in);
		  	System.out.print("Kac Adet Denklem Girilecektir : ");
		  		DenklemSayisi=oku.nextInt();
		   
		  		// Object Array
		  		İkinciDerecedenDenklemler Denklemler[] = new İkinciDerecedenDenklemler [DenklemSayisi];
		
		for(int i=0;i<Denklemler.length;i++){
			System.out.println();
			System.out.println("(ax²+bx+c) olmak üzere a, b ve c siralanacak sekilde sayilari ekrana giriniz.");
			
			System.out.print(i+1 + ". denklem icin a degerini giriniz : ");
				double a = oku.nextDouble();

			System.out.print(i+1 + ". denklem icin b degerini giriniz : ");
				double b = oku.nextDouble();
			
			System.out.print(i+1 + ". denklem icin c degerini giriniz : ");
				double c = oku.nextDouble();
				
				İkinciDerecedenDenklemler g = new İkinciDerecedenDenklemler(a, b, c);
				Denklemler[i] = g;
				System.out.println(Denklemler[i]);	
				System.out.println("Denklemin Kökleri : ");
				Denklemler[i].KokBulma();
		}
		
		System.out.print("\n1. Denklemde x yerine 15 yazilirsa :  ");
		Denklemler[1].DegerBulma(15);
		
		
		
		System.out.println("Girilen ilk 2 denklem için Toplama islemi Yapilirsa : ");
		Denklemler[1].Topla(Denklemler[2]);
		System.out.println("Girilen ilk 2 denklem için Çikartma islemi Yapilirsa : ");
		Denklemler[1].Cikar(Denklemler[2]);
		
		
	
		
	
	

		İkinciDerecedenDenklemler D1 = new İkinciDerecedenDenklemler (1,-3,-4);
		İkinciDerecedenDenklemler D2 = new İkinciDerecedenDenklemler (1,-1,0);
		İkinciDerecedenDenklemler D3 = new İkinciDerecedenDenklemler (1,6,9);
		
		System.out.println(D1);
		System.out.println(D2);
		System.out.println(D3+"\n");
		System.out.println("Denklemlerin Toplami Sonucu Olusan Yeni  \n" + D1.Topla(D2));
		System.out.println("\nDenklemlerin Farki Sonucu Olusan Yeni  \n" + D1.Cikar(D3) + "\n");
		System.out.println("Denklemlerin kökleri : ");
		
		System.out.println("\n1.Denklemde x yerine 5 yazilirsa sonus : ");
		D1.DegerBulma(5);
		System.out.println("2.Denklemde x yerine 10 yazilirsa sonuc :");
		D1.DegerBulma(10);
		System.out.println("3. Denklemde x yerinde -15 yazilirsa socuc :");
		D3.DegerBulma(-15);
			
		oku.close();
	}
}
