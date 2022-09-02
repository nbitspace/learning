
#single inheritance - 1 base 1 derived
#multi level inheritance - 1 base 1 derived 1 derived from previous derived
#multiple inheritance - many base class inherited by derived class

#data hiding - variable hiding with __

class Rubber():
    def gripRubber(self):
        print("Grip Rubber") 
        
class Engine():
    def startEngine(self):
        print("Start Engine")
    
class Wheel(Rubber):#parent class, base class
    __size = 15
    speed = 50
    
    def wheelFunc(self):
        print("Wheel Function")
    
    def wheelRotate(self):
        print("Wheel Rotate", self.speed)
    
    def wheelSize(self):
        print("Wheel Size:", self.__size)
    
class Car(Wheel, Engine):#car - child/derived class, wheel - parent class
    colour = ""
    
    def __init__(self, col = "black"):
        self.colour = col
        print(self.colour, "car created")
    
    def wheelFunc(self): #overriding method/function
        print("Car's Wheel Function - different")
        
    def carStart(self):
        print("Car start")
    
    def wheelSize(self): #overriding
        Wheel.__size = 20 #no hiding in class that derived the base class
        Wheel.wheelSize(self)
    
    def carColour(self):
        print("Car Colour:", self.colour)
    
    def setCarColour(self, col):
        self.colour = col
        
class Lorry:
    pass

wheel = Wheel()
#print("Size of wheel:", wheel.__size) # data hiding #abstraction
print("Size of wheel:", wheel.wheelSize())
print("Rotate Speed of wheel:", wheel.wheelRotate())

wheel2 = Wheel()
wheel2.speed = 80
print("Rotate Speed of wheel:", wheel2.wheelRotate())

carObj = Car()
carObj.carStart()
carObj.wheelFunc() #overriding method
carObj.wheelRotate() #parent method
carObj.wheelSize()
#print("Direct print of Wheel Size:", carObj.__size)# data hiding #abstraction
del carObj
#carObj.carStart() # error

car2 = Car("Blue")
setattr(car2, "colour", "green")
car2.carColour()
car2.colour = "yellow"
car2.carColour()
car2.setCarColour("pink")
car2.carColour()
car2.gripRubber()

hasExhaust = hasattr(car2, "exhaust")
print("Does the car has an exhaust?", hasExhaust)

hasColour = hasattr(car2, "colour")
print("Does the car has a colour?", hasColour)

carCol = getattr(car2, "colour")
print("Car Colour getattr:", carCol)

delattr(car2, "colour")
car2.carColour()

print("car2 name:", __name__)

car2.startEngine()

print("Subclass check:", issubclass(Car, Wheel))
print("Subclass check:", issubclass(Wheel, Car))
print("Subclass check:", issubclass(Wheel, Rubber))
print("Subclass check:", issubclass(Wheel, Engine))
print("Subclass check:", issubclass(Car, Rubber))

print("Is Instance check:", isinstance(car2, Car))
print("Is Instance check:", isinstance(car2, Wheel))
print("Is Instance check:", isinstance(car2, Engine))
print("Is Instance check:", isinstance(car2, Rubber))
print("Is Instance check:", isinstance(car2, Lorry))




