import java.util.*; 

public class Ulomek{
	
	public int a; 
	public int b; 
	
	/*
	public Ulomek(int a, int b){
		int gcd = 1; 
		if(a < b && b > 0){
			for(int i = 1; i <= b; i++){
				if(a%i == 0 && b%i == 0 && i > gcd)
					gcd = i; 
			}
			this.a = a/gcd; 
			this.b = b/gcd;
		}else if(a > b && b > 0){
			for(int i = 1; i <= a; i++){
				if(a%i == 0 && b%i == 0 && i > gcd)
					gcd = i; 
			}
			this.a = a/gcd; 
			this.b = b/gcd;
		}else if(b < 0){
			b *= -1;
			if(a < b){
				for(int i = 1; i <= b; i++){
					if(a%i == 0 && b%i == 0 && i > gcd)
					gcd = i; 
				}
			}else if(a > b && b > 0){
				for(int i = 1; i <= a; i++){
					if(a%i == 0 && b%i == 0 && i > gcd)
						gcd = i; 
				}
			}
			this.a = (-1 * a)/gcd; 
			this.b = b/gcd;
		}else if(a < 0 && b < 0){
			a *= -1; 
			b *= -1; 
			if(a < b){
				for(int i = 1; i <= b; i++){
					if(a%i == 0 && b%i == 0 && i > gcd)
					gcd = i; 
				}
			}else if(a > b && b > 0){
				for(int i = 1; i <= a; i++){
					if(a%i == 0 && b%i == 0 && i > gcd)
						gcd = i; 
				}
			}
			this.a = a/gcd; 
			this.b = b/gcd;
		}else if(a == 1 && b == 1){
			this.a = 1; 
			this.b = 1; 
		}
	}
	*/
	
	public Ulomek(int a, int b) {
		int gcd = gcd(Math.abs(a), Math.abs(b)); // Calculate GCD of absolute values
		this.a = a / gcd;  // Divide by GCD to simplify the fraction
		this.b = b / gcd;
		if (b < 0) { // Ensure the negative sign is on the numerator for consistency
			this.a *= -1;
			this.b *= -1;
		} else if (a == 0) { // Special case when numerator is 0, make denominator 1
			this.b = 1;
		}
	}	

// Method to calculate the greatest common divisor (GCD) using Euclidean algorithm
	private int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	
	@Override
	public String toString(){
		return String.format("%d/%d", this.a, this.b);
	}
	
	public boolean jeEnakKot(Ulomek u){
		return (this.a == u.a && this.b == u.b);
	}
	
	public Ulomek negacija(){ 
		return new Ulomek((this.a * -1), this.b);
	}
	
	public Ulomek obrat(){ 
		return new Ulomek(this.b, this.a); 
	}
	
	public Ulomek vsota(Ulomek u){
		if(this.b == u.b){
			return new Ulomek(this.a + u.a, this.b);
		}else{
			return new Ulomek(this.a*u.b + this.b*u.a, this.b * u.b);
		}
	}
	
	public Ulomek razlika(Ulomek u){
		if(this.b == u.b){
			return new Ulomek(this.a - u.a, this.b);
		}else{
			return new Ulomek(this.a*u.b - this.b*u.a, this.b * u.b);
		}
	}
	
	public Ulomek zmnozek(Ulomek u){
		return new Ulomek(this.a * u.a, this.b * u.b);
	}
	
	public Ulomek kolicnik(Ulomek u){
		Ulomek k = u.obrat(); 
		return new Ulomek(this.a * k.a, this.b * k.b);
	}
	/*
	public Ulomek potenca(int eksponent){
		if(eksponent > 1){
			int a = this.a; 
			int b = this.b; 
			for(int i = 1; i <= eksponent; i++){
				a *= a; 
				b *= b; 
			}
			return new Ulomek(a, b);
		}else{
			Ulomek k = this.obrat(); 
			eksponent = eksponent * -1; 
			int a = k.a; 
			int b = k.b; 
			for(int i = 1; i <= eksponent; i++){
				a *= a; 
				b *= b; 
			}
			return new Ulomek(a, b);
		}
	}
	*/
	public Ulomek potenca(int eksponent) {
		if (eksponent == 0) {
			// Any number raised to the power of 0 is 1
			return new Ulomek(1, 1);
		} else if (eksponent > 0) {
			// Positive exponent: Multiply the fraction by itself eksponent times
			int newA = 1;
			int newB = 1;
			for (int i = 0; i < eksponent; i++) {
				newA *= this.a;
				newB *= this.b;
			}
			return new Ulomek(newA, newB);
		} else {
			// Negative exponent: Take the reciprocal and raise to the positive exponent
			Ulomek obrat = this.obrat();
			return obrat.potenca(-eksponent);
		}
	}


	public boolean jeManjsiOd(Ulomek u){
		return (this.a/this.b < u.a/u.b);
	}
}