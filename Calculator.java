import java.lang.Math;

public class Calculator{

  double first;
  double second ;
  String oP;
  double result;

  Calculator(){ //constructor,,,
    this.first=first;
    this.second=second;
    this.oP=oP;
    this.result=result;
  }


  void operation(String str){
    //called by methods where we only need one number
    first = second; // discards value of first number and we focus on second number
    str = oP;
  }
  double add(){
    return result = first + second;
  }
  double subtract(){
    return result = first - second;
  }
  double multiply(){
    return result = first*second;
  }
  double divide(){
    return result = first/second;
  }
  double factorial(){
    operation("!");
    result = 1;
    for (int i = 2; i <= first; i++){
      result = result*i;
      }
    return result;
  }
  double pow(){
    for (int n = 1; n < second; n++){
      result = first*first;
    }
    return result;
  }
  double rootSquare(){
    operation("sqrt");
    return result = Math.sqrt(first);
  }
  double nepLog(){
    operation("ln");
    return result = Math.log(first);
  }
  double display(){
    return result;
  }
  void clear(){
    first = 0;
    second = 0;
    oP = "";
  }
  double compute(){
    if (oP=="+")
      add();
    if (oP=="-")
      subtract();
    if (oP=="*")
      multiply();
    if (oP=="/")
      divide();
    if (oP=="POW")
      pow();
    if (oP=="sqrt")
      rootSquare();
    if (oP=="ln")
      nepLog();
    if (oP=="!")
      factorial();
    return result;
  }
}
