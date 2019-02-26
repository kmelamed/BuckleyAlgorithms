#include <stdlib.h>
#include <stdio.h>

void doAll(char arr[], int lx, int size, int ux);
int count(char arr[]);

int main(){
	char arr[64];
	int lx, ux, size, c, c2;
	printf("Enter a string: ");
	fgets(arr, 64, stdin);
	size = count(arr);
	printf("Enter the first index slice: ");
	scanf("%d", &lx);
	printf("Enter the second index slice: ");
	scanf("%d", &ux);

	char result[ux - lx + 1]; 
	int ind = 0; 
	for (int i = lx; i < ux; i++) { 
		result[ind] ^= arr[i];
		arr[i] ^= result[ind]; 
		result[ind] ^= arr[i]; 
		ind++; 
		printf("%c", result[ind - 1]); 
	}
	
	result[ind + 1] = '\0'; 
	printf("\n");
	return 0;
}

int count(char arr[]) {
	int n = 0;
	for (int i = 0; i < 64; i++) {
		if (arr[i] != '\0') {
				n++;
		} else {
			return n;
		}
	}
	return n;
}

void doAll(char arr[], int lx, int size, int ux) {

}
