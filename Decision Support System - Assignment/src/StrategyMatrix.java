import java.util.Scanner;
public class StrategyMatrix {
    Scanner input=new Scanner(System.in);
    int[][] strategyMatrix;
    //A method that takes values from the user.
    public  void inputMatrix()
    {
        Criterions criterions=new Criterions();
        int decisionVariables,conditions,problemType=0;
        float hurwiczValue;
        do {
            System.out.println("Probleminiz Gelir Problemi ise \"1\" , Maliyet Problemi iste \"2\" değerini giriniz.");
            problemType=input.nextInt();
        }
        while (problemType!=1&&problemType!=2);
        System.out.println("Problem için kaç doğal durum var ? :");
        conditions=input.nextInt();
        System.out.println("Problem için kaç karar alternatifi var ? :");
        decisionVariables=input.nextInt();
        strategyMatrix=new int[decisionVariables][conditions];
        createMatrix(decisionVariables,conditions);
        do {
            System.out.println("HURWICZ DEĞERİ 1 İLE 0 ARASINDA OLMALIDIR." +
                    "Problem için Hurwicz Değeri giriniz :");
            hurwiczValue=input.nextFloat();
        }
        while (hurwiczValue>1&&hurwiczValue<0);
       getMatrix();
            criterions.optimismCriterion(strategyMatrix,problemType);
            criterions.pessimism(strategyMatrix,problemType);
              criterions.laplaceMethod(strategyMatrix,problemType,conditions);
                criterions.hurwiczCriterion(strategyMatrix,problemType,hurwiczValue);
    }
    //A method that assigns values taken from the user to a matrix.
    public void createMatrix(int decisionVariables,int conditions)
{
   for (int i=0;i<decisionVariables;i++)
   {
       for(int j=0;j<conditions;j++)
       {
           System.out.println((i+1)+". Karar Alternatifi için,"+(j+1)+". Doğal Durumdaki değeri giriniz :");
           strategyMatrix[i][j]=input.nextInt();
       }
   }
}
    //A method that displays the Strategy Matrix.
public void getMatrix()
{
    System.out.println("Strateji Matrisiniz:");
    for (int j=0;j<strategyMatrix[0].length;j++)
    {
        System.out.print("\t\t"+(j+1)+".DD ");
    }
    System.out.println();
    for (int i=0;i< strategyMatrix.length;i++)
    {
        System.out.print((i+1)+". KA: \t");
        for (int j=0;j<strategyMatrix[0].length;j++)
        {

            System.out.print(strategyMatrix[i][j]+"\t\t\t");
        }
        System.out.println();
    }
    System.out.println();
}
}
