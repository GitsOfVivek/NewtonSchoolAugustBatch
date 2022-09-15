import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t > 0) {

            String[] line0 = br.readLine().split(" ");

            int m = Integer.parseInt(line0[0]);

            int n = Integer.parseInt(line0[1]);

            boolean[][] mat = new boolean[m][n];

            for(int i = 0; i < m; i++) {

                String[] line = br.readLine().split(" ");

                for(int j = 0; j < n; j++) {

                    if (Integer.parseInt(line[j]) == 1) {

                        mat[i][j] = true;

                    } else {

                        mat[i][j] = false;

                    }

                }

            }
            outer:
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==true){
                        Arrays.fill(mat[i],true);
                    continue outer;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {

                    sb.append((mat[i][j] ? '1' : '0') + " ");

                }

                sb.append('\n');

            }

            System.out.print(sb.toString());

        --t;

        }
    }
}
