
public class �kinciDerecedenDenklemler {

	
	private double a,b,c;		// f(x) = ax� + bx + c

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public �kinciDerecedenDenklemler(double a, double b, double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public �kinciDerecedenDenklemler(�kinciDerecedenDenklemler Kopya){
		
		a = Kopya.getA();
		b = Kopya.getB();
		c = Kopya.getC();
	}
	
	public �kinciDerecedenDenklemler Topla(�kinciDerecedenDenklemler YeniDenklem){
		
		double Atoplam = getA() + YeniDenklem.getA();
		double Btoplam = getB() + YeniDenklem.getB();
		double Ctoplam = getC() + YeniDenklem.getC();
		
		return new �kinciDerecedenDenklemler(Atoplam, Btoplam, Ctoplam);
	}
	
	public �kinciDerecedenDenklemler C�kar(�kinciDerecedenDenklemler YeniDenklem){
		
		double AC�kar = getA() - YeniDenklem.getA();
		double BC�kar = getB() - YeniDenklem.getB();
		double CC�kar = getC() - YeniDenklem.getC();
		
		return new �kinciDerecedenDenklemler(AC�kar, BC�kar, CC�kar);	
	}

	public void KokBulma(){
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta > 0) {	
		double X1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
		double X2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
		System.out.println("x1= " + X1 + " x2= " + X2);
		}
		
		if (delta < 0) { 
			System.out.println("Denklemin Ger�el K�k� Yoktur."); 
		} 
		
		if (delta == 0) { 
			double x = (-1 * b) / (2 * a); 
			System.out.println("�ak���k k�k� var x1= x2= " + x); 
			}	
	}
	
	public void DegerBulma(double X){
		
		double Deger = (a*(Math.pow(X, 2)))+(b*X)+c;
		
		System.out.println(Deger);
	}
	
	@Override
	public String toString() {
		
		
		if(a<0){
			return "Denklem = " + getA() + "X� " + "+ " + getB() + "X " + "+ "  + getC();
		}
		if(b<0){
			return "Denklem = " + getA() + "X� " + getB() + "X " + "+ "  + getC();
		}
		if(c<0){
			return "Denklem = " + getA() + "X� " + "+ " + getB() + "X " + getC();
		}
		if(a<0 && b<0){
			return "Denklem = " + getA() + "X� " + getB() + "X " + "+ "  + getC();
		}
		if(a<0 && c<0){
			return "Denklem = " + getA() + "X� " + "+ " + getB() + "X " + getC();
		}
		if(b<0 && c<0){
			return "Denklem = " + getA() + "X� " + getB() + "X " + getC();
		}
		if(a<0 && b<0 && c<0){
			return "Denklem = " + getA() + "X� " + getB() + "X " + getC();
		}
		
		
		if(a==0){
			return "Denklem = " + getB() + "X " + "+ "  + getC();
		}
		if(b==0){
			return "Denklem = " + getA() + "X� " + " + " + getC();
		}
		if(c==0){
			return "Denklem = " + getA() + "X� " + "+ " + getB() + "X ";
		}
		if(a==0 && b==0){
			return "Denklem = " + getC();
		}
		if(b==0 && c==0){
			return "Denklem = " + getA() + "X� ";
		}
		if(a==0 && c==0){
			return "Denklem = " + getB() + "X ";
		}
		if(a==0 && b==0 && c==0){
			return "Denklem = 0";
		}
			return "Denklem = " + getA() + "X� " + "+ " + getB() + "X " + "+ "  + getC();
		}

}