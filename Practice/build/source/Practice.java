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

public class Practice extends PApplet {
  public void setup() {
//\u30b5\u30a4\u30ba\u6307\u5b9a
size(640,480);
//\u80cc\u666f\u8272
background(255);
//\u70b9
point(50,10);
//\u76f4\u7dda
line(200,0,0,200);
//\u4e09\u89d2\u5f62
triangle(100,10,50,100,100,50);
//\u30d9\u30b8\u30a7\u66f2\u7dda
bezier(32,20,80,5,80,75,30,75);
//\u7dda\u306b\u8272\u4ed8\u3051
stroke(255,165,0);
line (10,10,60,50);
//\u7dda\u306e\u592a\u3055
strokeWeight(5);
    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Practice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
