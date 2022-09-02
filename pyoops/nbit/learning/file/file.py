#from imaplib import dat

#r - read
#w - write
#a - append
#r+ - read & write - overwrite old data
#w+ - write & read - overwrite old data
#a+ - append & read - no overwrite old data

#binary mode
#rb - read
#wb - write
#ab - append
#rb+ - read & write - overwrite old data
#wb+ - write & read - overwrite old data
#ab+ - append & read - no overwrite old data
testFile = open("/home/geeky/geekey/nbit/test.txt", 'r')#absolute path
print("Type:", type(testFile))
for line in testFile:
    print("Line:", line)

file = open("/home/geeky/geekey/nbit/test.txt", 'r')
print("Read:", file.read(10))

fileWrite = open("../oops/write.txt", "w")#relative path
fileWrite.write("I am writing...\n")
fileWrite.write("I finished writing...\n")
fileWrite.close()


fileApp = open("../oops/write.txt", "a")#relative path
fileApp.write("I am writing again...\n")
fileApp.close()

with open("../oops/write.txt") as f:
    data = f.read()
    print("Data:", data)
    
with open("../oops/write.txt", "a") as f:
    f.write("Hello all.....")
    
with open("../oops/write.txt", "rb") as f:
    data = f.readlines()
    print("Type of data:", type(data).__name__)
    for line in data:
        words = line.split()
        #print("Word type:", type(words))
        for word in words:
            print("Word:", word)
            print("Word type:", type(word))



