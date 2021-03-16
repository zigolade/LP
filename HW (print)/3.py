# 두 개의 정수를 변수에 각각 담고, 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
# 입력 예: 4 5
# 출력 예:
# 4 > 5 --- 0
# 4 < 5 --- 1
# 4 >= 5 --- 0
# 4 <= 5 --- 1


fir = int(input('num1: '))
sec = int(input('num2: '))


print(fir," > ",sec," --- ",fir > sec)
print(fir," < ",sec," --- ",fir < sec)
print(fir," >= ",sec," --- ",fir >= sec)
print(fir," <= ",sec," --- ",fir <= sec)
