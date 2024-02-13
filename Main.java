class Tarray
{
    public static void main(String[] args)
    {
        int A[] = {22, 33, 44, 55, 66};


        for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i]);
            System.out.print(" ");

        }


        int B[] = {22, 33, 44, 55, 66};


        for (int i : B)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
