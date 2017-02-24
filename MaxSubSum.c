#include <stdio.h>
#include <stdlib.h>
int power(int x,int y){
    int i,carpim;
    carpim=1;
    for(i=0;i<y;i++){
        carpim=carpim*x;
    }   
    return carpim; 
}

int FindMaxSubSum(int x[], int n)
{
    int sum = 0;
    int maxSubSum = 0;
    int i,j,k;
    for (i = 0; i < n; i++)
    {
        for (j = i; j < n; j++)
        {
            sum = 0;
            for (k = i; k <= j; k++)
            {
                sum += x[k];
            }
            if (sum > maxSubSum)
            {
                maxSubSum = sum;
            }
        }
    }
    return maxSubSum;
}

int main(int argc, char *argv[])
{
  printf("2^5=%d\n",power(2,5));
  int array[]={355,5,8,12,84,53};
  printf("\n\nMaxSubSum-->%d\n\n",FindMaxSubSum(array,6));
  system("PAUSE");	
  return 0;
}
