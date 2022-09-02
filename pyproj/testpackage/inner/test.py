'''
Created on 09-Aug-2022

@author: geeky
'''
import random


#single line comment

"""
multi-line comment
"""

'''
multi-line comment 2
'''

st = "Hello World"
st2 = ''' This is
multi line string
.'''

def dictLoop():
    a = {
        "name" : "Rasa",
        "id" : 201821,
        "dept" : "Biology",
        21: 32,
        12: 32,
        "name" : "Rasi",
        #"name1" : "Bingo"
        "courses" : ["Computer", "Science", "English", "Tamil"],
        "teacher": {
            "name" : "Malar",
            "name1" : "Maliga",
            "subject" : "Tamil"
        }
    }
    
    for item in a:
        print("Printing item keys in dict a:", item)
        
    for item in a.keys():
        print("Printing each item keys() in dict a:", item)
        
    for item in a:
        print("Printing each item value in dict a:", a[item])
    
    for item in a.values():
        print("Printing each item value in dict a:", item)
        
    for key, val in a.items():
        print("dict a key value pair, key:", str(key), " val:", str(val))
    
    for key in a["teacher"]:
        print("teacher dict: key:", key, " val:", a.get("teacher").get(key))
        print("teacher dict: key:", key, " val:", a["teacher"].get(key))
        print("teacher dict: key:", key, " val:", a["teacher"][key])
    
    
def dictEg():
    #key-value pair, no duplicate keys, ordered, can change
    a = {
        "name" : "Rasa",
        "id" : 201821,
        "dept" : "Biology",
        21: 32,
        12: 32,
        "name" : "Rasi",
        #"name1" : "Bingo"
        "courses" : ["Computer", "Science", "English", "Tamil"]
    }
    print("Type of a:", type(a))
    print("Value of a:", a)
    print("Value of dept:", a["dept"])
    print("Length of dict a:", len(a))
    name_a = a["name"]
    print("Value of name:", name_a)
    name_a = a.get("name1", "No Name")
    print("Value of name1:", name_a)
    
    all_keys = a.keys()
    print("All keys in dict a:", all_keys)
    print("All keys type in dict:", type(all_keys))
    
    all_values = a.values()
    print("All values in dict a:", all_values)
    print("All values type in dict a:", type(all_values))
    
    a["dept"] = "Computer Science"
    print("Value of dict a:", a)
    
    a["name3"] = "Rusi"
    print("Value of dict a after Rusi:", a)
    
    a.update({"dept": "History"})
    print("Value of dict a after dept update:", a)
    
    a.update({"name2": "Risi"})
    print("Value of dict a after name2 update:", a)
    
    dict_items = a.items()
    print("Value of dict a:", dict_items)
    
    if "name1" in a:
        print("name1 key is in dict a")
    else:
        print("name1 key is not in dict a")
        
    get_val = a.pop("name")
    print("popped name from dict a:", get_val)
    print("popped from dict a:", a)
    
    #get_name = a.pop("name") #error
    
    get_val = a.popitem()
    print("popped item from dict a:", get_val)
    print("after popitem dict a:", a)
    
    del a["dept"]
    print("after delete dept dict a:", a)
    
    #del a["dept"] #error
    
    a2 = dict(a)
    
    a.clear()
    print("after clear() dept dict a:", a)
    
    print("after clear() dept dict a2:", a2)
    
    del a
    #print("print dict a:", a) #error
    
    
    
    

def setEg():
    a = {"Dosai", "Idli", "Sambar", "Vadai", "Idli", 35, True, True}
    print("Set items:", a)
    print("Type of a:", type(a).__name__)
    setLen = len(a)
    print("Lenght of set:", setLen)
    b = set((True, True, False, True, "Random"))
    for x in b:
        print("Set item in b:", x)
    
    a.update(b)
    print("Updated set a:", a)
    
    c = ["Pasta", "Pizza"]
    a.update(c)
    print("Updated set a:", a)
    
    a.remove("Sambar")
    a.remove("Vadai")
    a.discard("Burger")
    print("Updated set a:", a)
    
    x = a.pop()
    print("Popped set item:", x)
    x = a.pop()
    print("Popped set item:", x)
    x = a.pop()
    print("Popped set item:", x)
    print("Updated set a:", a)
    a.union(b)
    print("Updated set a:", a)
    
    d = {"Biriyani", "FriedRice", "Idli", "Dosai"}
    e = a.intersection(d)
    print("Updated set e:", e)
    print("Updated set a:", a)
    e = a.intersection_update(d)
    print("Updated set e:", e)
    print("Updated set a:", a)
    f = d.symmetric_difference(a)
    print("Updated set f:", f)
    
    
def tupleEg():
    a = ("C")
    print("Type of a:", type(a).__name__)
    print("Value of a:", a)
    
    a = ("C",)
    print("Type of a:", type(a).__name__)
    print("Value of a:", a)
    
    
    a = tuple(("C"))
    print("Type of a:", type(a).__name__)
    print("Value of a:", a)
    
    a = list(a)
    a.append("C++")
    a.append("Python")
    a.append("Java")
    a.append("Scala")
    print("Type of a:", type(a).__name__)
    print("Value of a:", a)
    a = tuple(a)
    var1 = a[0]
    var2 = a[1]
    (var1, var2, var3, *var4) = a
    print("Unpack Tuple to variable:", var1)
    print("Unpack Tuple to variable:", var2)
    print("Unpack Tuple to variable:", var3)
    print("Unpack Tuple to variable:", var4)
    (var1, var2, *var3, var4) = a
    print("Unpack Tuple to variable:", var1)
    print("Unpack Tuple to variable:", var2)
    print("Unpack Tuple to variable:", var3)
    print("Unpack Tuple to variable:", var4)
    
    newTuple = a * 2
    print("Multiple tuple:", newTuple)
    
    
    
def loopFunc():
    a = ["Radar", "Sonar", "Compass", "Navigator"]
    for item in a:
        print(item)
        print(item)
    print("Done printing the list items twice")
    
    for i in range(len(a)):
        print("Item " + str(i) + " in loop: " + a[i])
        
    j = 0
    while j < len(a):
        print("While: Item " + str(j) + " in loop: " + a[j])
        j += 1
    print("J value:", j)
    
    [print("Short syntax print:", item) for item in a]
    
    b = []
    for item in a:
        if "ar" in item:
            b.append(item)
            print("Item has 'ar' in it:", item)
        else:
            print("Item does not have 'ar' in it:", item)
    
    print("New list:", b)
    
    c = ["All " + item  for item in a]
    print("New list in short way:", c)
        
    d = ["New " + item  for item in a if "ar" in item]
    print("New list in short way:", d)
    
    oddNo = [item for item in range(20) if item%2==1]
    print("Odd numbers:", oddNo)
    
    caps = [item.upper() for item in a] 
    print("Capital List:", caps)
    
    students = ["Cara", "Lara", "Zara", "Mara"]
    students.sort()
    print(students)
    students.sort(reverse=True)
    print(students)
    
    # A=65, B=66 ...., a=97, b=98, ...
    students = ["Cara", "lara", "Zara", "Mara"]
    students.sort(key = str.lower)
    print(students)
    
    num = [120, 150, 50, 30, 200]
    num.sort(key=sortFun)
    print("Sorted close to 100 list:", num)
    
    num2 = num
    num2.append(300)
    print("num:",num)
    print("num2:", num2)
    
    num2 = num.copy()
    num2.append(400)
    print("num:",num)
    print("num2:", num2)
    
    num3 = list(num2)
    num3.append(500)
    print("num2:",num2)
    print("num3:", num3)
    
    num3 = num + num2
    print("num3:", num3)

def sortFun(num):
    differ = abs(100-num)
    print("num:" + str(num) + " diff:" + str(differ))
    return differ
    

def operatorsFunc():
    b = 5
    a = 2 + b
    print("A value:", a) #a=7
    a += b #a = a + b = 7 + 5
    print("A value:", a) #a=12
    a -=b#a = a - b = 12 - 5 = 7
    print("A value:", a)#a = 7
    a = a * b #a *=b
    print("A value:", a)#a = 35
    a = a / 6 #a /= b
    print("A value:", a)#a = 5
    a = int(a) % 4#modulus operator (reminder of division)
    print("A value:", a)#a = 1
    a = 2**4 #exponentiation 2*2*2*2
    print("A value:", a)#a = 16
    a //=3#a = a // 3 = 16 // 3 # floor division
    print("A value:", a)#a = 5
    c = a == b 
    print("C value:", c)#c = True
    c = a >= b 
    print("C value:", c)#c = True
    c = a < b 
    print("C value:", c)#c = False
    c = a != 4 
    print("C value:", c)#c = True
    c = a == b and b != 5
    print("C value:", c)#c = True
    c = a == b or b != 5
    print("C value or operator:", c)#c = True
    c = not(a == b or b!=5 or 5==5)
    print("C value not operator:", c)#c = False
    
    c = ["Aara", "Bara", "Cara", "Aara", 50]#list
    d = "Aara" in c
    print("C value membership operator:", d)#c = True
    d = "Dara" not in c
    print("C value not in membership operator:", d)#c = True
    
    #bit-wise operator - &, |, ~, ^,<< , >>
    
    print("List item with index 1:", c[3])
    print("List length:", len(c))
    print("List item with index 4 int value:", c[4])
    print("List type:", type(c))
    print("List negative index:", c[-2])# -2 from right # 5 - 2 = 3rd index
    print("List left half:", c[:len(c)//2])
    print("List middle half:", c[2:4])
    print("List right half:", c[2:])
    print("List negative index range:", c[-4:-1]) # (5-4):(5-1)#c[1:4]
    print("List item present/not:", "Dara" in c)
    if "Mara" not in c:
        print("Mara is not in the list c")
    c[3] = "Mara"
    print("List the list items:", c)
    c[1:3] = ["Fara", "Lara"]
    print("List the list items:", c)
    c[1:3] = ["Gara", "Lara", "Tara", "Nara"]
    print("List the list items:", c)
    c[1:3] = ["Gara"]
    print("List the list items:", c)
    c.insert(3, "40")
    print("List the list items:", c)
    c.append(["Yara", "Zara"])
    print("List the list items:", c)
    f = ["Nara", "Para"]
    c.extend(f)
    print("List the list items:", c)
    d = ("Sara", "Tara")
    c.extend(d)
    print("List the list items:", c)
    c.remove("Nara")
    print("List the list items:", c)
    e = c.pop(-1)
    print("List the list items:", c)
    print("Print the popped item:", e)
    del f
    #print("List the list items of f:", f) #error line
    c.clear()
    print("List the list items:", c)
    

x = 2
y = -6
z = -33.2e100
a = None
b = 2.4
c = 21j

def startFunc():
    global i
    i = 2
    print("String Print:", st)
    print("type of st:", type(st))
    for j in st:
        print(j)
    print("Length of string st:", len(st))
    s = st[-5:11]
    print("Print Substring:", s)
    s = s.upper()
    print("Print Upper:", s)
    print("Print Lower:", s.lower())
    print("Print s:", s)
    print("Type of s:", type(s))
    print("Type of s:", s)
    s = type(s)
    print("Type of s:", s)
    t = "Hello, Wo,rld "
    print("Print T:", t)
    print("Print T:", t.strip())
    print("Print T replace:", t.replace(", ", " ").replace(",", " "))
    print("Print T split:", t.split(","))
    s = str(s) + " " + t
    print("Print s, t concatenation:", s)
    name = "aara"
    age = 35
    printStr = "My age\\\\{1}\\\\ \n is {2} and my door number is \\\"{3}\", \'name {0}\'"
    print(printStr.format(name.capitalize(), 25, age, 21))
    
    boole = 5>7 or 5 > 3
    print("Boolean Value boole:", boole)
    print("Boolean Value :", bool(0))
    print("Boolean Value :", bool(-1))
    print("Boolean Value :", bool(["asd", "fdd"]))
    print("Boolean Value :", bool([]))
    print("Boolean Value :", isinstance(age, int))
    
    print("Multi line String Print:", st2)
    print("type of st2:", type(st2))
    print("Is 'in' present?", "in" in st2)
    print("Is 'This' not present?", "This" not in st2)
    print("Is 'this' not present?", "this" not in st2)
    
    print("x value:", x)
    print("type of x:", type(x))
    print("Int Values:", x, y, x+y)
    print("z value:", z)
    print("type of z:", type(z))
    print("a value:", a)
    print("type of a:", type(a))
    print("b value:", b)
    print("type of b:", type(b).__name__)
    print("c value:", c)
    print("type of c:", type(c).__name__)
    
    d = ["Crow", 'Peacock', "Eagle"]
    print("d value:", d)
    print("type of d:", type(d).__name__)
    
    d = list(("Crow", 'Peacock', "Eagle"))
    print("d value:", d)
    print("type of d:", type(d).__name__)
    
    d = ("Lion", "Cat", "Dog")
    print("d value:", d)
    print("type of d:", type(d).__name__)
    
    
    d = tuple(("Lion", "Cat", "Dog"))
    printMyValues(d)
    
    d = range(7)
    printMyValues(d)
    
    #set has unique values, set doesn't maintain order
    d = {"Policeman", 'Watchman', "Cameraman", "Watchman"}
    printMyValues(d)
    
    d = frozenset({'Computer Science', "History", 'Computer Science'})
    printMyValues(d)
    
    d = {"name" : "Aara", "age": 18}#dict is in key-value pair
    printMyValues(d)
    
    d = dict(name = "Aara", age = 18)
    printMyValues(d)
    
    d = False
    printMyValues(d)
    
    d = b"Hello World"
    printMyValues(d)
    
    d = bytearray(3)
    printMyValues(d)
    
    e = memoryview(d)
    printMyValues(e)
    
    f =random.randrange(1, 6)
    printMyValues(f)
    
    
    
def printMyValues(val):
    print("d value:", val)
    print("type of d:", type(val).__name__)

print("Starting\n")
#startFunc()
#operatorsFunc()
#loopFunc()
#tupleEg()
#setEg()
#dictEg()
dictLoop()
#print("global variable print:", i)
print("end")

