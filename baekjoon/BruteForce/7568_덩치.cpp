#include <stdio.h>

int main(void) {
	int input[50][2];
	int n, count;
	scanf("%d", &n);

	for (int i = 0; i < n; i++)
		scanf("%d %d", &input[i][0], &input[i][1]);

	for (int i = 0; i < n; i++) {
		count = 1;
		for (int j = 0; j < n; j++) {
			if (i == j) continue;
			if (input[i][0] < input[j][0] &&
				input[i][1] < input[j][1])
				count++;
		}
		printf("%d ", count);
	}


	return 0;
}