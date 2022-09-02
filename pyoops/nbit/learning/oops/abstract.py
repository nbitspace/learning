from abc import ABC,abstractmethod
#from <module> import <resource>

class Car(ABC):# ABC abstract base class
    
    @abstractmethod
    def processor(self):
        pass
    
    def seat(self):
        print("Car Seat")

class Honda(Car):
    def processor(self):
        print("Processor Honda")

class Maruthi(Car):
    def processor(self):
        print("Processor Maruthi")
    
    def seat(self):#overriding
        print("Car Seat - Maruthi")
        
class Tesla(Car):
    pass
    # def processor(self):
    #     pass
        

# obj = Car() #Error - can't create obj for Abstract Class
# obj.processor()

car1 = Honda()
car1.processor()
car1.seat()

car2 = Maruthi()
car2.processor()
car2.seat()

car3 = Tesla()
car3.processor() #error #abstract method not defined
car3.seat()

