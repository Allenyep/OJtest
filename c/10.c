//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
char *fun(char tt[]){
    int i;
    for(i=0;tt[i];i++){
        if((tt[i]>='a')&&(tt[i]<='z')){
            tt[i]=tt[i]-32;
        }
    }
    return tt;
}
int main(void)
{
    int i=4;
    char tt[]={'A','B','c','d'};
	printf("%s",fun(tt));
	return EXIT_SUCCESS;
}