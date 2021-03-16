# 다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
# 합계와 평균은 수식을 이용하세요.
# 합계 : 세 과목의 총합
# 평균 : 세 과목의 평균
# 출력 예:
# kor 90
# mat 80
# eng 100
# sum 270
# avg 90


k = input('국어점수: ')
m = input('수학점수: ')
e = input('영어점수: ')

k = int(k)
m = int(m)
e = int(e)

print("kor\t",k)
print("mat\t",m)
print("eng\t",e)
print("sum\t",k+m+e)
print("avg\t",(k+m+e)/3)