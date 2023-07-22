import java.util.ArrayList;

public class rec_j4_permu {
    public static void main(String[] args) {
        // permutations("", "adw");
        System.out.println(permutationsCount("", "abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); ++i){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }
    
    
    static ArrayList<String> permutationsList(String p, String up){
        ArrayList<String> ans = new ArrayList<String>();

        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); ++i){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p, String up){
        int n = 0;
        if(up.isEmpty()){        
            return 1;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); ++i){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           n = n + permutationsCount(f + ch + s, up.substring(1));
        }
        return n;
    }
}
