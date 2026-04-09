package rocks.zipcode.dreamhouse;

import java.awt.Rectangle;

public class MyRectangle
{
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public MyRectangle()
    {
        height = 30;
        width = 100;
        xPosition = 60;
        yPosition = 80;
        color = "pink";
        isVisible = false;
    }

    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    public void moveRight() { moveHorizontal(20); }
    public void moveLeft() { moveHorizontal(-20); }
    public void moveUp() { moveVertical(-20); }
    public void moveDown() { moveVertical(20); }

    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    public void slowMoveHorizontal(int distance)
    {
        int delta = (distance < 0) ? -1 : 1;
        distance = Math.abs(distance);

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    public void slowMoveVertical(int distance)
    {
        int delta = (distance < 0) ? -1 : 1;
        distance = Math.abs(distance);

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    // ✅ FIXED: change both width and height
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                new Rectangle(xPosition, yPosition, width, height)); // ✅ FIXED
            canvas.wait(10);
        }
    }

    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}