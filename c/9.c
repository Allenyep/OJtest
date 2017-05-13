//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
double fun(int x[]){
    double sum=0.0;
    int c=0,i=0;
    while(x[i]!=0){
        if(x[i]>0){
            sum+=x[i];c++;
        }
        i++;
    }
    sum=sum/c;
    return sum;
}
int main(void)
{
    int x[]={39,-47,21,2,-8,15,0};
    printf("%f",fun(x));
	return EXIT_SUCCESS;
}