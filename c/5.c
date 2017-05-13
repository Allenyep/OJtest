//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
int fun(int n,int xx[][]){
    int i,j,sum=0;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%4f",xx[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<n;i++){
        sum+=xx[i][i]+xx[i][n-i+1];
    }
    return sum;
}
int main(void)
{
    
	return EXIT_SUCCESS;
}