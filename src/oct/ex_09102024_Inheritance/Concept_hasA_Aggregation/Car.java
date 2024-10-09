package oct.ex_09102024_Inheritance.Concept_hasA_Aggregation;

public class Car {
    //Car has an Engine ,Tyre
   protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
