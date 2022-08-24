/*
 * Matrix.c
 *
 *  Created on: 21-Aug-2022
 *      Author: selva-temp
 */
#include<stdio.h>
int main1()
{
	//int k=3,m=2;
    int var1 [3][2]={{0,1},{2,3},{4,5}};
	for (int k=0; k<3; k++){
		for(int m=0; m<2; m++){
			printf("var1[%d][%d] =%d\n", k, m, var1[k][m]);
		}
	}
	//int i=3,j=2;
	int var2 [3][2]={{9,1},{7,2},{4,3}};
		for (int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				printf("var2[%d][%d] = %d\n", i, j, var2 [i][j]);
			}
		}
		//int var3[3][2];
	for (int a=0; a<3; a++){
		for(int q=0; q<2; q++){
			printf("var1 [%d][%d]+var2[%d][%d]=var3[%d]\n", a,q, a,q, var1 [a][q] += var2[a][q] );
		}
	}

	return 0;
}


