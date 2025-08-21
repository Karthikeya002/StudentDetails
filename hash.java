import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4); 
        set.removeIf(n -> n % 2 == 0); 
        System.out.println(set); 

        set.add(null); // Adding null to the set
        System.out.println(set); // Output will show null is added              
    }
    
}
