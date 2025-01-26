import java.util.HashSet;

public class ValidSudoku {
    public boolean ValidSudo(char[][] board){
        int N = 9;


        HashSet<Character>[] row = new HashSet[N];
        HashSet<Character>[] col = new HashSet[N];
        HashSet<Character>[] box = new HashSet[N];
        for(int r=0; r<N; r++){
            row[r] = new HashSet<Character>();
            col[r] = new HashSet<Character>();
            box[r] = new HashSet<Character>();
        }

        for (int r = 0; r<N; r++){
            for(int c=0; c<N; c++){

                char val = board[r][c];

                if(val == '.'){
                    continue;
                }

                if(row[r].contains(val)){
                    return false;
                }
                row[r].add(val);

                if(col[c].contains(val)){
                    return false;
                }
                col[c].add(val);

                int cal = (r/3) * 3 + c/3;
                if(box[cal].contains(val)){
                    return false;
                }
                box[cal].add(val);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
