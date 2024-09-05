import array as arr
str=input("enter element:")
list=list(map(int,str.split()))
a=arr.array('i',list)
large=a[0]
n=len(a)
for i in range(1,n):
    if arr[i]>large:
        large=arr[i]
print(large)