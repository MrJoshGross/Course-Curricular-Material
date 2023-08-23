class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String message = "this is a message";
        System.out.println(encrypt(message));
        System.out.println(decrypt(encrypt(message)));
    }
    
    public static String encrypt(String plain){
        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char c : plain.toCharArray()){
            if(c == ' ')
                result += ' ';
            else
                result += alphabet.charAt((alphabet.indexOf(c) + 3) % 26);
        }
        return result;
    }
    
    public static String decrypt(String cipher){
        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char c : cipher.toCharArray()){
            if(c == ' ')
                result += ' ';
            else
                result += alphabet.charAt((alphabet.indexOf(c) - 3) % 26);
        }
        return result;
    }
}