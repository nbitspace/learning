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
    print("Length of string st", len(st))
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
startFunc()
print("global variable print:", i)
print("end")

# if __name__ == '__main__':
#     pass
