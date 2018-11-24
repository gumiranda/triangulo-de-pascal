import java.util.*;
import java.math.*;

public class Main {

    public static void main(String args[]) {
		BigInteger bi3;
        boolean x;
        int op = 0;
        int x1;
        Scanner s = new Scanner(System.in);
        Binomial b = new Binomial();
        System.out.println("\n>> Gerando triangulo de pascal <<");
        do{
         System.out.println("\n1 - Entrar com um numero");
         System.out.println("2 - Sair");
         op = s.nextInt();
         if(op == 1){
            System.out.println("\nNumero: ");
            x1 = s.nextInt();
			//x1=997;
//					String vetor[] = new String[99999];
		for(int i = 0; i <= x1; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				Binomial.comb(i,j);
//				vetor[i] = vetor[i] +  Binomial.comb(i,j)+ "<";
			}
	//		vetor[i] += "\n";
			//if(i == x1){
		//		System.out.println(vetor[i]);
			//}
		}
		
			for(int j = 1; j <= x1; j++)
			{
				
				if(Binomial.memoized[x1][j] == null){
				break;
				}
				if(Binomial.memoized[x1][j+1] != null && x1 != (j+1)){
									bi3 = Binomial.memoized[x1][j+1].mod(Binomial.memoized[x1][1]);
											    System.out.println("Divisao1["+x1+"] ["+1+"]"+"  ->  "+Binomial.memoized[x1][1]);
														    System.out.println("Divisao2["+x1+"] ["+(j+1)+"]"+"  ->  "+Binomial.memoized[x1][j+1]);
									System.out.println("da mod -> "+bi3); 
									if(bi3.equals(new BigInteger("0"))){
								System.out.println("o numero "+x1+" eh primo");										
									}else{
									System.out.println("o numero "+x1+" nao eh primo");
									break;
									}
				}
		   // System.out.println("Posicao["+x1+"] ["+j+"]"+"  ->  "+Binomial.memoized[x1][j]);

						
		}
	



        
		}
        
        } while(op!=2);
    }
}
