//#include "header.h"	//AnycodeX includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
int fun(char str[][10],int m,char *pt){
    int k,q,i;
    for(k=0;k<m;k++){
        q=strlen(str[k]);
        for(i=0;i<q;i++){
            pt[i]=str[k][i];
        }
        pt+=q;
        pt[0]=0;
    }
}
int main(void)
{
	printf("Hello,C world of AnycodeX!");
	return EXIT_SUCCESS;
}