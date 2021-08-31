public class Rotor {
    //fields
    String permutation;
    String reverseRingSetting;
    int turn;
    char toturn;
    int needturn;
    int offset;

    public Rotor(int rotor, int ringSetting){
        if (rotor == 1){
            permutation = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
            turn = 'Q'-'A';
            toturn = 'R';
        }
        if (rotor == 2){
            permutation = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
            turn = 'E'-'A';
            toturn = 'F';
        }
        if (rotor == 3){
            permutation = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
            turn = 'V'-'A';
            toturn = 'W';
        }
        if (rotor == 4){
            permutation = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
            turn = 'J'-'A';
            toturn = 'K';
        }
        if (rotor == 5){
            permutation = "VZBRGITYUPSDNHLXAWMJQOFECK";
            turn = 'Z'-'A';
            toturn = 'A';
        }
        for(int i = 1; i<ringSetting; i++){
            advance();
        }
        toReverse();
        needturn = 0;
    }

    private void toReverse() {
        String reverse = "";
        for(int i = 0; i<26; i++){
            reverse += (char) (permutation.indexOf(i+'A') + 'A');
        }
        reverseRingSetting = reverse;
    }

    public void advance(){
        needturn = (needturn+1)%26;
        permutation = permutation.substring(1) + permutation.charAt(0);
        toReverse();
        offset = (offset + 1) % 26;
    }

    public char getForwardTranslate(char letter){
        return permutation.charAt(letter - 'A');
    }

    public char getReverseTranslate(char letter) {
        return reverseRingSetting.charAt(letter - 'A');
    }


}
