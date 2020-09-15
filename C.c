#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main()
{
    int size;
    printf("Enter the size of the square matrix: ");
    scanf("%d", &size);
    
    //Beginning of the execution time
    clock_t begin = clock();

    int A[size][size],B[size][size],C[size][size];

    //Get First Matrix
    for (int i = 0; i <size; ++i) {
        for (int j = 0; j < size; ++j) {
            int random= rand()%10;
            A[i][j]=random;
        }
    }
    //Get Second Matrix
    for (int i = 0; i <size; ++i) {
        for (int j = 0; j < size; ++j) {
            int random= rand()%10;
            B[i][j]=random;
        }
    }

    // Initializing elements of matrix mult to 0.
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            C[i][j] = 0;
        }
    }
    // Multiplying first and second matrices and storing it in result
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            for (int k = 0; k < size; ++k) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    clock_t end = clock();
    double time_spent = (double)(end-begin)/CLOCKS_PER_SEC;
    printf("Excitable Time: %f miliseconds\n",(time_spent*1000));
    
    return 0;
}
