public class Reflector {
    //fields
    int[] permutation;

    //constructor
    public Reflector(){
        String B = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
        permutation = new int[26];
        for (int i = 0; i < permutation.length;i++) {
            permutation[i] = B.charAt(i) - 'A';
        }
    }

    //receives a letter and translates it
    public char translate(char letter){
        return (char)(permutation[letter - 'A'] + 'A');
    }
}
