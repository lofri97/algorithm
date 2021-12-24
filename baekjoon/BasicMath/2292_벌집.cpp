#include <stdio.h>

int main(void) {
	int start, end, i, n;
	start = 1;
	end = 1;
	i = 0;

	scanf("%d", &n);

	while (true) {
		i++;
		if (start <= n && n <= end) {
			printf("%d\n", i);
			break;
		}
		start = end + 1;
		end += i * 6;
	}
	return 0;
}