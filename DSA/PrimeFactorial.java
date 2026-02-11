 public class MathUtilsOne {
   
   private List<Integer> getPrimeFactors(int n) {

        List<Integer> primeFactorList = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactorList.add(2);
            n /= 2;
        }

        for (int i = 3; i*i <= n; i += 2) {
            while (n % i == 0) {
                primeFactorList.add(i);
                n /= i;
            }
        }

        if (n > 2) primeFactorList.add(n);

        return primeFactorList;
    }


   private List<Integer> getPrimeFactorsOrderOfN(int n) {
        List<Integer> primeFactorList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
           while (n % i == 0 && n > 0) {
               primeFactorList.add(i);
               n = n / i;
           }
       }

   }

 }
