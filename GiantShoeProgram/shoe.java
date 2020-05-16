package GiantShoeProgram;

public class shoe {
    private String name;
    private int size;
    private String color;
    private sock[] socks = new sock[2];

    public shoe(String name, int size, String color, sock[] x) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.socks = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setRightSock(sock s) {
        socks[0] = s;
    }
    public void setLeftSock(sock s) {
        socks[1] = s;
    }
    public sock getRightSock(){
        return socks[0];
    }
    public sock getLeftSock(){
        return socks[1];
    }
}
