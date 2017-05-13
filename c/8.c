//#include "header.h"   //Anycodes includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
double fun(int n){
    double result=1.0;
    if(n==0)return result;
    while(n>1&&n<170){
        result=result*n--;
    }
    return result;
}
int main(void)
{
    int n=5;
	printf("%f",fun(n));
	return EXIT_SUCCESS;
}