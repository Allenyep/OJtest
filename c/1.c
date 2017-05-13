//#include "header.h"   //Anycodes includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>

int fun(int *a,int n){
    int k,m1,m2,max1,max2,t;
    max1=max2=-32768;
    m1=m2=0;
    for(k=0;k<n;k++){
        if(a[k]>max1){
            max2=max1;m2=m1;
            max1=a[k];m1=k;
        }else if(a[k]>max2){
            max2=a[k];m2=k;
        }
    }
    //改错部分
    t=a[0];a[0]=a[m1];a[m1]=t;
    t=a[1];a[1]=a[m2];a[m2]=t;
}

int main(void)
{
    int x,b[10]={7,10,12,0,3,6,9,11,5,8},n=10,i;
    for(int i=0;i<n;i++){
        printf("%d ",b[i]);
    }
    fun(b,n);
    printf("\n");
    for(int i=0;i<n;i++){
        printf("%d ",b[i]);
    }
    return EXIT_SUCCESS;
}