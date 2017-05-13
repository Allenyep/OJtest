//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>

void fun(char *p,char *q,char *c){
    int k=0;
    
    while(k<10){
        if(*p<*q){
            c[k]=*q;
        }else{
            c[k]=*p;
        }
        p++;
        q++;
        k++;
    }
}
int main(void)
{
	char a[10]="aBCDeFgH",b[10]="ABcd",c[80]={'\0'};
	fun(a,b,c);
	puts(a);printf("\n");
	puts(b);printf("\n");
	puts(c);
	return EXIT_SUCCESS;
}