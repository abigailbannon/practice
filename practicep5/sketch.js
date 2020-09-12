function setup() {
  createCanvas(1000, 700);
   background(255,0,0);}

function draw() {
//  background(255,0,0);
  fill(255,0,0);
  stroke(0);
     rect(width/2, height/2, 500,300);
  //background(255); //leaves no past loops, because background is redone
  fill(random(80),random(80),random(85));
 // fill(255);
  // rect(random(600),random(400),random(100),random(100)); //random rectangle generator
   ellipse(mouseX,mouseY,50,10); // random generator following mouse

}
