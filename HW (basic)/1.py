# 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
# 2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.

a = int(input('야드를 쓰세요: '))
b = int(input('인치를 쓰세요: '))

yard = round(a*91.44, 1)
inch = round(b*2.54, 1)
print(a,'yd =',yard,'cm')
print(b,'in =',inch,'cm')
