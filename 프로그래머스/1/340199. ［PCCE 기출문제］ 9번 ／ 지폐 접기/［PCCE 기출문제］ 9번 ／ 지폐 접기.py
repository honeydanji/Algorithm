def solution(wallet, bill):
    answer = 0
    check = True
    
    def min_print(length):
        if length[0] < length[1]:
            return length[0]
        else:
            return length[1]

    def max_print(length):
        if length[0] > length[1]:
            return length[0]
        else:
            return length[1]
        

    while check:
        if min_print(bill) > min_print(wallet) or max_print(bill) > max_print(wallet):
            if bill[0] > bill[1]:
                bill[0] = bill[0] // 2
                answer += 1
            else:
                bill[1] = bill[1] // 2
                answer += 1
        else:
            check = False

    return answer

