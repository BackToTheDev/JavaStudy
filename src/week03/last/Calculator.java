package week03.last;

public class Calculator {

   private AbstractOperation operation;

   public void setOperation(AbstractOperation operation) {
       this.operation = operation;
   }

   public double calculate(int firstNumber, int secondNumber) {
       return operation.operate(firstNumber, secondNumber);
   }
}
