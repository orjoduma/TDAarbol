    public static void main(String[] args) {
        int entero = 0;
        byte codigo[] = {0,0,0,0,0,0,1};
        int iterador = 0;
        for (int i = 0; i < 7; i++) {
            byte temp = codigo[i];
            temp = (byte) (temp<<iterador);
            iterador++;
            entero += temp;
            System.out.println("Oh Yeah!");
        }
        System.out.println(Integer.toBinaryString(entero));
        
    }
