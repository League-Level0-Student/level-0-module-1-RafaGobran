
void setup() {
    size(500, 500);
    PImage mushroom;
    mushroom = loadImage("mushroom.png");
    image(mushroom,250, 250);
    PImage pepperoni;
     pepperoni = loadImage("pepperoni.png");
         image(pepperoni,250, 250);
          PImage olive;
     olive = loadImage("olive.png"); 
      image(olive,250, 250);
       PImage mushroom2;
    mushroom = loadImage("mushroom.png");
    image(mushroom,150, 150);
    PImage pepperoni2;
     pepperoni = loadImage("pepperoni.png");
         image(pepperoni,100, 100);
          PImage olive2;
     olive = loadImage("olive.png"); 
      image(olive,200, 200);
}
void draw() {
  
    fill(#D6A04E);
    ellipse(250, 250,  450, 450);
    fill(255, 0, 0, 200);
    ellipse(250, 250,  400, 400);
    fill(#F2EC25);
    ellipse(250, 250,  370, 370);
    
    if (mousePressed && (mouseButton == RIGHT)) {}
    
}
