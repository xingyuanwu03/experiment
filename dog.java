public class dog{
  public static void main(String[] args){
    int sum=0;
    for(String arg:args){
      sum+=Integer.parseInt(arg); // 转换字符串为int
    }
    System.out.print(sum); // 用英文的分号
  }
}