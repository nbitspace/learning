#encapsulation - OOPS concept
# encapsule - idea of wrapping data/method
# data hiding

#protected: _ single underscore
#private: __ double underscore

class Human:
    def __init__(self):
        self._age = 25 #protected variable
        self.__address = "Chennai" #private variable
        
    def getAddress(self):
        return "Address: " +self.__address
    
    # def setAddress(self, addr):
    #     self.__address = addr
        
        
class Teacher(Human):
    def __init__(self):#constructor - automatically called during object creation
        Human.__init__(self)
        print("new teacher created")
    
    def changeAge(self, value):
        self._age = value
        
    def getAge(self):
        return self._age
    
    # error - private variable cannot be used outside the class
    # def getTeacherAddress(self):
    #     return self.__address
        
        
t = Teacher()
print(t._age) #should not use, but it'll work
t.changeAge(35) 
print(t.getAge())

#print(t.__address) #will not work - private variable
#print(t.getTeacherAddress()) #will not work - private variable
print(t.getAddress())
t.__address = "America"
print(t.__address)
print(t.getAddress())#Human.__address did not change

maliga = Teacher()
malar = Teacher()