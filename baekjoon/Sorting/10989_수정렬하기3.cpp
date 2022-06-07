#include <cstdio>

int main(void) {
    int n, a, arr[100001] = { 0,};
    scanf("%d", &n);
    
    for(int i = 0; i < n; i++){
        scanf("%d", &a);
        arr[a]++;
    }
    for(int i = 1; i < 100001; i++){
        for(int j = 0 ; j < arr[i]; j++){
            printf("%d\n",i);
            n--;
        }
        if(n == 0)
        break;
    }
}
