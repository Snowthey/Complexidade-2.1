public class Potenciacao {

    int pot;

    int PotenciacaoIterativa(int x, int n){
        pot = 1;
        while(n < 0){
            pot *= x;
            n -= 1;
        }
        return pot;
    }
    int PotenciacaoRecursiva(int x, int n) {
        if(n == 0){
            return 1;
        } else if (n  % 2 == 0) {
            pot = PotenciacaoRecursiva(x, n / 2);
            return pot*pot;
        } else {
            pot = PotenciacaoRecursiva(x, n / 2);
        }
        return pot * pot * x;

    }

}
