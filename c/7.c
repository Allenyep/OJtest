//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
fun(char *s,int num[5]){
    int k,i=5;
    for(k=0;k<i;k++){
        num[i]=0;
    }
    for(;*s>='a';s++){
        i=-1;
        switch(*s){
            // case....
            
        }
        if(i>=0){
            num[i]++;
        }
    }
}
int main(void)
{
	printf("Hello,C world of AnycodeX!");
	return EXIT_SUCCESS;
}