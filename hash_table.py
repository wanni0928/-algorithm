# 해쉬 구조

hash_table = list([0 for i in range(10)])

def hash_func(key):
    return key % 5

def storage_data(data, value):
    key = ord(data[0])
    hash_address = hash_func(key)
    hash_table[hash_address] = value

def get_data(data):
    key = ord(data[0])
    hash_address = hash_func(key)
    return hash_table[hash_address]

data1 = 'Andy'
data2 = 'Dave'
data3 = 'Trump'

## ord(): 문자의 ASCII코드 리턴
## unicode
print(ord(data1[0]))
print(hash_func(ord(data1[0])))

storage_data('Andy', '01066664444')
storage_data('Dave', '01066664244')
storage_data('Trump', '01066661444')

print(get_data('Andy'))