# 단어와 문자 한 개를 입력받아서 단어에서 입력받은 문자와 같은 문자를 찾아서 그 위치를 출력하는 프로
# 그램을 작성하시오.

word = input('영어단어를 쓰세요.: ')
spell = input('문자 하나를 쓰세요: ')

print(word.find(spell))

# find의 활용. find 쓸때는 .find