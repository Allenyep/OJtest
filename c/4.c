//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
float fun(float num){
    int s;
    float n,t,pi;
    t=1;pi=0;n=1;s=1;
    while(1/n>=num){
        pi=pi+t;
        n=n+2;
        s=-s;
        t=s/n;
        // printf("%f",t);
    }
    pi=pi*4;
    return pi;
}
int main(void)
{
	float n1=0.0001,n2;
	n2=fun(n1);
	 printf("%6.4f",n2);
	return EXIT_SUCCESS;
}