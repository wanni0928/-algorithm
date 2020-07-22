def split_func(data):
    medium = int(len(data) / 2)
    print (medium)
    left = data[:medium]
    right = data[medium:]
    print (left, right)

data_list = [3,4,1,3,2]
print(split_func(data_list))