public class prog2 {

        public static void main (String[] args) {

                int a=10;
                try {

                for(int i=3;i>=0;i--){

                     System.out.println(a/i);  

                   }
                }
                catch(ArithmeticException e)
                {
                	System.out.println("can't divide it by zero");
}
        }
}
