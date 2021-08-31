public class Translator {
    //fields
    Rotor rotor1;
    Rotor rotor2;
    Rotor rotor3;
    PlugBoard plugBoard;
    Reflector reflector;

    //constructor
    public Translator(Rotor rotor1, Rotor rotor2, Rotor rotor3, PlugBoard plugBoard){
        this.rotor1 = rotor1;
        this.rotor2 = rotor2;
        this.rotor3 = rotor3;
        this.plugBoard = plugBoard;
        reflector = new Reflector();
    }

    public String encrypt(String str){
        String code = "";
        for (int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            curr = plugBoard.translate(curr);
            if (rotor1.needturn==rotor1.turn) {
                if (rotor2.needturn==rotor2.turn)
                    rotor3.advance();
                rotor2.advance();
            }
            rotor1.advance();
            curr = rotor1.getForwardTranslate(curr);
            curr = (char)(curr - rotor1.offset);
            curr = correction(curr);
            curr = rotor2.getForwardTranslate(curr);
            curr = (char)(curr - rotor2.offset);
            curr = correction(curr);
            curr = rotor3.getForwardTranslate(curr);
            curr = correction(curr);
            curr = reflector.translate(curr);
            curr += rotor3.offset;
            curr = correction(curr);
            curr = rotor3.getReverseTranslate(curr );
            curr += rotor2.offset;
            curr = correction(curr);
            curr = rotor2.getReverseTranslate(curr);
            curr += rotor1.offset;
            curr = correction(curr);
            curr = rotor1.getReverseTranslate(curr);
            code += curr;
        }
        return code;
    }
    
    private char correction(char curr){
        if (curr < 'A')
            return (char)(curr + 26);
        if (curr > 'Z')
            return (char)(curr - 26);
        return curr;
    }

}
