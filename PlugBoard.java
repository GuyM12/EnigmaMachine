public class PlugBoard {
    //fields
    int[] permutation;

    //constructor
    public PlugBoard(String pairs){
        permutation = new int[26];
        if(!pairs.equals("NULL")) {
            for (int i = 0; i < 26; i++) {
                permutation[i] = i;
            }
            for (int i = 0; i < pairs.length(); i += 2) {
                int temp = permutation[pairs.charAt(i) - 'A'];
                permutation[pairs.charAt(i) - 'A'] = permutation[pairs.charAt(i + 1) - 'A'];
                permutation[pairs.charAt(i + 1) - 'A'] = temp;
            }
        }else{
            for(int i = 0; i<permutation.length; i++)
                permutation[i] = i;
        }
    }
    //receives a letter and translates it
    public char translate(char letter){
        return (char) (permutation[letter - 'A'] + 'A');
    }
}