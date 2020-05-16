public class Janlist {
    private int[] array;

    public Janlist(){
        int[] m = new int[0];
        array = m;
    }

    public Janlist(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void add(int a){
        int[] n = new int[array.length+1];
        int z = 0;
        for (int i = 0; i < array.length; i++){
            n[i] = array[i];
            z++;
        }
        n[z++] = a;
        array = n;

    }


    public void set(int a, int b){
        array[a] = b;
    }

    public void remove(int a){
        int[] n = new int[array.length-1];
        int x = 0;
        for(int i = 0; i < array.length; i++){
            if(i != a){
                n[x] = array[i];
                x++;
            }
        }
        array = n;
    }
    public int size(){
        return array.length;
    }
}