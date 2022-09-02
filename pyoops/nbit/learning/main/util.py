import datetime
import json

print("########################date time ##################")
x = datetime.datetime.now()
print("Now:", x)
print("Y:", x.year)
print("Day:", x.strftime("%A"))

#x = datetime.datetime(2022, 8, 22)
print(x.strftime("%d/%b/%Y %I hr %M sec %S sec %a %Z"))
print("Day of the year:", x.strftime("%jth day of the year"))

print("############## user input #################")
id = input("Your Reg ID:")
print("Your id is:", id)

print("#########################json############################")
y = '{"name":"Akil", "age":5, "School":"Hogwarts"}'
print(type(y))
z = json.loads(y)#json parses y string and converts to dict
print(type(z))
print(z["age"])
z["Subject"] = "Defence against the Dark Arts"
print(z["Subject"])
z['id'] = id

z1 = json.dumps(z)#converts dict to json string
print(type(z1))
print("Converted json string:", z1)

a ={}
a['name'] = input("Name:")
a['age'] = int(input("Age:"))
print(type(a['age']))
a['school'] = input("School:")

b = json.dumps(a)
print("User input values:", b)


