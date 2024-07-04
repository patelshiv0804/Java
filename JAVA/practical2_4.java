class timepass {
 int value;
 public timepass(int value) {
 this.value = value;
 }
}
public class practical2_4 {
 public static void modifyValue(int x) {
 x = 42;
 }
 public static void modifyObjectValue(timepass obj) {
 obj.value = 42;
 }
 public static int add(int a, int b) {
 return a + b;
 }
 public static timepass createObject(int value) {
 return new timepass(value);
 }
 public static void main(String[] args) {
 int num = 10;
 System.out.println("Before Value: " + num);
 modifyValue(num);
 System.out.println("After Value: " + num);
 timepass myObj = new timepass(10);
 System.out.println("Before ObjectValue: " + myObj.value);
 modifyObjectValue(myObj);
 System.out.println("After ObjectValue: " + myObj.value);
 int sum = add(5, 7);
 System.out.println("Result of add method: " + sum);
 timepass newObj = createObject(100);
 System.out.println("Value of the created object: " + newObj.value);
 }
}