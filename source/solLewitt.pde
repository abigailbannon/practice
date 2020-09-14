float []x=new float[50];
float []y=new float[50];

void setup(){
 size(800,600);
 for(int i=0;i<x.length;i=i+1){
    x[i]=random(width);
   y[i]=random(height);
   strokeWeight(.1);
  }
}

void draw(){
  background(255);
  for(int j=0;j<x.length;j=j+1){
  for(int i=0;i<x.length;i=i+1){
    point(x[i],y[i]);
    line(x[i],y[i],x[j],y[j]);
  }
}
noLoop();
}
void mousePressed(){
  background(255);
    for(int i=0;i<x.length;i=i+1){
    x[i]=random(width);
    y[i]=random(height);
    strokeWeight(.1);
    }
    loop();
}
