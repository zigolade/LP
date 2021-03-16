# 두 정수를 변수 2개에 각각 담고 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시
# 오.
# 입력 예: 35 10
# 출력 예:
# 35 / 10 = 3...5

num1 = int(input('num1:'))
num2 = int(input('num2:'))

val1 = num1 // num2
val2 = num1 % num2

print(num1,'/',num2,'=',val1,'...',val2)