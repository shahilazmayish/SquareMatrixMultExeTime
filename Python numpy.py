import numpy as np
import random
import datetime

n=int(input("Enter the size of square matrix: "))

start_time = datetime.datetime.now()

A=np.random.randint(10, size=(n,n))
B=np.random.randint(10, size=(n,n))
C=np.zeros((n,n,), dtype=int)

C= np.matmul(A, B)

#print('Output of C',C)

end_time = datetime.datetime.now()

time_diff = (end_time - start_time)
execution_time = time_diff.total_seconds() * 1000

print("Executable Time: ",execution_time," miliseconds")
