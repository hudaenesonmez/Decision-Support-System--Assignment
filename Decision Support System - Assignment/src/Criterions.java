public class Criterions {
    MatrixFunc mFunc=new MatrixFunc();

//The criteria are called from here.
    //Optimism Criterion
    public void optimismCriterion(int[][] matrix,int problemType)
    {
        int optimism;
        System.out.print("İyimserlik Ölçütüne Göre Kararınız : ");
        if(problemType==1)
        {
            optimism=mFunc.findMax(mFunc.findMaxValuesInDecision(matrix));
        } else
        {
            optimism = mFunc.findMin(mFunc.findMinValuesInDecision(matrix));
        }
    }
    //Pessimism Criterion
    public  void pessimism(int[][] matrix,int problemType)
    {

        int pess;
        System.out.print("Kötümserlik Ölçütüne Göre Kararınız : ");
        if (problemType==1)
        {
            pess=mFunc.findMax(mFunc.findMinValuesInDecision(matrix));
        }
        else
        {
            pess=mFunc.findMin(mFunc.findMaxValuesInDecision(matrix));
        }

    }
    //Equal Probability (Laplace) Criterion
    public void laplaceMethod(int[][] matrix,int problemType,int conditions)
    {
        float[][] laplace;
        float laplaceCriterion;
        laplace=mFunc.multiplyValuesToProbability(matrix,conditions);
        //laplaceMatrix(laplace); //TEST MATRIX section can be activated for execution if needed.
        System.out.print("Eş Olasılık(Laplace) Ölçütüne Göre Kararınız : ");
        if (problemType==1)
        {
            laplaceCriterion=mFunc.findFloatMax(mFunc.findMaxValuesInFloatDecision(laplace));

        }
        else
        {
            laplaceCriterion=mFunc.findFloatMin(mFunc.findMinValuesInFloatDecision(laplace));
        }
    }
    //Hurwicz Criterion
    public void hurwiczCriterion(int[][] matrix,int problemType,float hurwiczValue)
    {
        float[][] hurwicz=mFunc.intToFloatMatrix(matrix);
        float[] hurwiczMatrix=mFunc.multiplyValuesToHurwicz(hurwicz,hurwiczValue,problemType);
        float hurwiczCrit;
        System.out.print("Hurwicz Ölçütüne Göre Kararınız : ");
        if (problemType==1)
        {
            hurwiczCrit=mFunc.findFloatMax(MatrixFunc.multiplyValuesToHurwicz(hurwicz,hurwiczValue,problemType));
            //hurwiczMatrix(hurwiczMatrix); //TEST MATRIX section can be activated for execution if needed.
        }
        else
        {
            hurwiczCrit=mFunc.findFloatMin(MatrixFunc.multiplyValuesToHurwicz(hurwicz,hurwiczValue,problemType));
            //hurwiczMatrix(hurwiczMatrix); //TEST MATRIX section can be activated for execution if needed.
        }
    }
    //TEST MATRIX
    //The matrix outputs here can be activated, and they are paused for Laplace and Hurwicz checks.
    /*private void  hurwiczMatrix(float[] hurwiczMatrix)
    {

        System.out.println("Hurwicz Değerleri Matrisi:");
     for (int i=0;i<hurwiczMatrix.length;i++)
     {
             System.out.print((i+1)+". KA: \t"+hurwiczMatrix[i]+"\t\t\t");
         System.out.println();
     }
    }
    public void laplaceMatrix(float[][] matrix)
    {
        System.out.println("Laplace Matrisiniz:");
        for (int j=0;j<matrix[0].length;j++)
        {
            System.out.print("\t\t"+(j+1)+".DD ");
        }
        System.out.println();
        for (int i=0;i< matrix.length;i++)
        {
            System.out.print((i+1)+". KA: \t");
            for (int j=0;j<matrix[0].length;j++)
            {

                System.out.print(matrix[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
*/
   
}
