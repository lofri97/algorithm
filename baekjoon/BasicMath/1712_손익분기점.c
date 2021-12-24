#include <stdio.h>

int main(void) {
	int a, b, c, result;
	result = -1;
	scanf("%d %d %d", &a, &b, &c);
	if (c - b > 0) result = a / (c - b) + 1;
	printf("%d\n", result);
}