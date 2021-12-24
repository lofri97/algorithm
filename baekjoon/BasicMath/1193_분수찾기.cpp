#include <stdio.h>

int main(void) {
	int i=1, n;
	scanf("%d", &n);
	while (n > i) {
		n -= i++;
	}
	if (i % 2 == 0)
		printf("%d/%d\n", n, i + 1 - n);
	else
		printf("%d/%d\n", i + 1 - n, n);
}