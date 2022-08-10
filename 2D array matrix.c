/*
 ============================================================================
 Name        : test.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include<stdio.h>

int main(){
	int x[4][3]={
			{1,1,1},
			{2,2,2},
			{3,3,3},
			{4,4,4}
	};
	int y[4][3]={
				{1,1,1},
				{2,2,2},
				{3,3,3},
				{4,4,4}
		};
	int z[4][3];
	int i,j;
	//int row,col, a[3][3],b[3][3],c[3][3] ;

	printf("value seted value of X : \n");
		for(i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
			{
				printf("%d",x[i][j]);

			}
			printf("\n");
		}

	printf("value seted value of Y : \n");
	for(i=0;i<3;++i)
    {

    for(j=0;j<3;++j)
    {
      printf("%d",y[i][j]);

	}
		printf("\n");
	}

	printf("addition : \n");
		for(i=0;i<3;++i)
	    {

	    for(j=0;j<3;++j)
	    {
	    	//printf("x i %d and j %d val %d \n",i,j,x[i][j]);
	    	     //    1      1 =2
                 //   0 1 +  0+1
	    	z[i][j]=x[i][j]+y[i][j];

	      printf("\n %d",z[i][j]);

		}
			printf("\n");

		}



//
//	printf("Enter first matrix\n");
//
//	for (row=0;row<3; ++row)
//
//	{
//
//	for (col=0; col<3; ++col)
//	{
//
//	scanf("%d",&a[row][col]); 0 row ku 0 col  =1 then 0 row ku 1 col ku =1
//
//
//	}
//
//	}
//    printf("show A value : \n");
//	for(i=0;i<3;++i)
//	{
//		for(j=0;j<3;++j)
//		{
//			printf("%d",a[i][j]);
//
//		}
//		printf("\n");
//	}
//
//	printf("Enter second matrix\n");
//
//	for (row=0;row<3; ++row)
//	{
//
//	for (col=0; col<3; ++col)
//	{
//
//	 scanf("%d",&b[row][col]);
//	}
//	}
//	// add
//	for (row=0;row<3; ++row)
//	{
//
//	for (col=0; col<3; ++col)
//	{
//
//	c[row][col]=a[row][col]+b[row][col];
//	}
//	}
//
//	printf("Output\n");
//
//	for (row=0;row<3; ++row)
//	{
//	for (col=0; col<3; ++col)
//	{
//	printf("%d",c[row][col]);
//
//	}
//	printf("\n");
//
//	}

	return 0;
}
















