#include<stdio.h>
#include<math.h>

const int M = 3;
const int N = 2;
//return_type function_name(parameters)
//{
//	body of the function
//	return ;
//}
//* &

/*
 * main mf - 3
 * mf -2 - completed
 * mf - 1 - completed
 * mf - 0
 */

void recursion(int a)
{
	if(a == 0){
		return;
	}
	a--;

	printf("First Print \n");
	recursion(a);
	printf("Last Print\n");
}

void math_fun()
{
	printf("Math functions: \n");
	printf("%f\n", sqrt(25));//square root
	printf("%f\n", ceil(3.3));//round ceiling
	printf("%f\n", floor(3.3));//round floor
	printf("%f\n", pow(2, 3));//power
	printf("%f\n", abs(7));//absolute TODO
}

struct addr {
	int door;
	int pin;
};

struct my_struct {
	int id;
	char name[30];
	char initial;
	int age;
	struct addr address;
};


void use_structure() {
	struct my_struct s[10];
	s[0].id = 1;
	s[0].age = 10;
	s[0].initial = 'A';
	strcpy(s[0].name, "Aara");
	s[0].address.door = 322;
	s[0].address.pin = 54333;

	s[1].id = 2;
	s[1].age = 15;
	s[1].initial = 'B';
	strcpy(s[1].name, "Bara");

	s[2] = s[0];

	s[3].initial ='C';
	s[3].age = s[0].age;

	printf("\n Student Struct: \n");
	for(int i = 0; i < 4; i++) {
		printf("%d student: \nid:%d, name:%s, initial:%c, age:%d\n",
				i, s[i].id, s[i].name, s[i].initial, s[i].age);

		printf("door no: %d, pincode: %d\n\n",
				s[i].address.door, s[i].address.pin);
	}
}

void user_input()
{
	int age;
	char name[30];
	printf("\nEnter your name: \n");
	scanf("%s", name);
	printf("\nEnter your age: \n");
	scanf("%d", &age);
	printf("Your name is %s and your age is %d years!", name, age);

	//address
	printf("Address of age: %p", &age);

}

void break_continue()
{
	int i = 1;
	for(; i <= 20; i++)
	{
		if(i == 10) break;//break out of loop when i==10

		if (i % 2 == 0) continue; // print odd numbers
		printf("%d\n", i);
	}

}
void print_3d_arr(int var[N][N][M])
{
	printf("Printing 3D Array:\n");
	for (int i = 0; i < N; i++) //how to print int array
	{
		for (int j = 0; j < N; j++)
		{
			for (int k = 0; k < M; k++)
			{
				printf("%d ", var[i][j][k]);
			}
			printf("\n");
		}
		printf("-------------\n");
	}
}

void print_2d_arr(int var[M][M])
{
	printf("Printing 2D Array:\n");
	for (int i = 0; i < 3; i++) //how to print int array
	{
		for (int j = 0; j < 3; j++)
		{
			printf("%d ", var[i][j]);
		}
		printf("\n");
	}
}
void multi_dim_array()
{
	printf("\nMulti Dimentional Array:\n");
	int var[3][3]= {
			{1 ,2, 3},
			{4, 5, 6},
			{7, 8, 9}
	};
	int var2[3][3]= {
				{1 ,2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
	printf("2D Array val: %d\n", var[2][1]);
	print_2d_arr(var);

	int var3d[2][2][3] = {
			{{1, 2, 3}, {4, 5, 6}},
			{{7, 8, 9}, {10, 11, 12}}
	};

	printf("3D Array val: %d\n", var3d[0][0][2]);
	print_3d_arr(var3d);
}

void print_array(int *var) {
	printf("Printing Array:\n");
	for (int i = 0; i < 3; i++) //how to print int array
	{
		printf("%d ", var[i]);
	}
	printf("\n");
}

void print_int(int var) {
	printf("Integer value: %d\n", var);
}

void array()
{
	//array
	//type varName[size] = {val1, val2, val3};
	printf("\nArray:\n");
	int var[3] = {3, 5, 6};
	char ch[6] = {'a', 'b', 'c', 'd', 'e', '\0'};//string
	char cha[] = "Hello";//cha is same as ch
	cha[0] = 'M';
	char _chara12[] = "abcde";//chara is same as cha
	printf("\"%c\"\n", ch[0]);//array index starts with 0
	printf("%d\n", var[2]);// 2th index is 3rd value
	printf("%c\n", ch[5]);//empty or null value - string ending
	printf("%c\n", ch[12]);//junk/garbage value
	printf("Print cha: %s\n", cha);//prints the char array(string)
	printf("Size of cha: %lu\n", sizeof(cha));//prints the char array(string)
	print_int(var[1]);
	print_array(var);
	print_array(var);
}

int main() {
	recursion(3);
	//math_fun();
	//use_structure();
	//user_input();
	//break_continue();
	//multi_dim_array(b);
	//array();

	return 0;
}


// filename.c - source code
// c compiler - gcc - mingw
//
