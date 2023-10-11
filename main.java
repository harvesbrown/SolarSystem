public class main {
    public static void main(String[] args){
        float x = 0;
        SolarSystem s1 = new SolarSystem(500,500);

        while (true){
            s1.drawSolarObject(0,0, 50, "yellow");
            s1.drawSolarObject(100, x, 10, "blue");
            if(x < 360){
                x += 2;
            } else {
                x = 0;
            }
            
            s1.finishedDrawing();
        }
    }
}
