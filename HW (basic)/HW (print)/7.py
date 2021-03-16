# 직사각형의 가로와 세로의 길이를 정수형 값을 변수에 담고,
# 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출
# 력하는 프로그램을 작성하시오.
# 입력 예: 20 15 (앞에 입력된 값이 가로, 뒤에 입력된 값이 세로 길이)
# 출력 예:
# width = 25
# length = 30
# area = 750



wid = int(input('width: '))
le = int(input('lenth: '))

print('width =',wid+5)
print('length =',le*2)
print('area =', (wid+5)*(le*2))