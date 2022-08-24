public class ScopeTest {

    public static void main(String[] args) {
        int i = 0;

        System.out.println();
        for(int j = 64; j >0; j=j/2 ){
            System.out.print(j +" ");
        }



        System.out.println("");
        for(int j = 0; j<=5; j++){
            System.out.print(j +" ");
        }

        System.out.println("");
        for(int j = 5; j>=0; j--){
            System.out.print(j +" ");
        }

        System.out.println("");
        for(int k = 2; k<=64; k=k*2){
            System.out.print(k +" ");
        }


    }
}
