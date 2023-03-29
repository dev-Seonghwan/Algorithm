import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());


        while (true){
            String operator = br.readLine();
            if (operator.equals("=")) {
                System.out.println(n1);
                break;

            }
            int n2 = Integer.parseInt(br.readLine());

            switch (operator){
                case "+" :
                    n1 += n2;
                    break;
                case "-" :
                    n1 -= n2;
                    break;
                case "*" :
                    n1 *= n2;
                    break;
                case "/" :
                    n1 /= n2;
                    break;
            }
        }
    }
}
