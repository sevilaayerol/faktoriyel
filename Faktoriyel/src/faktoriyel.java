import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		int n,r, comb;
		Scanner input=new Scanner(System.in);
		System.out.println("C(n,r) seklindeki n giriniz:");
		n=input.nextInt();
		System.out.println("C(n,r) seklindeki r giriniz:");
		r=input.nextInt();
		int totaln=1,totalr=1,totalfark=1;
		
		for(int i=1; i<=n; i++) {
			totaln*=i;
		}
		for(int i=1; i<=r; i++) {
			totalr*=i;
		}
		int farkFakt= n-r;
		for(int i=1; i<=farkFakt; i++) {
			totalfark*=i;
	}
		comb= totaln / (totalr * totalfark);
		System.out.println("Combinasyon sonucu:"+comb);

}
}