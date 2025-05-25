// 2. Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods. WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces. (A)

interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();

    void mousePressed();

    void mouseReleased();

    void mouseMoved();

    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();

    void keyReleased();
}

public class P2 implements MouseListener, KeyListener {

    @Override
    public void performEvent() {
        System.out.println("Event performed!");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse clicked.");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse pressed.");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse released.");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse moved.");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse dragged.");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key pressed.");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key released.");
    }

    public static void main(String[] args) {
        P2 obj = new P2();

        obj.performEvent();
        obj.mouseClicked();
        obj.mousePressed();
        obj.mouseReleased();
        obj.mouseMoved();
        obj.mouseDragged();
        obj.keyPressed();
        obj.keyReleased();
    }
}
