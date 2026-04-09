package rocks.zipcode.dreamhouse;

public class Picture {
    private Square wall;
    private Square window1, window2;
    private Triangle roof;
    private Circle sun;
    private MyRectangle door, garage, river, trunk ;
    private Triangle leaves;
    private Triangle bird1, bird2, bird3;
    private MyRectangle sky;
    private Circle cloud1a, cloud1b, cloud1c;
    private Circle cloud2a, cloud2b, cloud2c;
    
   

    public Picture() {
    }

    public void draw() {

        sky = new MyRectangle();
        sky.changeColor("blue");
        sky.changeSize(800, 1200);   
        sky.moveHorizontal(-200);    
        sky.moveVertical(-200);
        sky.makeVisible();
    
        river = new MyRectangle();
        river.changeColor("green");
        river.changeSize(150, 1000); 
        river.moveHorizontal(-150);
        river.moveVertical(400);
        river.makeVisible();

        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(650); 
        sun.moveVertical(30);
        sun.changeSize(100);
        sun.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(100);
        wall.moveVertical(150);
        wall.changeSize(290);
        wall.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(150, 360); 
        roof.moveHorizontal(260); 
        roof.moveVertical(50);
        roof.makeVisible();

        
        door = new MyRectangle();
        door.changeColor("black");
        door.changeSize(120, 70); 
        door.moveHorizontal(215); 
        door.moveVertical(280);  
        door.makeVisible();

        window1 = new Square();
        window1.changeColor("yellow");
        window1.moveHorizontal(140);
        window1.moveVertical(220);
        window1.changeSize(60);
        window1.makeVisible();

        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(300);
        window2.moveVertical(220);
        window2.changeSize(60);
        window2.makeVisible();

        
        cloud1a = new Circle();
        cloud1a.changeColor("white");
        cloud1a.moveHorizontal(100);
        cloud1a.moveVertical(40);
        cloud1a.changeSize(40);
        cloud1a.makeVisible();

        cloud1b = new Circle();
        cloud1b.changeColor("white");
        cloud1b.moveHorizontal(130);
        cloud1b.moveVertical(30);
        cloud1b.changeSize(50);
        cloud1b.makeVisible();

        cloud1c = new Circle();
        cloud1c.changeColor("white");
        cloud1c.moveHorizontal(160);
        cloud1c.moveVertical(40);
        cloud1c.changeSize(40);
        cloud1c.makeVisible();

        
        cloud2a = new Circle();
        cloud2a.changeColor("white");
        cloud2a.moveHorizontal(100);
        cloud2a.moveVertical(40);
        cloud2a.changeSize(40);
        cloud2a.makeVisible();

        cloud2b = new Circle();
        cloud2b.changeColor("white");
        cloud2b.moveHorizontal(530);
        cloud2b.moveVertical(40);
        cloud2b.changeSize(40);
        cloud2b.makeVisible();

        cloud2c = new Circle();
        cloud2c.changeColor("white");
        cloud2c.moveHorizontal(560);
        cloud2c.moveVertical(50);
        cloud2c.changeSize(30);
        cloud2c.makeVisible();

        bird1 = new Triangle();
        bird1.changeColor("black");
        bird1.changeSize(20, 30); // small bird
        bird1.moveHorizontal(500);
        bird1.moveVertical(50);
        bird1.makeVisible();

        bird2 = new Triangle();
        bird2.changeColor("black");
        bird2.changeSize(20, 30);
        bird2.moveHorizontal(50);
        bird2.moveVertical(80);
        bird2.makeVisible();

        bird3 = new Triangle();
        bird3.changeColor("black");
        bird3.changeSize(20, 30);
        bird3.moveHorizontal(200);
        bird3.moveVertical(60);
        bird3.makeVisible();

        garage = new MyRectangle();
        garage.changeColor("black");
        garage.changeSize(180, 120); 
        garage.moveHorizontal(400); 
        garage.moveVertical(220);  
        garage.makeVisible();
        

        trunk = new MyRectangle();
        trunk.changeColor("brown");
        trunk.changeSize(120, 40);
        trunk.moveHorizontal(05);
        trunk.moveVertical(280);
        trunk.makeVisible();

        leaves = new Triangle();
        leaves.changeColor("green");
        leaves.changeSize(180, 150);
        leaves.moveHorizontal(30); // Aligned with trunk center
        leaves.moveVertical(180);
        leaves.makeVisible();
    }

    public void setBlackAndWhite() {
        if(wall != null) {
            wall.changeColor("black");
            window1.changeColor("white");
            window2.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            door.changeColor("black");
            garage.changeColor("black");
            river.changeColor("black");
            trunk.changeColor("black");
            leaves.changeColor("black");
            cloud1a.changeColor("white");
            cloud1b.changeColor("white");
            cloud1c.changeColor("white");
            cloud2a.changeColor("white");
            cloud2b.changeColor("white");
            cloud2c.changeColor("white");
        }
    }

    public void setColor() {
        if(wall != null) {
            wall.changeColor("red");
            window1.changeColor("yellow");
            window2.changeColor("yellow");
            roof.changeColor("black");
            sun.changeColor("yellow");
            door.changeColor("black");
            garage.changeColor("black"); 
            river.changeColor("blue");
            trunk.changeColor("black");
            leaves.changeColor("green");
            cloud1a.changeColor("white");
            cloud1b.changeColor("white");
            cloud1c.changeColor("white");
            cloud2a.changeColor("white");
            cloud2b.changeColor("white");
            cloud2c.changeColor("white");
            
        }
    }
}

