#polymorphism
#poly - many morph - forms
#same function name but different types
#function overloading

#polymorphism - overloading function with parameters
def PrintValue(obj, objName = "obj", times = 1):
    for x in range(times):
        print(x, "th time Printing", objName, obj)
    

a = len("Fury")
PrintValue(a, "a")

b = len(["Aari", "Bari", "Cari"])#len is polymorphism of predefined function
PrintValue(b)

PrintValue("Aari", times = 2)

#PrintValue(objName = "c", times = 2) #obj is mandatory

###############################

class Animal():
    def head(self):
        print("Animal head")
        
    def legs(self):
        print("Animal legs")
    
class Bird():
    def head(self):
        print("Bird head")
        
    def legs(self):
        print("Bird legs")
      
class Dog(Animal):
    pass

class Lion(Animal):
    def head(self): #overriding
        print("Lion head")
        
class Cat(Animal):
    def legs(self): #overriding
        print("Cat Legs")



an = Animal() # head, legs - polymorphism
bi = Bird() # head, legs - polymorphism
do = Dog() # head, legs - polymorphism with inheritance
li = Lion() # head, legs - polymorphism with inheritance
ca = Cat() # head, legs - polymorphism with inheritance
for item in (an, bi, do, li, ca):
    item.head()
    item.legs()

print("polymorphism with function - different class types for parameter")
def characteristics(obj):
    obj.head()
    obj.legs()
    
characteristics(an)
characteristics(bi)
        