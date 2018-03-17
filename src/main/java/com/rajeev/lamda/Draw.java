package com.rajeev.lamda;




public class Draw {  
	
	private void draw(Drawable drawable ) {
		drawable.draw();
		
	}
	
    public static void main(String[] args) {  
        int width=10;  
 
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  

        
        Draw draw=new Draw();
        draw.draw(()-> System.out.println("Draw Circle"));
 
        Drawable drawable=()-> System.out.println("Draw line");
        
        drawable.draw();
        draw.draw(drawable);
  
  
    }  
}  

