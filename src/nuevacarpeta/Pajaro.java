public class Pajaro {
    public void setedad(int e) { edad=e; }
    public void printedad() { System.out.println(edad); }
    public void setcolor(char c) { color=c; }
    private int edad;
    private char color;


    public static void main(String[] args) {

        Pajaro p = new Pajaro();

        p.setedad(3);
        p.setcolor('R'); // por ejemplo R de rojo
        p.printedad();
    }
}



