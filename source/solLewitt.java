import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class solLewitt extends PApplet {

float []x=new float[50];
float []y=new float[50];

public void setup(){
 
 for(int i=0;i<x.length;i=i+1){
    x[i]=random(width);
   y[i]=random(height);
   strokeWeight(.1f);
  }
}

public void draw(){
  background(255);
  for(int j=0;j<x.length;j=j+1){
  for(int i=0;i<x.length;i=i+1){
    point(x[i],y[i]);
    line(x[i],y[i],x[j],y[j]);
  }
}
noLoop();
}
public void mousePressed(){
  background(255);
    for(int i=0;i<x.length;i=i+1){
    x[i]=random(width);
    y[i]=random(height);
    strokeWeight(.1f);
    }
    loop();
}
  public void settings() {  size(800,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "solLewitt" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
