#dividir el array en partes
#data=[31,88,7,1,4,2,42]
def merge_sort(data):
    if len(data) <= 1:
        return data #31  y continua con linea 5
    mid = len(data) // 2 #3 =>1
    left = merge_sort(data[:mid])#31,7,88  =>31 =>7 
    right = merge_sort(data[mid:]) #1,4,2,42 =>7,88 =>88 
    return merge(left, right)#merge(7,88) (31,7,88) (1,4) (1,4,2,42) (7,31,88,1,2,4,42)


#organizar de a dos
def merge(left, right):
    merged = list()
    left_point, right_point = 0, 0 #contador para posicion
    # case1: left/right
    while len(left) > left_point and len(right) > right_point:#1>0 and 1>0
        if left[left_point] > right[right_point]:#7>88
            merged.append(right[right_point])
            right_point += 1
        else:
            merged.append(left[left_point])# 7
            left_point += 1
    # case2: left
    while len(left) > left_point:#1>0
        merged.append(left[left_point])
        left_point += 1
    # case3: right
    while len(right) > right_point:#1>0
        merged.append(right[right_point])#7,88 
        right_point += 1
    return merged #7,88 =>31,7,88 =>2,42 =>1,2,4,42


data=[31,88,7,1,4,2,42]
print(merge_sort(data)) #menor a mayor