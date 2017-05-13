//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
fun(int n,int *a){
    int i,j,p,t;
    for(j=0;j<n-1;j++){
        p=j;
        for(i=j+1;i<n;i++){
            if(a[p]>a[i]){
                t=a[i];
            }
        }
        if(p!=j){
            t=a[j];a[j]=a[p];a[p]=t;
        }
    }
}
int main(void)
{
	return EXIT_SUCCESS;
}