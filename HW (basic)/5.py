# 문자열(100자 이하)을 입력받은 후 정수를 입력받아 해당위치의 문자를 제거하고 출력하는 프로그램을
# 작성하시오.

string = input('문자열 쓰세요: ')
number = int(input('정수 쓰세요: '))

print(string[0:number], string[number+1:(len(string)+1)], sep="")