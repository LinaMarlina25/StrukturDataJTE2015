
/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
   public KoordinatGPS (){
       this.lintang = new Double(0);       
       this.bujur = new Double(0);
}

public KoordinatGPS(Double bujur, Double lintang){
    this.lintang = lintang;       
    this.bujur = bujur;
}
public KoordinatGPS(double bujur, double lintang){
    this.lintang = lintang;       
    this.bujur = bujur;
}

public Double lintang(){
return lintang;
}
public Double bujur(){
return bujur;
}

private Double lintang;
private Double bujur;
}
