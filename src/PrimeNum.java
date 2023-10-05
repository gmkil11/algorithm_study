public class PrimeNum {
    public static void main(String[] args) {
//        for(int i = 1; i <= 1000; i++){
//            if(i%2 == 1 && ){
//                System.out.println(i);
//            }
//        }

//        for (int i = 1; i <= 1000; i++){
//            for (int y = 1; y <= 1000; y++){
//                int count = 0;
//                if(i % y== 2)
//            }
//        }

        int prime = 17;
        int nonPrime = 21;
        int count = 0;

        for (int i = 1; i <= prime; i++){

            if (prime % i == 0 ){
                count++;


                System.out.println(i);

            } else continue;
            System.out.println("카운트" + count);


        }


    }
}
