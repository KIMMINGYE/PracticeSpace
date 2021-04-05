#include "stdio.h"
#include "math.h"
#include "ctype.h"
#include "string.h"
#include <stdio.h>
#include <windows.h>
#include "stdbool.h"
#pragma execution_character_Set("utf-8")
#pragma warning(disable:4996)

void main() {

	/*double x = 12.34;
	int i = -5, j = 2;

	int a, b, c;
	a = ceil(x);
	b = floor(x);
	c = pow(4, j);

	printf("ceil(12.34)=%d\n", a);
	printf("floor(12.34)=%d\n", b);
	printf("pow(4,2)=%d", c);*/

	int i, alp = 0, no = 0, et = 0;

	char s[20];

	printf("Enter :");
	scanf("%s", s);

	for (i = 0; i < strlen(s); i++) {

		if (isalpha(s[i]))

			alp++;

		else if (isdigit(s[i]))
			no++;
		else
			et++;
	}

	printf("alphabet = %d\n", alp);

	printf("number = %d\n", no);

	printf("etc = %d\n", et);
	return 0;
}











