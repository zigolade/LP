# 두 변수에 논리 값(true, false)을 각각 임의로 대입하고, 논리 합(or)과 논리 곱(and)의 결과를 출력하시
# 오.
# 입력 예: False True
# 출력 예:
# 논리 합: False or True => True
# 논리 곱: False and True => False

a = input('False or True: ')
b = input('False or True: ')

print('논리 곱:',a,'and',b,'=> ', a and b)
print('논리 합:',a,'or',b,'=> ', a or b)