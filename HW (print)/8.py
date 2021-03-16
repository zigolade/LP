# 민수와 기영이의 키와 몸무게를 각각 변수에 담고, 민수가 키도 크고 몸무게도 크면 True 그렇지 않으면
# False을 출력하는 프로그램을 작성하시오.
# 입력 예:
# 150 35 (민수의 키와 몸무게 값)
# 145 35 (가영이의 키와 몸무게 값)
# 출력 예:
# False

minH = int(input('minsu hight: '))
minW = int(input('minsu weight: '))
giH = int(input('giyoung hight: '))
giW = int(input('giyoung weight: '))

if minH > giH and minW > giW:
    print('True')
else:
    print('False')