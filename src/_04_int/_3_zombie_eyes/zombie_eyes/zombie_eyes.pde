PImage face;
void setup() {
 face = loadImage("zombieface.png");
 size(500, 500);
 face.resize(500, 500);
}
void draw() {
image(face, 0, 0);
fill(255, 0, 0);
rect(173, 195,  50, 45);
rect(275, 195,  50, 45);
fill(0, 0, 0);
ellipse(193, 215,  30, 25);
ellipse(298, 215,  30, 25);
}
