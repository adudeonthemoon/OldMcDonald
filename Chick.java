class Chick implements Animal
{
private String myType;
private String youngSound;
private String oldSound;
private String mySound;
    Chick(String type, String ySound, String oSound)
    {
        myType = type;
        youngSound = ySound;
        oldSound = oSound;
        double rand = (Math.random() * 1);
        if(rand <= .5){
            mySound = ySound;
        }
        else {
            mySound = oSound;
        }
        
}
public String getSound() { return mySound; }
public String getType() { return myType; }
}