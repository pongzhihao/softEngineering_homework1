import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int cnt = 0;
        int n = 0;
        int[] Prime = new int[20000];
        boolean[] isPrime = new boolean[20000];
        Arrays.fill(isPrime,true);
        for(int i = 2;i < 20000;i++){
            if(isPrime[i]) Prime[++cnt] = i;
            for(int j = 1;j < cnt&&i * Prime[j]<20000;j++){
                isPrime[i*Prime[j]] = false;
                if(i % Prime[j] == 0) break;
            }
        }

        for(int k = 1;k < 2297;k++){
            if(k %5 ==0) System.out.println("");
            System.out.print(Prime[k]+" ");
        }
    }
}
