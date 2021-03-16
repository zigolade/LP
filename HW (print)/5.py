# 3개의 정수를 변수 3개에 담아 첫 번째 수가 가장 크면 True 아니면 False을 출력하고,
# 세 개의 수가 모두 같으면 True 아니면 False을 출력하는 프로그램을 작성하시오.


num1 = int(input('num1: '))
num2 = int(input('num2: '))
num3 = int(input('num3: '))

if max(num1, num2, num3) is num1: # is 가 된다고?
    print('True')
else:
    print('False')

if num1 is num2 and num2 is num3:
    print('True')
else:
    print('False')
