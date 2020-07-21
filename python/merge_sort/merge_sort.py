def split_func(data):
    medium = int(len(data) / 2)
    print (medium)
    left = data[:medium]
    right = data[medium:]
    print (left, right)