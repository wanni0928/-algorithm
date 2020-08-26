import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    for i in range(len(scoville)):
        if len(scoville) == 1 : 
            return -1
        temp = heapq.heappop(scoville)+ heapq.heappop(scoville)*2
        heapq.heappush(scoville, temp)
        answer += 1
        if check(scoville, K) :
            break
        else: continue
    return answer

def check(heap, K): 
    for element in heap:
        if element < K :
            return False
        else:
            continue
    return True