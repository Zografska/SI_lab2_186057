Со цел да можеме да ги истестираме влезовие до сите искази, ќе треба да поставиме почетни вредности за во листата
allStudents ќе ја наполниме со два users -> 
“User1”
“User2”
Исто така ќе поставиме уште неколку корисници кои ќе ги користиме за тестирање

tUser1= new User (“User1”,”pass112”,”user1@email.com")
tUser2=new User (“User22”,”pass22”,”user22@email.com")
tUser3=new User (“User22”,”pass22”,null)


!(https://github.com/Zografska/SI_lab2_186057/blob/master/tabela1.jpg?raw=true)





Multiple condition

Со цел да го објасниме тестирањето повторно ни треба да дефинираме вредности
allStudents ќе ја наполниме со два users -> 
“User1”
“User2”
Исто така ќе поставиме уште неколку корисници кои ќе ги користиме за тестирање

tUser1= new User (“User1”,”pass112”,”user1@email.com")
tUser2=new User (“User22”,”pass22”,”user22emailcom")
tUser3=new User (null,”pass22”,user22@email.com")
tUser4= new User (“User4”,”pass114”,”user1email.com")

Случаи на повеќе услови се:
E) -> user.getUsername()==null || allUsers.contains(user.getUsername())



Со овие тест случаи се изминуваат сите возможни исходи од овие два услови. Бидејќи се поврзани со ИЛИ потребно е било кој од условите да е точен со цел условот да е точен
N) -> atChar&&user.getEmail().charAt(i)==‘.’ 



Со овие тест случаи се изминуваат сите возможни исходи од овие два услови. Бидејќи се поврзани со И потребно е и двата услови да се точни со цел условот да е точен
