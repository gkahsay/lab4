package Assignment3;

public class WeightConvertor {
    public double weight;
    public static final double MOON_WEIGHT_CONVERTOR=0.167;
    public static void main(String[] args){
        WeightConvertor wc= new WeightConvertor();
        wc.convertor(16);

    }
    public void convertor( double weight){
        this.weight= weight;
        System.out.println(weight * MOON_WEIGHT_CONVERTOR);
    }
}
