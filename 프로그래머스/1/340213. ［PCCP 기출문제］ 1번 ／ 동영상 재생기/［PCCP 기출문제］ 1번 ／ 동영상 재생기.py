def solution(video_len, pos, op_start, op_end, commands):

    def tarnspom_time_int_to_str(time):
        time_li = time.split(":")
        if int(time_li[0]) < 10:
            time_li[0] = "0" + time_li[0]

        if int(time_li[1]) < 10:
            time_li[1] = "0" + time_li[1] 

        return time_li[0] + ":" + time_li[1]
    
    ## 시간 str -> int -> 초단위로 환산
    def transpom_time(time):
        minute = int(time[0:2]) * 60
        second = int(time[3:5])
        total_time = minute + second
        return total_time

    answer = transpom_time(pos)

    for com in commands:
        # 시작 0055초 현재시간 0101초 
        if transpom_time(op_start) <= answer and transpom_time(op_end) >= answer:
            answer = transpom_time(op_end)

        if com == "prev":
            # 현재 위치 10초 미만
            if answer < 10:
                answer = 0 
            else:
                # 10초 전으로 이동
                answer = answer - 10
                
        elif com == "next":
            # 동영상 남은 시간 10초 미만
            if transpom_time(video_len) - answer < 10:
                answer = transpom_time(video_len)
            else:
                # 10초 후로 이동
                answer = answer + 10

        if transpom_time(op_start) <= answer and transpom_time(op_end) >= answer:
            answer = transpom_time(op_end)

    answer = str(answer // 60) + ":" + str(answer % 60)
    answer = tarnspom_time_int_to_str(answer)
    return answer   
