public class MatrixFunc {
    /*Finds the highest value among the natural states for decision alternatives in the Strategy Matrix and assigns it to a one-dimensional array.*/
    public static int[] findMaxValuesInDecision(int[][] matrix)
    {
        int[] maxValues=new int[matrix.length];
        for (int i=0;i< matrix.length;i++)
        {
         int maxValue=matrix[i][0];
            for (int j=0;j<matrix[0].length;j++)
            {
                if (maxValue<matrix[i][j])
                {
                maxValue=matrix[i][j];
                }
            }
        maxValues[i]=maxValue;
        }
        return maxValues;
    }
    /*Finds the lowest value among the natural states for decision alternatives in the Strategy Matrix and assigns it to a one-dimensional array.*/
    public static int[] findMinValuesInDecision(int[][] matrix)
    {
        int[] minValues=new int[matrix.length];
        for (int i=0;i< matrix.length;i++)
        {
            int minValue=matrix[i][0];
            for (int j=0;j<matrix[0].length;j++)
            {
                if (minValue>matrix[i][j])
                {
                    minValue=matrix[i][j];
                }
            }
            minValues[i]=minValue;
        }
        return minValues;
    }

    /*
Assigns the highest value among the natural states for decision alternatives in the Strategy Matrix to a one-dimensional array. (For the Float data type)*/
    public static float[] findMaxValuesInFloatDecision(float[][] matrix)
    {
        float[] maxValues=new float[matrix.length];
        for (int i=0;i< matrix.length;i++)
        {
            float maxValue=matrix[i][0];
            for (int j=0;j<matrix[0].length;j++)
            {
                if (maxValue<matrix[i][j])
                {
                    maxValue=matrix[i][j];
                }
            }
            maxValues[i]=maxValue;
        }
        return maxValues;
    }

    /*Finds the lowest value among the natural states for decision alternatives in the Strategy Matrix and assigns it to a one-dimensional array. (For the Float data type)*/
    public static float[] findMinValuesInFloatDecision(float[][] matrix)
    {
        float[] minValues=new float[matrix.length];
        for (int i=0;i< matrix.length;i++)
        {
            float minValue=matrix[i][0];
            for (int j=0;j<matrix[0].length;j++)
            {
                if (minValue>matrix[i][j])
                {
                    minValue=matrix[i][j];
                }
            }
            minValues[i]=minValue;
        }
        return minValues;
    }

   //It is used to select the maximum among the decision alternatives whose values have been obtained.
    public static int findMax(int[] matrix)
    {
        int maxDeger=matrix[0];
        int alternatif=0;
        for(int i=0;i<matrix.length;i++)
        {
            if (maxDeger<matrix[i])
            {
                maxDeger=matrix[i];
                alternatif=i;
            }
            if(i!=0&&maxDeger==matrix[i])
            {

            }
        }
        System.out.println("Karar Alternatifi "+ (alternatif+1));
        return maxDeger;
    }
    //It is used to select the minimum among the decision alternatives whose values have been obtained.
    public static int findMin(int[] matrix)
    {
        int minDeger=matrix[0];
        int alternatif=0;
        for(int i=0;i<matrix.length;i++)
        {
            if (minDeger>matrix[i])
            {
                minDeger = matrix[i];
               alternatif=i;
            }
        }
        System.out.println("Karar Alternatifi "+ (alternatif+1));
        return minDeger;
    }
    //It is used to select the maximum among the decision alternatives whose values have been obtained (float data type).
    public static float findFloatMax(float[] matrix)
    {
        float maxDeger=matrix[0];
        int alternatif=0;
        for(int i=0;i<matrix.length;i++)
        {
            if (maxDeger<matrix[i])
            {
                maxDeger=matrix[i];
                alternatif=i;
            }
        }
        System.out.println("Karar Alternatifi "+ (alternatif+1));
        return maxDeger;
    }
    //It is used to select the minimum among the decision alternatives whose values have been obtained (float data type).
    public static float findFloatMin(float[] matrix)
    {
        float minDeger=matrix[0];
        int alternatif=0;
        for(int i=0;i<matrix.length;i++)
        {
            if (minDeger>matrix[i])
            {
                minDeger = matrix[i];
                alternatif=i;
            }
        }
        System.out.println("Karar Alternatifi "+ (alternatif+1));
        return minDeger;
    }
//It is used to multiply the values with the Hurwicz value.
    public static float[] multiplyValuesToHurwicz(float[][] floatMatrix,float hurwiczValue,int problemType)
    {
     float[] hurwiczMatrix=new float[floatMatrix.length];
     float hurwiczDifference=(1.0f-hurwiczValue);
     float result;
     float[] rowMax=findMaxValuesInFloatDecision(floatMatrix);
     float[] rowMin=findMinValuesInFloatDecision(floatMatrix);
     if (problemType==1)
     {
         for (int i=0;i<hurwiczMatrix.length;i++)
         {
            hurwiczMatrix[i]=(rowMax[i]*hurwiczValue)+(rowMin[i]*hurwiczDifference);
         }
        return hurwiczMatrix;
     }
     else
     {
         for (int i=0;i<hurwiczMatrix.length;i++)
         {
                 hurwiczMatrix[i]=(rowMin[i]*hurwiczValue)+(rowMax[i]*hurwiczDifference);
         }
         return  hurwiczMatrix;
     }

    }
    /*It converts the decision alternatives in the strategy matrix to float and then multiplies them for equal probability.*/
    public  static float[][] multiplyValuesToProbability(int[][] matrix,int conditions)
    {
        float probability=(1.0f/conditions);
        float[][] floatMatrix=intToFloatMatrix(matrix);
        float[][] multipliedMatrix=new float[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                multipliedMatrix[i][j]=floatMatrix[i][j]*probability;
            }
        }
        //findMaxValuesInFloatDecision(multipliedMatrix);
        //findMinValuesInFloatDecision(multipliedMatrix);
        return multipliedMatrix;
    }
    //It converts an integer matrix to the Float data type.
    public static float[][] intToFloatMatrix(int[][] matrix)
    {
        float[][] floatMatrix=new float[matrix.length][matrix[0].length];
        for (int i=0;i< floatMatrix.length;i++)
        {
            for (int j=0;j<floatMatrix[0].length;j++)
            {
                floatMatrix[i][j]=(float) matrix[i][j];
            }
        }
        return floatMatrix;
    }
}
