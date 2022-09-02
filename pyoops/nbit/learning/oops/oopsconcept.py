

class OopsConcept:
    #this function is called constructor
    #constructor is called during object creation
    v1 = 5
    
    def __init__(self, var1 = 10, var2 = "No Name"):
        self.v1 = var1
        self.v2 = var2
        
    def func1(self):
        print("Func1 v1:", self.v1)
        
    def func2(self):
        print("Func2 v2:", self.v2)
        
    def func3(self):
        print("Func3")
    
    print("Hello, class start!")
    if __name__=="__main__":
        print("OopsConcept main!, v1:", v1)

i = str("Fury")
print("i type:", type(i))
lower_i = i.lower()
print("Lower i:", lower_i)
print()

a = OopsConcept(25) #object is variable, class is type
print("a type:", type(a))
print("A:")
a.func1()
a.func2()
a.func3()

print("B:")
b = OopsConcept()
b.func1()
b.func2()
b.func3()

print("C:")
c = OopsConcept(30, "Fury")
c.func1()
c.func2()
c.func3()

print("D:")
d = OopsConcept(var2="Fury")
d.func1()
d.func2()
d.func3()

print("End of OopsConcept")

