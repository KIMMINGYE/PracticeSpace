#include "stdio.h"
#include "math.h"
#include "ctype.h"
#include "string.h"
#include <stdio.h>
#include <windows.h>
#include "stdbool.h"
#pragma execution_character_Set("utf-8")
#pragma warning(disable:4996)

int checkmax(int x, int y);

int checkmin(int x, int y);

void main() {

	int i, j;
	printf("정수를 입력하시오");
	scanf("%d %d", &i, &j);

	printf("max(%d,%d)=%d\n", i, j, max(i, j));

	printf("min(%d,%d)=%d", i, j, min(i, j));

	return 0;
}

int checkmax(int x, int y) {


	return (x > y ? x : y);

}

int checkmin(int x, int y) {

	if (x > y)

		return y;
	else
		return x;


}











