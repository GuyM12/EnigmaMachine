import java.util.Scanner;
public class Enigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("if you want the deafult version write DEF else write anything else (Just say u agrees us not to make initial offset)");
        if(sc.next().equals("DEF")){
            Rotor rotor1 = new Rotor(1,1);
            Rotor rotor2 = new Rotor(2,1);
            Rotor rotor3 = new Rotor(3,1);
            PlugBoard pb = new PlugBoard("NULL");
            Translator trans = new Translator(rotor1, rotor2, rotor3, pb);
            String str = trans.encrypt(sc.next());
            System.out.println(str);

        }else {
            System.out.println("Enter Ring setting (number bigger or equals to 1)");
            int ringSetting = sc.nextInt();
            System.out.println("Enter the permutations for the rotors: ");
            System.out.println("1. EKMFLGDQVZNTOWYHXUSPAIBRCJ");
            System.out.println("2. AJDKSIRUXBLHWTMCQGZNPYFVOE");
            System.out.println("3. BDFHJLCPRTXVZNYEIWGAKMUSQO");
            System.out.println("4. ESOVPZJAYQUIRHXLNFTGKDCMWB");
            System.out.println("5. VZBRGITYUPSDNHLXAWMJQOFECK");
            Rotor rotor1 = new Rotor(sc.nextInt(), ringSetting);
            System.out.println("Enter Ring setting (number bigger or equals to 1)");
            ringSetting = sc.nextInt();
            System.out.println("Enter the permutations for the rotors: ");
            System.out.println("1. EKMFLGDQVZNTOWYHXUSPAIBRCJ");
            System.out.println("2. AJDKSIRUXBLHWTMCQGZNPYFVOE");
            System.out.println("3. BDFHJLCPRTXVZNYEIWGAKMUSQO");
            System.out.println("4. ESOVPZJAYQUIRHXLNFTGKDCMWB");
            System.out.println("5. VZBRGITYUPSDNHLXAWMJQOFECK");
            Rotor rotor2 = new Rotor(sc.nextInt(), ringSetting);
            System.out.println("Enter Ring setting (number bigger or equals to 1)");
            ringSetting = sc.nextInt();
            System.out.println("Enter the permutations for the rotors: ");
            System.out.println("1. EKMFLGDQVZNTOWYHXUSPAIBRCJ");
            System.out.println("2. AJDKSIRUXBLHWTMCQGZNPYFVOE");
            System.out.println("3. BDFHJLCPRTXVZNYEIWGAKMUSQO");
            System.out.println("4. ESOVPZJAYQUIRHXLNFTGKDCMWB");
            System.out.println("5. VZBRGITYUPSDNHLXAWMJQOFECK");
            Rotor rotor3 = new Rotor(sc.nextInt(), ringSetting);
            System.out.println("Enter plugboard configuration (for nothing write NULL)");
            PlugBoard pb = new PlugBoard(sc.next());
            Translator trans = new Translator(rotor1, rotor2, rotor3, pb);
            System.out.println("Enter text to encrypt: ");
            String encryption = trans.encrypt(sc.next());
            System.out.println("This is your encryprion: \n" + encryption);
        }
    }


}
