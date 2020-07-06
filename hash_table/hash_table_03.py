## 충돌(Collision) 해결 알고리즘(좋은 해쉬 함수 사용하기)
'''
Chaining 기법
    - 개방 해슁 또는 Open Hashing 기법 중 하나:해쉬 테이블 저장공간 외의 공간을 활용하는 기법
    - 충돌이 일어나면, 링크드 리스트라는 자료 구조를 사용해서, 링크드 리스트로 데이터를 추가로 연결시켜서 저장하는 기법.
'''

'''
연습: 테이블 코드에 Chaining 기법으로 충돌 해결 코드를 추가해보기
1. 해쉬 함수 : key % 8
2. 해쉬 키 생성 : hash(data)
'''
hash_table = list([0 for i in range(8)])

def get_key(data):
    return hash(data)

def hash_function(key):
    return key % 8

def save_data(data, value):
    index_key = get_key(data)
    hash_address = hash_function(index_key)
    # hash_table의 디폴트 값은 0
    if hash_table[hash_address] != 0:
        for index in range(len(hash_table[hash_address])):
            if hash_table[hash_address][index][0] == index_key:
                hash_table[hash_address][index][1] = value
                return
        hash_table[hash_address].append([index_key, value])
    else:
        hash_table[hash_address] = [[index_key, value]]
    
def read_data(data):
    index_key = get_key(data)
    hash_address = hash_function(index_key)

    if hash_table[hash_address] != 0:
        for index in range(len(hash_table[hash_address])):
            if hash_table[hash_address][index][0] == index_key:
                return hash_table[hash_address][index][1]
        return None
    else:
        return None

print(hash('Dava') % 8)
print(hash('Data') % 8)
print(hash('Dd') % 8)

save_data('Dd', '1201023010')
save_data('Data', '3301023010')
print(read_data('Dd'))

print(hash_table)
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
