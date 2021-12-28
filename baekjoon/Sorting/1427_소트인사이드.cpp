#include <stdio.h>
#include <string.h>

void swap(char* a, char* b) {
	char temp;
	temp = *a;
	*a = *b;
	*b = temp;
}

int main(void) {
	char str[11];
	int max;
	scanf("%s", &str);

	for (int i = 0; i < strlen(str); i++) {
		max = i;
		for (int j = i + 1; j < strlen(str); j++) {
			if (str[j] > str[max]) max = j;
		}
		swap(&str[i], &str[max]);
	}

	printf("%s\n", str);
}